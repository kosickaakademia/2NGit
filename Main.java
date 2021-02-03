package sk.kosickaakademia.predicate.example2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// this is the main class
public class Main {
    public static void main(String[] args) {

        Integer[] pole = {5,15,4,8,100,12,3,0,65,4,-7,89};
        List<Integer> nums = Arrays.asList(pole);

        Predicate<Integer> btf = n -> n > 5;  // (n) -> n >5
        Predicate<Integer> btf2 = n -> n < 20;

        //nums.stream().filter(btf).forEach(Main::vypis);
        nums.stream().filter(btf.and(btf2)).forEach((n)-> System.out.println(n));
    }

    public static void vypis(int c){
        System.out.println(">> "+c+" <<");
	// Done
    }
}
