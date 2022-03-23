import java.util.Comparator;

//Helper class implementing Comparator interface
public class SortByRoll implements Comparator<Student> {
//    Sorting in ascending orderof roll number

    @Override
//    Sorting in ascending order of roll number
    public int compare(Student a, Student b) {
        return a.rollNo - b.rollNo;
    }
}
