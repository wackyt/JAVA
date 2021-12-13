public class Student implements Comparable<Student>
{
    private final int mId;
    private final double mScore;
    private final String mName;

    public Student(int id, double score, String name)
    {
        mId = id;
        mScore = score;
        mName = name;
    }

    public int getID()
    {
        return mId;
    }

    public double getFS()
    {
        return mScore;
    }

    public String getName()
    {
        return mName;
    }

    public int compareTo(Student other)
    {
        return Double.compare(mScore, other.getFS());
    }

    @Override
    public String toString()
    {
        return "Student {ID: " + mId + ", " + "Name: " + mName + ", " + "Score: " + mScore + "}";
    }
}