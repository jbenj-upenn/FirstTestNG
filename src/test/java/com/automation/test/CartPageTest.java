package com.automation.test;

import org.testng.annotations.Test;

public class CartPageTest extends BaseTest{

    @Test
    public void verifyUserCanRemoveItemFromCart(){
        System.out.println("Test: remove item");
    }

    @Test
    public void verifyUserCanAddItemIntoCar(){
        System.out.println("Test: add item");
    }

    @Test
    public void verifyUserCanChangeQuantity(){
        System.out.println("Test: change quantity");
    }
}
