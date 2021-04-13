import java.util.Comparator;

public class TributeNameComparator implements Comparator<Tribute> {
    @Override
    public int compare(Tribute o1, Tribute o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
