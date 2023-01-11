package com.automation.test;

import org.testng.annotations.*;

//Creating a super class for tests that contain @Before and @After annotations
//Use the abstract keyword so no one can make an object of BaseTest
public abstract class BaseTest {
    @BeforeSuite
    public void bSuite(){
        System.out.println("Before Suite.");
    }

    @BeforeClass
    public void bClass(){
        System.out.println("Before Class.");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Open Browser.");
//        System.out.println("Open Database Connection.");
    }

    @AfterMethod
    public void cleanUp(){
        System.out.println("Close Browser.");
//        System.out.println("Close Database Connection.");
    }

    @AfterClass
    public void aClass(){
        System.out.println("After Class.");
    }

    @AfterSuite
    public void aSuite(){
        System.out.println("After Suite.");
    }
}
