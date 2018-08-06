package second;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainStart {

    public void order(){
        System.out.println("choise your model"+ "Porsche"+"");
    }

    public static void main (String args[]) {

    Moving myObject = new Moving();
        System.out.println("Airplane could fly: " + myObject.fly("Airplane"));

    MakeVehicle newVehicle = new MakeVehicle("Ship");


    }



}





        /*
        Map<String, Integer> myValue = new HashMap<>();
        myValue.put("Porsche", 320);
        Auto myTest = new Auto();
        myTest.getSpeed(myValue);


        String carName = "BMW";
        List<String> carNames = new ArrayList<String>();

        carNames.add("BMW");
        carNames.add("VW");
        carNames.add("Audi");
        carNames.add("Porsche");

        carNames.forEach(p -> {
            if (p.equals(carName)){
                System.out.println(carName);
            }
        });
*/
