package stream;

import com.sun.source.tree.UsesTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.sun.tools.javac.util.List.collector;

public class StreamCollection {
    private static String string;

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("Dushko");
        list.add("Utkin");
        list.add("Kukushik");

        Stream<String> stream = list.stream();
                    stream.forEach(x -> System.out.println(x));

                    System.out.println("-----------------------");

        Stream<String> stream2 = list.stream();
                    stream2.forEachOrdered(x -> System.out.println(x));

                    System.out.println("-----------------------");

        Stream<String> stream1 = list.stream();
                    stream1
                        .peek((e) -> System.out.println("," + e))
                            .toArray();

                    System.out.println("-----------------------");

//        Stream<String> stream4 = list.stream();
//                    stream4
//                        .sorted()
//                            .collect ();








//        Collection<String> collection = Arrays.asList("Dushko", "Utkin", "Kukushik");
//        Stream<String> names = collection.stream();



    }

}