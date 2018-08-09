package second.dataType;

public enum CarModels {

    BMW ("BMW"),
    AUDI ("Audi");

    private String carModel;

    CarModels(String carModel) {this.carModel = carModel;}

    @Override
    public String toString() {
        return carModel;
    }
}
