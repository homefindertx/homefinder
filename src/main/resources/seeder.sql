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

-- create table if not exists user
-- (
-- 	id bigint auto_increment primary key,
-- 	email varchar(100) not null,
-- 	first_name varchar(100) not null,
-- 	is_buyer bit not null,
-- 	last_name varchar(100) not null,
-- 	password varchar(1000) not null,
-- 	phone_number varchar(100) not null,
-- 	username varchar(16) not null
-- ) ;

-- create table if not exists listing
-- (
-- 	id bigint auto_increment
-- 		primary key,
-- 	address varchar(255) not null,
-- 	bathrooms double not null,
-- 	bedrooms double not null,
-- 	city varchar(100) not null,
-- 	description varchar(100) not null,
-- 	lot_size double not null,
-- 	price double not null,
-- 	square_footage double not null,
-- 	state varchar(100) not null,
-- 	status varchar(100) not null,
-- 	year_built int not null,
-- 	zipcode varchar(100) not null,
-- 	user_id bigint null,
-- 		foreign key (user_id) references user (id)
-- );

-- create table user_listings
-- (
--   user_id     bigint not null,
--   listings_id bigint not null UNIQUE ,
--   foreign key (user_id) references user (id),
--   foreign key (listings_id) references listing (id)
-- );

-- CREATE TABLE user_roles (
--   id bigint(20) NOT NULL AUTO_INCREMENT,
--   role varchar(255) DEFAULT NULL,
--   user_id bigint(20) DEFAULT NULL,
--   PRIMARY KEY (id)
-- );

-- VERIFY tables WERE CREATED
# show tables;


-- -- SEEDS THE Tables

-- INSERT INTO user(email, first_name, is_buyer, last_name, password, phone_number, username) VALUES
--   ('john@gmail.com',      'John',     true,   'Salazar',   'pass',  2104558744,      'john1'),
--   ('samuel@gmail.com',    'Samuel',   true,   'Combs',     'pass',  2102168465,    'samuel1'),
--   ('jim@gmail.com',       'Jim',      true,   'Ham',       'pass',  6808774539,       'jim1'),
--   ('shawn@gmail.com',     'Shawn',    true,   'White',     'pass',  2107175346,     'shawn1'),
--   ('noah@gmail.com',      'Noah',     true,   'Holdstein', 'pass',  2109805463,      'noah1'),
--   ('carol@gmail.com',     'Carol',    true,   'Schwertz',  'pass',  2108304494,     'carol1'),
--   ('david@gmail.com',     'David',    true,   'Dunhill',   'pass',  2106505535,     'david1'),
--   ('jacob @gmail.com',    'Jacob',    true,   'Myers',     'pass',  2108792769,     'jacob1'),
--   ('mary@gmail.com',      'Mary',     true,   'Darnell',   'pass',  8304307860,      'mary1'),
--   ('joline@gmail.com',   'Joline',   true,   'Jacobson',  'pass', 3214123588,   'joline1'),
--   ('walter@gmail.com',   'Walter',   true,   'Terrence',  'pass', 2708976554,   'walter1'),
--   ('justin@gmail.com',   'Justin',   true,   'Long',      'pass', 8508792769,   'justin1'),
--   ('jin@gmail.com',      'Jin',      true,   'Cho',       'pass', 9804452376,      'jin1'),
--   ('lauren@gmail.com',   'Lauren',   true,   'McDowell',  'pass', 2107178890,   'lauren1'),
--   ('zackery@gmail.com',  'Zackery',  true,   'Henderson', 'pass', 3602338346,  'zackery1'),
--   ('adam@gmail.com',     'Adam',     false,  'Shaw',      'pass', 8793468756,     'adam1'),
--   ('robert@gmail.com',   'Robert',   false,  'Davis',     'pass', 5558675309,   'robert1'),
--   ('harold@gmail.com',   'Harold',   false,  'Washington','pass', 2146637589,   'harold1'),
--   ('barbara@gmail.com',  'Barbara',  false,  'Rand',      'pass', 2103385028,  'barbara1'),
--   ('franklin@gmail.com', 'Franklin', false,  'Bell',      'pass', 2107473848, 'franklin1');




