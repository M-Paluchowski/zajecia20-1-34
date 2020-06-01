package excercise35;

import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> integerIntegerFunction = number -> number * 3;

        Stream.of(1, 2, 3)
        .map(new Function<Integer, Integer>() {
            private int a = 2;

            public int multiply(int a) {
                return a * this.a;
            }

            @Override
            public Integer apply(Integer integer) {
                return multiply(integer);
            }
        })
        .map(integerIntegerFunction);
    }

    public static void calculate(Function<Integer, Integer> f) {
        System.out.println(f.apply(10));
    }
}
