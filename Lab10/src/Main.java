class PingPongThread implements Runnable
{
    private final Object mLock;
    private final String mName;

    public PingPongThread(Object lock, String name)
    {
        mLock = lock;
        mName = name;
    }

    @Override
    public void run()
    {
        synchronized (mLock)
        {
            while (true)
            {
                System.out.println(mName);
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

public class Main
{
    public static void main(String[] args)
    {
        Object lock = new Object();
        Thread ping = new Thread(new PingPongThread(lock, "Ping"));
        Thread pong = new Thread(new PingPongThread(lock, "Pong"));
        ping.start();
        pong.start();
    }
}
