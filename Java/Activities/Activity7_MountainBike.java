public class Activity7_MountainBike extends Activity7_Bicycle{
    public int seatHeight;
    Activity7_MountainBike(int gears, int currentSpeed, int seatHeight)
    {
        super(gears, currentSpeed);
        this.seatHeight=seatHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    public String bicycleDesc() {
        return ("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed
        +" \n Seat Height is "+seatHeight);
    }
}
