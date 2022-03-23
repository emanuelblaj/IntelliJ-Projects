import java.util.Comparator;

//Helper class implementing Comparator interface
public class SortByName implements Comparator<Student> {
    @Override
//    Sorting in ascending order of name
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}
