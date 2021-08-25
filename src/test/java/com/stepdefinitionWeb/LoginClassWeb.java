package com.stepdefinitionWeb;

import com.base.CapabilitiesAndWebDriverUtils;
import com.pom_WEB.Dashboard;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginClassWeb extends CapabilitiesAndWebDriverUtils {


    @Given("Launh the WebApplication")
    public void launch(){
        Dashboard.launchApplication();

    }
    @And("Login in using the username")
    public void login(){
        Dashboard.login();
    }

}
