import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{

    //using upperbounded wild card to read and lower to add/copy
    public static <T> void copy(List<? extends T> source,
        List<? super T> destination) {
            for (int i = 0; i < source.size(); i++) {
                destination.add(source.get(i));
            }
    
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("matthew", "matte");
        List<String> list2 = new ArrayList<>();
        copy(list, list2);
        System.out.println(list2);
    }
}