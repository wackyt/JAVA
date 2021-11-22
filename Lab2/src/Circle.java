public class Circle
{
    Circle(float x, float y, float z, float radius)
    {
        mX = x;
        mY = y;
        mZ = z;
        mRadius = radius;
    }

    void SetX(float x) { mX = x; }
    void SetY(float y) { mY = y; }
    void SetZ(float z) { mZ = z; }

    void SetRadius(float radius) { mRadius = radius; }

    float GetX() { return mX; }
    float GetY() { return mY; }
    float GetZ() { return mZ; }

    float GetRadius() { return mRadius; }

    void PrintStats()
    {
        System.out.println("Pos x: " + mX + " y: " + mY + " z: " + mZ + " Radius: " + mRadius);
    }

    private float mX, mY, mZ;
    private float mRadius;
}
