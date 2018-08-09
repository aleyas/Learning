package second.model;

import second.dataType.DeliveryTime;
import second.dataType.VehicleName;

public class Train extends Vehicle {

    public Train() {
        super(VehicleName.Train,5, DeliveryTime.THIRDQUARTER);
    }

    @Override
    public int orderToMake() {
        System.out.println("We made " + count + " of " + name + " delivery of " + dateToDelivery);
        return count;
    }
}
