import java.util.Arrays;

public class Main
{
    public static void InsertionSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; i++)
        {
            int key = arr[i];
            int j = i - 1;
            while ((j > -1) && (arr[j] > key))
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static public <T extends Comparable<T>>
    int Partition(T[] arr, int begin, int end)
    {
        T pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j].compareTo(pivot) > -1)
            {
                i++;
                T swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        T swapTemp = arr[i+1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

    static public <T extends Comparable<T>>
    void QuickSort(T[] arr, int begin, int end)
    {
        if (begin < end)
        {
            int partitionIndex = Partition(arr, begin, end);

            QuickSort(arr, begin, partitionIndex - 1);
            QuickSort(arr, partitionIndex + 1, end);
        }
    }

    public static void Merge
    (
        Student[] a,
        Student[] l,
        Student[] r,
        int left, int right
    )
    {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right)
        {
            if (l[i].GetGPA() <= r[j].GetGPA())
                a[k++] = l[i++];
            else
                a[k++] = r[j++];
        }

        while (i < left)
            a[k++] = l[i++];

        while (j < right)
            a[k++] = r[j++];
    }

    public static void MergeSort(Student[] a, int n)
    {
        if (n < 2) return;

        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        for (int i = 0; i < mid; i++)
            l[i] = a[i];

        for (int i = mid; i < n; i++)
            r[i - mid] = a[i];

        MergeSort(l, mid);
        MergeSort(r, n - mid);

        Merge(a, l, r, mid, n - mid);
    }

    public static void main(String a[])
    {
        int[] iDNumber  = { 0, 2, 1 };
        Student[] students = new Student[iDNumber.length];
        students[0] = new Student("A");
        students[1] = new Student("B");
        students[2] = new Student("C");

        System.out.print("Print iDNumber array content: ");
        System.out.println(Arrays.toString(iDNumber));
        InsertionSort(iDNumber);
        System.out.print("Print students array content: ");
        for (int i = 0; i < students.length; i++)
            System.out.print(students[iDNumber[i]].GetName() + " ");
        System.out.println();

        int[] gpas = { 5, 3, 4 };
        System.out.println("Print students GPAs: " + Arrays.toString(gpas));
        System.out.print("Print students content: ");
        for (Student value : students)
            System.out.print(value.GetName() + " ");
        System.out.println();

        for (int i = 0; i < gpas.length; ++i)
            students[i].SetGPA(gpas[i]);
        QuickSort(students, 0, students.length - 1);
        System.out.print("Print students content: ");
        for (Student student : students)
            System.out.print(student.GetName() + " ");
        System.out.println();

        int[] firstListGPA = { 5, 1, 6, 2, 3, 4 };
        int[] secondListGPA = { 1, 2, 3, 4, 5, 6 };

        Student[] firstGroup = new Student[firstListGPA.length];
        Student[] secondGroup = new Student[secondListGPA.length];
        for (int i = 0; i < firstListGPA.length; i++)
        {
            firstGroup[i] = new Student("A");
            firstGroup[i].SetGPA(firstListGPA[i]);
        }
        for (int i = 0; i < secondListGPA.length; i++)
        {
            secondGroup[i] = new Student("B");
            secondGroup[i].SetGPA(secondListGPA[i]);
        }

        Student[] sortedGroup = new Student[firstListGPA.length + secondListGPA.length];
        for (int i = 0; i < firstGroup.length; i++)
            sortedGroup[i] = firstGroup[i];
        for (int i = firstGroup.length; i < sortedGroup.length; i++)
            sortedGroup[i] = secondGroup[i - firstGroup.length];

        MergeSort(sortedGroup, sortedGroup.length);
        System.out.print("Print students content: ");
        for (Student student : sortedGroup)
            System.out.print(student.GetGPA() + " ");
    }
}
