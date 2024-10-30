package by.nn.zags.model;

public class DeathServiceModel {
    private String DateOfDeath;
    private String PlaceOfDeath;

    public DeathServiceModel() {
    }

    public DeathServiceModel(String dateOfDeath, String placeOfDeath) {
        DateOfDeath = dateOfDeath;
        PlaceOfDeath = placeOfDeath;
    }

    public String getDateOfDeath() {
        return DateOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        DateOfDeath = dateOfDeath;
    }

    public String getPlaceOfDeath() {
        return PlaceOfDeath;
    }

    public void setPlaceOfDeath(String placeOfDeath) {
        PlaceOfDeath = placeOfDeath;
    }

    @Override
    public String toString() {
        return "DeathServiceModel{" +
                "DateOfDeath='" + DateOfDeath + '\'' +
                ", PlaceOfDeath='" + PlaceOfDeath + '\'' +
                '}';
    }
}
