import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TheListApp {
    public static void main(String[] args) {


        List <String> lyrics = new ArrayList<>();
        lyrics.add("Oops");
        lyrics.add("I");
        lyrics.add("did");
        lyrics.add("it");
        lyrics.add("again!");
        lyrics.add("Oops");
        lyrics.add("did");

        lyrics.remove(6);
        lyrics.remove("Oops");
        lyrics.set(3,"again!!!");

        lyrics.forEach( word -> System.out.println(word));

        List <String> lyrics2 = new LinkedList<>();
        lyrics2.addAll(lyrics);

        List <String> lyrics3 = new LinkedList<>(lyrics2);

        System.out.println(lyrics3.contains("again!"));
        System.out.println(lyrics3.contains("again!!!"));
    }
}
