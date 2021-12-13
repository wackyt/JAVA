import java.io.File;
import java.util.*;

class Array<T>
{
    private ArrayList<T> mData;

    public Array(T[] elements)
    {
        mData = new ArrayList<T>();
        for (T element: elements)
            mData.add(element);
    }

    public T Get(int index)
    {
        return mData.get(index);
    }
}

class Tasks
{
    public static <T> ArrayList<T> NewArrayList(T ... elements)
    {
        ArrayList list = new ArrayList<>();
        for (T element: elements)
            list.add(element);
        return list;
    }

    public static <T> HashSet<T> NewHashSet(T ... elements)
    {
        HashSet set = new HashSet<>();
        for (T element: elements)
            set.add(element);
        return set;
    }

    public static <K, V> HashMap<K, V> NewHashMap(List<? extends K> keys, List<? extends V> values)
    {
        HashMap<K, V> map = new HashMap<>();
        if (keys.size() == values.size())
            for (int i = 0; i < keys.size(); i++)
                map.put(keys.get(i), values.get(i));
        else
            throw new IllegalArgumentException();
        return map;
    }

    public static void CatContents(String path)
    {
        File file = new File(path);
        String[] fileArray = null;
        if (file.exists() || file.isDirectory())
            fileArray = file.list(null);
        else
            System.out.println("[Error]: path not exists");
        ArrayList<String> list = new ArrayList(Arrays.asList(fileArray));
        for (int i = 0; i < list.size(); i++)
            if (i < 5)
                System.out.println(list.get(i));
    }
}

public class Main
{
    public static Integer[] ints = { 1, 2, 3, 4, 5, 6 };

    public static String[] strs = { "ab", "cd", "ef", "gh", "ij", "kl" };

    public static void FirstTask()
    {
        System.out.println("Task 1");
        ArrayList list1 = Tasks.NewArrayList(ints);
        System.out.println(list1);

        ArrayList list2 = Tasks.NewArrayList(strs);
        System.out.println(list2);
    }

    public static void SecondThirdTask()
    {
        System.out.println("Task 2, 3");

        Array<Integer> intArr2 = new Array(ints);
        System.out.println(intArr2.Get(4));
        Array<String> strArr2 = new Array(strs);
        System.out.println(strArr2.Get(4));
    }

    public static void FourthTask()
    {
        System.out.println("Task 4");
        Tasks.CatContents("//");
    }

    public static void FifthTask()
    {
        System.out.println("Task 5");

        ArrayList list1 = Tasks.NewArrayList(ints);
        ArrayList list2 = Tasks.NewArrayList(strs);

        HashSet<Integer> intSet = new HashSet();
        intSet.add(1);
        intSet.add(3);
        intSet.add(2);

        HashSet<String> strSet = new HashSet();
        strSet.add("One");
        strSet.add("Three");
        strSet.add("Two");

        HashSet set1 = Tasks.NewHashSet(intSet);
        System.out.println(set1);

        HashSet set2 = Tasks.NewHashSet(strSet);
        System.out.println(set2);

        HashMap map1 = Tasks.NewHashMap(list1, list2);
        System.out.println(map1);

        HashMap map2 = Tasks.NewHashMap(list2, list1);
        System.out.println(map2);
    }

    public static void main(String[] args)
    {
        FirstTask();
        SecondThirdTask();
        FourthTask();
        FifthTask();
    }
}





