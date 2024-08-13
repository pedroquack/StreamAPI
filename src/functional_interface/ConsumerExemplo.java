package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        numeros.stream().forEach(n -> {
                if(n % 2 == 0){
                    System.out.println(n);
                }
            });
    }
}
