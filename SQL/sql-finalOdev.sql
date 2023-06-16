CREATE TABLE users (
	user_id SERIAL NOT NULL PRIMARY KEY,
	username VARCHAR(50) NOT NULL UNIQUE,
	email VARCHAR(50) NOT NULL UNIQUE,
	creation_date DATE DEFAULT CURRENT_TIMESTAMP,
	is_active VARCHAR(50)
);

CREATE TABLE categories (
	category_id SERIAL PRIMARY KEY,
	name VARCHAR(50) UNIQUE NOT NULL,
	creation_date DATE DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE posts (
	post_id SERIAL PRIMARY KEY,
	user_id INT NOT NULL,
	category_id INT NOT NULL,
	title VARCHAR(50) NOT NULL,
	content TEXT NOT NULL,
	view_count INT DEFAULT 0,
	creation_date DATE DEFAULT CURRENT_TIMESTAMP,
	is_published VARCHAR(50),
    FOREIGN KEY (user_id) REFERENCES users(user_id),
	FOREIGN KEY (category_id) REFERENCES categories(category_id)
);

CREATE TABLE comments (
	comment_id SERIAL PRIMARY KEY,
	post_id INT NOT NULL,
	user_id INT,
	comment TEXT NOT NULL,
	creation_date DATE DEFAULT CURRENT_TIMESTAMP,
	is_confirmed VARCHAR(50),
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (post_id) REFERENCES posts(post_id)
);

-- users tablosunda minimum 2 kullanıcı bulunmalıdır.
-- insert two users into users table
insert into users (user_id, username, email, creation_date, is_active) values (1, 'bcromer0', 'kodornan0@omniture.com', '2005-04-08 07:12:19', true);
insert into users (user_id, username, email, creation_date, is_active) values (2, 'jhillburn1', 'cjzhakov1@google.nl', '2005-10-15 11:16:04', true);


-- categories tablosunda minimum 3 kategori bulunmalıdır.
-- insert three categories into categories table
insert into categories (category_id, name, creation_date) values (1, 'Ornamental Railings', '2019-07-20 15:07:19');
insert into categories (category_id, name, creation_date) values (2, 'Marlite Panels (FED)', '2008-07-25 17:42:11');
insert into categories (category_id, name, creation_date) values (3, 'Overhead Doors', '2004-04-22 02:58:10');


-- posts tablosunda farklı kategorilerde, farklı görüntülenme sayılarında ve farklı başlıklarda minimum 50 gönderi bulunmalıdır.
-- insert fifty posts into posts table
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (1, 2, 1, 'Lipton Cockton in the Shadows of Sodoma', 'In congue. Etiam justo. Etiam pretium iaculis justo.

In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus.

Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi.', 70, '2011-12-26 16:07:43', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (2, 2, 2, 'The Land Before Time IV: Journey Through the Mists', 'Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris.

Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.', 320, '2007-02-02 22:31:27', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (3, 1, 3, 'Mannequin', 'Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.', 848, '2019-07-08 06:55:14', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (4, 2, 3, 'The Fighting 69th', 'Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus.', 791, '2009-09-23 12:35:21', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (5, 1, 2, 'Horsemen', 'In congue. Etiam justo. Etiam pretium iaculis justo.

In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus.', 949, '2012-02-05 03:20:26', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (6, 2, 3, 'Speed Racer', 'Morbi porttitor lorem id ligula. Suspendisse ornare consequat lectus. In est risus, auctor sed, tristique in, tempus sit amet, sem.

Fusce consequat. Nulla nisl. Nunc nisl.

Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus. Duis at velit eu est congue elementum.', 813, '2000-09-20 12:04:49', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (7, 2, 3, 'Breaker! Breaker!', 'Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat.

Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede.', 682, '2015-05-08 03:36:03', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (8, 1, 1, 'Dangerous', 'Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis.

Sed ante. Vivamus tortor. Duis mattis egestas metus.

Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.', 973, '2008-05-04 23:27:03', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (9, 2, 1, 'Extreme Measures', 'Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros.

Vestibulum ac est lacinia nisi venenatis tristique. Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat.

In congue. Etiam justo. Etiam pretium iaculis justo.', 305, '2000-06-11 21:42:54', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (10, 1, 3, 'Paleface, The', 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.', 783, '2001-11-30 09:46:04', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (11, 1, 3, 'Purple Rain', 'In sagittis dui vel nisl. Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus.

Suspendisse potenti. In eleifend quam a odio. In hac habitasse platea dictumst.', 843, '2017-03-09 16:58:56', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (12, 1, 2, 'Wild One, The', 'Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus.

Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus.

Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.', 718, '2012-09-07 10:51:59', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (13, 1, 3, 'Romeo and Juliet', 'Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.

Etiam vel augue. Vestibulum rutrum rutrum neque. Aenean auctor gravida sem.', 139, '2017-12-25 13:19:59', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (14, 2, 1, 'Conman (Du Xia 1999)', 'In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo.

Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis.

Sed ante. Vivamus tortor. Duis mattis egestas metus.', 760, '2011-05-14 09:35:09', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (15, 1, 3, 'Godzilla Against MechaGodzilla (Gojira tai Mekagoj', 'In congue. Etiam justo. Etiam pretium iaculis justo.

In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus.', 83, '2006-12-20 14:52:42', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (16, 2, 3, 'Kids, The (Mistons, Les) (Mischief Makers, The)', 'Vestibulum ac est lacinia nisi venenatis tristique. Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat.', 293, '2003-07-14 08:20:11', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (17, 2, 3, 'The Imitation Game', 'Etiam vel augue. Vestibulum rutrum rutrum neque. Aenean auctor gravida sem.', 456, '2018-08-23 11:52:38', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (18, 2, 1, 'River, The', 'Nullam sit amet turpis elementum ligula vehicula consequat. Morbi a ipsum. Integer a nibh.', 551, '2020-12-02 11:02:38', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (19, 2, 3, 'Tunnel, The', 'Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.

Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros.

Vestibulum ac est lacinia nisi venenatis tristique. Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat.', 118, '2003-01-28 17:50:41', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (20, 2, 2, 'Leap of Faith', 'Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.', 775, '2009-09-22 08:36:19', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (21, 2, 3, 'Baraka', 'Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit.', 973, '2016-01-08 19:58:49', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (22, 1, 1, 'Emma', 'Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.

Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem.

Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus.', 902, '2009-12-07 04:41:39', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (23, 2, 1, 'Blob, The', 'Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio.', 358, '2016-02-06 04:57:00', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (24, 2, 3, 'My Blue Heaven', 'Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.', 806, '2010-07-13 18:18:12', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (25, 1, 1, 'All the Brothers Were Valiant', 'Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus.

Phasellus in felis. Donec semper sapien a libero. Nam dui.', 35, '2007-01-03 10:49:51', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (26, 1, 1, 'Cat''s Eye', 'Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem.', 141, '2012-12-25 20:46:34', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (27, 1, 3, 'Take the Trash', 'Cras non velit nec nisi vulputate nonummy. Maecenas tincidunt lacus at velit. Vivamus vel nulla eget eros elementum pellentesque.', 320, '2015-03-04 17:37:25', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (28, 1, 2, 'Owning Mahowny', 'Etiam vel augue. Vestibulum rutrum rutrum neque. Aenean auctor gravida sem.

Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio.

Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit.', 324, '2001-08-18 21:44:25', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (29, 2, 1, 'Colourful (Karafuru)', 'In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.

Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.', 77, '2016-01-27 03:40:23', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (30, 1, 2, 'Full Eclipse', 'Maecenas ut massa quis augue luctus tincidunt. Nulla mollis molestie lorem. Quisque ut erat.

Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem.', 843, '2010-04-08 21:59:33', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (31, 2, 1, 'Vampire''s Kiss', 'In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus.

Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi.

Cras non velit nec nisi vulputate nonummy. Maecenas tincidunt lacus at velit. Vivamus vel nulla eget eros elementum pellentesque.', 866, '2006-09-02 03:25:56', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (32, 1, 3, 'Quadrille', 'Etiam vel augue. Vestibulum rutrum rutrum neque. Aenean auctor gravida sem.', 373, '2000-08-05 03:33:58', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (33, 1, 2, 'Crime and Punishment', 'Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat.

Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede.', 552, '2018-07-02 06:13:14', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (34, 1, 2, 'Hunger', 'Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.', 822, '2004-11-22 13:41:01', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (35, 1, 3, '2081', 'Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit.', 499, '2000-11-26 14:48:25', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (36, 2, 1, 'Jackpot 2', 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis.

Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus.

Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero.', 351, '2017-11-15 04:59:44', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (37, 1, 3, 'George Lopez: America''s Mexican', 'Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero.

Nullam sit amet turpis elementum ligula vehicula consequat. Morbi a ipsum. Integer a nibh.

In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.', 409, '2015-06-28 01:14:07', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (38, 1, 2, 'It Follows', 'Duis aliquam convallis nunc. Proin at turpis a pede posuere nonummy. Integer non velit.

Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi. Integer ac neque.', 952, '2001-10-11 21:36:54', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (39, 1, 1, 'Tales from the Hood', 'Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.

Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros.

Vestibulum ac est lacinia nisi venenatis tristique. Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat.', 665, '2004-05-12 00:38:51', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (40, 2, 3, 'Cry ''Havoc''', 'In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.

Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.', 268, '2006-10-15 10:22:13', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (41, 1, 1, 'Teeth', 'Nullam sit amet turpis elementum ligula vehicula consequat. Morbi a ipsum. Integer a nibh.

In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.', 814, '2019-10-27 00:19:01', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (42, 2, 1, 'Cries and Whispers (Viskningar och rop)', 'Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus.

Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus.', 664, '2001-02-03 22:29:56', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (43, 1, 2, 'Alex Cross', 'Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.

Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros.

Vestibulum ac est lacinia nisi venenatis tristique. Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat.', 739, '2012-09-05 06:33:54', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (44, 2, 2, 'Delgo', 'Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem.

Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat.

Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede.', 770, '2003-01-22 10:13:37', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (45, 2, 3, 'They Live', 'In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.

Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.

Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti.', 75, '2005-01-31 10:39:42', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (46, 1, 3, 'Neverwas', 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.

Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum.

Proin eu mi. Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem.', 831, '2017-10-05 08:09:17', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (47, 2, 3, 'Apartment for Peggy', 'Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio.

Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit.

Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl.', 118, '2007-03-03 03:32:53', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (48, 1, 1, 'Better Tomorrow, A (Ying hung boon sik)', 'Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.

Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem.

Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus.', 557, '2004-12-15 14:36:10', true);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (49, 2, 3, 'The Pool Boys', 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.

Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum.', 788, '2010-09-24 00:01:35', false);
insert into posts (post_id, user_id, category_id, title, content, view_count, creation_date, is_published) values (50, 2, 3, 'Beauty and the Beast (Beauty and the Beasts: A Dar', 'In congue. Etiam justo. Etiam pretium iaculis justo.', 861, '2003-11-24 09:09:29', false);



-- comments tablosunda farklı gönderilere ait, farklı kullanıcılara ait veya kullanıcısı olmayan toplam minimum 250 yorum bulunmalıdır.
-- insert 250 comments into comments table

insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (1, 40, 1, 'Nullam molestie nibh in lectus. Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.', '2010-03-09 01:14:10', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (2, 47, null, 'Suspendisse ornare consequat lectus. In est risus, auctor sed, tristique in, tempus sit amet, sem. Fusce consequat. Nulla nisl. Nunc nisl. Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus. Duis at velit eu est congue elementum. In hac habitasse platea dictumst.', '2004-01-14 02:46:56', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (3, 49, null, 'Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem. Integer tincidunt ante vel ipsum.', '2002-01-10 10:59:14', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (4, 49, null, 'Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti. In eleifend quam a odio. In hac habitasse platea dictumst. Maecenas ut massa quis augue luctus tincidunt. Nulla mollis molestie lorem.', '2015-07-25 18:33:27', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (5, 43, 2, 'Aenean lectus. Pellentesque eget nunc.', '2002-02-03 01:34:55', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (6, 50, 1, 'Duis mattis egestas metus. Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh. Quisque id justo sit amet sapien dignissim vestibulum.', '2020-12-24 15:52:26', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (7, 12, 2, 'Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl. Aenean lectus. Pellentesque eget nunc. Donec quis orci eget orci vehicula condimentum. Curabitur in libero ut massa volutpat convallis.', '2014-10-17 17:23:56', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (8, 34, null, 'Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis. Sed ante. Vivamus tortor. Duis mattis egestas metus. Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.', '2000-10-06 18:08:09', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (9, 41, 2, 'Ut at dolor quis odio consequat varius. Integer ac leo. Pellentesque ultrices mattis odio. Donec vitae nisi. Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus. Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla. Quisque arcu libero, rutrum ac, lobortis vel, dapibus at, diam.', '2011-01-06 00:05:29', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (10, 42, null, 'Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin interdum mauris non ligula pellentesque ultrices.', '2011-01-28 19:35:24', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (11, 39, 1, 'Suspendisse ornare consequat lectus. In est risus, auctor sed, tristique in, tempus sit amet, sem. Fusce consequat. Nulla nisl. Nunc nisl. Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus. Duis at velit eu est congue elementum. In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante.', '2001-07-02 07:24:48', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (12, 17, 2, 'Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris. Morbi non lectus.', '2010-06-09 16:51:09', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (13, 15, 1, 'Duis at velit eu est congue elementum.', '2001-05-04 00:35:35', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (14, 50, 2, 'In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem. Duis aliquam convallis nunc. Proin at turpis a pede posuere nonummy. Integer non velit. Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi. Integer ac neque. Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus.', '2014-05-12 05:26:40', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (15, 35, 1, 'Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus. Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci.', '2016-04-04 11:49:15', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (16, 23, null, 'Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede. Morbi porttitor lorem id ligula. Suspendisse ornare consequat lectus. In est risus, auctor sed, tristique in, tempus sit amet, sem. Fusce consequat.', '2018-06-15 13:12:04', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (17, 20, null, 'Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem. Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus.', '2015-04-10 09:36:01', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (18, 41, null, 'Donec dapibus. Duis at velit eu est congue elementum. In hac habitasse platea dictumst.', '2021-12-02 19:24:40', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (19, 7, null, 'Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem. Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat. Praesent blandit.', '2017-07-22 17:07:53', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (20, 7, 2, 'Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus. Phasellus in felis. Donec semper sapien a libero. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Ut at dolor quis odio consequat varius.', '2005-09-23 15:48:05', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (21, 20, 2, 'Morbi non quam nec dui luctus rutrum. Nulla tellus. In sagittis dui vel nisl. Duis ac nibh.', '2009-04-14 11:02:54', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (22, 2, 2, 'Aenean auctor gravida sem. Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio. Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim.', '2018-10-05 03:12:21', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (23, 22, 2, 'Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus. Phasellus in felis.', '2008-10-28 08:02:12', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (24, 33, 1, 'Pellentesque ultrices mattis odio. Donec vitae nisi. Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus. Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla.', '2000-09-10 02:22:32', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (25, 31, 2, 'Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus. Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.', '2018-07-12 03:09:34', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (26, 24, null, 'Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus.', '2020-05-14 23:01:30', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (27, 40, 2, 'Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede. Morbi porttitor lorem id ligula. Suspendisse ornare consequat lectus. In est risus, auctor sed, tristique in, tempus sit amet, sem. Fusce consequat.', '2012-02-10 10:35:49', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (28, 31, 1, 'Etiam vel augue. Vestibulum rutrum rutrum neque.', '2012-08-31 19:39:31', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (29, 37, null, 'Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl. Aenean lectus. Pellentesque eget nunc. Donec quis orci eget orci vehicula condimentum. Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est. Phasellus sit amet erat.', '2003-04-12 08:14:34', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (30, 33, null, 'Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros. Vestibulum ac est lacinia nisi venenatis tristique. Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat. In congue. Etiam justo. Etiam pretium iaculis justo. In hac habitasse platea dictumst.', '2011-07-21 20:33:45', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (31, 31, 2, 'Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus. Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus.', '2019-11-06 03:21:39', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (32, 28, 1, 'Nulla tellus. In sagittis dui vel nisl. Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti. In eleifend quam a odio. In hac habitasse platea dictumst.', '2007-09-16 05:03:41', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (33, 40, 2, 'Suspendisse ornare consequat lectus. In est risus, auctor sed, tristique in, tempus sit amet, sem. Fusce consequat.', '2015-05-15 04:13:03', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (34, 47, null, 'Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus. Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla. Quisque arcu libero, rutrum ac, lobortis vel, dapibus at, diam. Nam tristique tortor eu pede.', '2001-03-17 13:20:07', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (35, 6, null, 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin risus. Praesent lectus. Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis. Duis consequat dui nec nisi volutpat eleifend.', '2003-11-16 11:01:37', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (36, 9, 2, 'Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est. Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum. Proin eu mi. Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem. Duis aliquam convallis nunc. Proin at turpis a pede posuere nonummy.', '2010-02-26 19:56:50', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (37, 36, 1, 'Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam.', '2008-06-22 20:00:20', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (38, 21, 2, 'Ut at dolor quis odio consequat varius. Integer ac leo. Pellentesque ultrices mattis odio. Donec vitae nisi. Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus.', '2001-10-21 01:39:00', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (39, 32, 1, 'Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat.', '2006-01-30 12:51:03', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (40, 27, 1, 'Etiam pretium iaculis justo. In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus. Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi.', '2017-11-22 08:53:00', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (41, 7, 1, 'Etiam justo. Etiam pretium iaculis justo. In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus. Nulla ut erat id mauris vulputate elementum.', '2006-02-11 22:55:10', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (42, 6, null, 'Aenean sit amet justo. Morbi ut odio. Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl. Aenean lectus. Pellentesque eget nunc.', '2009-07-18 08:53:00', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (43, 2, 1, 'Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus. Pellentesque at nulla. Suspendisse potenti.', '2010-12-04 06:56:52', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (44, 24, null, 'Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl. Aenean lectus. Pellentesque eget nunc.', '2007-05-06 10:47:26', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (45, 9, 2, 'Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui. Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc.', '2017-09-21 17:45:48', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (46, 18, 2, 'Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.', '2015-09-08 19:48:13', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (47, 36, null, 'In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet. Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam.', '2021-04-23 01:26:53', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (48, 27, 2, 'Donec ut dolor.', '2018-04-08 12:42:24', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (49, 21, 1, 'Donec dapibus. Duis at velit eu est congue elementum. In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis. Sed ante. Vivamus tortor.', '2013-03-11 10:11:51', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (50, 23, 1, 'Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Ut at dolor quis odio consequat varius. Integer ac leo. Pellentesque ultrices mattis odio. Donec vitae nisi. Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus.', '2013-07-21 21:54:26', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (51, 6, 2, 'Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet. Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui. Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam.', '2000-02-13 09:28:39', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (52, 9, 2, 'Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros. Vestibulum ac est lacinia nisi venenatis tristique. Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat. In congue. Etiam justo. Etiam pretium iaculis justo. In hac habitasse platea dictumst. Etiam faucibus cursus urna.', '2006-10-17 01:33:52', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (53, 43, 2, 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis. Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus.', '2003-12-16 20:17:58', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (54, 30, 2, 'Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh. Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros. Vestibulum ac est lacinia nisi venenatis tristique. Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat.', '2001-02-19 04:33:42', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (55, 24, null, 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin risus. Praesent lectus. Vestibulum quam sapien, varius ut, blandit non, interdum in, ante.', '2017-11-14 22:49:49', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (56, 3, 2, 'In hac habitasse platea dictumst. Maecenas ut massa quis augue luctus tincidunt. Nulla mollis molestie lorem. Quisque ut erat. Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem.', '2001-09-06 02:13:52', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (57, 35, 1, 'Vivamus in felis eu sapien cursus vestibulum. Proin eu mi. Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem. Duis aliquam convallis nunc. Proin at turpis a pede posuere nonummy. Integer non velit.', '2012-06-24 05:44:10', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (58, 24, null, 'Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti. Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum.', '2018-03-08 10:41:30', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (59, 27, 1, 'Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat. In congue.', '2021-09-15 20:05:33', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (60, 48, 2, 'Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh. Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros.', '2016-09-11 09:22:31', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (61, 31, 1, 'Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis. Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem. Sed sagittis.', '2007-05-14 22:38:08', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (62, 31, null, 'Maecenas pulvinar lobortis est. Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum. Proin eu mi. Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem.', '2020-08-18 06:48:17', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (63, 22, 1, 'Sed ante. Vivamus tortor. Duis mattis egestas metus.', '2004-01-01 20:48:26', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (64, 24, 2, 'Vestibulum ac est lacinia nisi venenatis tristique. Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat. In congue. Etiam justo.', '2001-09-05 10:36:11', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (65, 11, 1, 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis.', '2006-05-19 00:59:57', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (66, 5, null, 'Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla. Quisque arcu libero, rutrum ac, lobortis vel, dapibus at, diam. Nam tristique tortor eu pede.', '2010-02-19 09:47:13', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (67, 44, 1, 'Duis aliquam convallis nunc.', '2006-02-20 15:22:52', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (68, 45, 2, 'Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat. Praesent blandit. Nam nulla.', '2005-09-22 18:22:51', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (69, 24, 2, 'Integer non velit. Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue.', '2006-10-18 09:07:29', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (70, 38, 2, 'Fusce consequat. Nulla nisl. Nunc nisl. Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa.', '2004-03-14 13:08:41', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (71, 44, null, 'Suspendisse potenti. In eleifend quam a odio. In hac habitasse platea dictumst. Maecenas ut massa quis augue luctus tincidunt.', '2017-03-19 03:34:09', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (72, 17, null, 'Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat. In congue. Etiam justo. Etiam pretium iaculis justo. In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus.', '2020-03-31 11:13:47', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (73, 49, null, 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis. Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus. Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero. Nullam sit amet turpis elementum ligula vehicula consequat. Morbi a ipsum.', '2007-05-23 15:39:32', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (74, 15, 1, 'Aliquam non mauris. Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis. Fusce posuere felis sed lacus.', '2020-12-22 02:22:27', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (75, 3, 2, 'Proin at turpis a pede posuere nonummy. Integer non velit. Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi. Integer ac neque. Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus.', '2017-02-04 11:52:27', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (76, 32, 1, 'Nulla mollis molestie lorem. Quisque ut erat. Curabitur gravida nisi at nibh.', '2021-11-16 16:45:01', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (77, 4, null, 'Vestibulum rutrum rutrum neque. Aenean auctor gravida sem. Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio. Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue.', '2016-12-11 02:08:15', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (78, 50, null, 'Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl. Aenean lectus. Pellentesque eget nunc.', '2003-03-14 20:25:57', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (79, 17, 1, 'Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus. Duis at velit eu est congue elementum.', '2018-09-09 22:00:55', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (80, 13, 1, 'Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero. Nullam sit amet turpis elementum ligula vehicula consequat. Morbi a ipsum. Integer a nibh. In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.', '2000-03-28 04:11:34', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (81, 23, 2, 'Nulla facilisi. Cras non velit nec nisi vulputate nonummy. Maecenas tincidunt lacus at velit. Vivamus vel nulla eget eros elementum pellentesque. Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus.', '2014-11-03 00:23:14', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (82, 5, 1, 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est. Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum. Proin eu mi.', '2002-04-07 14:30:55', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (83, 27, 1, 'Nullam molestie nibh in lectus. Pellentesque at nulla.', '2007-01-31 19:32:21', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (84, 19, 1, 'Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis. Sed ante. Vivamus tortor.', '2005-02-02 10:52:13', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (85, 3, null, 'Suspendisse potenti. In eleifend quam a odio.', '2021-02-12 13:28:08', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (86, 5, 2, 'Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio. Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl.', '2019-12-12 12:47:40', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (87, 31, null, 'Nulla mollis molestie lorem. Quisque ut erat. Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem. Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat. Praesent blandit. Nam nulla.', '2010-05-15 00:05:41', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (88, 25, null, 'Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi. Integer ac neque. Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus. In sagittis dui vel nisl. Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti.', '2004-11-29 12:32:26', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (89, 17, 2, 'Etiam pretium iaculis justo. In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus. Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi. Cras non velit nec nisi vulputate nonummy. Maecenas tincidunt lacus at velit.', '2008-11-07 15:28:08', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (90, 3, 1, 'Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus. Phasellus in felis. Donec semper sapien a libero. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Ut at dolor quis odio consequat varius.', '2018-12-02 09:02:59', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (91, 4, 2, 'Donec posuere metus vitae ipsum. Aliquam non mauris. Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis. Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem. Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci.', '2006-03-30 21:56:15', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (92, 41, 1, 'Duis ac nibh.', '2006-07-13 20:40:28', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (93, 45, 2, 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl. Aenean lectus. Pellentesque eget nunc. Donec quis orci eget orci vehicula condimentum. Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.', '2012-02-06 22:16:39', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (94, 42, null, 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros. Vestibulum ac est lacinia nisi venenatis tristique. Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat. In congue.', '2003-09-13 04:30:55', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (95, 23, null, 'Maecenas tincidunt lacus at velit. Vivamus vel nulla eget eros elementum pellentesque. Quisque porta volutpat erat.', '2009-05-12 15:38:04', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (96, 24, null, 'Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus. Phasellus in felis. Donec semper sapien a libero.', '2019-10-24 11:23:16', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (97, 36, null, 'Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis.', '2014-04-07 10:30:54', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (98, 5, 2, 'Vivamus vel nulla eget eros elementum pellentesque. Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus. Phasellus in felis. Donec semper sapien a libero. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla.', '2001-06-16 10:54:02', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (99, 22, null, 'Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet. Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo.', '2006-02-17 19:02:26', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (100, 33, 2, 'Nulla ac enim.', '2006-05-10 19:01:47', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (101, 31, 1, 'Proin risus. Praesent lectus. Vestibulum quam sapien, varius ut, blandit non, interdum in, ante.', '2010-09-09 10:05:45', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (102, 18, 2, 'Cras non velit nec nisi vulputate nonummy. Maecenas tincidunt lacus at velit. Vivamus vel nulla eget eros elementum pellentesque. Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus. Phasellus in felis. Donec semper sapien a libero. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla.', '2017-05-20 10:54:37', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (103, 26, 2, 'Donec dapibus. Duis at velit eu est congue elementum. In hac habitasse platea dictumst.', '2001-04-26 06:26:35', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (104, 1, 2, 'Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis. Sed ante. Vivamus tortor. Duis mattis egestas metus. Aenean fermentum.', '2018-02-28 21:01:24', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (105, 16, null, 'Morbi non quam nec dui luctus rutrum. Nulla tellus. In sagittis dui vel nisl. Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti. In eleifend quam a odio.', '2002-04-04 21:43:34', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (106, 6, 2, 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis. Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus. Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci.', '2004-03-10 19:18:00', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (107, 41, null, 'Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis. Sed ante. Vivamus tortor. Duis mattis egestas metus. Aenean fermentum.', '2006-01-25 14:49:39', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (108, 32, 1, 'Curabitur in libero ut massa volutpat convallis.', '2020-11-19 09:07:14', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (109, 7, 1, 'Vivamus tortor. Duis mattis egestas metus.', '2021-02-20 05:12:46', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (110, 13, null, 'Morbi porttitor lorem id ligula.', '2019-06-21 03:13:18', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (111, 23, null, 'Integer ac leo. Pellentesque ultrices mattis odio. Donec vitae nisi. Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus.', '2021-12-06 05:24:50', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (112, 31, 2, 'Sed ante. Vivamus tortor.', '2004-11-02 09:36:02', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (113, 6, 2, 'Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti. Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris. Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.', '2018-03-27 01:50:18', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (114, 17, 2, 'Proin risus. Praesent lectus. Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio.', '2011-04-03 13:09:54', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (115, 37, 2, 'Vestibulum rutrum rutrum neque. Aenean auctor gravida sem. Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio. Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit.', '2003-11-25 03:31:47', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (116, 37, 2, 'Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl. Aenean lectus. Pellentesque eget nunc. Donec quis orci eget orci vehicula condimentum.', '2016-12-11 23:02:44', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (117, 2, 2, 'Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis. Sed ante. Vivamus tortor.', '2018-07-07 22:55:46', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (118, 31, null, 'Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem. Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat. Praesent blandit.', '2006-08-06 22:19:08', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (119, 20, 1, 'Suspendisse potenti. Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum.', '2017-01-08 18:33:16', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (120, 28, null, 'Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui. Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti.', '2010-05-21 08:59:48', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (121, 6, null, 'Praesent blandit. Nam nulla.', '2006-01-06 23:02:40', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (122, 29, 1, 'Aenean sit amet justo. Morbi ut odio. Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim.', '2007-10-30 10:47:03', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (123, 36, null, 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.', '2014-05-16 00:43:31', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (124, 3, null, 'Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem. Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat.', '2011-12-25 11:46:45', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (125, 15, null, 'Mauris lacinia sapien quis libero.', '2016-06-07 01:32:19', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (126, 6, 1, 'Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat.', '2009-04-21 23:44:24', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (127, 4, 2, 'Proin at turpis a pede posuere nonummy. Integer non velit. Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi. Integer ac neque.', '2015-12-24 17:53:52', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (128, 31, 2, 'Integer ac leo. Pellentesque ultrices mattis odio. Donec vitae nisi. Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus. Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla. Quisque arcu libero, rutrum ac, lobortis vel, dapibus at, diam.', '2003-10-26 00:27:44', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (129, 13, null, 'Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis. Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem. Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus.', '2000-02-05 00:25:07', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (130, 42, 1, 'Maecenas pulvinar lobortis est. Phasellus sit amet erat.', '2003-05-17 06:09:51', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (131, 37, 1, 'Sed accumsan felis.', '2013-10-21 06:54:59', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (132, 21, 1, 'Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl.', '2020-06-25 03:09:18', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (133, 14, 1, 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis. Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor.', '2009-08-20 09:52:27', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (134, 22, 1, 'Morbi a ipsum. Integer a nibh.', '2011-04-04 02:45:45', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (135, 10, 2, 'Maecenas pulvinar lobortis est. Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum. Proin eu mi.', '2010-08-08 06:49:24', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (136, 19, null, 'Etiam justo. Etiam pretium iaculis justo. In hac habitasse platea dictumst.', '2010-09-02 23:22:53', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (137, 13, 2, 'Integer a nibh. In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet. Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.', '2016-04-14 07:41:45', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (138, 49, 1, 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis. Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus.', '2000-05-02 19:10:11', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (139, 50, 2, 'Curabitur convallis. Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus. Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero. Nullam sit amet turpis elementum ligula vehicula consequat.', '2019-12-30 10:59:31', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (140, 21, 1, 'Donec semper sapien a libero. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Ut at dolor quis odio consequat varius. Integer ac leo. Pellentesque ultrices mattis odio. Donec vitae nisi.', '2008-05-06 04:51:36', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (141, 7, 1, 'Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus. Phasellus in felis. Donec semper sapien a libero. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Ut at dolor quis odio consequat varius.', '2010-08-17 19:07:26', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (142, 38, null, 'In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem. Duis aliquam convallis nunc.', '2016-04-19 07:52:34', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (143, 46, 1, 'Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus. Phasellus in felis. Donec semper sapien a libero.', '2009-06-16 06:28:14', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (144, 1, 2, 'Donec semper sapien a libero. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis.', '2021-01-23 16:05:13', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (145, 26, 1, 'Etiam pretium iaculis justo. In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus. Nulla ut erat id mauris vulputate elementum. Nullam varius.', '2013-07-22 02:47:37', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (146, 38, 2, 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin risus. Praesent lectus. Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio.', '2003-06-05 03:10:06', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (147, 37, 2, 'Nulla tellus. In sagittis dui vel nisl.', '2002-11-11 14:29:50', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (148, 32, null, 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin risus. Praesent lectus. Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis. Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor.', '2008-07-10 02:59:40', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (149, 9, 1, 'Nullam molestie nibh in lectus. Pellentesque at nulla.', '2010-08-19 06:59:50', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (150, 7, 2, 'Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui. Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti. Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris. Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet.', '2014-05-18 07:54:01', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (151, 33, 1, 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis. Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus.', '2021-09-05 16:52:52', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (152, 22, 1, 'In est risus, auctor sed, tristique in, tempus sit amet, sem. Fusce consequat. Nulla nisl. Nunc nisl.', '2005-05-28 22:22:49', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (153, 11, 2, 'Duis at velit eu est congue elementum. In hac habitasse platea dictumst.', '2002-01-17 02:08:08', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (154, 22, null, 'Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis. Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem. Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci.', '2019-02-25 18:01:32', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (155, 35, 2, 'Aenean lectus. Pellentesque eget nunc. Donec quis orci eget orci vehicula condimentum. Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo.', '2019-02-11 04:06:05', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (156, 10, null, 'Proin interdum mauris non ligula pellentesque ultrices.', '2011-05-07 18:55:19', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (157, 23, 2, 'Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Etiam vel augue. Vestibulum rutrum rutrum neque. Aenean auctor gravida sem. Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio. Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim.', '2009-06-10 13:59:47', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (158, 38, null, 'In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem. Duis aliquam convallis nunc. Proin at turpis a pede posuere nonummy. Integer non velit. Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi. Integer ac neque. Duis bibendum.', '2001-05-23 23:15:04', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (159, 3, null, 'Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat. Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede. Morbi porttitor lorem id ligula. Suspendisse ornare consequat lectus. In est risus, auctor sed, tristique in, tempus sit amet, sem.', '2017-08-27 03:29:10', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (160, 49, 1, 'Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus. Duis at velit eu est congue elementum. In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis.', '2015-01-24 07:21:36', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (161, 4, null, 'Proin at turpis a pede posuere nonummy. Integer non velit. Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi. Integer ac neque. Duis bibendum.', '2000-05-27 04:38:20', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (162, 9, null, 'Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Etiam vel augue. Vestibulum rutrum rutrum neque. Aenean auctor gravida sem. Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo.', '2018-04-08 12:17:25', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (163, 19, 1, 'Nulla nisl. Nunc nisl. Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus. Duis at velit eu est congue elementum.', '2020-10-04 17:04:26', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (164, 42, 2, 'Vestibulum ac est lacinia nisi venenatis tristique. Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat. In congue. Etiam justo. Etiam pretium iaculis justo.', '2005-01-17 12:15:25', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (165, 19, 2, 'Duis consequat dui nec nisi volutpat eleifend.', '2017-12-31 17:49:03', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (166, 12, null, 'Proin interdum mauris non ligula pellentesque ultrices.', '2020-05-15 05:41:38', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (167, 21, null, 'Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat. Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede. Morbi porttitor lorem id ligula. Suspendisse ornare consequat lectus. In est risus, auctor sed, tristique in, tempus sit amet, sem. Fusce consequat. Nulla nisl.', '2011-09-25 05:41:46', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (168, 15, null, 'Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est. Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum. Proin eu mi. Nulla ac enim.', '2000-09-23 07:55:51', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (169, 22, 2, 'Donec vitae nisi. Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus. Curabitur at ipsum ac tellus semper interdum.', '2016-03-18 05:05:21', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (170, 8, null, 'In hac habitasse platea dictumst. Maecenas ut massa quis augue luctus tincidunt.', '2004-10-23 12:30:07', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (171, 5, 1, 'Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Etiam vel augue. Vestibulum rutrum rutrum neque. Aenean auctor gravida sem. Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio.', '2003-12-22 22:25:33', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (172, 28, null, 'Morbi quis tortor id nulla ultrices aliquet.', '2010-06-26 18:44:04', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (173, 36, null, 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti. Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris. Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis. Fusce posuere felis sed lacus.', '2018-11-28 05:35:09', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (174, 48, 1, 'Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi. Cras non velit nec nisi vulputate nonummy.', '2017-12-19 04:53:50', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (175, 32, 2, 'Pellentesque eget nunc.', '2011-07-08 06:44:30', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (176, 38, 2, 'Nunc rhoncus dui vel sem. Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus. Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.', '2014-01-16 16:54:11', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (177, 44, 2, 'Quisque ut erat. Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem. Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat. Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede.', '2009-05-23 12:37:34', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (178, 24, 2, 'Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat. Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede. Morbi porttitor lorem id ligula. Suspendisse ornare consequat lectus.', '2018-09-15 11:18:15', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (179, 6, 2, 'Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros.', '2008-01-12 10:33:28', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (180, 1, 2, 'Morbi quis tortor id nulla ultrices aliquet.', '2002-08-31 04:58:53', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (181, 45, null, 'Suspendisse potenti. Nullam porttitor lacus at turpis.', '2007-03-22 04:54:14', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (182, 41, 1, 'Duis aliquam convallis nunc. Proin at turpis a pede posuere nonummy. Integer non velit. Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi. Integer ac neque. Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus.', '2004-07-29 07:27:48', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (183, 37, 1, 'Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede. Morbi porttitor lorem id ligula.', '2003-11-06 23:13:45', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (184, 37, 2, 'Curabitur convallis. Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus. Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero. Nullam sit amet turpis elementum ligula vehicula consequat.', '2007-04-06 20:48:11', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (185, 26, 1, 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.', '2015-09-07 04:59:12', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (186, 26, null, 'In congue. Etiam justo. Etiam pretium iaculis justo. In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus. Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi.', '2016-03-10 23:36:29', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (187, 37, null, 'In hac habitasse platea dictumst. Maecenas ut massa quis augue luctus tincidunt. Nulla mollis molestie lorem. Quisque ut erat. Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem. Integer tincidunt ante vel ipsum.', '2015-02-22 05:04:07', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (188, 39, 1, 'Nunc nisl. Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus. Duis at velit eu est congue elementum. In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante.', '2002-02-11 23:15:13', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (189, 12, null, 'Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat. Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede.', '2005-01-23 16:55:03', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (190, 47, 1, 'Suspendisse potenti. Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris.', '2020-10-22 21:11:31', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (191, 4, 2, 'Suspendisse potenti.', '2003-08-18 10:36:16', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (192, 17, 1, 'Sed sagittis.', '2010-11-14 05:49:36', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (193, 18, 1, 'Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh. Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est.', '2020-02-01 18:10:52', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (194, 2, null, 'Pellentesque at nulla.', '2014-12-19 15:17:48', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (195, 7, 1, 'Morbi vel lectus in quam fringilla rhoncus. Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis.', '2018-09-27 19:37:12', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (196, 10, 2, 'Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem.', '2019-11-15 21:36:04', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (197, 2, null, 'Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis. Sed ante. Vivamus tortor. Duis mattis egestas metus.', '2000-10-16 23:03:05', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (198, 40, 1, 'Aliquam erat volutpat. In congue. Etiam justo. Etiam pretium iaculis justo. In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus.', '2007-07-08 22:30:21', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (199, 42, 1, 'Quisque arcu libero, rutrum ac, lobortis vel, dapibus at, diam. Nam tristique tortor eu pede.', '2011-06-30 07:39:37', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (200, 4, 1, 'Aenean lectus.', '2008-01-26 04:40:13', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (201, 16, 2, 'Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus. Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla. Quisque arcu libero, rutrum ac, lobortis vel, dapibus at, diam.', '2001-08-17 12:05:19', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (202, 24, 1, 'Ut at dolor quis odio consequat varius. Integer ac leo.', '2000-03-17 17:38:35', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (203, 39, 1, 'Morbi non quam nec dui luctus rutrum. Nulla tellus. In sagittis dui vel nisl.', '2008-03-30 07:06:06', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (204, 20, 2, 'Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl. Aenean lectus. Pellentesque eget nunc. Donec quis orci eget orci vehicula condimentum.', '2001-11-05 18:37:35', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (205, 11, null, 'Sed accumsan felis. Ut at dolor quis odio consequat varius. Integer ac leo. Pellentesque ultrices mattis odio. Donec vitae nisi. Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus.', '2000-08-06 23:21:56', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (206, 5, null, 'Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl. Aenean lectus. Pellentesque eget nunc. Donec quis orci eget orci vehicula condimentum. Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.', '2005-06-22 03:29:22', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (207, 23, 2, 'In congue. Etiam justo. Etiam pretium iaculis justo. In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus. Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi.', '2009-05-10 17:52:00', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (208, 44, 1, 'Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est. Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum. Proin eu mi.', '2001-02-22 17:42:07', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (209, 3, null, 'Etiam vel augue. Vestibulum rutrum rutrum neque. Aenean auctor gravida sem. Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio. Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim.', '2010-12-19 05:39:50', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (210, 32, 1, 'Duis mattis egestas metus. Aenean fermentum. Donec ut mauris eget massa tempor convallis.', '2002-01-27 12:36:51', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (211, 29, null, 'Cras in purus eu magna vulputate luctus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien.', '2011-05-26 19:37:19', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (212, 32, 2, 'Nulla nisl. Nunc nisl. Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus. Duis at velit eu est congue elementum. In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo.', '2020-10-15 13:50:11', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (213, 39, 1, 'Nullam molestie nibh in lectus. Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus.', '2007-09-22 05:11:59', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (214, 12, null, 'Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis. Sed ante. Vivamus tortor.', '2005-05-14 08:54:34', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (215, 35, null, 'Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus. Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero. Nullam sit amet turpis elementum ligula vehicula consequat.', '2007-07-25 00:00:34', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (216, 49, 1, 'Suspendisse potenti. Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris. Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.', '2013-09-15 14:46:11', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (217, 30, 2, 'Nulla nisl. Nunc nisl. Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus. Duis at velit eu est congue elementum. In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo.', '2004-08-20 03:58:18', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (218, 6, null, 'Nulla nisl. Nunc nisl. Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus. Duis at velit eu est congue elementum. In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo. Aliquam quis turpis eget elit sodales scelerisque.', '2016-11-19 03:24:56', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (219, 43, 2, 'Suspendisse potenti. Nullam porttitor lacus at turpis.', '2018-06-05 21:14:37', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (220, 1, 2, 'Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl. Aenean lectus. Pellentesque eget nunc. Donec quis orci eget orci vehicula condimentum. Curabitur in libero ut massa volutpat convallis.', '2008-02-25 17:55:53', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (221, 29, 1, 'In eleifend quam a odio.', '2008-04-03 13:17:56', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (222, 12, null, 'Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem.', '2011-08-27 22:25:32', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (223, 25, null, 'Praesent blandit lacinia erat.', '2010-07-14 23:20:14', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (224, 41, 2, 'Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem.', '2014-09-25 07:21:10', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (225, 1, null, 'Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi. Cras non velit nec nisi vulputate nonummy.', '2016-03-29 21:45:06', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (226, 46, 1, 'Nulla suscipit ligula in lacus. Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla.', '2016-03-21 20:03:13', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (227, 38, null, 'Nunc nisl. Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus.', '2021-06-26 01:43:02', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (228, 12, 1, 'Etiam vel augue.', '2008-03-19 07:52:53', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (229, 6, null, 'Pellentesque ultrices mattis odio. Donec vitae nisi. Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus. Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla. Quisque arcu libero, rutrum ac, lobortis vel, dapibus at, diam.', '2008-04-24 03:34:11', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (230, 36, 1, 'Nunc nisl. Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus. Duis at velit eu est congue elementum. In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante.', '2014-08-17 16:33:25', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (231, 13, null, 'Vestibulum rutrum rutrum neque.', '2006-07-26 04:12:45', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (232, 28, 1, 'Suspendisse potenti. Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris. Morbi non lectus.', '2004-02-04 08:53:03', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (233, 34, 2, 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin risus. Praesent lectus. Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis.', '2006-01-24 04:04:23', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (234, 22, null, 'Curabitur convallis. Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus. Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero. Nullam sit amet turpis elementum ligula vehicula consequat. Morbi a ipsum.', '2007-03-27 07:39:49', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (235, 27, 2, 'Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Ut at dolor quis odio consequat varius.', '2015-01-27 22:02:39', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (236, 44, null, 'In sagittis dui vel nisl. Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti. In eleifend quam a odio.', '2021-08-29 04:30:00', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (237, 23, 1, 'Nunc rhoncus dui vel sem.', '2009-01-22 06:39:09', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (238, 40, 2, 'Nullam varius. Nulla facilisi. Cras non velit nec nisi vulputate nonummy. Maecenas tincidunt lacus at velit. Vivamus vel nulla eget eros elementum pellentesque. Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla.', '2005-05-02 00:36:24', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (239, 31, 1, 'Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Ut at dolor quis odio consequat varius. Integer ac leo. Pellentesque ultrices mattis odio.', '2001-06-04 12:25:58', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (240, 21, 2, 'Morbi non quam nec dui luctus rutrum.', '2011-04-11 17:34:13', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (241, 9, null, 'Nunc nisl. Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus. Duis at velit eu est congue elementum. In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis.', '2004-12-26 05:36:29', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (242, 13, 1, 'Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem. Duis aliquam convallis nunc. Proin at turpis a pede posuere nonummy. Integer non velit. Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi. Integer ac neque. Duis bibendum.', '2009-02-09 14:22:58', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (243, 7, 1, 'Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi. Cras non velit nec nisi vulputate nonummy.', '2014-03-04 21:35:12', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (244, 46, null, 'Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus. Phasellus in felis. Donec semper sapien a libero. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla.', '2002-11-22 12:25:20', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (245, 2, null, 'Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi. Cras non velit nec nisi vulputate nonummy. Maecenas tincidunt lacus at velit. Vivamus vel nulla eget eros elementum pellentesque. Quisque porta volutpat erat.', '2000-05-26 07:18:40', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (246, 2, null, 'Integer ac leo. Pellentesque ultrices mattis odio. Donec vitae nisi. Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus. Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla.', '2015-02-08 00:58:00', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (247, 30, 2, 'Nullam varius. Nulla facilisi. Cras non velit nec nisi vulputate nonummy. Maecenas tincidunt lacus at velit. Vivamus vel nulla eget eros elementum pellentesque. Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus. Phasellus in felis. Donec semper sapien a libero.', '2001-06-08 07:28:48', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (248, 45, null, 'Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien.', '2009-06-22 05:32:24', false);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (249, 6, null, 'Suspendisse accumsan tortor quis turpis. Sed ante. Vivamus tortor. Duis mattis egestas metus. Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh. Quisque id justo sit amet sapien dignissim vestibulum.', '2006-10-23 07:30:05', true);
insert into comments (comment_id, post_id, user_id, comment, creation_date, is_confirmed) values (250, 34, 2, 'Vivamus vel nulla eget eros elementum pellentesque. Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus. Phasellus in felis. Donec semper sapien a libero. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Ut at dolor quis odio consequat varius.', '2000-10-18 09:12:02', false);


--Veritabanında Gerçekleştirmek İstediğimiz İşlemler

--1. Tüm blog yazılarını başlıkları, yazarları ve kategorileriyle birlikte getirin.

SELECT users.username, categories.name AS category_name, posts.title, posts.content FROM posts
INNER JOIN users ON posts.user_id = users.user_id
INNER JOIN categories ON posts.category_id = categories.category_id;

--2. En son yayınlanan 5 blog yazısını başlıkları, yazarları ve yayın tarihleriyle birlikte alın.

SELECT posts.title, users.username, posts.creation_date FROM posts
INNER JOIN users ON posts.user_id = users.user_id
INNER JOIN categories ON posts.category_id = categories.category_id
ORDER BY creation_date DESC
LIMIT 5;

--3. Her blog yazısı için yorum sayısını gösterin.

SELECT posts.post_id, COUNT(*) FROM posts
INNER JOIN comments ON posts.post_id = comments.post_id
GROUP BY posts.post_id;

--4. Tüm kayıtlı kullanıcıların kullanıcı adlarını ve e-posta adreslerini gösterin.

SELECT username, email FROM users;

--5. En son 10 yorumu, ilgili gönderi başlıklarıyla birlikte alın.

SELECT comments.comment, posts.title, posts.creation_date FROM comments
INNER JOIN posts ON comments.post_id = posts.post_id
ORDER BY posts.creation_date DESC
LIMIT 10;

--6. Belirli bir kullanıcı tarafından yazılan tüm blog yazılarını bulun.

SELECT users.username, posts.content FROM users
INNER JOIN posts ON users.user_id = posts.user_id
WHERE users.user_id = 1;

--7. Her kullanıcının yazdığı toplam gönderi sayısını alın.

SELECT users.username, COUNT(*) FROM users
INNER JOIN posts ON users.user_id = posts.user_id
GROUP BY username;

--8. Her kategoriyi, kategorideki gönderi sayısıyla birlikte gösterin.

SELECT categories.category_id, categories.name, COUNT(*) FROM posts
INNER JOIN categories ON posts.category_id = categories.category_id
GROUP BY categories.category_id;

--9. Gönderi sayısına göre en popüler kategoriyi bulun.

SELECT categories.category_id, categories.name, COUNT(*) FROM posts
INNER JOIN categories ON posts.category_id = categories.category_id
GROUP BY categories.category_id
ORDER BY count DESC
LIMIT 1;

--10. Gönderilerindeki toplam görüntülenme sayısına göre en popüler kategoriyi bulun.

SELECT categories.category_id, categories.name, SUM(view_count) FROM posts
INNER JOIN categories ON posts.category_id = categories.category_id
GROUP BY categories.category_id
ORDER BY sum DESC
LIMIT 1;

--11. En fazla yoruma sahip gönderiyi alın.

SELECT posts.post_id, posts.title, COUNT(*) AS comment_number FROM comments
INNER JOIN posts ON comments.post_id = posts.post_id
GROUP BY posts.post_id
ORDER BY comment_number DESC
LIMIT 1;

--12. Belirli bir gönderinin yazarının kullanıcı adını ve e-posta adresini gösterin.

SELECT users.username, users.email, posts.post_id, posts.title, posts.content FROM posts
INNER JOIN users ON posts.user_id = users.user_id
WHERE posts.post_id = 1;

--13. Başlık veya içeriklerinde belirli bir anahtar kelime bulunan tüm gönderileri bulun.

SELECT * FROM posts
WHERE title ILIKE '%the%' or content ILIKE '%the%';

--14. Belirli bir kullanıcının en son yorumunu gösterin.

SELECT users.user_id, users.username, comment, comments.creation_date FROM comments
INNER JOIN users ON comments.user_id = users.user_id
WHERE users.user_id = 1
ORDER BY creation_date DESC
LIMIT 1;

--15. Gönderi başına ortalama yorum sayısını bulun.

SELECT AVG(comment_count) AS average_comment_count
FROM (
  SELECT post_id, COUNT(*) AS comment_count
  FROM comments
  GROUP BY post_id
) AS comment_counts;

--16. Son 30 günde yayınlanan gönderileri gösterin.

SELECT * FROM posts
WHERE creation_date > NOW() - INTERVAL '30 day'

--17. Belirli bir kullanıcının yaptığı yorumları alın.

SELECT users.user_id, users.username, comment FROM comments
INNER JOIN users ON comments.user_id = users.user_id
WHERE users.user_id = 2;

--18. Belirli bir kategoriye ait tüm gönderileri bulun.

SELECT categories.category_id, categories.name, posts.content FROM posts
INNER JOIN categories ON posts.category_id = categories.category_id
WHERE categories.category_id = 1;

--19. 5'ten az yazıya sahip kategorileri bulun.

SELECT categories.category_id, categories.name FROM categories
INNER JOIN (
	SELECT category_id, COUNT(*) AS ct FROM posts
	GROUP BY category_id
)AS postct ON categories.category_id = postct.category_id 
WHERE postct.ct < 5

--20. Hem bir yazı hem de bir yoruma sahip olan kullanıcıları gösterin.

SELECT users.user_id, users.username FROM users
INNER JOIN posts ON users.user_id = posts.user_id
INNER JOIN comments ON users.user_id = comments.user_id
GROUP BY users.user_id, users.username
HAVING COUNT(
	DISTINCT posts.post_id) > 0 
	AND COUNT(
		DISTINCT comments.comment_id) > 0;

--21. En az 2 farklı yazıya yorum yapmış kullanıcıları alın.

SELECT users.user_id, users.username FROM users
INNER JOIN (
	SELECT user_id FROM comments
	GROUP BY user_id
	HAVING COUNT(DISTINCT post_id) >= 2
)ct ON users.user_id = ct.user_id;

--22. En az 3 yazıya sahip kategorileri görüntüleyin.

SELECT categories.category_id, categories.name FROM categories
INNER JOIN (
	SELECT category_id, COUNT(*) AS ct FROM posts
	GROUP BY category_id
)AS postct ON categories.category_id = postct.category_id 
WHERE postct.ct >= 3

--23. 5'ten fazla blog yazısı yazan yazarları bulun.

SELECT users.user_id, users.username, user_post.ct FROM users
INNER JOIN (
	SELECT users.user_id, COUNT(*) as ct FROM posts
	INNER JOIN users ON users.user_id = posts.user_id
	GROUP BY users.user_id
) AS user_post ON users.user_id = user_post.user_id
WHERE ct > 5

--24. Bir blog yazısı yazmış veya bir yorum yapmış kullanıcıların e-posta adreslerini görüntüleyin. (UNION kullanarak)

(
	SELECT users.email FROM users
	WHERE (
		SELECT COUNT(*) FROM posts 
		WHERE posts.user_id = users.user_id) = 1
)
UNION 
(
	SELECT users.email FROM users
	WHERE (
		SELECT COUNT(*) FROM comments 
		WHERE comments.user_id = users.user_id) = 1
);

--25. Bir blog yazısı yazmış ancak hiç yorum yapmamış yazarları bulun.

SELECT users.username FROM users
LEFT JOIN posts ON users.user_id = posts.user_id
LEFT JOIN comments ON posts.post_id = comments.post_id
GROUP BY users.username
HAVING COUNT(posts.post_id) > 0 
    AND COUNT(comments.comment_id) = 0;

-- ----
