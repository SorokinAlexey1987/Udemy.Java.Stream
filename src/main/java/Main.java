import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("User1", 12));
        users.add(new User("User2", 26));
        users.add(new User("User3", 38));
        users.add(new User("User4", 24));
        users.add(new User("User5", 47));
        users.add(new User("User6", 18));
        users.add(new User("User7", 56));
        users.add(new User("User8", 63));

        long count = users.stream()
                .filter(user -> user.getAge() > 30)
                .count();

        System.out.println(count);


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

        ////Task_2
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
