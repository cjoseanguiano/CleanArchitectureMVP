package com.mvp.carlosanguiano.cleanarchitecturemvp.ui.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Carlos Anguiano on 3/25/18.
 * For more info contact: c.joseanguiano@gmail.com
 */


public class CommonUtils {

    public static boolean isEmailValid(String emailId) {
        Pattern pattern;
        Matcher matcher;
        final String EMAIL_PATTERN =
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(emailId);
        return matcher.matches();
    }
}
