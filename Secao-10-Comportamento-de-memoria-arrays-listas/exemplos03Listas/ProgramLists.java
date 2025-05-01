import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramLists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Luciana");
        list.add("João");
        list.add("José");
        list.add("Marta");
        list.add("Adriana");
        list.add("Alberto");
        list.add("Farias");

        System.out.println("Tamanho da Lista: " + list.size());
        for (String x : list) {
            System.out.println("- " + x);
        }
        System.out.println("---------------");
        list.removeIf(s -> s.charAt(0) == 'M');
        System.out.println("Tamanho da Lista: " + list.size());
        for (String x : list) {
            System.out.println("- " + x);
        }
        System.out.println("---------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("---------------");
        List<String> result = list.stream().filter(s -> s.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println("- " + x);
        }

        System.out.println("---------------");
        String name = list.stream().filter(s -> s.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println("- " + name);
    }
}
