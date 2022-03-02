

public class Hangar {
    public static void main (String[] args){
        Car Mercedes = new Car("Mercedes");
            Mercedes.setBrand("Mercedes");
            System.out.println("I am " + Mercedes.getBrand() + " and I go " + Mercedes.doStuff());
        Boat Bayliner = new Boat("Bayliner");
            Bayliner.setBrand("Bayliner");
            System.out.println("I am " + Bayliner.getBrand() + " and I go " + Bayliner.doStuff());
        }
    }

