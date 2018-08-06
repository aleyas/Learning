package second;

import java.util.Random;

public class Moving  {


    public int getSpeed(String vehicleName){
        if (vehicleName.equals("Ship")){
            return 70; }
        else if (vehicleName.equals("Train")){
            return 270;
        } else if (vehicleName.equals("Airplane")){
            return 1200;
        } else if (vehicleName.equals("Auto")){
            return 240;
        } else {
            return 0;
        }
    }
    public String switchingGear(String vehicleName){
        if (vehicleName.equals("Ship")){
            return "nothing"; }
        else if (vehicleName.equals("Train")){
            return "Two";
        } else if (vehicleName.equals("Airplane")){
            return "Nothing";
        } else if (vehicleName.equals("Auto")){
            return "6";
        } else {
            return "No Informatoin!";
        }
    }
    public int powerMotor(String vehicleName){
        if (vehicleName.equals("Ship")){
            return 70000;
        } else if (vehicleName.equals("Train")){
            return 10000;
        } else if (vehicleName.equals("Airplane")){
            return 95000;
        } else if (vehicleName.equals("Auto")){
            return 700;
        } else {
            return 0;
        }
    }
    public boolean publicTransport(String vehicleName){
        return vehicleName.equals("Ship") ? false : true;
    }
    public int distance (String startPoint, String target){
        Random randi = new Random();
        int x = (randi.nextInt(10000));
        return x;
    }
    public boolean fly(String vehicleName){
        return vehicleName.equals("Airplane") ? true : false;

    }
}
