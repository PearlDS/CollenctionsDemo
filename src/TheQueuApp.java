import java.util.*;

public class TheQueuApp {
    public static void main(String[] args) {

        Queue <String> queueForButcher = new PriorityQueue<>();

        queueForButcher.offer("Milan");
        queueForButcher.offer("Sami");
        queueForButcher.offer("Gregory");
        queueForButcher.offer("Diederiek");
        queueForButcher.offer("Florian");
        queueForButcher.offer("Jens");
        queueForButcher.forEach(name -> System.out.println(name));


        System.out.println("-----");



        while (queueForButcher.size()>0){
            System.out.println("Next to die:"+queueForButcher.peek());

            System.out.println("Currently treating "+ queueForButcher.poll());
        }

        System.out.println("------");

       Queue <Tribute> sacrifices = new PriorityQueue<>(new TributeAgeComparator().thenComparing(new TributeNameComparator()));
        //Queue <Tribute> sacrifices = new PriorityQueue<>((tribute1, tribute2)-> -(tribute1.getMeatQuality()-tribute2.getMeatQuality()));
        sacrifices.offer(new Tribute("Bilal", 46, 'a'));
        sacrifices.offer(new Tribute("Yilmaz", 25, 'd'));
        sacrifices.offer(new Tribute("Bilal", 40, 's'));
        sacrifices.offer(new Tribute("Peter", 25, 'b'));
        sacrifices.offer(new Tribute("Denis", 65, 'c'));
        sacrifices.offer(new Tribute("Denis", 65, 'a'));





        Set<Tribute> sacrifices2 = new TreeSet<>(new TributeNameComparator().
                thenComparing(new TributeAgeComparator().
                        thenComparing((tribute1, tribute2)-> tribute1.getMeatQuality()-tribute2.getMeatQuality())));
        sacrifices2.addAll(sacrifices);
        sacrifices2.add(new Tribute("Neal", 65, 'a'));

        //sacrifices2.forEach(sacrifice -> System.out.println(sacrifice));


        List<Tribute> sacrifices3 = new ArrayList<>(sacrifices2);

        sacrifices3.forEach(sacrifice -> System.out.println(sacrifice));
        System.out.println("-----");

        sacrifices3.add(new Tribute("Neal", 25, 'a'));
        sacrifices3.sort(Comparator.comparingInt(Tribute::getAge));
        sacrifices3.forEach(sacrifice -> System.out.println(sacrifice));

    }
}
