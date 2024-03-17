package Module8.t1_2;

import java.util.ArrayList;

public class CollectionLambda {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(5);
        integers.add(8);
        integers.add(20);
        integers.add(15);
        integers.add(3);
        integers.add(12);
        System.out.println("Original list");
        integers.forEach(System.out::println);
        integers.removeIf(integer -> integer % 2 == 0);
        System.out.println("After removing even numbers");
        integers.forEach(System.out::println);
        integers.replaceAll(integer -> integer * 2);
        System.out.println("After multiplying by 2");
        integers.forEach(System.out::println);
        //sum of all the numbers with lambda
        int sum = integers.stream().reduce(0, Integer::sum);
        System.out.println("Sum of all the numbers: " + sum);

    }
}
