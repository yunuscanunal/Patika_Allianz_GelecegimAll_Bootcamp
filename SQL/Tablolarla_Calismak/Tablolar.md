
Lecture 1

# Tablo Oluşturmak ve Silmek (CREATE - DROP)
## Tablo Oluşturmak - CREATE
SQL ile yeni bir tablo oluşturmak için __CREATE__ anahtar kelimesi kullanılır. Tablo oluştururken sonrasında daha detaylı konuşacağımız 3 önemli başlık daha vardır.

Sütunlara verilecek isim, sütunların veri tipi ve varsa sütunlarda bulunan kısıtlama yapıları.

#### Tablo Oluşturmak - CREATE Söz Dizimi
```SQL
CREATE TABLE <tablo_adı> (
    <sütun_adı> <veri_tip> (kısıtlama_adı>,
    <sütun_adı> <veri_tip> (kısıtlama_adı>,
   ....
);
```
#### Tablo Oluşturmak - CREATE Örnek Kullanım
__author__ isminde bir tablo oluşturalım, id, first_name, last_name, email, birthday sütunları olsun. Veri tipleri ve kısıtlama yapılarıyla ilgili sonrasında detaylı olarak konuşacağız.
```SQL
CREATE TABLE author (
  id SERIAL PRIMARY KEY,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  email VARCHAR(100)
  birthday DATE
);
```
## Tablo Silmek - DROP
Oluşturduğumuz tabloları silmek için __DROP__ anahtar kelimesi kullanılır.

#### Tablo Silmek - DROP Söz Dizimi
```SQL
DROP TABLE (IF EXISTS) <tablo_adı>;
```
Burada __IF EXISTS__ yapısını kullanarak yanlış tablo ismi yazımı durumunda hata mesajı almayı önleriz.

#### Tablo Silmek - DROP Örnek Kullanım
"test" isimli tablomuzu silmek istersek;
```SQL
DROP TABLE IF EXISTS test;
```

---

Lecture 2

# Tablo Verilerini Güncellemek (UPDATE - DELETE)
Bir tabloda bulunan verileri güncellemek veya silmek için öncelikle örnek bir tablo oluşturup içine 5 date veri yerleştireceğim.

Bunun için _Mockaroo_ benzeri servisleri kullanabiliriz. Aşağıdaki örnek tablo oluşturma ve veri girme komutlarını bulabilirsiniz.
```SQL
CREATE TABLE my_apps (
	id INT,
	name VARCHAR(50),
	price VARCHAR(50)
);

INSERT INTO my_apps (id, name, price) values (1, 'Ronstring', '$0.96');
INSERT INTO my_apps (id, name, price) values (2, 'Duobam', '$3.44');
INSERT INTO my_apps (id, name, price) values (3, 'Tresom', '$2.21');
INSERT INTO my_apps (id, name, price) values (4, 'Redhold', '$2.52');
INSERT INTO my_apps (id, name, price) values (5, 'Y-find', '$9.14');
```
### UPDATE
__UPDATE__ anahtar kelimesi sayesinde tablomuzda bulunan verileri güncelleyebiliriz.

#### UPDATE Söz Dizimi
```SQL
UPDATE <tablo_adı>
SET <sütun_adı> = değer, 
    <sütun_adı> = değer,
    ----
WHERE <koşul_adı>;
```
#### UPDATE Örnek Kullanım
__my apps__ tablosunda bulunan ve id 2' ye eşit olan verimizin name sütunundaki degerini 'Mayak' price sütunundaki değerini '$5.22' ile değiştirelim.
```SQL
UPDATE my_apps
SET name = 'Mayak',
	price = '$5.22'
WHERE id = 2;
```
### DELETE
__DELETE__ anahtar kelimesi sayesinde tablomuzda bulunan verileri silebiliriz.

#### DELETE Söz Dizimi
```SQL
DELETE FROM <tablo_adı>
WHERE <koşul_adı>;
```
#### DELETE Örnek Kullanım
__my apps__ tablosunda bulunan name sütunundaki verisi 'Tresom' olan satırı silelim.
```SQL
DELETE FROM my_apps
WHERE name = 'Tresom';
```

---

Lecture 3