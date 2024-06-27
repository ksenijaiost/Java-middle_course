package Les1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");

        ArrayList<Integer> arrayList = new ArrayList<>();
        var randomInt = new Random().nextInt();
        for (int i = 1; i <= randomInt; i++) {
            arrayList.add(i);
        }
        System.out.println("\nThe array list contains " + arrayList.size() + " elements");
    }
}