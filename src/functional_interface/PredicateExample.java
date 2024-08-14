package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java","Python", "palavras","Sishfdjao", "dfsjafoidsa");

        Predicate<String> maisDeCinco = palavra -> palavra.length() > 5;

        palavras.stream().filter(palavra -> palavra.length() > 5).forEach(System.out::println);
    }
}
