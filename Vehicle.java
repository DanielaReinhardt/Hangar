public abstract class Vehicle{
    private String brand;
    private int kilometers;
    //attributes

    public Vehicle(String brand){
        this.brand = brand;
        this.kilometers = 0;
        //constructors initialised

    }
       
    
    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getKilometers(){
        return this.kilometers;
    }

    public void setKilometers(int kilometers){
        this.kilometers=kilometers;

    }
    public abstract String doStuff();
    //abstract method (7)
    

}


