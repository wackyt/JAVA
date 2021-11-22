public class Pet
{
    String mType;
    String mName;
    Pet(String name, String type)
    {
        mName = name;
        mType = type;
    }

    void SayHello()
    {
        System.out.println(mType + " " + mName + " says hello!");
    }
}
