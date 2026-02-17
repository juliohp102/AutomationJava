package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FligthPages {



    private WebDriver driver;
    //elementos -> PAGE FACTORY
    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")
    private WebElement btnContinuar;

    //constructor de este objeto
    public FligthPages(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //acciones

    public void clickContinuar(){

        btnContinuar.click();
    }

}
