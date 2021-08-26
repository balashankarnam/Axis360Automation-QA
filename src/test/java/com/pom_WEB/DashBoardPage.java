package com.pom_WEB;

import com.applitools.eyes.appium.Eyes;
import com.base.CapabilitiesAndWebDriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import java.net.DatagramSocket;

public class DashBoardPage extends CapabilitiesAndWebDriverUtils {
    static Eyes eyes = new Eyes();
    public DashBoardPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
//////////////////////////Login Dashboard
@FindBy(xpath = "//*[@id=\"toggle\"]/span/svg/g/rect[2]")
public static WebElement side_Menu_Btn;
@FindBy(id ="txtSearch")
public static WebElement dash_Board_Advance_Search;
@FindBy(id ="loginBtn" )
public static WebElement login_Btn;
@FindBy(xpath = "//*[@id=\"LogOnModel_UserName\"]")
public static WebElement userName_Text_Field;
@FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[2]/button")
public static WebElement login_button;
@FindBy(xpath = "//*[@id=\"btnLogout\"]")
public static WebElement logout_Button;







///////////////////Default methods////////////////////////

public static void launchApplication(){
    try {
        WaitForWebElement(login_Btn);
        eyes.open(driver,"Axis360","Axis360Page");
        eyes.checkWindow("DashboardAxis360");
    }finally {
        eyes.abortIfNotClosed();
    }

}


public static void user_clicks_On_Login() {
  //  WaitForWebElement(login_Btn);
    DashBoardPage.login_Btn.click();

//    try {
//        eyes.open(driver, "LoginScreen", "Loginscreen");
//
//        eyes.checkWindow("LoginPage");
//        eyes.close();
//    } finally {
//        eyes.abortIfNotClosed();
//    }
}

    public static void user_enter_valid_username_clicks_on_login(String Username){
        DashBoardPage.userName_Text_Field.sendKeys(Username);
        DashBoardPage.login_button.click();

    }

    public static void user_lands_on_logged_in_dashboard_screen() throws InterruptedException {
        driver.wait(1000);
        WaitForWebElement(DashBoardPage.logout_Button);
    }



}





