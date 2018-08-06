package second;

import java.sql.Struct;

public class MakeVehicle {
    protected String vehicleName;

    public MakeVehicle (String vehicleName){ this.vehicleName = vehicleName;
    if (vehicleName.equals("Ship")){
       Ship newShip = MakeVehicle.this.makeShip();
    }
    }


    public Ship makeShip(){
        String vehicleName = "Ship";
        Ship template = new Ship();

        template.switchingGear(vehicleName);
        template.powerMotor(vehicleName);
        template.fly(vehicleName);
        template.getSpeed(vehicleName);
        template.publicTransport(vehicleName);
        return template;
    }

}
