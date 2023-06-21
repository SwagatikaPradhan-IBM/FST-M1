public class Activity8 {
    public static void main(String[] args)
    {
        try
        {
            Activity8.exceptionTest("Will print to console");
            Activity8.exceptionTest(null);
            Activity8.exceptionTest("Won't execute");
        }
        catch(Activity8_CustomException e)
        {
            System.out.println("Inside catch block "+e.getMessage());
        }
    }
    static void exceptionTest(String custom) throws Activity8_CustomException
    {
        if(custom == null)
        {
            throw new Activity8_CustomException("String value is null");
        }
        else
        {
            System.out.println(custom);
        }
    }
}
