package second.model;

import second.dataType.DeliveryTime;
import second.dataType.VehicleName;

public class Airplane extends Vehicle {


    public Airplane() {
        super(VehicleName.AIRPLANE,5, DeliveryTime.THIRDQUARTER);
    }

    @Override
    public int orderToMake() {
        System.out.println("We made " + count + " of " + name + " delivery of " + dateToDelivery);
        return count;
    }
}
