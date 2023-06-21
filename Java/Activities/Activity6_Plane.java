import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity6_Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
    Activity6_Plane(int maxPassengers)
    {
        this.maxPassengers=maxPassengers;
        this.passengers=new ArrayList<>();
    }
    public void onboard(String name)
    {
        this.passengers.add(name);
    }
    public Date takeOff()
    {
        this.lastTimeTookOf=new Date();
        return lastTimeTookOf;
    }
    public void land()
    {
        this.lastTimeLanded=new Date();
        this.passengers.clear();
    }
    public Date getLastTimeLanded()
    {
        return lastTimeLanded;
    }
    public List getPassengers()
    {
        return passengers;
    }

}
