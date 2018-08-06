package second;

public class Airplane extends Moving implements Imoving{


    @Override
    public boolean fly(String vehicleName) {
        if (vehicleName.equals("Airplane")){
            return true;
        }
        return super.fly(vehicleName);
    }
}
