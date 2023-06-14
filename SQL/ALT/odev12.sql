/*
Merhabalar,

Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.

1- film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?

2- film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?

3- film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.

4- payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.

Kolay Gelsin.
*/

--1
SELECT length FROM film
WHERE length > (
	SELECT AVG(length) FROM film
);

--2
SELECT rental_rate FROM film
WHERE rental_rate = (
	SELECT MAX(rental_rate) FROM film
);

--3
SELECT rental_rate, replacement_cost FROM film
WHERE (rental_rate = (
	SELECT MIN(rental_rate) FROM film
	)
	AND replacement_cost = (
	SELECT MIN(replacement_cost) FROM film
	)
);

--4
SELECT customer.customer_id, first_name, last_name, purchase FROM customer
INNER JOIN (
	SELECT COUNT(*) AS purchase, customer_id FROM payment
	GROUP BY customer_id
)
AS count_purchases_table ON customer.customer_id = count_purchases_table.customer_id
ORDER BY purchase DESC
;
