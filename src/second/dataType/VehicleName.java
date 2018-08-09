package second.dataType;

public enum VehicleName {

    AIRPLANE("Airplane"),
    CAR ("Car"),
    SHIP("Ship"),
    Train ("Train"),
    BUS ("Bus");

    private String name;

    VehicleName(String  name){this.name = name;}

    @Override
    public String toString() {
        return name;
    }
}
