Lecture 1

# Değişkenler ve Veri Tipleri
Değişkenler programlamada geçici bilgileri sakladığımız ve programcı tarafından belirlenen yapılardır. Değişkenler programlamanın temel yapısını oluşturmaktadır ve tüm programlama dillerinde kullanılan bir yapıdır. Değişkenler sayesinde program içinde yaptığımız işlemleri hafıza da tutar ve gerektiği yerlerde kullanırız. Değişkenlerin 4 özelliği bulunur ; Veri Tipi, İsim, Değer ve Adres.

Değişkenlerde Veri Tipi, adından da anlaşılacağı üzere verinin saklanacağı türünü belirtmektedir bunlar sayılar, sözcükler ve programatik alanlar olabilir. Her değişkenin program içinde kullanıldığı ve çağrıldığı benzersiz bir ismi vardır. Bu değişkenlere birde değer atarız , işletim sistemimizde bu değişkeni hafızada tutar ve bir adres belirler.

Java'da değişkenlerin veri tipleri vardır. Bu tipler Java'da varsayılan olarak tanımlı gelen ilkel tipler (primitive) de olabilir yahut yazılımcıların kendi tanımladığı ilkel olmayan tipler (non-primitive) de olabilir. İlkel tipler her zaman bir değere sahiptir. İlkel olmayan tipler ise 'null' (boş) olabilir. İlkel olmayan türlerin tümü aynı boyuta sahipken ilkel veri tiplerin boyutu alacağı veri tipine bağlıdır.

## Java Değişken Tanımlama
<veri tipi> <değişken ismi> = veri (değer)

İlk önce değişkenin veri tipini ve değişkenin ismini yazarız ve istenirse aynı matematikteki gibi "=" eşittir ile değerini atarız.
```java
int number;
// number isminde, int veri tipinde bir değişken tanımlanmış
```
Veri tipleri aynı olan değişkenleri aynı satırda tanımlayabiliriz
```java
int a, b, c;
// int veri tipinde 3 tane değişken tanımlanmış
```
Değişkeni tanımladıktan sonra, atama operatörü (=) kullanarak değişkene atayabiliriz.
```java
double pi; // ilk başta double türünde bir değişken tanımladık
pi = 3.14; // Daha sonra bu değişkene bir değer atadık
```
Eğer bir değişkene hemen değer atayacaksanız, bunu iki satırda yapmak yerine tek bir satırda halledebilirsiniz.
```java
double pi = 3.14;
```
Aynı satırda aynı türden birden fazla değişken tanımlıyorsak :
```java
int a = 1 , b = 2;
// Aynı satırda int türünde 2 farklı değişken tanımlanmış ve ikisine de değer verilmiş
```
Değişkene verilen değer sonrasında değiştirilebilir, ama aynı isimde ikinci bir değişken oluşturulamaz ve hata alırız.

### Hatalı Kullanım :
```java
int a = 5; // a isminde bir değişken tanımlanmış
int a = 1 ; // Bu satır hataya neden olur, a değişkeni zaten var
```
### Doğru Kullanım :
```java
boolean a = true; // a isminde bir değişken tanımlanmış ve varsayılan bir değer verilmiş
a = false; // a değişkeninin değeri değiştirilmiş
```
## Java'daki İlkel Veri Tipleri
- Tam Sayılar
- Byte
- Short
- Integer
- Long
- Ondalıklı Sayılar
- Float
- Double
- Karakterler
- Char
- Mantıksal Değerler
- Boolean


--- 
Lecture 2


# Byte, Short, Int ve Long Veri Tipleri
Java'da tam sayıları belirten veri tipleri __Byte, Short, Integer ve Long__'tur.

