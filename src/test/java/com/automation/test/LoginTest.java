package com.automation.test;

import org.testng.annotations.*;

public class LoginTest extends BaseTest{ //pom.xml with automatically grab files with "Test" in the name, but it's a convention as well



    //============================================

    @Test
    public void verifyLoginSuccess(){
        System.out.println("Open website");
        System.out.println("Login");
        System.out.println("Verify Successful Login");
    }

    @Test
    public void secondTest(){
        System.out.println("Second Test");
    }

    @Test
    public void thirdTest(){
        System.out.println("Third Test");
    }

    //============================================


}
