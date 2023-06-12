Lecture 1

# ORDER BY
ORDER BY anahtar kelimesi sayesinde bizler verilerimizi herhangi bir sütunda bulunan değerlere göre azalan veya artan bir şekilde sıralayabiliriz.

## ORDER BY Söz Dizimi
```SQL
SELECT <sütun_adı>, <sütun_adı>, ...
FROM <tablo_adı>
ORDER BY <sütun_adı>, <sütun_adı>, ... ASC|DESC;
```

## ORDER BY Örnek Kullanım
```SQL
SELECT *
FROM film
ORDER BY title (ASC);
```
Bu sorgumuzda __dvdrental__ veritabanında bulunan __film__ tablosundaki tüm sütunları __title__ sütununda bulunan verilere göre artan (ASC) şeklinde sıralıyoruz.

ASC sıralama varsayılan olduğu için ayrı bir şekilde yazılması zorunluluğu yoktur ancak sorguyu belirginleştirmesi açısından genelde yazılır.
```SQL
SELECT *
FROM film
ORDER BY title ASC length DESC;
```
Sıralama birden fazla sütuna göre de yapılabilir. Yukarıdaki örneğimizde sıralama __title__ sütununa göre artan __length__ sütununa göre azalan şeklinde yapılıyor.
```SQL
SELECT *
FROM film
WHERE title LIKE 'A%'
ORDER BY title ASC length DESC;
```
Yukarıdaki örneğimizde de gördüğümüz gibi sıralama işlemi, koşuldan sonra yazılır.

---

Lecture 2

# LIMIT ve OFFSET
## LIMIT
Şimdiye kadar yaptığımız SQL sorgularında genellikle verilerin tamamını belirli koşullar altında sıraladık. Bazı durumlarda ise koşullarımızı sağlayan verilerin tamamını değil belirli sayıda olanlarını sıralamak isteriz, bunun için LIMIT anahtar kelimesini kullanırız.

Şöyle bir senaryo üzerine düşünelim. __dvdrental__ veritabanında bulunan __film__ tablosundan B ile başlayan filmleri uzunluklarına göre en uzun olan 10 filmi sıralayalım.

```SQL
SELECT *
FROM film
WHERE title LIKE 'B%'
ORDER BY length DESC
LIMIT 10;
```
Yukarıdaki sorgumuzda da görmüş olduğunuz gibi önce koşullamayı, sonra gruplamayı en son ise __LIMIT__ kullanarak istediğimiz veri sayısını belirttik.

## OFFSET
Bazı durumlarda sonuç olarak gördüğümüz veri grubu içerisinden bazılarını "pass" geçmek isteriz. Yukarıdaki senaryomuzu tekrar düşünelim, __dvdrental__ veritabanında bulunan __film__ tablosundan B ile başlayan filmleri uzunluklarına göre sıralayalım ancak en uzun 6 filmi "pass" geçelim ve sonrasındaki 4 filmi sıralayalım. Bu durumda __LIMIT__ 4 ve __OFFSET__ 6 olacak.

```SQL
SELECT *
FROM film
WHERE title LIKE 'B%'
ORDER BY length DESC
OFFSET 6
LIMIT 4;
```

---

Lecture 3

# Aggregate Fonksiyonlar - MIN, MAX, SUM, AVG
Aggregate fonksiyonları yardımıyla bizler veri kümelerimizden sonuçlar çıkarabiliriz. Ne demek istiyorum? Şu senaryoları düşünelim.

- Toplam kaç adet müşterimiz var?
- Elimizde bulunan filmlerin ortalama uzunluğu nedir?
Bu şekilde belirli veri kümelerinden tek bir sonuç çıkarmak için aggregate fonksiyonları kullanırız.

