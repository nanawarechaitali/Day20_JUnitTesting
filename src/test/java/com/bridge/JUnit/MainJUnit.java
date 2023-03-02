package com.bridge.JUnit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainJUnit {
    public boolean checkFirstName(String firstName){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher matcher =pattern.matcher(firstName);
        return matcher.matches();
    }
}
