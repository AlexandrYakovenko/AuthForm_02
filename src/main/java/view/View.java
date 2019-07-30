package view;

import java.util.Locale;
import java.util.ResourceBundle;

import static view.TextConstant.*;

public class View {
    private static final String MESSAGE_BUNDLE = "message";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(MESSAGE_BUNDLE,
                    new Locale("en"));
                    /*new Locale("ua");*/



    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concatMessage(String... message) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : message) {
            stringBuilder.append(s);
        }
        return new String(stringBuilder);
    }

    public void printStringInput(String message) {
        printMessage(concatMessage(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongInput(String message) {
        printMessage(concatMessage(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }


}
