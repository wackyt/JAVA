import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        HashMap<String, Pet> petsMap = new HashMap<String, Pet>();
        petsMap.put("first", new Cat("Lucy"));
        petsMap.put("second", new Dog("Bailey"));
        petsMap.put("third", new Owl("Sophie"));

        System.out.println("Print hashmap");
        for(HashMap.Entry<String, Pet> entry : petsMap.entrySet())
            entry.getValue().SayHello();

        System.out.println("\nAdd elements\n");
        petsMap.put("fourth", new Dog("Jasper"));
        petsMap.put("fifth", new Cat("Charley"));

        System.out.println("Print hashmap");
        for(HashMap.Entry<String, Pet> entry : petsMap.entrySet())
            entry.getValue().SayHello();
    }
}
