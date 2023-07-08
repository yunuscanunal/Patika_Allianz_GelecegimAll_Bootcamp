import java.util.Scanner;

public class javaVariables {

    public static void main(String[] args) {
        int numberOne, numberTwo = 4;
        int numberThree;
        numberOne = 2;
        numberThree = numberOne + numberTwo;

        System.out.println(numberThree);
    }

    public static void main(String[] args) {
        int kisaKenar = 10, uzunKenar = 20;
        int cevre = (kisaKenar + uzunKenar) * 2;
        int alan = kisaKenar * uzunKenar;

        System.out.println(cevre);
        System.out.println(alan);
    }

    public static void main(String[] args) {
        // byte v8byte = 128; error because of byte < 128
        byte v8byte = 100;
        System.out.println(v8byte);

        short vShort = 1000;
        System.out.println(vShort);

        int vInt = 10000;
        System.out.println(vInt);

        long vLong = 1000000000;
        System.out.println(vLong);
    }

    public static void main(String[] args) {
        float vFloat = 1;
        System.out.println(vFloat); // 1.0

        // float pi = 3.14; //error because missing f, correct form 3.14f or 3.14F
        // System.out.println(pi);

        float pi = 3.14f; // or 3.14F
        System.out.println(pi);

        double vDouble = 3.14;
        System.out.println(vDouble);

        double vDouble2 = 3; // 3.0
        System.out.println(vDouble2);

    }

    public static void main(String[] args) {
        char vChar = 'b';
        char v2Char = 98; // output: b

        System.out.println(vChar);
        System.out.println(v2Char);

        char c1 = 'J';
        char c2 = 'A';
        char c3 = 'V';
        char c4 = 'A';

        System.out.println("" + c1 + c2 + c3 + c4);

        boolean dogru = true;
        boolean yanlis = false;

        System.out.println(dogru);
        System.out.println(yanlis);
    }

    public static void main(String[] args) {
        String vStr = "Java101 Patikası";
        System.out.println(vStr);
    }

    public static void main(String[] args) {
        int a = 7;
        int b = a;
        System.out.println("b = " + b);

        int c = 7, d = 1;
        d += c; // d = d + c;
        d -= c; // d = d - c;
        d *= c; // d = d * c;
        d /= c; // d = d / c;
        d %= c; // d = d % c; mod
        System.out.println("d = " + d);

        int e = 5, f = 2, g = 5;
        boolean sonuc = (e == f);
        System.out.println(sonuc); // false

        System.out.println(e < f); // false

        boolean kosul1 = (e == g);
        boolean kosul2 = (e >= f);
        boolean sonuc2 = kosul1 && kosul2;
        System.out.println(kosul1); // true
        System.out.println(kosul2); // true
        System.out.println(sonuc2); // true && true => true

        System.out.println(kosul1 || kosul2); // true || true => true

        boolean sonuc3 = ((e == g) && (e >= f));
        System.out.println(sonuc3); // true && true => true
        System.out.println("-----");
        System.out.println(sonuc2 == sonuc3); // true

        String str = sonuc ? "Doğru" : "Yanlış"; // str değişkeni: sonuc doğru ise "Doğru", yanlış ise "Yanlış" string
        // ifadesine eşit olacaktır.
        System.out.println(str);

    
    }

    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("A sayısını giriniz: ");
        a = input.nextInt();
        System.out.println(a);
    }
}
