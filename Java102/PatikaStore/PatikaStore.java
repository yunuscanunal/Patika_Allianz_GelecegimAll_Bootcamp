import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatikaStore {
    public static void main(String[] args) {
        List<Brand> brands = new ArrayList<>();
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));
        List<Product> products = new ArrayList<>();
        products.add(
                new Laptop(1, "HUAWEI Matebook 14", 7000.0, brands.get(4), 512, 14.0, 16));
        products.add(new Laptop(2, "LENOVO V14 IGL", 3699.0, brands.get(2), 1024, 14.0, 8));
        products.add(new Laptop(3, "ASUS Tuf Gaming", 8199.0, brands.get(6), 2048, 15.6, 32));

        products.add(
                new MobilePhone(4, "SAMSUNG GALAXY A51", 3199.0, brands.get(0), 128, 6.5, 32, 4000.0, 6, "Siyah"));
        products.add(new MobilePhone(5, "iPhone 11 64 GB", 7379.0, brands.get(2), 64, 6.1, 5, 3046.0, 6, "Mavi"));
        products.add(
                new MobilePhone(6, "Redmi Note 10 Pro 8GB", 4012.0, brands.get(7), 128, 6.5, 32, 4000.0, 12, "Beyaz"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz : ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Notebook Listesi\n");
                System.out.println(
                        "----------------------------------------------------------------------------------------------------");
                System.out.format("| %-2s | %-30s | %-9s | %-10s | %-9s | %-9s | %-9s |\n", "ID", "Ürün Adı", "Fiyat",
                        "Marka", "Depolama", "Ekran", "RAM");
                System.out.println(
                        "----------------------------------------------------------------------------------------------------");
                for (Product product : products) {
                    if (product instanceof Laptop) {
                        Laptop laptop = (Laptop) product;
                        System.out.format("| %-2d | %-30s | %-9.1f TL | %-10s | %-9d | %-9.1f | %-9d |\n", laptop.id,
                                laptop.name, laptop.price, laptop.brand.name, laptop.storage, laptop.screenSize,
                                laptop.ram);
                    }
                }
                System.out.println(
                        "----------------------------------------------------------------------------------------------------");
            } else if (choice == 2) {
                System.out.println("Cep Telefonu Listesi\n");
                System.out.println(
                        "----------------------------------------------------------------------------------------------------------------------");
                System.out.format("| %-2s | %-30s | %-9s | %-10s | %-9s | %-9s | %-9s | %-9s | %-9s | %-9s |\n", "ID",
                        "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Kamera", "Pil", "RAM", "Renk");
                System.out.println(
                        "----------------------------------------------------------------------------------------------------------------------");
                for (Product product : products) {
                    if (product instanceof MobilePhone) {
                        MobilePhone mobilePhone = (MobilePhone) product;
                        System.out.format(
                                "| %-2d | %-30s | %-9.1f TL | %-10s | %-9d | %-9.1f | %-9d | %-9.1f | %-9d | %-9s |\n",
                                mobilePhone.id, mobilePhone.name, mobilePhone.price, mobilePhone.brand.name,
                                mobilePhone.storage, mobilePhone.screenSize, mobilePhone.camera, mobilePhone.battery,
                                mobilePhone.mobileRam, mobilePhone.mobileColor);
                    }
                }
                System.out.println(
                        "----------------------------------------------------------------------------------------------------------------------");
            } else if (choice == 3) {
                System.out.println("Markalarımız");
                System.out.println("--------------");
                for (Brand brand : brands) {
                    System.out.println("- " + brand.name);
                }
            } else if (choice == 0) {
                System.out.println("Çıkış yapılıyor...");
                break;
            } else {
                System.out.println("Geçersiz tercih, lütfen tekrar deneyin.");
            }
        }
    }
}