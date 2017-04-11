package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.*;

/**
 * Kontroler dla logowania
 */
@Controller
@RequestMapping("/login")
public class LoginController  {
    /**
     * Zwraca widok strony domowej
     * @param model model
     * @return widok strony domowej
     */
    @RequestMapping(method = RequestMethod.GET)
    public String sendRegisterView(ModelMap model) {
        return "hello";
    }

    /**
     * Logowanie uzytkownika
     * @param name nazwa logujacego sie uzytkownika
     * @param pwd haslo logujacego sie uzytkownika
     * @return widok strony domowej
     */
    @RequestMapping(method = RequestMethod.POST)
    public String submitLogin(@RequestParam String name, @RequestParam String pwd){
        System.out.println("Login:\n" + name + "\n" + pwd);
        loadDataBase(name,pwd);
        return "hello"; //TODO: encryption, redirect to actual app page
    }


    /**
     * Ladowanie bazy danych do logowania
     * @param name nazwa logujacego sie uzytkownika
     * @param pwd haslo logujacego sie uzytkownika
     */
    public void loadDataBase(String name, String pwd){
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
            boolean zalogowanoUzytkownika;
            zalogowanoUzytkownika = logowanieUzytkownika(name, pwd, conn);
            if(zalogowanoUzytkownika == true){
                System.out.println("Sukces!!! Zalogowano uzytkownika");
            }
            else{
                System.out.println("Porazka!!! Logowanie nie powiodlo sie");
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: unable to connect driver class!");
            e.printStackTrace();
        }
    }

    /**
     * Sprawdzenie czy taki uzytkownik istnieje w bazie
     * @param nazwa nazwa logujacego sie uzytkownika
     * @param pwd haslo logujacego sie uzytkownika
     * @param conn polaczenie z baza
     * @return informacja czy znaleziono uzytkownika
     */
    public boolean logowanieUzytkownika(String nazwa, String pwd, Connection conn){
        Statement stmt= null;
        ResultSet rs= null;
        try {
            stmt = conn.createStatement();
            rs=stmt.executeQuery( "SELECT Login FROM Uzytkownik WHERE Login = '"+nazwa+"' AND Haslo = '"+pwd+"'");

            while (rs.next()) {
                //System.out.println("RS"+rs.getString(1));
                return true;
            }
            return false;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        finally {
            try {
                rs.close();
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}