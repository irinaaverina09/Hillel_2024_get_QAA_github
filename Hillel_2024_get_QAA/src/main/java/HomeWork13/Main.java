package HomeWork13;

import java.nio.channels.UnresolvedAddressException;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
       // Supplier<User> supplier = () -> new User("Ira", 33, "t@y.com", "Female");
        Map<String, List<User>> collect = Stream.generate(() -> UserProvider.getUser())
                .limit(20)
                .filter(u -> u.getAge() > 18)
                .filter(e -> e.getEmail() != null)
                .sorted((u1, u2) -> u1.getName().compareTo(u2.getName()))
                .collect(Collectors.groupingBy(User::getGender));
        System.out.println(collect);

        // .forEach(System.out::println);
    }
}
