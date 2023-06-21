public class Activity1_Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    Activity1_Car(){
        tyres=4;
        doors=4;
    }
    public void displayCharacteristics()
    {
        System.out.println("Color of car is "+color);
        System.out.println("Transmission of car is "+transmission);
        System.out.println("Make of car is "+make);
        System.out.println("No of doors in car is "+doors);
        System.out.println("No of tyres in car is "+tyres);
    }
    public void accelarate()
    {
        System.out.println("Car is moving forward.");
    }
    public void brake()
    {
        System.out.println("Car has stopped.");
    }
}
