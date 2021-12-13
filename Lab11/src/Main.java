import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class HorseThread implements Runnable
{
    private Object mLock;
    private String mName;

    public HorseThread(Object lock, String name)
    {
        mLock = lock;
        mName = name;
    }

    @Override
    public void run()
    {
        synchronized (mLock)
        {
            String s = "";
            for (int i = 0; i < 10001; i++)
            {
                if (i >= 10000)
                {
                    s = " has finished";
                    System.out.println(mName + s);
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    mLock.notify();

                    try
                    {
                        mLock.wait(1000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

public class Main
{
    public static void RunThreads(int horsesCount)
    {
        Object lock = new Object();
        List<Thread> horses = new ArrayList<Thread>(horsesCount);
        String number;

        for (int i = 1; i < horsesCount + 1; ++i)
        {
            number = i < 10 ? ("0" + i) : "" + i;
            Thread horse_i = new Thread(new HorseThread(lock, "Horse " + number));
            horses.add(horse_i);
        }

        for (int i = 0; i < horsesCount; ++i)
        {
            horses.get(i).start();
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter horses count: ");
        int n = in.nextInt();
        RunThreads(n);
    }
}
