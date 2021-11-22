public class Glass extends Dish
{
    Glass(String color)
    {
        super(color, "Glass");
        mEmpty = true;
    }

    void Fill()
    {
        mEmpty = false;
    }

    boolean IsEmpty() { return mEmpty; }

    private boolean mEmpty;
}
