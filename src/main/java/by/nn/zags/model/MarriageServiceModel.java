package by.nn.zags.model;

public class MarriageServiceModel {
     private String registrationDate;
     private String newSurname;
     private String spouseSurname;
     private String spouseName;
     private String spouseMiddleName;
     private String spouseBirthDate;
     private String spousePassport;

    public MarriageServiceModel() {
    }

    public MarriageServiceModel(String registrationDate, String newSurname, String spouseSurname, String spouseName, String spouseMiddleName, String spouseBirthDate, String spousePassport) {
        this.registrationDate = registrationDate;
        this.newSurname = newSurname;
        this.spouseSurname = spouseSurname;
        this.spouseName = spouseName;
        this.spouseMiddleName = spouseMiddleName;
        this.spouseBirthDate = spouseBirthDate;
        this.spousePassport = spousePassport;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getNewSurname() {
        return newSurname;
    }

    public void setNewSurname(String newSurname) {
        this.newSurname = newSurname;
    }

    public String getSpouseSurname() {
        return spouseSurname;
    }

    public void setSpouseSurname(String spouseSurname) {
        this.spouseSurname = spouseSurname;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getSpouseMiddleName() {
        return spouseMiddleName;
    }

    public void setSpouseMiddleName(String spouseMiddleName) {
        this.spouseMiddleName = spouseMiddleName;
    }

    public String getSpouseBirthDate() {
        return spouseBirthDate;
    }

    public void setSpouseBirthDate(String spouseBirthDate) {
        this.spouseBirthDate = spouseBirthDate;
    }

    public String getSpousePassport() {
        return spousePassport;
    }

    public void setSpousePassport(String spousePassport) {
        this.spousePassport = spousePassport;
    }

    @Override
    public String toString() {
        return "MarriageServiceModel{" +
                "registrationDate='" + registrationDate + '\'' +
                ", newSurname='" + newSurname + '\'' +
                ", spouseSurname='" + spouseSurname + '\'' +
                ", spouseName='" + spouseName + '\'' +
                ", spouseMiddleName='" + spouseMiddleName + '\'' +
                ", spouseBirthDate='" + spouseBirthDate + '\'' +
                ", spousePassport='" + spousePassport + '\'' +
                '}';
    }
}
