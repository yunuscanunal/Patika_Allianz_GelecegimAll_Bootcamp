import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        int chunkSize = numbers.size() / 4;

        Thread thread1 = new Thread(new NumberRunnable(numbers.subList(0, chunkSize), evenNumbers, oddNumbers));
        Thread thread2 = new Thread(new NumberRunnable(numbers.subList(chunkSize, 2 * chunkSize), evenNumbers, oddNumbers));
        Thread thread3 = new Thread(new NumberRunnable(numbers.subList(2 * chunkSize, 3 * chunkSize), evenNumbers, oddNumbers));
        Thread thread4 = new Thread(new NumberRunnable(numbers.subList(3 * chunkSize, numbers.size()), evenNumbers, oddNumbers));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    }
}
