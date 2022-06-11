package exams.qfahszz;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Set;

public class Sector extends Thread
{
    private final Set<Double> set;
    private final PrintWriter writer;
    private int seconds = 0;
    public Sector(Set<Double> in, PrintWriter out)
    {
        set = in;
        writer = out;
    }
    @Override
    public void run()
    {
        Random random = new Random();
        try
        {
            while(true)
            {
                sleep(1000);
                seconds++;
                synchronized (set)
                {
                    set.add(random.nextDouble());
                }
            }

        }
        catch(InterruptedException e)
        {
            double sum = 0;
            synchronized (set)
            {
                writer.println(set.stream().mapToDouble(Double::doubleValue).sum() / seconds);
            }
        }
    }
}
