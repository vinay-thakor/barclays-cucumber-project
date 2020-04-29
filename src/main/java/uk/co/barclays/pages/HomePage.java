package uk.co.barclays.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.barclays.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Bank")
    WebElement _bankTab;
    @FindBy(linkText = "Switching bank account to Barclays")
    WebElement _switchTOBankAccountTab;

    @FindBy(linkText = "Already bank with us?")
    WebElement _alreadyWithUsText;

    public void clickonBankBtn() {
        waitUntilElementToBeClickable(_bankTab, 20);
        Reporter.addStepLog("Clicking on bank tab : " + _bankTab.toString());
        mouseHoverClick(_bankTab);
        log.info("Clicking on bank tab : " + _bankTab.toString());

    }

    public void clickonSwithAccountLink() {
        waitUntilElementToBeClickable(_switchTOBankAccountTab, 20);
        Reporter.addStepLog("Clicking on bank tab : " + _switchTOBankAccountTab.toString());
        mouseHoverClick(_bankTab);
        log.info("Clicking on bank tab : " + _switchTOBankAccountTab.toString());

    }

    public String verifyAlreadyWithusText(String alreadyText) {
        waitUntilElementToBeClickable(_alreadyWithUsText, 20);
        Reporter.addStepLog("Swith with us text verify " + _alreadyWithUsText.toString());
        log.info("Swith with us text verify " + _alreadyWithUsText.toString());
        return getTextFromElement(_alreadyWithUsText);
    }
}












//    public void clickingOnBankTab() {
//        waitUntilElementToBeClickable(_bankTab, 20);
//        Reporter.addStepLog("Clicking on bank tab : " + _bankTab.toString());
//        mouseHoverClick(_bankTab);
//        log.info("Clicking on bank tab : " + _bankTab.toString());
//    }
//
//    public void clickingOnCurrentAccountTab() {
//        waitUntilElementToBeClickable(_currentAcTab, 20);
//        Reporter.addStepLog("Clicking on bank tab : " + _currentAcTab.toString());
//        clickOnElement(_currentAcTab);
//        log.info("Clicking on bank tab : " + _currentAcTab.toString());
//    }
//
//    public String verifyCurrentAccountText(String currntText) {
//        return getTextFromElement(_currentAccountText);
//    }


//    public void mouseHoverOnBankDropDownLink() {
//        Reporter.addStepLog(" Mouse hover on " + _bankDropDownLink.toString() + "<br>");
//        mouseHover(_bankDropDownLink);
//        log.info(" Mouse hover on " + _bankDropDownLink.toString());
//    }
//
//    public void mouseHoverOnBorrowDropDownLink() {
//        Reporter.addStepLog(" Mouse hover on " + _bankDropDownLink.toString() + "<br>");
//        mouseHover(_borrowDropDownLink);
//        log.info(" Mouse hover on " + _bankDropDownLink.toString());
//    }
//}