## Örnek Kullanımlar
AVG fonksiyonunu kullandığımız sayısal değerlerden oluşan sütunun ortalama değerini alırız.
```SQL
SELECT AVG(length) 
FROM film;
```
sorgusu sayesinde __film__ tablosunda bulunan __length__ sütunundaki değerlerin ortalamasını alırız. SUM fonksiyonunu kullandığımız sayısal değerlerden oluşan sütunun toplam değerini alırız.
```SQL
SELECT SUM(length) 
FROM film;
```
sorgusu sayesinde __film__ tablosunda bulunan __length__ sütunundaki değerlerin toplamını alırız. MAX fonksiyonunu kullandığımız sayısal değerlerden oluşan sütunun en yüksek değerini alırız.
```SQL
SELECT MAX(length) 
FROM film;
```
sorgusu sayesinde __film__ tablosunda bulunan __length__ sütunundaki değerlerin en yüksek değerini alırız. MIN fonksiyonunu kullandığımız sayısal değerlerden oluşan sütunun en düşük değerini alırız.
```SQL
SELECT MIN(length) 
FROM film;
```
sorgusu sayesinde __film__ tablosunda bulunan __length__ sütunundaki değerlerin en düşük değerini alırız.


---

Lecture 4

# GROUP BY
Bizler şimdiye kadar olan sorgularımızın tamamında sorguları yaparken genel veri kümesinin tamamı üzerine düşündük, ancak bazı durumlarda aynı sonuçları veri kümesinin içerisinde bulunan farklı gruplarda da bulmak isteyebiliriz. Senaryomuzu şu şekilde düşünelim, __dvdrental__ veritabanında __rental_rate__ sütununda bizim 3 farklı değerimiz var (0.99, 2.99, 4.99). Biz bu 3 farklı değer için en uzun filmi bulmaya çalışalım.
```SQL
SELECT MAX(length)  FROM film
WHERE rental_rate = 0.99;
SELECT MAX(length) 
FROM film
WHERE rental_rate = 2.99;
SELECT MAX(length) 
FROM film
WHERE rental_rate = 4.99;
```
İstediğimiz sonuçları elde ediyoruz ancak şöyle bir sorunumuz var 3 farklı değer yerine 30 farklı değer olsaydı? İşte bu şekilde senaryolar için yani verileri gruplama için __GROUP BY__ anahtar kelimesi kullanılır.

## GROUP BY Söz Dizimi
```SQL
SELECT <sütun_adı>, <sütun_adı>, ... (veya aggregate func) FROM <tablo_adı>
GROUP BY <sütun_adı>, <sütun_adı>, ...
```
Burada şuna dikkat etmemiz gerekir, SELECT anahtar kelimesinde bulunan sütunların GROUP BY anahtar kelimesi içerisinde bulunması gerekir.

## GROUP BY Örnek Kullanım
Yukarıdaki senaryomuzu GROUP BY anahtar kelimesini kullanarak gerçekleştirelim. Dikkat ettiğiniz üzere SELECT ile kullanılan rental_rate sütunu GROUP BY satırında da kullanılmıştır.
```SQL
SELECT rental_rate, MAX(length)  FROM film
GROUP BY rental_rate;
```

---

Lecture 5


# HAVING
__HAVING__ anahtar kelimesi sayesinde gruplandırılmış verilere koşullar ekleyebiliriz. Hemen aklımıza __WHERE__ anahtar kelimesi geldi değil mi? Ancak WHERE anahtar kelimesi ile biz satır bazlı koşullar verebiliyoruz.

Şöyle bir senaryomuz olsun. Her bir rental_rate oranına karşılık gelen film sayısını bulalım. Bunu GROUP BY ile gerçekleştirebiliriz. Ancak bu kez 1 adım öteye gidip şöyle bir koşul ekleyelim toplam film sayısı 325 ten fazla olan rental_rate oranlarını görelim. Bu durumda GROUP BY ile elde ettiğimiz toplam film sayılarına koşul eklememiz gerekir.
```SQL
SELECT rental_rate, COUNT(*) FROM film GROUP BY rental_rate HAVING COUNT(*) > 325;
```

---

Lecture 6

# ALIAS (AS)
__AS__ anahtar kelimesi sayesinde sorgular sonucu oluşturduğumuz sanal tablo ve sütunlara geçici isimler verebiliriz.

## ALIAS SÜTUN KULLANIMI
```SQL
SELECT <sütun_adı> AS <geçici_ad>
FROM <tablo_adı>;
```
## ALIAS TABLO KULLANIMI
```SQL
SELECT <sütun_adı>, <sütun_adı>...
FROM <tablo_adı> AS <geçici_ad>;
```