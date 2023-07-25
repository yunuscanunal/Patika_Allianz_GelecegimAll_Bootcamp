Lecture 1
# Erişim Belirleyiciler (Access Modifiers)
Java'da bir sınıfa ait nitelik ve davranışlara ulaşabilmek için Erişim Belirleyiciler (Access Modifiers) kullanılır. Erişim belirleyiciler, değişken ,metot ve sınıfların önüne yazılır ve yazıldıkları konuların erişilebilecekleri alanları belirlerler. Java'da 3 adet Erişim Belirleyiciler vardır bunlar ; public , private ve protected.

## Private Erişim Belirleyici
Java'da private deyimi yazıldığı öğenin sadece ait olduğu sınıftan doğrudan erişilebilir olduğunu ve o sınıfın dışındaki kod parçacıklarından doğrudan erişilemeyeceğini tanımlar. Nesne Yönelimli Programlama'nın temel ilkelerinden olan Sarmalama ilkesi gereği, sınıf içindeki değişkenler sadece sınıf içinde doğrudan erişebilir olması gerekir. Bundan dolayı, genellikle değişkenler "private" olarak tanımlanır. Bazı zamanlarda ise sadece o sınıfta çağrılmasını istediğimiz değişkenler veya metotları da private olarak tanımlarız.

## Public Erişim Belirleyici

Java'da "public" deyimi , yazıldığı öğenin sadece olduğu sınıf için değil, diğer sınıflar tarafından doğrudan erişilebilir olmasını sağlar. Sınıflara ait nesnelerin ve diğer nesneler tarafından kullanılması istenilen metotlar için "Public Erişim Düzenleyicisi" kullanılır.

## Protected Erişim Belirleyici
Java'da "protected" deyimi , public ve private arasında kalan bir erişim düzenleyicidir. Protected ile tanımlanan öğeler, kendisi ile aynı package (paket) bulunan sınıflar tarafından doğrudan erişilir.

## Varsayılan
Eğer yazdığımız kodlarda herhangi bir öğenin önüne erişim düzenleyici yazmazsak, o öğenin erişimi ait olduğu paket ile sınırlandırılır. Aynı pakette bulunan başka bir sınıf içinden o öğeye erişilir.

## Tüm kullanım şekilleri

![Access Modifiers](../../img/accessModifiers.jpeg "Access Modifiers")

---
Lecture 2

# Static Kullanımı
Java'da Static deyimi, sınıf değişkenlerini ve ya sınıf metotlarını tanımlarken kullanılır. Eğer bir sınıfa ait değişkenlerin başına "static" yazılırsa, o değişkenler artık sınıf değişkeni olurlar. Sınıf değişkeni olarak tanımlanan değişkenler, her nesne oluşturduğumuzda ayrı ayrı oluşmazlar. Sınıfa ait ne kadar nesne olursa olsun, sınıf değişkenleri 1 tanedir. Sınıfa ait herhangi bir nesne üzerinden bu değişkene ulaşılabilir. Sınıf değişkenlerinin bir diğer özelliği ise, ilgili sınıfa ait hiç nesne oluşturulmasa bile bellekte yer kaplarlar.
```java
public class Player { static int onlinePlayers; 
    Player() {
        onlinePlayers++;
    }

public static void main(String[] args) { 
Player p1 = new Player(); Player p2 = new Player(); Player p3 = new Player(); 
System.out.println("Online oyuncular : " + Player.onlinePlayers);     }
}
```
Eğer sınıfa ait metotlardan bir yada birden fazlasının önüne "static" deyimi yazılırsa, o metotlar sınıf metodu olurlar. Sınıf metotlarının en önemli özelliği, ilgili sınıfa ait nesne oluşturmadan sınıf metodu çağırılabilir. Bir sınıf değişkeninin, henüz nesne oluşturulmasa da bellekte fiziksel olarak yer kapladığını söylemiştik. Bir sınıf metodunun ise nesne oluşturulmadan, sınıf adı üzerinden çağrılabildiğini belirttik. Bu durumda, nesne var olmadan çağrılabilecek olan sınıf metotları, nesne var olmadan bellekte var olamayan olgu değişkenlerine erişmesi olanaklı değildir. Benzer şekilde, nesne var olmadan bellekte var olan sınıf değişkenleri üzerinde işlem yapan yöntemlerin, nesne var olmadan çağrılabilmeleri gerekir.
```java
public class Course {     String name;
    String code;
    String prefix;
int note; 
public Course(String name, String code, String prefix) { this.name = name; this.code = code; this.prefix = prefix; this.note = 0;     }

public static void courseList() { String[] courseList = {"fizik", "kimya", "matematik"}; for (String courseName : courseList) {             System.out.println(courseName);
        }
    }

public static void main(String[] args) { Course c1 = new Course("Mat-101" , "MAT" , "MAT");         Course.courseList();
    }
}
```

---
Lecture 3

# Static Kod Blokları
Sınıf değişkenlerinin ilk değerlerinin verilmesi için kurucu metotlar kullanabiliriz. Ancak sınıfa ait statik değişkenlerinin ilk değerlerini kurucu içinde vermeye çalışmak yanlış olabilir. Çünkü sınıf değişkenleri, hiç nesne oluşturulmamış olsa da kullanılabilmektedir. Sınıf değişkenleri ile ilgili olarak bir defaya özel olmak üzere işletilmesi istenen kod kesimleri static kod bloklarında kodlanabilir. Static kod blokları, sınıf belleğe yüklendiği anda işletilir. Böylece sınıf değişkenleri bellekte oluşturuldukları anda ilk değerlerini almış olurlar.
```java
public class Yazar {
    private String ad;
    private String soyad;

    public Yazar(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getBilgi() {
        return this.ad + " " + this.soyad;
    }
}
```
```java
public class YazarIslemleri {
    private static Yazar[] yazarlar;
    static {
        yazarlar = new Yazar[5];
        yazarlar[0] = new Yazar("Reşat Nuri", "Güntekin");
        yazarlar[1] = new Yazar("Necip Fazıl", "Kısakürek");
        yazarlar[2] = new Yazar("Yakup Kadri", "Karaosmanoğlu");
        yazarlar[3] = new Yazar("Halit Ziya", "Uşaklıgil");
        yazarlar[4] = new Yazar("Yahya Kemal", "Beyatlı");
    }
    public static Yazar[] getYazarlar() {
        return YazarIslemleri.yazarlar;
    }
}
```

---
Lecture 4

# Final Anahtar Sözcüğü ve Sabit Tanımlama

Java'da "final" deyimi, önüne yazıldığı öğenin değerini bir kez tanımlandıktan sonra değiştirilemeyeceğini söyler. Bu yüzden programımız içerisinde "sabit" tanımlamak için kullanılır.

Bir sabit değeri tanımlandıktan sonra değiştirilemeyeceği için, final ile tanımlanmış bir değişkenin "public" olmasında bir sorun olmayacaktır.

NOT : Sabit tanımlarken isimler büyük harflerle yazılır. Sabit adı birden fazla sözcükten oluşuyorsa, sözcükler altçizgi ( _ ) ile birbirlerinden ayrılır. Örneğin en fazla kayıt sayısını ifade edecek sabitin adı şöyle verilebilir: __PATIKA_DEV_JAVA_102__
```java
final double PI = 3.14;
```