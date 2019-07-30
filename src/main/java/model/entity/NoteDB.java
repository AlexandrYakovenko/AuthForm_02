package model.entity;

import static model.entity.Group.*;

public enum NoteDB {
    USER_1("Yakovenko", "Alexandr", "Fedorovich",
            "yakovenko", "qwerty", FIRST,
            "0445553311", "0631272132", "0681142830",
            "yakovenko9814@ukr.net", "skype",
            "02192", "Kiev", "Yunosti", "9", "127",
            "22-10-2018", "22-04-2019"),
    USER_2("Yakovenko", "Alexandr", "Fedorovich",
            "yakoven", "qwerty", SECOND,
            "0445553311", "0631272132", "0681142830",
            "yakovenko9814@ukr.net", "skype",
            "02192", "Kiev", "Yunosti", "9", "127",
            "22-10-2018", "22-04-2019"),
    USER_3("Yakovenko", "Alexandr", "Fedorovich",
            "yakov", "qwerty", THIRD,
            "0445553311", "0631272132", "0681142830",
            "yakovenko9814@ukr.net", "skype",
            "02192", "Kiev", "Yunosti", "9", "127",
            "22-10-2018", "22-04-2019");

    private String surname;
    private String name;
    private String patronymic;
    private String nickname;
    private String comment;
    private Group group;
    private String homeNumber;
    private String firstMobileNumber;
    private String secondMobileNumber;
    private String email;
    private String skype;
    private String index;
    private String city;
    private String street;
    private String houseNumber;
    private String flatNumber;
    private String registrationDate;
    private String changingDataDate;

    NoteDB(String surname, String name, String patronymic,
           String nickname, String comment, Group group,
           String homeNumber, String firstMobileNumber,
           String secondMobileNumber, String email,
           String skype, String index, String city,
           String street, String houseNumber,
           String flatNumber, String registrationDate,
           String changingDataDate) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.nickname = nickname;
        this.comment = comment;
        this.group = group;
        this.homeNumber = homeNumber;
        this.firstMobileNumber = firstMobileNumber;
        this.secondMobileNumber = secondMobileNumber;
        this.email = email;
        this.skype = skype;
        this.index = index;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.registrationDate = registrationDate;
        this.changingDataDate = changingDataDate;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    //getter returns name of group(String)
    public String getGroup() {
        return group.name();
    }
    //setter param is String, but convert in type of Group
    public void setGroup(String group) throws IllegalArgumentException {
        this.group = Group.valueOf(group);
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getFirstMobileNumber() {
        return firstMobileNumber;
    }

    public void setFirstMobileNumber(String firstMobileNumber) {
        this.firstMobileNumber = firstMobileNumber;
    }

    public String getSecondMobileNumber() {
        return secondMobileNumber;
    }

    public void setSecondMobileNumber(String secondMobileNumber) {
        this.secondMobileNumber = secondMobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getRegistartionDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getChangingDataDate() {
        return changingDataDate;
    }

    public void setChangingDataDate(String changingDataDate) {
        this.changingDataDate = changingDataDate;
    }
}
