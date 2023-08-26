import java.util.List;

class NumberRunnable implements Runnable {
    private List<Integer> inputNumbers;
    private List<Integer> evenNumbers;
    private List<Integer> oddNumbers;

    public NumberRunnable(List<Integer> inputNumbers, List<Integer> evenNumbers, List<Integer> oddNumbers) {
        this.inputNumbers = inputNumbers;
        this.evenNumbers = evenNumbers;
        this.oddNumbers = oddNumbers;
    }

    @Override
    public void run() {
        for (Integer number : inputNumbers) {
            if (number % 2 == 0) {
                synchronized (evenNumbers) {
                    evenNumbers.add(number);
                }
            } else {
                synchronized (oddNumbers) {
                    oddNumbers.add(number);
                }
            }
        }
    }
}