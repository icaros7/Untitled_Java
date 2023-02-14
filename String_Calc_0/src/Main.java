import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = { 73, 96, 103, 116, 99, 103, 66, 102, 128, 120, 105, 105, 123, 153, 109,
                136, 104, 148, 159, 141, 77, 165, 157, 69 };
        ArrayList <String> list = new ArrayList<>();

        for (int i = 0; i < 24; i++) { list.add(Character.toString((arr[i] - ( 2 * i)) ^ i)); }

        for (int i = 0; i < 24; i++) { System.out.print(list.get(i)); }
    }
}
