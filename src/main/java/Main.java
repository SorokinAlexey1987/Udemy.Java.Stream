import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Task_7
        List<Float> numbers = new ArrayList<>();
        for (int i = 0; i < 30_000_000; i++) {
            numbers.add((float) i);
        }
        long before = System.currentTimeMillis();
        numbers.parallelStream()
                .map(number -> Math.sin(0.2f + number / 5))
                .collect(Collectors.toList());
        long after = System.currentTimeMillis();
        System.out.println(after - before);


        //Task_6
        /*
        List<User> users = new ArrayList<>();
        users.add(new User("User1", 19));
        users.add(new User("User2", 26));
        users.add(new User("User3", 38));
        users.add(new User("User4", 24));
        users.add(new User("User5", 47));
        users.add(new User("User6", 19));
        users.add(new User("User7", 56));
        users.add(new User("User8", 63));

        int[] array = {3, 2, 4, 1, 5};
        int[] array2 = {0, 0, 0, 0, 0};
        //Stream.of(3, 2, 4, 1, 5)
        Arrays.stream(array).filter(n -> n > 2);
        array2 = Arrays.stream(array).toArray();
        for (int i = 0; i < 5; i++) {
            System.out.println("Array2 = " + array2[i]);
        }

        users.stream()
                .filter(user -> user.getName().contains("s"))
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));
        */

        //Task_5
        /*
                .filter(user -> user.getAge() < 5)
                .max(Comparator.comparingInt(User::getAge));
        oldest.ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));
        */

        //Task_4
                /*
                .filter(user -> user.getAge() > 30)
                .noneMatch(user -> user.getAge() <= 18);
                .sorted((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()))
                .limit(3)
                .forEach(System.out::println);
                */
        //Task_3
                /*
                .sorted(Comparator.comparing(User::getName))
                .filter(user -> user.getAge() < 40)
                .limit(3)
                .map(User::getName)
                .forEach(System.out::println);
                */


        //Task_1
        /*
        //new Thread(() -> System.out.println(1)).start();
        Director director = new Director();
        Worker worker = (n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println("Working...");
            }
            return "Success";
        };
        String result = director.force(worker, 5);
        System.out.println(result);
        */

        //Task_2
        /*
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 100 + 100));
        }

        List<String> result = numbers.stream()
                .filter(integer -> integer % 2 == 0 && integer % 5 == 0)
                .map(Math::sqrt)
                .map(sqrt -> "Sqrt: " + sqrt)
                .toList();

        for (String s : result) {
            System.out.println(s);
        }
        */
    }

    private static List<String> map(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        for (int number : numbers) {
            result.add("Number: " + number);
        }
        return result;
    }

    private static List<Integer> filter(List<Integer> list, Predicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (predicate.test(i)) {
                result.add(i);
            }
        }
        return result;
    }


}
