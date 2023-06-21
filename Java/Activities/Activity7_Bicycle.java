public class Activity7_Bicycle implements Activity7_BicycleParts, Activity7_BicycleOperations
{
    public int gears;
    public int currentSpeed;
    Activity7_Bicycle(int gears, int currentSpeed)
    {
        this.gears=gears;
        this.currentSpeed=currentSpeed;
    }
    public void applyBrake(int decrement)
    {
        currentSpeed=currentSpeed-decrement;
        System.out.println("Current Speed "+currentSpeed);
    }
    public void speedUp(int increment)
    {
        currentSpeed=currentSpeed+increment;
        System.out.println("Current Speed "+currentSpeed);
    }
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}
