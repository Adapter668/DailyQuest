package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.* ;  // for standard JDBC programs
import java.math.* ; // for BigDecimal and BigInteger support
import java.util.Properties;

/**
 * Kontroler dla strony z rejestracją
 */
@Controller
@RequestMapping("/register")
public class RegisterController {
    /**
     * Zwraca widok rejetracji
     * @param model model
     * @return widok formularza rejestracji
     */
    @RequestMapping(method = RequestMethod.GET)
    public String sendRegisterView(ModelMap model) {
        return "register";
    }

    /**
     * Rejestrowanie uzytkownika
     * @param name nazwa rejestrującego się użytkownika
     * @param email email rejestrującego się użytkownika
     * @param pwd hasło rejestrującego się użytkownika
     * @return widok strony domowej
     */
    @RequestMapping(method = RequestMethod.POST)
    public String submit(@RequestParam String name, @RequestParam String email, @RequestParam String pwd){
        System.out.println("Register:\n" + name + "\n" + email + "\n" + pwd);
        sendEmail(name, email, pwd);
        //loadDataBase(name,email,pwd);
        return "hello"; //TODO + encryption
    }

    //TODO: activation link, when get and click then redirect to login/profile
    public void sendEmail(String name, String email, String pwd) {
        final String from = "dailyquestteam@gmail.com";
        final String password = "DailyQuest123";

        String host = "smtp.gmail.com";
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.user", from);
        properties.put("mail.smtp.password", password);

        Session session = Session.getDefaultInstance(properties);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress toAddress = new InternetAddress(email);
            message.addRecipient(Message.RecipientType.TO, toAddress);
            message.setSubject("DailyQuest Registration");
            message.setText("Name: " + name + "\nPassword: " + pwd + "\nActivation link: ");
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, password);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Ladowanie bazy danych do rejestracji
     * @param name nazwa logujacego sie uzytkownika
     * @param pwd haslo logujacego sie uzytkownika
     * @param email email logujacego sie uzytkownika
     */
    public void loadDataBase(String name, String email, String pwd){
        try {
            Class.forName("oracle.jdbc.OracleDriver");//
        }
        catch(ClassNotFoundException ex) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM", "Oracle2017");
            System.out.println("BAZA OTWARTA!!! \n \n \n");
            boolean dodanoUzytkownika = rejestracjaUzytkownika(name, email, pwd, conn);
            if(dodanoUzytkownika){
                System.out.println("Sukces!!! Dodano nowego uzytkownika");
            }
            else{
                System.out.println("Porazka!!! Nie dodano");
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: unable to connect driver class!");
            e.printStackTrace();
        }
    }

    /**
     * Wprowadzenie nowego uzytkownika do bazy
     * @param login nazwa logujacego sie uzytkownika
     * @param email email logujacego sie uzytkownika
     * @param pwd haslo logujacego sie uzytkownika
     * @param conn polaczenie z baza
     * @return informacja czy udalo sie wprowadzic nowe dane
     */
    public boolean rejestracjaUzytkownika(String login, String email, String pwd, Connection conn){
        Statement stmt= null;
        try {
            stmt = conn.createStatement();
            int changes;
            changes=stmt.executeUpdate("INSERT INTO Uzytkownik" + " VALUES (null, '"+login+"', '"+pwd+"', null, null, '"+email+"',null,null,null)");
            System.out.println("Wstawiono " + changes + " krotek.");
            stmt.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

}