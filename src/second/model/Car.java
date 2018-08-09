package second.model;

import second.dataType.CarModels;
import second.dataType.DeliveryTime;
import second.dataType.VehicleName;

public class Car extends Vehicle {

    protected CarModels carModel;


    public Car(CarModels carModel){
        super(VehicleName.CAR,4, DeliveryTime.FIRSTQUARTER);
        this.carModel = carModel;
    }


    @Override
    public int orderToMake() {
        System.out.println("We made " + count + " of " + name + " model "+ carModel + " delivery of " + dateToDelivery);
        return count;
    }
}
