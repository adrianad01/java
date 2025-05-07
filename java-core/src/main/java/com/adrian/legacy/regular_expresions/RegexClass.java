package com.adrian.legacy.regular_expresions;

public class RegexClass {

    public static void main(String[] args) {


        if (isValidEmail("a@a.com")){
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static final String UUID_REGEX = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[1-5][0-9a-fA-F]{3}-[89abAB][0-9a-fA-F]{3}-[0-9a-fA-F]{12}$";
    public static final String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    public static final String RFC_NATURAL_PERSON_REGEX = "^([A-ZÑ]|\\&){4}[0-9]{2}(0[1-9]|1[0-2])([12][0-9]|0[1-9]|3[01])[A-Z0-9]{3}$";
    public static final String RFC_LEGAL_PERSON_REGEX = "^([A-ZÑ]|\\&){3}[0-9]{2}(0[1-9]|1[0-2])([12][0-9]|0[1-9]|3[01])[A-Z0-9]{3}";

    public static boolean isValidRFC(String rfc) {
        return rfc.matches(RFC_NATURAL_PERSON_REGEX);
    }

    public static boolean isValidEmail(String email) {
        return email.matches(EMAIL_REGEX);
    }
}
