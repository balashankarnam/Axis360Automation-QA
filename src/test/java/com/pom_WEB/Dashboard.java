package com.pom_WEB;

import com.base.CapabilitiesAndWebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends CapabilitiesAndWebDriverUtils {

    public Dashboard(){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
//////////////////////////Login Dashboard
@FindBy(xpath = "//*[@id=\"toggle\"]/span/svg/g/rect[2]")
public static WebElement side_Menu_Btn;
@FindBy(id ="txtSearch")
public static WebElement dash_Board_Advance_Search;
@FindBy(id ="loginBtn" )
public static WebElement login_Btn;


public static void launchApplication(){
    try {
        WaitForWebElement(login_Btn);
        eyes.open(driver, "Axis360", "Axis360WebTesting");
        eyes.checkWindow("DashboardAxis360");
    }finally {
        eyes.abortIfNotClosed();
    }

}
public static void login(){
    WaitForWebElement(login_Btn);
    Dashboard.login_Btn.click();
    try{
        eyes.open(driver,"LoginScreen","Loginscreen");
        eyes.checkWindow("LoginPage");
        eyes.close();
    }finally{
        eyes.abortIfNotClosed();
    }
}


}





