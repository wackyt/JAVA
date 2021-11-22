public class Student implements Comparable<Student>
{
    private String mName;
    private int mGPA;

    public Student(String name)
    {
        mName = name;
    }

    public String GetName()
    {
        return mName;
    }

    public void SetGPA(int gpa)
    {
        mGPA = gpa;
    }

    public int GetGPA()
    {
        return mGPA;
    }

    @Override
    public int compareTo(Student o)
    {
        return o.GetGPA() > mGPA ? 1 : -1;
    }
}
