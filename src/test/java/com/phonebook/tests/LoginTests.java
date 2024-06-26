package com.phonebook.tests;

import com.phonebook.data.UserData;
import com.phonebook.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        if(!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnSignoutButton();
        }
    }
    @Test
    public void loginWithValidData(){
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginRegisterForm(new User().setEmail(UserData.EMAIL)
                .setPassword(UserData.PASSWORD));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isSignOutButtonPresent());
    }
    @Test
    public void loginNegativeTestWithoutEmail(){
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginRegisterForm(new User().setPassword(UserData.PASSWORD));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isAlertPresent());

    }

}
