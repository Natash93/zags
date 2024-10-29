package by.nn.zags.model;

public class BirthServiceModel {
    private String birthPlace;
    private String motherName;
    private String fatherName;

    public BirthServiceModel() {
    }

    public BirthServiceModel(String birthPlace, String motherName, String fatherName) {
        this.birthPlace = birthPlace;
        this.motherName = motherName;
        this.fatherName = fatherName;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Override
    public String toString() {
        return "BirthServiceModel{" +
                "birthPlace='" + birthPlace + '\'' +
                ", motherName='" + motherName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }
}
