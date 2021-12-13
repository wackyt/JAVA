import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static List<String> Push(List<String> l, String s)
    {
        l.add(s);
        return l;
    }

    public static List<String> Remove(List<String> l, int i)
    {
        l.remove(i);
        return l;
    }

    public static List<String> Set(List<String> l, int i, String value)
    {
        l.set(i, value);
        return l;
    }

    public static List<String> Shuffle(List<String> l)
    {
        Collections.shuffle(l);
        return l;
    }

    public static String Select(List<String> l)
    {
        return l.get((int) (Math.random() * 2));
    }

    public static int IndexOf(List<String> l, String s)
    {
        return l.indexOf(s);
    }

    public static String Find(List<String> l, String s)
    {
        int idx = IndexOf(l, s);
        if (idx == -1)
            return "Not Exist";
        return l.get(idx);
    }

    public static List<String> Reverse(List<String> l)
    {
        Collections.reverse(l);
        return l;
    }

    public static void main(String[] args)
    {
        String Neptune = new String("Neptune");
        String Mars = new String("Mars");
        String Jupiter = new String("Jupiter");
        String Saturn = new String("Saturn");
        String Uranus = new String("Uranus");
        String Earth = new String("Earth");
        String Mercury = new String("Mercury");
        String Venus = new String("Venus");

        List<String> mutableList = new ArrayList<String>(Arrays.asList(Mercury, Venus, Earth, Mars));
        List<String> immutableList = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(Jupiter, Saturn, Uranus, Neptune)));

        System.out.println(mutableList);
        mutableList = Push(mutableList, Jupiter);
        System.out.println(mutableList);
        mutableList = Remove(mutableList, 2);
        System.out.println(mutableList);
        mutableList = Set(mutableList, 2, "SomePlanet");
        System.out.println(mutableList);
        mutableList = Shuffle(mutableList);
        System.out.println(mutableList);
        System.out.println(Select(mutableList));
        System.out.println(IndexOf(mutableList, Earth));
        System.out.println(Find(mutableList, Uranus));
        mutableList = Reverse(mutableList);
        System.out.println(mutableList);
        System.out.println(immutableList);
        System.out.println(Select(immutableList));
        System.out.println(IndexOf(immutableList, Earth));
        System.out.println(Find(immutableList, Uranus));

        try
        {
            // Try to change immutable list cause throwing exception
            immutableList = Reverse(immutableList);
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
}
