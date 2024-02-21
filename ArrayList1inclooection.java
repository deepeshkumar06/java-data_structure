import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            strings.add(scanner.nextLine());
        }
        Collections.sort(strings, Comparator.comparingInt(String::length));
        System.out.println(strings);
    }
}