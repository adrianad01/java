package programacion_funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {
    public static void main(String[] args) {

        Stream<String> names = Stream.of("John", "Mary", "Jane");
        names.forEach(System.out::println);
        System.out.println("--------------");
        List<String> namesList = List.of("John", "Mary", "Jane");
        System.out.println("--------------");

        List<String> namesWithJ = namesList
                .stream()
                .filter(name -> name.startsWith("J"))
                .toList();
        namesWithJ.forEach(System.out::println);
        System.out.println("--------------");


        List<String> names2 = new ArrayList<>();
        names2.add("John");
        names2.add("Mary");
        names2.add("Jane");
        names2.forEach(System.out::println);
    }
}
