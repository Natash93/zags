package by.nn.zags.model;

public class ApplicantModel {
    private String surname;
    private String name;
    private String middleName;
    private String phone;
    private String passport;
    private String address;

    public ApplicantModel() {
    }

    public ApplicantModel(String surname, String name, String middleName, String phone, String passport, String address) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.phone = phone;
        this.passport = passport;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
