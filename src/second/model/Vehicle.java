package second.model;

import second.dataType.DeliveryTime;
import second.dataType.VehicleName;

public abstract class Vehicle {

    protected VehicleName name;
    protected int count;
    protected DeliveryTime dateToDelivery;

    public Vehicle (VehicleName name, int count, DeliveryTime dateToDelivery){
        this.name = name;
        this.count = count;
        this.dateToDelivery = dateToDelivery;
    }

    public VehicleName getName() { return name;}
    public void setName (VehicleName name) {this.name = name;}
    public void setCount (int count){this.count = count;}


    //make the order
    public int orderToMake (){ return 0;}

}
