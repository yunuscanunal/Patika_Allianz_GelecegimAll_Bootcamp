package MyList.myList;

public class Main {
    public static void main(String[] args) {
        myList<Integer> list = new myList<>();
        System.out.println("List is " + (list.isEmpty() ? "empty" : "not empty"));

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println("List is " + (list.isEmpty() ? "empty" : "not empty"));

        System.out.println("Index of 20: " + list.indexOf(20));
        System.out.println("Index of 100: " + list.indexOf(100));

        System.out.println("Last index of 20: " + list.lastIndexOf(20));

        Object[] array = list.toArray();
        System.out.println("First element of the array: " + array[0]);

        myList<Integer> sublist = list.sublist(1, 4);
        System.out.println("Sublist: " + sublist.toString());

        System.out.println("Contains 20: " + list.contains(20));
        System.out.println("Contains 120: " + list.contains(120));

        list.clear();
        System.out.println("List after clear: " + list.toString());
    }
}
