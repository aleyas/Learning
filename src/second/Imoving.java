package second;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public interface Imoving {

    int getSpeed(String vehicleName);
    String switchingGear(String vehicleName);
    int  powerMotor(String vehicleName);
    boolean publicTransport(String vehicleName);
    int distance (String startPoint, String target);
    boolean fly(String vehicleName);
}
