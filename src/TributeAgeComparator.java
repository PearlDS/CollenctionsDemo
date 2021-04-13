import java.util.Comparator;

public class TributeAgeComparator implements Comparator<Tribute> {
    @Override
    public int compare(Tribute o1, Tribute o2) {
        return o1.getAge() - o2.getAge();
    }
}