INSERT INTO listing(user_id, address, description, bedrooms, bathrooms, square_footage, price, year_built, lot_size, city, zipcode, status, state, upload_path, upload_path2, upload_path3) VALUES
  (1, '266 Claywell Dr',        'Beautiful 3 bedroom', 3, 3, 1544,  401732,  1942, 10454, 'San Antonio', 78209, 'For Sale', 'TX', 'house3.jpeg', 'inthouse3.jpeg', 'yard3.jpeg'),
  (1, '215 Tophill Rd',         'Beautiful 4 bedroom', 4, 3, 2726,  559338,  1955, 10890, 'San Antonio', 78209, 'For Sale', 'TX', 'house2.jpeg', 'inthouse2.jpeg', 'yard2.jpeg'),
  (1, '302 Castano Ave',        'Beautiful 4 bedroom', 4, 4, 4342,  1168170, 1937, 14985, 'San Antonio', 78209, 'For Sale', 'TX', 'house5.jpeg', 'inthouse5.jpeg', 'yard5.jpeg'),
  (1, '322 EL Monte Blvd',      'Beautiful 2 bedroom', 2, 1, 512,   100028,  1956, 7013,  'San Antonio', 78212, 'For Sale', 'TX', 'house4.jpeg', 'inthouse4.jpeg', 'yard4.jpeg'),
  (1, '515 Weizmann St',        'Beautiful 3 bedroom', 3, 1, 1112,  123589,  1951, 6882,  'San Antonio', 78213, 'For Sale', 'TX', 'house6.jpeg', 'inthouse6.jpeg', 'yard6.jpeg'),
  (1, '511 Fresno St',          'Beautiful 4 bedroom', 4, 1, 1272,  139833,  1950, 7405,  'San Antonio', 78212, 'For Sale', 'TX', 'house1.jpeg', 'inthouse1.jpeg', 'yard1.jpeg'),
  (1, '923 Edison Dr',          'Beautiful 3 bedroom', 3, 1, 1374,  131625,  1947, 7013,  'San Antonio', 78201, 'For Sale', 'TX', 'house3.jpeg', 'inthouse3.jpeg', 'yard3.jpeg');
