package programacion_funcional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapClass {
    public static void main(String[] args) {

    List<String> names = Stream.of("Adrian", "Jose", "Miguel")
            .map(String::toUpperCase)
            .toList();
    }
}
