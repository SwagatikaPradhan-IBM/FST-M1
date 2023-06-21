public class Activity8_CustomException extends Exception
{
    private String message=null;
    public Activity8_CustomException(String message)
    {
        this.message=message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
