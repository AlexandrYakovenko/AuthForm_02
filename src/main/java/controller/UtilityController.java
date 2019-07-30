package controller;

import view.View;

import java.util.ResourceBundle;
import java.util.Scanner;

import static controller.RegexContainer.*;

public class UtilityController {
    private View view;
    private Scanner sc;

    public UtilityController( View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    String inputStringData(String message, String regex) {
        String res;
        view.printStringInput(message);
        while (!(sc.hasNext() &&
                (res = sc.next()).matches(regex))) {
            view.printWrongInput(message);
        }
        return res;
    }

    String checkRegEx(String regex) {
        String locale =
                (String.valueOf(View.bundle.getLocale()).equals("ua")) ? "ua" : "en" ;

        if(locale.equals("en")) {
            switch(regex) {
                case("full_name") : return REGEX_FULL_NAME_EN ;
                case("nickname") : return REGEX_NICKNAME_EN;
                case("comment") : return REGEX_COMMENT;
                case("group") : return REGEX_GROUP;
                case("home_number") : return REGEX_HOME_PHONE;
                case("mobile_number") : return REGEX_MOBILE_PHONE;
                case("email") : return REGEX_EMAIL;
                case("skype") : return REGEX_SKYPE;
                case("index") : return REGEX_INDEX;
                case("city") : return REGEX_CITY;
                case("street") : return REGEX_STREET;
                case("number") : return REGEX_NUMBER;
                case("data") : return REGEX_DATE;
                default: return null;
            }
        } else {
            switch(regex) {
                case("full_name") : return REGEX_FULL_NAME_UA;
                case("nickname") : return REGEX_NICKNAME_EN;
                case("comment") : return REGEX_COMMENT;
                case("group") : return REGEX_GROUP;
                case("home_number") : return REGEX_HOME_PHONE;
                case("mobile_number") : return REGEX_MOBILE_PHONE;
                case("email") : return REGEX_EMAIL;
                case("skype") : return REGEX_SKYPE;
                case("index") : return REGEX_INDEX;
                case("city") : return REGEX_CITY;
                case("street") : return REGEX_STREET;
                case("number") : return REGEX_NUMBER;
                case("data") : return REGEX_DATE;
                default: return REGEX_DEFAULT;
            }
        }
    }
}