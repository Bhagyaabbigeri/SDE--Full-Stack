<<<<<<< HEAD
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        demoHashSet();
    }

    public static void demoHashSet() {
        Set<String> fruits = new HashSet<>();

        fruits.add("apple");
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("orange");

        System.out.println(fruits);

        if (fruits.contains("apple") == true) {
            System.out.println("List contains apple");
        }

        fruits.remove("mango");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println(fruits);
    }

=======
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        demoHashSet();
    }

    public static void demoHashSet() {
        Set<String> fruits = new HashSet<>();

        fruits.add("apple");
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("orange");

        System.out.println(fruits);

        if (fruits.contains("apple") == true) {
            System.out.println("List contains apple");
        }

        fruits.remove("mango");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println(fruits);
    }

>>>>>>> 7ebb9c4bf653ae0912b8c1045321eb2844921530
}