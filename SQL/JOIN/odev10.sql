/*
Merhabalar,

Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.

1- city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz LEFT JOIN sorgusunu yazınız.

2- customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz RIGHT JOIN sorgusunu yazınız.

3-customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz FULL JOIN sorgusunu yazınız.

Kolay Gelsin.
*/

--1--
SELECT country, city FROM country
LEFT JOIN city ON city.country_id = country.country_id;

--2--
SELECT payment.payment_id, 
	customer.first_name, 
	customer.last_name 
FROM customer
LEFT JOIN payment ON customer.customer_id = payment.customer_id;

--3--
SELECT rental.rental_id, 
	customer.first_name, 
	customer.last_name 
FROM customer
LEFT JOIN rental ON customer.customer_id = rental.customer_id