package controller;

import static view.TextConstant.*;

import model.entity.Note;
import view.View;

import java.util.Scanner;

public class InputNote {
    private Note note;
    private View view;
    private UtilityController uC;
    private Scanner sc;

    public InputNote(Note note, View view, Scanner sc) {
        this.note = note;
        this.view = view;
        this.sc = sc;
        uC = new UtilityController(view, sc);
    }

    public Note writeNote() {
        note.setSurname(
                uC.inputStringData(
                        INPUT_SURNAME, uC.checkRegEx("full_name")));
        note.setName(
                uC.inputStringData(
                        INPUT_NAME, uC.checkRegEx("full_name")));
        note.setPatronymic(
                uC.inputStringData(
                        INPUT_PATRONYMIC, uC.checkRegEx("full_name")));
        note.setNickname(
                uC.inputStringData(
                        INPUT_NICKNAME, uC.checkRegEx("nickname")));
        note.setComment(
                uC.inputStringData(
                        INPUT_COMMENTARY, uC.checkRegEx("comment")));
        note.setGroup(
                uC.inputStringData(
                        INPUT_GROUP, uC.checkRegEx("group")));
        note.setHomeNumber(
                uC.inputStringData(
                        INPUT_HOME_PHONE, uC.checkRegEx("home_number")));
        note.setFirstMobileNumber(
                uC.inputStringData(
                        INPUT_FIRST_MOBILE_PHONE, uC.checkRegEx("mobile_number")));
        note.setSecondMobileNumber(
                uC.inputStringData(
                        INPUT_SECOND_MOBILE_PHONE, uC.checkRegEx("mobile_number")));
        note.setEmail(
                uC.inputStringData(
                        INPUT_EMAIL, uC.checkRegEx("email")));
        note.setSkype(
                uC.inputStringData(
                        INPUT_SKYPE, uC.checkRegEx("skype")));
        note.setIndex(
                uC.inputStringData(
                        INPUT_INDEX, uC.checkRegEx("index")));
        note.setCity(
                uC.inputStringData(
                        INPUT_CITY, uC.checkRegEx("city")));
        note.setStreet(
                uC.inputStringData(
                        INPUT_STREET, uC.checkRegEx("street")));
        note.setHouseNumber(
                uC.inputStringData(
                        INPUT_HOUSE_NUMBER, uC.checkRegEx("number")));
        note.setFlatNumber(
                uC.inputStringData(
                        INPUT_FLAT_NUMBER, uC.checkRegEx("number")));
        note.setRegistrationDate(
                uC.inputStringData(
                        INPUT_REGISTRATION_DATE, uC.checkRegEx("data")));
        note.setChangingDataDate(
                uC.inputStringData(
                        INPUT_CHANGING_DATA_DATE, uC.checkRegEx("data")));

        return note;
    }

    public Note rewriteNickname(Note note) {
        note.setNickname(
                uC.inputStringData(
                        WRONG_NICKNAME, uC.checkRegEx("nickname")));
        return  note;
    }
}
