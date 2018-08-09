package second.test;

import junit.framework.TestCase;
import org.junit.Test;
import second.MakeVehicle;
import second.dataType.CarModels;
import second.model.Car;
import second.model.Vehicle;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class MakeVehicleTest extends TestCase {

    @Test
    public void testUnit () {

    List<Vehicle> myList = new ArrayList<>();
    myList.add(new Car(CarModels.AUDI));

    assertEquals(4, new MakeVehicle().getOrder(myList));
    assertEquals(4, new Car(CarModels.AUDI).orderToMake());
    }

}