## Byte
- 8 bit uzunluğundadır. Max 127 , Min -128 değerleri arasındadır.
- Anahtar sözcük : __byte__
## Short
- 16 bit uzunluğundadır. Max 32,767 , Min -32,768 değerleri arasındadır.
- Anahtar sözcük : __short__
## Integer
- 32 bit uzunluğundadır. Max 2,147,483,647 , Min -2,147,483,648 değerleri arasındadır.
- En çok tercih edilen veri tipidir , sebebi ise optimize uzunluktadır.
- Anahtar sözcük : __int__
## Long
- 64 bit uzunluğundadır. Max 9,223,372,036,854,775,807 , Min -9,223,372,036,854,775,808 değerleri arasındadır.
- Int’in yetersiz olduğu yerlerde kullanılır
- Anahtar sözcük : __long__

```java
public class JavaPatika {
    public static void main(String[] args) {
        byte a = 120;
        short b = 1000;
        int c = 100000;
        long d = 10000000;
    }
}
```

---
Lecture 3


# Float ve Double Veri Tipleri
Java'da ondalıklı yani küsuratlı sayıları belirten veri tipleri __Float__ ve __Double__'dır.

## Float
- 32 Bit boyutundadır ve 1.4×10^-45 ile 3.4×10^38 aralığında bir değer tanımlanabilir.
- Float içerisine tam sayı yazdığımız zamanda bile o sayı 1.0 şeklinde ondalıklı olarak algılar.
- Float ile double ayırmak için , float tanımlamalardan sonra ‘f’ veya ‘F’ konulmalıdır.
- Anahtar Sözcük : __float__
## Double
- 64 Bit boyutundadır ve 4.9×10^-324 ile 1.8×10^308 aralığında bir değer tanımlanabilir.
- Üst düzey matematiksel işlemlerde kullanılır
- Anahtar Sözcük : __double__
### Ondalık Sayı Veri Tiplerinden Hangisi Tercih Edilmelidir ?
Bu sorunun cevabı değişken olmakla beraber hangi durumlarda Double veya Float kullanımınız için dikkat etmeniz gereken hususlar

- __Double__ tipi, yüksek duyarlıklı ve hassas matematiksel işlemlerde kullanılır.
- __Float__ basittir : hız ve bellek.
- __Double__ daha yavaş ve fazla yer kaplar.(Bu işlemler arasında milisaniye oynar)
- __Java__ hassas matematiksel işlemler, örneğin sinüs kosinüs fonksiyonları, double tipi değer döndürür.
```java
public class JavaPatika {
    public static void main(String[] args) {
        float number1 = 3.14F;
        float number2 = 3.14f;

        double number3 = 3.14;
    }
}
```

---
Lecture 4


# Char ve Boolean Veri Tipleri
## Char
Java'da karakter değişkenleri saklamak için __Char__ kullanılır. __Char__ veri tipleri birleşerek __String__ Sınıfından bir yapıya dönüşür.

- Karakterler Char ile saklanır.
- Diğer dillere göre Char Java’da 16 bittir.
- Java Unicode karakter setini kullanır ve tüm dilleri içerir.
- Java evrensel bir dil olarak tasarlandığı için karakter seti de evrensel set olan Unicode ile tanımlanmıştır.
- Anahtar Sözcük : __char__
## Boolean
Java, mantıksal değerleri saklamak için boolean adında bir tipe sahiptir.

- Boolean sadece iki değer alabilir : True ve False
- Genellikle koşul ve döngü işlemlerinde, kontrol amaçlı olarak kullanılır.
- Anahtar Sözcük : __boolean__
```java
public class JavaPatika {
    public static void main(String[] args) {
        char letter = 'u';
        boolean logic1 = true;
        boolean logic2 = false;
    }
}
```

---
Lecture 5


# String Sınıfı
__String__ sınıfı __java.lang__ kütüphanelerinde bulunan ve metinlerle ilgili her türlü işlemin yapıldığı sınıftır. Java'da genellikle kelime tutmak için char yerine String sınıfı kullanılır. Basitçe şöyle düşünebiliriz , Char veri tipi tek bir karakter tutabiliyorken, charların birleşmesiyle oluşan sözcükleri String Sınıfı tutmaktadır.
```java
public class JavaPatika {
    public static void main(String[] args) {
        String words = "Hello World";
    }
}
```

