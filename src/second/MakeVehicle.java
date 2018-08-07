package second;

import java.util.List;

public class MakeVehicle {

    //read counts per order
    public int getOrder(List<Vehicle> vehicles) {

        int totalOrder = 0;
        for (Vehicle p : vehicles) {
            //send a order to make
            totalOrder += p.orderToMake();
        }
        return totalOrder;
    }
}

