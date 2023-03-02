package com.bridge.JUnit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainJUnit {
    public boolean checkFirstName(String firstName){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher matcher =pattern.matcher(firstName);
        return matcher.matches();
    }
    public boolean checkLastName(String lastName){
        Pattern pattern =Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();

    }
    public boolean checkEmail(String email){
        Pattern pattern =Pattern.compile("^([a-zA-Z\\.]+)([a-zA-Z0-9\\.]+)@([a-zA-Z0-9\\._]+)\\.([a-z]{2,8})(\\.[a-z]{2,8})?$");
        Matcher matcher=pattern.matcher(email);
        return matcher.matches();
    }
    public boolean checkMobileFormate(String mobileNum){
        Pattern pattern = Pattern.compile("^([0-9]{2}+)[ ]([6-9]{1,1}+)([0-9]{9,9})$");
        Matcher matcher =pattern.matcher(mobileNum);
        return matcher.matches();
    }
}
