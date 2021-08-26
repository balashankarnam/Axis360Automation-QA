package com.stepdefinitionWeb;

import com.base.CapabilitiesAndWebDriverUtils;
import com.pom_WEB.DashBoardPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginClassWeb extends CapabilitiesAndWebDriverUtils {


    @Given("User clicks on login button")
    public void user_Clicks_On_Login(){
     //  DashBoardPage.launchApplication();
        DashBoardPage.user_clicks_On_Login();

    }
//    @Given("User enter valid name {String} and clicks on login")
//    public void User_Enter_Valid_UserName(String Username){
//        DashBoardPage.user_enter_valid_username_clicks_on_login(Username);
//      }
    @Given("User lands on dashboard")
    public void user_enters_valid_Username() throws InterruptedException {
       DashBoardPage.user_lands_on_logged_in_dashboard_screen();

    }

    @And("User enter valid name \\{String} and clicks on login")
    public void userEnterValidNameStringAndClicksOnLogin(String Username) {
        DashBoardPage.user_enter_valid_username_clicks_on_login(Username);
    }
}
