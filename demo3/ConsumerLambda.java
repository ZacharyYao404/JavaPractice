package demo3;

import java.util.function.Consumer;

public class ConsumerLambda {
    public static void main(String[] args) {
        comsumerString(
                s-> System.out.println(s.toLowerCase()),
                s-> System.out.println(s.toUpperCase())
        );
    }
    static void consumerString(Consumer<String> function){
        function.accept("Hello");
    }
    static void comsumerString(Consumer<String>one,Consumer<String>two){
        one.andThen(two).accept("Hello");
    }
}
