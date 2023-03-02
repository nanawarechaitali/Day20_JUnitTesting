package com.bridge.JUnit;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainJUnitTesting {
    @Test
    public void givenFirstCharacterUpperCase_whenTestedFirstName_shouldReturnTrue(){
        MainJUnit firstName = new MainJUnit();
        boolean result = firstName.checkFirstName("Chaitali");
        assertTrue(result);

    }
    @Test
    public void givenFirstCharacterUpperCase_whenTestedLastName_shouldReturnTrue(){
        MainJUnit lastName=new MainJUnit();
        boolean result = lastName.checkLastName("Nanaware");
        assertTrue(result);
    }
    @Test
    public void emailCheck_shouldReturnTrue(){
        MainJUnit email=new MainJUnit();
        boolean result = email.checkEmail("nanawarechaitali4196@gmail.com");
        assertTrue(result);
    }
    @Test
    public void mobileNumCheck_shouldReturnTrue(){
        MainJUnit mobileNum = new MainJUnit();
        boolean result = mobileNum.checkMobileFormate("91 9421642048");
        assertTrue(result);

    }
}
