import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Java8Feature
{
    public static void main(String[] args) {
        Function<String, Integer> func = x -> x.length();

        Integer apply = func.apply("Thakur");   // 6

        System.out.println(apply);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        Consumer<String> consumer = input -> System.out.println(input.toLowerCase());
        consumer.accept("THAKUR");
        //System.out.println;

        Consumer<List<Integer>> integerConsumer = input -> input.stream().map(i ->i*5);
        Consumer<List<Integer>> display = input -> input.stream().forEach(a ->System.out.print(a+" ") );
        integerConsumer.accept(list);
        display.accept(list);
    }

}
