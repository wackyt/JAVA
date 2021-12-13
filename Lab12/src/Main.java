import java.util.HashMap;
import java.util.Scanner;

class StudentTest implements IStudent
{
    private static final Scanner in = new Scanner(System.in);

    public void RunTest() throws StudentNotFoundException
    {
        System.out.print("Enter students count: ");
        int length = in.nextInt();
        Student[] newStudents = new Student[length];
        for (int i = 0; i < length; ++i)
        {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("Enter student name: ");
            in.nextLine();
            String newName = in.nextLine();
            System.out.print("Enter student score: ");
            newStudents[i] = new Student(i, in.nextDouble(), newName);
        }

        while (true)
        {
            System.out.println("1 – get student info");
            System.out.println("2 – enumerate students");
            System.out.println("3 – sort students list");
            System.out.println("0 – exit");
            System.out.print("Choice: ");
            int choice = in.nextInt();
            in.nextLine();
            System.out.println();
            switch (choice)
            {
                case 1:
                    GetInfo(newStudents);
                    System.out.println();
                    break;
                case 2:
                    PrintStudents(newStudents);
                    System.out.println();
                    break;
                case 3:
                    Sort(newStudents);
                    PrintStudents(newStudents);
                    System.out.println();
                    break;
                case 0:
                    return;
            }
        }
    }

    private static void GetInfo(Student[] students) throws StudentNotFoundException
    {
        System.out.print("Enter student name: ");
        String name = in.nextLine();
        System.out.println(students[Find(students, name)]);
    }

    private static void PrintStudents(Student[] students)
    {
        System.out.printf("%3s|%50s|%14s\n", "ID", "Name", "Score");
        for (Student newStudents : students)
        {
            System.out.printf("%3d|%50s|%14f\n", newStudents.getID(), newStudents.getName(), newStudents.getFS());
        }
    }

    private static void Swap(Comparable<Student>[] array, int i, int j)
    {
        var temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void Sort(Student[] students)
    {
        final int len = students.length;
        for (int i = 0; i < len - 1; ++i)
        {
            for (int j = i + 1; j < len; ++j)
            {
                if (students[i].compareTo(students[j]) > 0)
                    Swap(students, i, j);
            }
        }
    }

    public static int Find(Student[] students, String name) throws StudentNotFoundException
    {
        for (int i = 0; i < students.length; ++i)
        {
            if (students[i].getName().equals(name))
                return i;
        }
        throw new StudentNotFoundException("[ERROR]: Student \"" + name + "\" not found in database");
    }
}


class InnTest
{
    private static final Scanner in = new Scanner(System.in);

    public void RunTest()
    {
        var database = new HashMap<String, String>(5);
        database.put("1", "Peter");
        database.put("2", "Mikhail");
        database.put("3", "Ron");
        database.put("4", "Leo");
        database.put("5", "Sofia");
        System.out.print("Enter name: ");
        String name = in.nextLine();
        System.out.print("Enter inn: ");
        String inn = in.next();
        try
        {
            String dbName = database.get(inn);
            if (!name.equals(dbName))
            {
                throw new InvalidInnException("[ERROR]: INN \"" + inn + "\" wrong for \"" + name + "\".");
            }
            System.out.println("INN \"" + inn + "\" correct for \"" + name + "\".");
        }
        catch (InvalidInnException e)
        {
            e.printStackTrace();
        }
    }
}

public class Main
{
    public static void main(String[] args)
    {
        StudentTest studentTest = new StudentTest();

        try
        {
            studentTest.RunTest();
        }
        catch (StudentNotFoundException e)
        {
            e.printStackTrace();
        }

        InnTest innTest = new InnTest();
        innTest.RunTest();
    }
}