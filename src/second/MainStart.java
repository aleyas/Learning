package second;

import second.dataType.CarModels;
import second.model.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class MainStart {

    private static CarModels carModel;

    public static void main (String [] args) {

        //List of orders
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car(CarModels.BMW));
        vehicles.add(new Car(CarModels.AUDI));
        vehicles.add(new Ship());
        vehicles.add(new Bus());
        vehicles.add(new Airplane());
        vehicles.add(new Train());

        //give list of orders to make
        MakeVehicle makeOrder = new MakeVehicle();
        int totalCount = makeOrder.getOrder(vehicles);

        System.out.println("Total Orders was: " + totalCount);

    }


}




