import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        /*
         * Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan
         * program yazınız.
         * 
         * Çin Zodyağı nedir?
         * 
         * 4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve
         * insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun
         * eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve
         * yıldızlarla pek bir ilgisi yoktur.
         * 
         * Çin Zodyağı nasıl hesaplanır?
         * 
         * Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre
         * bulunur.
         * 
         * Doğum Tarihi %12 = 0 ➜ Maymun
         * 
         * Doğum Tarihi %12 = 1 ➜ Horoz
         * 
         * Doğum Tarihi %12 = 2 ➜ Köpek
         * 
         * Doğum Tarihi %12 = 3 ➜ Domuz
         * 
         * Doğum Tarihi %12 = 4 ➜ Fare
         * 
         * Doğum Tarihi %12 = 5 ➜ Öküz
         * 
         * Doğum Tarihi %12 = 6 ➜ Kaplan
         * 
         * Doğum Tarihi %12 = 7 ➜ Tavşan
         * 
         * Doğum Tarihi %12 = 8 ➜ Ejderha
         * 
         * Doğum Tarihi %12 = 9 ➜ Yılan
         * 
         * Doğum Tarihi %12 = 10 ➜ At
         * 
         * Doğum Tarihi %12 = 11 ➜ Koyun
         * 
         * Senaryo
         * 
         * Doğum Yılınızı Giriniz : 1990
         * Çin Zodyağı Burcunuz : At
         */

        int birthYear, remainder;
        String sign = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        birthYear = input.nextInt();

        remainder = birthYear % 12;
        // System.out.println(remainder);

        switch (remainder) {
            case 0:
                sign = "Maymun";
                break;
            case 1:
                sign = "Horoz";
                break;
            case 2:
                sign = "Köpek";
                break;
            case 3:
                sign = "Domuz";
                break;
            case 4:
                sign = "Fare";
                break;
            case 5:
                sign = "Öküz";
                break;
            case 6:
                sign = "Kaplan";
                break;
            case 7:
                sign = "Tavşan";
                break;
            case 8:
                sign = "Ejderha";
                break;
            case 9:
                sign = "Yılan";
                break;
            case 10:
                sign = "At";
                break;
            case 11:
                sign = "Koyun";
                break;
        }

        System.out.println("Çin Zodyağı Burcunuz: " + sign);
    }
}
