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
}
