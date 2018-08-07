package second;

public class Vehicle {

    private VehicleName name;
    private int count;

    public Vehicle (VehicleName name, int count){
        this.name = name;
        this.count = count;
    }

    public VehicleName getName() { return name;}
    public void setName (VehicleName name) {this.name = name;}

    public void setCount (int count){this.count = count;}


    //make the order
    public int orderToMake (){
        System.out.println("We made " + count + " of " + name  );
        return count;
    }

}
