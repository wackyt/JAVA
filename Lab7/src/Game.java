import java.util.ArrayDeque;
import java.util.Queue;

public class Game
{
    Queue<Integer> first, second;

    public Game(String fp, String sp)
    {
        first = new ArrayDeque<>();
        second = new ArrayDeque<>();
        for (int i = 0; i < 5; i++)
        {
            first.add(Integer.parseInt(fp.substring(i, i + 1)));
            second.add(Integer.parseInt(sp.substring(i, i + 1)));
        }
    }

    public String Play()
    {
        int count = 0;
        while (!first.isEmpty() && !second.isEmpty() && count < 106)
        {
            if(first.peek() > second.peek() && second.peek() != 0)
            {
                first.add(first.remove());
                first.add(second.remove());
            }
            else
            {
                second.add(first.remove());
                second.add(second.remove());
            }
            count++;
        }

        String res = "";
        if (count >= 106)
        {
            res = "botva";
        }
        else
        {
            if(first.isEmpty())
            {
                res = "second " + count;
            }
            else
            if (second.isEmpty())
            {
                res += "first " + count;
            }
        }

        return res;
    }
}
