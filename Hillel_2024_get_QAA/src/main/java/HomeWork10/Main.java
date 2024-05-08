package HomeWork10;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        Set<Character> delimiters = new HashSet<Character>(
                Arrays.asList(' ', '.', ',', ':', ';', '?', '!', '-', '(', ')', '\"'));
        Set<Character> letters = new TreeSet<Character>();
        for (int i = 0; i < sentence.length(); i++) {
            if (!delimiters.contains(sentence.charAt(i))) {
                letters.add(sentence.charAt(i));
            }
        }
        System.out.println(letters);

        Stream.of(sentence.replaceAll("\\s+", "").split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((letter, count) -> System.out.println(letter + " " + count));
    }

}