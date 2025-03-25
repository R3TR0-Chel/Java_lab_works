import java.time.LocalDateTime;
import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {
        Function<Integer,Double> f = n -> n/1.0;
        System.out.println(f.apply(5));

        Predicate<Integer> p = n ->{
            if (n%2 == 0) return true;
            else return false;
        };
        System.out.println(p.test(5));

        Consumer<String> c = s -> System.out.println(s);
        c.accept("Hello World");

        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        System.out.println(s.get().toString());

        UnaryOperator<Integer> u = n -> n*n;
        System.out.println(u.apply(5));

        BinaryOperator<Integer> b = (n1,n2) -> n1+n2;
        System.out.println(b.apply(5,6));



    }
}
