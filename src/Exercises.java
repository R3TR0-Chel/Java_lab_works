import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Exercises {
    public static void main(String[] args) {
        MathOperation mo1 = (a, b) -> a + b;
        System.out.println(mo1.operation(5,5));
        MathOperation mo2 = (a, b) -> a - b;
        System.out.println(mo2.operation(10,6));
        MathOperation mo3 = (a, b) -> a * b;
        System.out.println(mo3.operation(7,3));
        MathOperation mo4 = (a, b) -> a / b;
        System.out.println(mo4.operation(21,7));
    }
}

interface MathOperation {
    int operation(int a, int b);
}

class Exercise2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,22,33,40,55);
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        List<Integer> arr = new ArrayList<>();
        for (Integer number : numbers) {
            if (isOdd.test(number)) {
                arr.add(number);
            }
        }
        System.out.println("Odd numbers: " + arr);
    }
}

class Exercise3{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.sort((a,b) -> b.compareTo(a));
        System.out.println("sorted Names: "+names);
    }
}

class Exercise4{
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("hello", "java", "lambda");
        cities.replaceAll(String::toUpperCase);
        Function<String, String> reverse = s -> new StringBuilder(s).reverse().toString();
        cities.replaceAll(reverse::apply);
        System.out.println("Transformed: "+cities);

    }
}
class Exercise5{
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("New York", "London", "Tokyo", "Berlin");
        Consumer<String> c1 = s -> System.out.println(s);
        cities.forEach(c1);
    }
}

class Exercise6{
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("New York", "London", "Tokyo", "Berlin");
        cities.forEach(System.out::println);
    }
}

class Exercise7{
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> max = (a,b) ->{
            if(a>b){
                return a;
            }else{
                return b;
            }
        };
        BiFunction<Integer,Integer,Integer> min = (a,b) ->{
            if(a<b){
                return a;
            }else{
                return b;
            }
        };
        System.out.println("Min: "+min.apply(25,40));
        System.out.println("Max: "+max.apply(25,40));

    }
}
