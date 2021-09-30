public class CountPrinter implements Runnable
{
    private int i = 1;

    @Override
    public void run()
    {
        while(i <= 4000)
        {
            System.out.println(i);
            i++;
        }
    }
}
