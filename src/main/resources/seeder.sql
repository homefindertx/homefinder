CREATE database if not exists homefinder_db;
USE  homefinder_db;

show tables;

-- -- DROP ALL TABLES
-- drop table  user_listings;
-- drop table user_roles;
-- drop table listing;
-- drop table user;

-- -- VERIFY tables WERE DROPPED
show tables;

-- -- MANUALLY CREATE NEW TABLES IF AUTO-CREATE IS BUGGING

# create table if not exists user
# (
# 	id bigint auto_increment primary key,
# 	email varchar(100) not null,
# 	first_name varchar(100) not null,
# 	is_buyer bit not null,
# 	last_name varchar(100) not null,
# 	password varchar(1000) not null,
# 	phone_number varchar(100) not null,
# 	username varchar(16) not null
# ) ;

# create table if not exists listing
# (
# 	id bigint auto_increment
# 		primary key,
# 	address varchar(255) not null,
# 	bathrooms double not null,
# 	bedrooms double not null,
# 	city varchar(100) not null,
# 	description varchar(100) not null,
# 	lot_size double not null,
# 	price double not null,
# 	square_footage double not null,
# 	state varchar(100) not null,
# 	status varchar(100) not null,
# 	year_built int not null,
# 	zipcode varchar(100) not null,
# 	user_id bigint null,
# 		foreign key (user_id) references user (id)
# );

# create table user_listings
# (
#   user_id     bigint not null,
#   listings_id bigint not null UNIQUE ,
#   foreign key (user_id) references user (id),
#   foreign key (listings_id) references listing (id)
# );

# CREATE TABLE user_roles (
#   id bigint(20) NOT NULL AUTO_INCREMENT,
#   role varchar(255) DEFAULT NULL,
#   user_id bigint(20) DEFAULT NULL,
#   PRIMARY KEY (id)
# );

-- VERIFY tables WERE CREATED
show tables;


-- -- SEEDS THE Tables

# INSERT INTO user(email, first_name, is_buyer, last_name, password, phone_number, username) VALUES
#   ('john@gmail.com',      'John',     true,   'Salazar',   'pass',  2104558744,      'john1'),
#   ('samuel@gmail.com',    'Samuel',   true,   'Combs',     'pass',  2102168465,    'samuel1'),
#   ('jim@gmail.com',       'Jim',      true,   'Ham',       'pass',  6808774539,       'jim1'),
#   ('shawn@gmail.com',     'Shawn',    true,   'White',     'pass',  2107175346,     'shawn1'),
#   ('noah@gmail.com',      'Noah',     true,   'Holdstein', 'pass',  2109805463,      'noah1'),
#   ('carol@gmail.com',     'Carol',    true,   'Schwertz',  'pass',  2108304494,     'carol1'),
#   ('david@gmail.com',     'David',    true,   'Dunhill',   'pass',  2106505535,     'david1'),
#   ('jacob @gmail.com',    'Jacob',    true,   'Myers',     'pass',  2108792769,     'jacob1'),
#   ('mary@gmail.com',      'Mary',     true,   'Darnell',   'pass',  8304307860,      'mary1'),
#   ('joline@gmail.com',   'Joline',   true,   'Jacobson',  'pass', 3214123588,   'joline1'),
#   ('walter@gmail.com',   'Walter',   true,   'Terrence',  'pass', 2708976554,   'walter1'),
#   ('justin@gmail.com',   'Justin',   true,   'Long',      'pass', 8508792769,   'justin1'),
#   ('jin@gmail.com',      'Jin',      true,   'Cho',       'pass', 9804452376,      'jin1'),
#   ('lauren@gmail.com',   'Lauren',   true,   'McDowell',  'pass', 2107178890,   'lauren1'),
#   ('zackery@gmail.com',  'Zackery',  true,   'Henderson', 'pass', 3602338346,  'zackery1'),
#   ('adam@gmail.com',     'Adam',     false,  'Shaw',      'pass', 8793468756,     'adam1'),
#   ('robert@gmail.com',   'Robert',   false,  'Davis',     'pass', 5558675309,   'robert1'),
#   ('harold@gmail.com',   'Harold',   false,  'Washington','pass', 2146637589,   'harold1'),
#   ('barbara@gmail.com',  'Barbara',  false,  'Rand',      'pass', 2103385028,  'barbara1'),
#   ('franklin@gmail.com', 'Franklin', false,  'Bell',      'pass', 2107473848, 'franklin1');



#
# INSERT INTO listing(user_id, address, description, bedrooms, bathrooms, square_footage, price, year_built, lot_size, city, zipcode, status, state, upload_path, upload_path2, upload_path3, upload_path4, upload_path5) VALUES
#   (1, '1002 Cerro Alto Dr', 'Beautiful 3 bedroom', 3, 2, 1055,  181939,  1964, 8276, 'San Antonio', 78213, 'For Sale', 'TX', 'home1.jpeg', 'houseint1.jpeg', 'housekit1.jpeg', 'housebath1.jpeg', 'houseyard1.jpeg'),
#   (1, '226 Carolwood Dr', 'Home with Pool', 5, 4, 3210, 489000, 2003, 12000, 'San Antonio', 78213, 'For Sale', 'TX', 'home2.jpeg', 'houseint2.jpeg', 'housekit2.jpeg', 'housebath2.jpeg', 'houseyard2.jpeg'),
#   (1, '515 Grabo Dr', 'Beautiful House', 3, 2, 1179, 169000, 1966, 7562, 'San Antonio', 78216, 'For Sale', 'TX', 'home3.jpeg', 'houseint3.jpeg', 'housekit3.jpeg', 'housebath3.jpeg', 'houseyard3.jpeg'),
#   (1, '6205 Rue Sophie St', '6 Bedrooms, Wow!', 6, 4, 2913, 244900, 1971, 12000, 'San Antonio', 78238, 'For Sale', 'TX', 'home4.jpeg', 'houseint4.jpeg', 'housekit4.jpeg', 'housebath4.jpeg', 'houseyard4.jpeg'),
#   (1, '5610 Prentiss Dr', 'Very Nice Neighborhood', 3, 2, 1568, 185500, 1965, 10018, 'San Antonio', 78240, 'For Sale', 'TX', 'home5.jpeg', 'houseint5.jpeg', 'housekit5.jpeg', 'housebath5.jpeg', 'houseyard5.jpeg');
#
#





-- -- -- -- VERIFIES SEEDING WAS DONE RIGHT

-- select * from user;
-- select * from listing;




