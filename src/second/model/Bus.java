package second.model;

import second.dataType.DeliveryTime;
import second.dataType.VehicleName;

public class Bus extends Vehicle {


    public Bus(){
        super(VehicleName.BUS,35, DeliveryTime.QUARTERQUARTER);
    }

    @Override
    public int orderToMake() {
        System.out.println("We made " + count + " of " + name + " delivery of " + dateToDelivery);
        return count;
    }
}