--   (16, '138 Mink',            'Beautiful 3 bedroom', 3, 1, 1394,  142342,  1953, 6969,  'San Antonio', 78213, 'For Sale', 'TX'),
--   (19, '510 Adrian Dr',          'Beautiful 2 bedroom', 2, 1, 884,   117657,  1952, 7144,  'San Antonio', 78213, 'For Sale', 'TX'),
--   (20, '5411 King Richard St',  'Beautiful 4 bedroom', 4, 2, 2100,  239000,  1968, 10803, 'San Antonio', 78229, 'For Sale', 'TX'),
--   (19, '4502 Adkins Triail',    'Beautiful 3 bedroom', 3, 2, 1914,  195063,  2004, 7492,  'San Antonio', 78238, 'For Sale', 'TX'),
--   (19, '4919 Bear Wood Rd',     'Beautiful 3 bedroom', 3, 3, 1556,  161964,  2006, 3484,  'San Antonio', 78238, 'For Sale', 'TX'),
--   (20, '6914 Forest Park St',   'Beautiful 3 bedroom', 3, 2, 1540,  167228,  1968, 7928,  'San Antonio', 78240, 'For Sale', 'TX'),
--   (16, '3610 Mohegan Dr',       'Beautiful 3 bedroom', 3, 2, 1403,  166178,  1959, 8407,  'San Antonio', 78228, 'For Sale', 'TX'),
--   (18, '147 Colleen Dr',        'Beautiful 3 bedroom', 3, 2, 2608,  181089,  1959, 9583,  'San Antonio', 78228, 'For Sale', 'TX'),
--   (20, '475 Dresden Dr',        'Beautiful 3 bedroom', 3, 1, 1532,  147960,  1955, 8451,  'San Antonio', 78213, 'For Sale', 'TX'),
--   (16, '15526 Cloud Top Rd',    'Beautiful 5 bedroom', 5, 4, 3400,  456536,  1985, 22215, 'San Antonio', 78248, 'For Sale', 'TX'),
--   (18, '1343 Burning Arrow St', 'Beautiful 4 bedroom', 4, 3, 2448,  293952,  1997, 10149, 'San Antonio', 78258, 'For Sale', 'TX'),
--   (17, '22723 Wichita Pass St', 'Beautiful 5 bedroom', 5, 4, 3563,  387509,  2002, 11761, 'San Antonio', 78258, 'For Sale', 'TX'),
--   (20, '78255 Shady Hollow Dr', 'Beautiful 5 bedroom', 5, 2, 3250,  244503,  1991, 23958, 'San Antonio', 78255, 'For Sale', 'TX'),
--   (18, '13802 East Hillside St','Beautiful 3 bedroom', 3, 2, 1611,  195910,  1964, 1000,  'San Antonio', 78249, 'For Sale', 'TX'),
--   (17, '8662 White Shadow Dr',  'Beautiful 3 bedroom', 3, 3, 1690,  216216,  2016, 6142,  'San Antonio', 78249, 'For Sale', 'TX'),
--   (19, '8919 Shade Tree St',    'Beautiful 4 bedroom', 4, 2, 2451,  277535,  1988, 9235,  'San Antonio', 78254, 'For Sale', 'TX'),
--   (20, '1207 Silverway St',     'Beautiful 3 bedroom', 3, 2, 1384,  155408,  1982, 7057,  'San Antonio', 78251, 'For Sale', 'TX'),
--   (16, '11403 Big Elk Dr Rd',   'Beautiful 3 bedroom', 3, 2, 1374,  141433,  1984, 8015,  'San Antonio', 78245, 'For Sale', 'TX'),
--   (17, '5641 Lopez Valley Rd',  'Beautiful 4 bedroom', 4, 2, 1936,  176636,  1981, 75707, 'San Antonio', 78703, 'For Sale', 'TX'),
--   ( 20, '8803 Garnett Ave',      'Beautiful 2 bedroom', 2, 1, 640,   80804,   1951, 21693, 'San Antonio', 78221, 'For Sale', 'TX'),
--   (17, '252 Koehler Ct',        'Beautiful 2 bedroom', 2, 1, 984,   85207,   1945, 7013,  'San Antonio', 78223, 'For Sale', 'TX'),
--   (19, '426 South Polaris St',     'Beautiful 3 bedroom', 3, 2, 1072,  113200,  2001, 8265,  'San Antonio', 78203, 'For Sale', 'TX'),
--   (17, '3826 Kirby DR',         'Beautiful 4 bedroom', 4, 2, 1766,  141091,  1963, 9147,  'San Antonio', 78219, 'For Sale', 'TX'),
--   (17, '3615 Vinecrest Dr',     'Beautiful 3 bedroom', 3, 2, 1182,  128526,  1967, 10193, 'San Antonio', 78219, 'For Sale', 'TX'),
--   (19, '5004 Viking Coral Dr',  'Beautiful 3 bedroom', 3, 3, 21195, 177950,  2001, 11674, 'San Antonio', 78244, 'For Sale', 'TX'),
--   (20, '8510 Secret Hollow Dr', 'Beautiful 5 bedroom', 5, 3, 3288,  208338,  2001, 6229,  'San Antonio', 78109, 'For Sale', 'TX'),
--   (18, '18425 Kinney Rd',       'Beautiful 3 bedroom', 3, 2, 2715,  260267,  2010, 57238, 'San Antonio', 78073, 'For Sale', 'TX'),
--   (17, '118 West Bonner Ave',   'Beautiful 3 bedroom', 3, 1, 1276,  123295,  1950, 9627,  'San Antonio', 78214, 'For Sale', 'TX'),
--   (20, '210 Congress Ave',      'Beautiful 2 bedroom', 2, 1, 1174,  118020,  1920, 9627,  'San Antonio', 78214, 'For Sale', 'TX'),
--   (19, '11900 Casa Nueva St',   'Beautiful 3 bedroom', 3, 2, 1412,  143677,  1971, 8756,  'San Antonio', 78233, 'For Sale', 'TX'),
--   (16, '11514 Sharpsburg St',   'Beautiful 3 bedroom', 3, 2, 1905,  216233,  1970, 7928,  'San Antonio', 78230, 'For Sale', 'TX'),
--   (19, '327 Ridgehaven Pl',     'Beautiful 4 bedroom', 4, 2, 2105,  446090,  1963, 8276,  'San Antonio', 78209, 'For Sale', 'TX'),
--   (18, '6706 Sunlite Pass Dr',  'Beautiful 4 bedroom', 4, 2, 2180,  142673,  1996, 7928,  'San Antonio', 78239, 'For Sale', 'TX'),
--   (20, '14207 Bobolink Cv',     'Beautiful 3 bedroom', 3, 2, 1656,  177720,  2007, 4356,  'San Antonio', 78233, 'For Sale', 'TX'),
--   (19, '8223 North Verde Dr',   'Beautiful 3 bedroom', 3, 3, 2295,  382244,  1967, 71874, 'San Antonio', 78240, 'For Sale', 'TX'),
--   (17, '51 Morgans Bluff',      'Beautiful 3 bedroom', 3, 2, 1744,  262004,  1997, 9147,  'San Antonio', 78216, 'For Sale', 'TX'),
--   (18, '154 Pelican Ct',        'Beautiful 3 bedroom', 3, 2, 3242,  687302,  2003, 2003,  'Spring Branch', 78070, 'For Sale', 'TX');


-- -- -- -- VERIFIES SEEDING WAS DONE RIGHT

-- select * from user;
-- select * from listing;




