public class Plate extends Dish
{
    Plate(String color)
    {
        super(color, "Ceramic");
        mIsDirty = true;
    }

    void Clean() { mIsDirty = false; }

    boolean IsDirty() { return mIsDirty; }

    private boolean mIsDirty;
}
