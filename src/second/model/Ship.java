package second.model;

import second.dataType.DeliveryTime;
import second.dataType.VehicleName;

public class Ship extends Vehicle {


    public Ship() {
        super(VehicleName.SHIP,4, DeliveryTime.FIRSTQUARTER);
    }

    @Override
    public int orderToMake() {
        System.out.println("We made " + count + " of " + name + " delivery of " + dateToDelivery);
        return count;
    }
}
