import java.util.Date;

public class DatePrinter implements Runnable
{
    private java.util.Date date = new java.util.Date();
    private int i = 1;

    @Override
    public void run()
    {
        while(i <= 200)
        {
            System.out.println(date);
            i++;
        }
    }
}
