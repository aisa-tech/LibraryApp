package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "inputEmail")
    public WebElement emailBox;
    @FindBy(id = "inputPassword")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInBtn;

    @FindBy(xpath = "//a[@class='nav-link']//span[.='Dashboard']")
    public WebElement dashboard;

    @FindBy(xpath = "//a[@class='nav-link']//span[.='Books']")
    public WebElement books;

    @FindBy(xpath = "//h2[@id='user_count']")
    public WebElement userCount;

    @FindBy(xpath = "(//li[@class='nav-item'])[2]/a")
    public WebElement usersLink;

    @FindBy(xpath = "//table[@id='tbl_users']//tr[@role='row']//th")
    public List<WebElement> headerNames;

    @FindBy(xpath = "//a[@id='navbarDropdown']//span")
    public WebElement userName;




}
