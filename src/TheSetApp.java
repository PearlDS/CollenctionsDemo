import java.util.*;

public class TheSetApp {
    public static void main(String[] args) {
        //LinkedHashset print uit in meegegeven volgorde
        Set<String> groceries = new LinkedHashSet<>();
        groceries.add("banana");
        groceries.add("apple");
        groceries.add("water");
        groceries.add("cookie");
        groceries.add("Cookie");
        groceries.add("Apple");
        groceries.add("apPle");
        groceries.add("apple");


       groceries.remove("apple");


        groceries.forEach( word -> System.out.println(word));

        System.out.println("-----------");

        //Hashset doet maar wat
        Set <String> lyrics3 = new HashSet<>(groceries);
        lyrics3.forEach( word -> System.out.println(word));

        System.out.println("-----------");
        //Treeset print uit in alfabetische volgorde, eerst hoofdletters, dan kleine letters
        Set <String> lyrics4 = new TreeSet<>(groceries);
        lyrics4.add("bacardi");
        lyrics4.forEach( word -> System.out.println(word));


    }
}
