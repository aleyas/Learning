package second;

import java.util.HashMap;
import java.util.Map;

public class Auto extends Moving {

    public int getSpeed(Map<String, Integer> autoName) {
        Map<String, Integer> autoSpeedList = new HashMap<String, Integer>();



        autoSpeedList.put("Porsche", 320);
        autoSpeedList.put("BMW", 260);
        autoSpeedList.put("VW", 220);
        autoSpeedList.put("Audi", 280);

        autoSpeedList.values().forEach(p -> {
            if (p.equals(autoName.values())){
                System.out.println("It is Value" + p);
            }
                }
        );
        return 0;
    }

    @Override
    public int powerMotor (String vehicleName) {
        if (vehicleName.equals("BMW")){
            return 120;
        } else{
            return 0;
        }
    }

    @Override
    public String switchingGear(String vehicleName) {
        if (vehicleName.equals("BMW")) {
            return "Speed from1 to 2";
        } else {
            return null;
        }
    }

}
