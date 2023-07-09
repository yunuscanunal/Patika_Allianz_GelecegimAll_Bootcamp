public class conditions {

    // public static void main(String[] args) {
    // int a = 10, b = 20, c = 1;

    // if ((a < b) && (a < c)) {
    // System.out.println(" a en küçüktür.");
    // } else if ((b < a) && (b < c)) {
    // System.out.println(" b en küçüktür.");
    // } else {
    // System.out.println("c en küçüktür.");
    // }
    // }
    public static void main(String[] args) {
        int points = 6;
        switch (points) {
            case 6:
                ;
            case 7:
                System.out.println("Java");
                break;
            case 8:
                ;
            case 9:
                System.out.println("101");
                break;
            case 10:
                System.out.println("Patika");
                break;
            default:
                System.out.println("Dev");
        }
    }
}