import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Problema2 {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        numbers[0] = 15;
        numbers[1] = 20;
        int n = 21;
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        int c = list.stream().min(Comparator.comparingInt(i -> Math.abs(i - n))).orElseThrow(() -> new NoSuchElementException("No value present"));
    }
}
