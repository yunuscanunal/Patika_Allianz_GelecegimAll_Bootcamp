/*
Merhabalar,

1- test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

2- Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

3- Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

4- Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

Kolay Gelsin.

*/

--1--
create table customer (
	id INT,
	name VARCHAR(50),
	birthday DATE,
	email VARCHAR(50)
);

--2--

insert into customer (id, name, birthday, email) values (1, 'Onida Phlippi', '2010-02-14', 'ophlippi0@barnesandnoble.com');
insert into customer (id, name, birthday, email) values (2, 'Wilt Dyton', '2007-02-25', 'wdyton1@nps.gov');
insert into customer (id, name, birthday, email) values (3, 'Zondra Paolillo', '2022-05-21', 'zpaolillo2@yahoo.co.jp');
insert into customer (id, name, birthday, email) values (4, 'Kellie Perassi', '1946-06-11', 'kperassi3@cnn.com');
insert into customer (id, name, birthday, email) values (5, 'Kimberly Gotter', '1986-04-08', 'kgotter4@ucla.edu');
insert into customer (id, name, birthday, email) values (6, 'Amabel Danilov', '1968-04-21', 'adanilov5@flavors.me');
insert into customer (id, name, birthday, email) values (7, 'Valerye Kempster', '1969-06-23', 'vkempster6@sina.com.cn');
insert into customer (id, name, birthday, email) values (8, 'Brandea Capp', '2009-12-21', 'bcapp7@uiuc.edu');
insert into customer (id, name, birthday, email) values (9, 'Morgan Wreford', '1937-12-08', 'mwreford8@baidu.com');
insert into customer (id, name, birthday, email) values (10, 'Olav Briskey', '1946-01-02', 'obriskey9@mayoclinic.com');
insert into customer (id, name, birthday, email) values (11, 'Rufe Searchwell', '1906-06-27', 'rsearchwella@last.fm');
insert into customer (id, name, birthday, email) values (12, 'Osmund Knolles-Green', '2009-01-01', 'oknollesgreenb@chicagotribune.com');
insert into customer (id, name, birthday, email) values (13, 'Bartholomeus Tant', '1926-03-15', 'btantc@nationalgeographic.com');
insert into customer (id, name, birthday, email) values (14, 'Bartholomeo Keay', '1990-10-03', 'bkeayd@nbcnews.com');
insert into customer (id, name, birthday, email) values (15, 'Horst Kitchingham', '1953-11-28', 'hkitchinghame@princeton.edu');
insert into customer (id, name, birthday, email) values (16, 'Andrew Larderot', '1901-12-05', 'alarderotf@shareasale.com');
insert into customer (id, name, birthday, email) values (17, 'Sheff Paddemore', '1944-04-09', 'spaddemoreg@businessinsider.com');
insert into customer (id, name, birthday, email) values (18, 'Emmalee Arndtsen', '1902-12-30', 'earndtsenh@blinklist.com');
insert into customer (id, name, birthday, email) values (19, 'Jervis Brick', '2008-01-10', 'jbricki@foxnews.com');
insert into customer (id, name, birthday, email) values (20, 'Umberto Strathdee', '1927-09-24', 'ustrathdeej@tinypic.com');
insert into customer (id, name, birthday, email) values (21, 'Georgianne Menham', '1914-02-25', 'gmenhamk@github.io');
insert into customer (id, name, birthday, email) values (22, 'Conant Albarez', '1942-02-10', 'calbarezl@goo.ne.jp');
insert into customer (id, name, birthday, email) values (23, 'Westbrooke Barthot', '1921-10-19', 'wbarthotm@archive.org');
insert into customer (id, name, birthday, email) values (24, 'Nilson Josselson', '1971-11-02', 'njosselsonn@1688.com');
insert into customer (id, name, birthday, email) values (25, 'Claiborn Cressy', '1972-05-21', 'ccressyo@patch.com');
insert into customer (id, name, birthday, email) values (26, 'Alyce Matejka', '1902-12-30', 'amatejkap@psu.edu');
insert into customer (id, name, birthday, email) values (27, 'Luke Claque', '1941-05-07', 'lclaqueq@gnu.org');
insert into customer (id, name, birthday, email) values (28, 'Melicent Risby', '1926-10-10', 'mrisbyr@dagondesign.com');
insert into customer (id, name, birthday, email) values (29, 'Leone O''Hengerty', '1985-10-28', 'lohengertys@mediafire.com');
insert into customer (id, name, birthday, email) values (30, 'Peggie Shillam', '1957-06-18', 'pshillamt@sfgate.com');
insert into customer (id, name, birthday, email) values (31, 'Montgomery Blackader', '2010-12-06', 'mblackaderu@163.com');
insert into customer (id, name, birthday, email) values (32, 'Trudey McConachie', '1947-07-30', 'tmcconachiev@cpanel.net');
insert into customer (id, name, birthday, email) values (33, 'Isidor Penhall', '1934-12-05', 'ipenhallw@craigslist.org');
insert into customer (id, name, birthday, email) values (34, 'Dari Ioannidis', '1994-05-22', 'dioannidisx@over-blog.com');
insert into customer (id, name, birthday, email) values (35, 'Archy Pitchford', '1917-03-30', 'apitchfordy@i2i.jp');
insert into customer (id, name, birthday, email) values (36, 'Conney Uppett', '2016-06-11', 'cuppettz@samsung.com');
insert into customer (id, name, birthday, email) values (37, 'Darb Ramey', '1903-06-27', 'dramey10@usatoday.com');
insert into customer (id, name, birthday, email) values (38, 'Gunther O''Fogerty', '1995-06-28', 'gofogerty11@cisco.com');
insert into customer (id, name, birthday, email) values (39, 'Linda Grendon', '1976-12-08', 'lgrendon12@biglobe.ne.jp');
insert into customer (id, name, birthday, email) values (40, 'Thayne McCluskey', '1906-07-20', 'tmccluskey13@fema.gov');
insert into customer (id, name, birthday, email) values (41, 'Jennee Wimpey', '1976-01-27', 'jwimpey14@ox.ac.uk');
insert into customer (id, name, birthday, email) values (42, 'Sammy Henker', '1915-03-03', 'shenker15@addtoany.com');
insert into customer (id, name, birthday, email) values (43, 'Madelaine Maddra', '1910-09-01', 'mmaddra16@ucoz.ru');
insert into customer (id, name, birthday, email) values (44, 'Torrey Lowndsborough', '1904-09-12', 'tlowndsborough17@flavors.me');
insert into customer (id, name, birthday, email) values (45, 'Arielle Dunckley', '1960-03-26', 'adunckley18@discovery.com');
insert into customer (id, name, birthday, email) values (46, 'Adler Pott', '1911-05-02', 'apott19@etsy.com');
insert into customer (id, name, birthday, email) values (47, 'Winne Bantock', '1946-01-27', 'wbantock1a@cisco.com');
insert into customer (id, name, birthday, email) values (48, 'Joline Farey', '1910-07-17', 'jfarey1b@slate.com');
insert into customer (id, name, birthday, email) values (49, 'Juliette Paley', '2006-08-07', 'jpaley1c@google.ca');
insert into customer (id, name, birthday, email) values (50, 'Mady Beldham', '1969-08-02', 'mbeldham1d@drupal.org');

--3--
UPDATE customer SET NAME =  'yunuscan'
WHERE birthday = '1973-04-21';

UPDATE customer SET birthday = '2002-10-22'
WHERE birthday = '1938-03-18';

UPDATE customer SET NAME = 'victor', birthday ='2000-01-29'
WHERE ID =  10;

UPDATE customer SET email = 'patika@dev.dev'
WHERE email ='Iside1d@goo.gl';

UPDATE customer SET email ='patika@patika.dev', NAME = 'patika' 
WHERE ID = 50;

--4--
DELETE FROM customer
WHERE id = 37;

DELETE FROM customer
WHERE NAME ='Natka';

DELETE FROM customer
WHERE id BETWEEN 1 AND 10;

DELETE FROM customer
WHERE id IN (19,20,30);

DELETE FROM customer
WHERE birthday = '1908-04-10';