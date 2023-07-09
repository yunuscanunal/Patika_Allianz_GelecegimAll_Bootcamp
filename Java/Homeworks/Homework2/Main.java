package Homeworks.Homework2;

import Homeworks.Homework2.assets.Category;
import Homeworks.Homework2.assets.Film;
import Homeworks.Homework2.assets.Platform;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int control;
        int controlAdmin;

        List<Film> FilmList = new ArrayList<>();

        ArrayList<String> platformList = new ArrayList<>();
        platformList.add("Netflix");
        platformList.add("Amazon Prime");
        platformList.add("BluTV");
        platformList.add("Disney");

        ArrayList<String> categoryList = new ArrayList<>();
        categoryList.add("Komedi");
        categoryList.add("Bilim Kurgu");
        categoryList.add("Romantik");
        categoryList.add("Aksiyon");
        categoryList.add("Macera");

        do {

            System.out.println("1-Admin Girişi\n2-Kullanıcı Girişi\n0-Çıkış Yap");
            control = input.nextInt();

            switch (control) {
                case 1:
                    System.out.println("Admin Paneline Hoşgeldiniz...");
                    System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz :");
                    System.out.println("1-Kategori Ekle\n2-Platform Ekle\n3-Film Ekle\n0-Çıkış Yap");
                    controlAdmin = input.nextInt();

                    switch (controlAdmin) {

                        case 1:

                            input.nextLine();
                            System.out.println("Eklenecek Kategorinin Adını Giriniz: ");
                            String newCatName = input.nextLine();
                            categoryList.add(newCatName);

                            break;

                        case 2:

                            input.nextLine();
                            System.out.println("Eklenecek Platformun Adını Giriniz: ");
                            String newPlatName = input.nextLine();
                            platformList.add(newPlatName);

                            break;

                        case 3:
                            // Bu kısımda oluşturulacak yeni Film objesi için kullanıcıdan veriler
                            // alınmaktadır.

                            System.out.println("Filmin kategorisini seçin :");
                            for (int i = 0; i < categoryList.size(); i++) {
                                System.out.println((i + 1) + "-" + categoryList.get(i));
                            }
                            int catNum = input.nextInt();
                            System.out.println("Filmin Platformunu seçin :");
                            for (int i = 0; i < platformList.size(); i++) {
                                System.out.println((i + 1) + "-" + platformList.get(i));
                            }
                            int platNum = input.nextInt();
                            input.nextLine();
                            System.out.println("Filmin adını giriniz :");
                            String nameInp = input.nextLine();
                            System.out.println("Filmin yapım tarihini giriniz :");
                            int yearInp = input.nextInt();
                            input.nextLine();
                            System.out.println("Filmin yönetmenini giriniz :");
                            String directorInp = input.nextLine();
                            System.out.println("Filmin imdb puanını giriniz :");
                            double imdbInp = input.nextDouble();
                            input.nextLine();
                            System.out.println("Filmin süresini giriniz :");
                            String runtimeInp = input.nextLine();

                            /*
                             * Kullanıcıdan alınan veriler ile Film sınıfında oluşturulan Constructor
                             * alanları
                             * dolduruluyor ve yeni Film objemiz oluşturuluyor.
                             */

                            Film newFilm = new Film(nameInp, yearInp, directorInp, imdbInp, runtimeInp);

                            /*
                             * Yukarıda kullanıcıdan aldığımız kategori bilgisini kategori objemizde
                             * kullanabilmek için
                             * bir kategori objesi oluşturuyoruz. "setCategoryName" methodu ile kullanıcının
                             * girdiği kategoriyi
                             * objemize tanımlıyoruz.
                             * 
                             * Aynı zamanda bu kategori bilgisini oluşturduğumuz Film objesine de tanımlamak
                             * için bir
                             * ArrayList oluşturup depoluyoruz. Çünkü Film sınıfımız içerisinde
                             * tanımladığımız
                             * "setCatArrayList" methodu parametre olarak ArrayList kabul ediyor.
                             */

                            Category tempCat = new Category();
                            tempCat.setCategoryName(categoryList.get(catNum - 1));
                            ArrayList<Category> tempCatList = new ArrayList<>();
                            tempCatList.add(tempCat);
                            newFilm.setCatArrayList(tempCatList);

                            /*
                             * Yukarıda kullanıcıdan aldığımız platform bilgisini platform objemizde
                             * kullanabilmek için
                             * bir platform objesi oluşturuyoruz. "setPlatformName" methodu ile kullanıcının
                             * girdiği platformu
                             * objemize tanımlıyoruz.
                             * 
                             * Aynı zamanda bu platform bilgisini oluşturduğumuz Film objesine de tanımlamak
                             * için bir
                             * ArrayList oluşturup depoluyoruz. Çünkü Film sınıfımız içerisinde
                             * tanımladığımız
                             * "setPlatArrayList" methodu parametre olarak ArrayList kabul ediyor.
                             */

                            Platform tempPlat = new Platform();
                            tempPlat.setPlatformName(platformList.get(platNum - 1));
                            ArrayList<Platform> tempPlatList = new ArrayList<>();
                            tempPlatList.add(tempPlat);
                            newFilm.setPlatArrayList(tempPlatList);

                            // Son olarak oluşturulan yeni filmimizi film listemize ekliyoruz.

                            FilmList.add(newFilm);

                            System.out.println("Film başarıyla oluşturuldu...");

                            break;

                    }
                    break;

                case 2:
                    // "categoryList" içerisinde tanımlanan kategoriler listeleniyor.

                    System.out.println("Filmleri Görmek İçin Kategori Seçiniz.");
                    for (int i = 0; i < categoryList.size(); i++) {
                        System.out.println((i + 1) + "-" + categoryList.get(i));
                    }
                    int userChoice = input.nextInt();

                    /*
                     * Kullanıcı Scanner ile kategori seçtikten sonra seçilen kategoriye ait
                     * filmleri getirebilmek
                     * için iç içe bir for each yapısı kullanıldı. İlk for each yapısında FilmList
                     * içerisindeki
                     * film objelerine ulaşıldı. İkinci for each yapısında ise kategori objelerini
                     * tutan
                     * "getCatArrayList" içerisindeki kategorilere ulaşıldı. if yapısı ile de
                     * kullanıcının
                     * seçtiği kategori adına eşit olan filmler listelendi.
                     * 
                     * Son olarak oluştulan ve sıfır olarak tanımlanan "count" değişkeni bu döngüler
                     * içerisinde
                     * seçilen kategoriye ait her film bulunduğunda bir arttı. Film bilgileri
                     * yazdırıldıktan sonra
                     * ilgili kategoride kaç tane film olduğunu yazdırmak için kullanıldı.
                     */

                    System.out.println(categoryList.get(userChoice - 1) + " kategorisindeki filmler :");

                    int count = 0;

                    for (Film fd : FilmList) {
                        for (Category c : fd.getCatArrayList()) {
                            if (c.getCategoryName().equals(categoryList.get(userChoice - 1))) {
                                System.out.println(fd);
                                count++;
                            }
                        }
                    }

                    System.out.println(
                            categoryList.get(userChoice - 1) + " kategorisinde " + count + " tane film vardır...");

                    break;

                case 0:
                    // while döngüsünün koşulunu bozmak ve programı sonlandırmak için eklendi.

                    System.out.println("Çıkış Yapıyorsunuz...");
                    flag = false;
                    input.close();
                    break;

                default:
                    System.out.println("Hatalı bir komut girdiniz...");
                    break;
            }

        } while (flag);
    }
}