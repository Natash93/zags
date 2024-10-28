package by.nn.zags.model;

public class AdminModel {
    private String surname;
    private String name;
    private String middleName;
    private String phone;
    private String passport;
    private String birthDate;

    public AdminModel() {
    }

    public AdminModel(String surname, String name, String middleName, String phone, String passport, String birthDate) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.phone = phone;
        this.passport = passport;
        this.birthDate = birthDate;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}

