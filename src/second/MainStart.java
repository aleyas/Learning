package second;

import java.util.ArrayList;
import java.util.List;

public class MainStart {

    public static void main (String [] args){

        //List of orders
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle(VehicleName.AIRPLANE,4));
        vehicles.add(new Vehicle(VehicleName.Bus,15));
        vehicles.add(new Vehicle(VehicleName.SHIP,3));
        vehicles.add(new Vehicle(VehicleName.CAR,35));
        vehicles.add(new Vehicle(VehicleName.Train,5));
        vehicles.add(new Vehicle(VehicleName.Train,5));

        //give list of orders to make
        MakeVehicle makeOrder = new MakeVehicle();
        int totalCount = makeOrder.getOrder(vehicles);

        System.out.println("Total Orders was: " + totalCount);

    }


}