---
Lecture 6


# Temel Operatörler
Java dilinde operatörler birçok işlemi yapabilmenize olanak tanır. Örneğin: matematiksel operatörlerle birlikte aritmetik işlemler yapabilmenizi, ilişkisel operatörlerle verileri kıyaslayabilmeyi, atama operatörleri ile değişkenlerin değerlerini değiştirmeye fırsat verir.

Java'da operatörler aşağıdaki gibi listelenebilir:

- Atama Operatörleri
- Aritmetiksel Operatörler
- İlişkisel ve Eşitlik Operatörler
- Koşul Operatörler
- Mantıksal Operatörler

## Atama Operatörü
![Atama Operatörü](../../img/atama.png 'Atama Operatörü')
## Aritmetik Operatörler
Java'da Aritmetik Operatörler adından da anlaşılacağı üzere matematiksel işlemleri programlama dilinde uygulamamızı sağlarlar.

- Toplama : a + b
- Çıkarma : a – b
- Çarpma : a * b
- Bölme : a / b
- Mod alma : a % b
- 1 arttırma : a++
- 1 eksiltme : b--
## Karşılaştırma Operatörleri
Java'da Karşılaştırma Operatörleri iki nesnenin birbirleriyle olan durumlarını belirler.

- Eşitlik : a == b
- Eşit Değil : a != b
- Büyüktür : a > b
- Küçüktür : a < b
- Büyük Eşittir : a >= b
- Küçük Eşittir : a <= b
## Mantıksal Operatörler
Java'da Mantıksal Operatörler , nesnelerin veya ifadelerin mantıksal değerlerini yansıtır.

- Ve : a && b
- Veya : a || b
- Değil : !(a&&b)
## Koşul Operatörü
Java'da Koşul Operatörleri ifadelerin sonucunda oluşacak olayları belirler.

- a = 5 ;
- b = (a == 1) ? 1 : 0
- Çıktısı : 0

---
Lecture 7

# Kullanıcıdan Veri Alma
Java’da __kullanıcıdan veri almak__ için __Scanner__ sınıfı kullanılır. Ama bu sınıfı kullanmadan önce kodumuza Scanner sınıfını dahil etmemiz gerekir. Bunun için __import__ deyimi kullanılır ;

```java
import java.util.Scanner;
```
İmport deyimi projenin en başına yazılır. Kullanıcıdan verileri almak için __değişkenlere__ ihtiyacımız vardır. İlk önce "__a__" adında veri tipi integer olan bir değişken oluşturalım. Oluşturduğumuz "__a__" değişkenine veriyi kullanıcıdan almak için yapmamız gereken Scanner sınıfını kullanmak. __Scanner__ sınıfından türeyen adı "input" olan bir nesne tanımlayalım. Sınıf ve Nesne kavramları ilerleyen derslerde detaylıca anlatılacaktır. __Scanner__ sınıfından nesne ürettikten sonra değişkenimize veri almak için, değişkenimizin türüne göre bir kod yazmamız gerekecektir. Eğer değişkenimizin "__integer__" türünde ise "__input.nextInt()__" veya double türünde ise "__input.nextDouble()__" kod bloğu kullanılmalıdır.
```java
import java.util.Scanner;

public class JavaPatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;

        System.out.println("A sayısını giriniz : ");
        a = input.nextInt();

        System.out.println("B sayısını giriniz : ");
        b = input.nextInt();

        System.out.println("A Sayısı : " + a);
        System.out.println("B Sayısı : " + b);
    }
}
```
## Veri Tiplerine Göre Scanner Metotları

![Scanner Method](../../img/scannerMethod.png 'Scanner Method')
```java
import java.util.Scanner;
public class JavaPatika {public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        // String ÖrneğiString adSoyad = inp.nextLine();
        
        // Sayı Örnekleriint yas = inp.nextInt();
        double maas = inp.nextDouble();
        
        // Çıktılar
        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("Yaş : " + yas);
        System.out.println("Maaş : " + maas);
    }
}
```