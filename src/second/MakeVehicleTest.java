package second;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MakeVehicleTest extends TestCase {

    @Test
    public void testUnit (){

    List<Vehicle> myList = new ArrayList<>();
    myList.add(new Vehicle(VehicleName.AIRPLANE,4));
    assertEquals(4, new MakeVehicle().getOrder(myList));
    assertEquals(4, new Vehicle(VehicleName.AIRPLANE,4).orderToMake());
    }

}

