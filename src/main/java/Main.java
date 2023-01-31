import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("User1", 19));
        users.add(new User("User2", 26));
        users.add(new User("User3", 38));
        users.add(new User("User4", 24));
        users.add(new User("User5", 47));
        users.add(new User("User6", 19));
        users.add(new User("User7", 56));
        users.add(new User("User8", 63));

        users.stream()
                .filter(user -> user.getName().contains("s"))
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));


        /*
                .filter(user -> user.getAge() < 5)
                .max(Comparator.comparingInt(User::getAge));
        oldest.ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));
        */

                /*
                .filter(user -> user.getAge() > 30)
                .noneMatch(user -> user.getAge() <= 18);
                .sorted((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()))
                .limit(3)
                .forEach(System.out::println);
                */
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
