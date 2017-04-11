/**
 * Created by Monika on 2017-04-07.
 */
var sidebarOpen = false;

function openSidebar(){
    document.getElementById("sidebar").style.width = "250px";
    document.getElementById("page-content-wrapper").style.marginLeft = "250px";
}

function closeSidebar(){
    document.getElementById("sidebar").style.width = "0";
    document.getElementById("page-content-wrapper").style.marginLeft= "0";
}

function sidebarToggle(){
   if(sidebarOpen) {
       closeSidebar()
   }else{
       openSidebar()
   }
    sidebarOpen = !sidebarOpen;
}

