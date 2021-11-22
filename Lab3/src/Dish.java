public abstract class Dish
{
    Dish(String color, String material)
    {
        mColor = color;
        mMateial = material;
    }

    String GetColor() { return mColor; }
    String GetMaterial() { return mMateial; }

    private String mColor;
    private String mMateial;
}
