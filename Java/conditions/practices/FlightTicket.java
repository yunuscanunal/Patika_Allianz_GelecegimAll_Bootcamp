import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        /*
         * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı
         * yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş)
         * bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak
         * uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye
         * aşağıdaki indirimleri uygulayın ;
         * 
         * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
         * yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya
         * "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
         * Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
         * Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
         * Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
         * Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20
         * indirim uygulanır.
         */
        int agePerson;
        byte travelType;
        double distance, totalAmount, feeDistance = 0.10; // 0.10 / km
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Distance (KM): ");
        distance = input.nextDouble();

        System.out.print("Enter your Age: ");
        agePerson = input.nextInt();

        System.out.print("Enter your Type of Travel (1 => One Way, 2 => Round Trip): ");
        travelType = input.nextByte();

        totalAmount = distance * feeDistance;

        if (agePerson > 65) {
            totalAmount *= 0.7;
        } else if (agePerson >= 12 && agePerson <= 24) {
            totalAmount *= 0.9;
        } else if (agePerson < 12) {
            totalAmount *= 0.5;
        }

        switch (travelType) {
            case 1:
                totalAmount = totalAmount;
                break;

            case 2:
                totalAmount *= 1.6;
                break;

            default:
                isError = true;
        }
        if (distance < 0) {
            isError = true;
        }

        if (isError == true) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            System.out.println("Toplam Tutar: " + totalAmount + " TL");
        }

    }
}
