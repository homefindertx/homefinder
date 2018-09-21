CREATE DATABASE IF NOT EXISTS homefinder;

USE DATABASE homefinder;

show tables;

INSERT INTO listing(id,user_id, address, description, bedrooms, bathrooms, square_footage, price, year_built, lot_size, city, zipcode, status, state) VALUES
  (1, 2, '266 Claywell Dr',        'Beautiful 3 bedroom', 3, 3, 1544,  401732,  1942, 10454, 'San Antonio', 78209, 'For Sale', 'TX'),
  (2, 2, '215 Tophill Rd',         'Beautiful 4 bedroom', 4, 3, 2726,  559338,  1955, 10890, 'San Antonio', 78209, 'For Sale', 'TX'),
  (3, 3, '302 castano Ave',        'Beautiful 4 bedroom', 4, 4, 4342,  1168170, 1937, 14985, 'San Antonio', 78209, 'For Sale', 'TX'),
  (4, 1, '322 EL Monte Blvd',      'Beautiful 2 bedroom', 2, 1, 512,   100028,  1956, 7013,  'San Antonio', 78212, 'For Sale', 'TX'),
  (5, 4, '515 Weizmann St',        'Beautiful 3 bedroom', 3, 1, 1112,  123589,  1951, 6882,  'San Antonio', 78213, 'For Sale', 'TX'),
  (6, 4, '511 Fresno St',          'Beautiful 4 bedroom', 4, 1, 1272,  139833,  1950, 7405,  'San Antonio', 78212, 'For Sale', 'TX'),
  (7, 2, '923 Edison Dr',          'Beautiful 3 bedroom', 3, 1, 1374,  131625,  1947, 7013,  'San Antonio', 78201, 'For Sale', 'TX'),
  (8, 1, '138 Mink St',            'Beautiful 3 bedroom', 3, 1, 1394,  142342,  1953, 6969,  'San Antonio', 78213, 'For Sale', 'TX'),
  (9, 1, '510 Adrian Dr',          'Beautiful 2 bedroom', 2, 1, 884,   117657,  1952, 7144,  'San Antonio', 78213, 'For Sale', 'TX'),
  (10, 2, '5411 King Richard St',  'Beautiful 4 bedroom', 4, 2, 2100,  239000,  1968, 10803, 'San Antonio', 78229, 'For Sale', 'TX'),
  (11, 2, '4502 Adkins Triail',    'Beautiful 3 bedroom', 3, 2, 1914,  195063,  2004, 7492,  'San Antonio', 78238, 'For Sale', 'TX'),
  (12, 2, '4919 Bear Wood Rd',     'Beautiful 3 bedroom', 3, 3, 1556,  161964,  2006, 3484,  'San Antonio', 78238, 'For Sale', 'TX'),
  (13, 2, '6914 Forest Park St',   'Beautiful 3 bedroom', 3, 2, 1540,  167228,  1968, 7928,  'San Antonio', 78240, 'For Sale', 'TX'),
  (14, 2, '3610 Mohegan Dr',       'Beautiful 3 bedroom', 3, 2, 1403,  166178,  1959, 8407,  'San Antonio', 78228, 'For Sale', 'TX'),
  (15, 2, '147 Colleen Dr',        'Beautiful 3 bedroom', 3, 2, 2608,  181089,  1959, 9583,  'San Antonio', 78228, 'For Sale', 'TX'),
  (16, 2, '475 Dresden Dr',        'Beautiful 3 bedroom', 3, 1, 1532,  147960,  1955, 8451,  'San Antonio', 78213, 'For Sale', 'TX'),
  (17, 2, '15526 Cloud Top Rd',    'Beautiful 5 bedroom', 5, 4, 3400,  456536,  1985, 22215, 'San Antonio', 78248, 'For Sale', 'TX'),
  (18, 2, '1343 Burning Arrow St', 'Beautiful 4 bedroom', 4, 3, 2448,  293952,  1997, 10149, 'San Antonio', 78258, 'For Sale', 'TX'),
  (19, 2, '22723 Wichita Pass St', 'Beautiful 5 bedroom', 5, 4, 3563,  387509,  2002, 11761, 'San Antonio', 78258, 'For Sale', 'TX'),
  (20, 2, '78255 Shady Hollow Dr', 'Beautiful 5 bedroom', 5, 2, 3250,  244503,  1991, 23958, 'San Antonio', 78255, 'For Sale', 'TX'),
  (21, 2, '13802 East Hillside St','Beautiful 3 bedroom', 3, 2, 1611,  195910,  1964, 1000,  'San Antonio', 78249, 'For Sale', 'TX'),
  (22, 2, '8662 White Shadow Dr',  'Beautiful 3 bedroom', 3, 3, 1690,  216216,  2016, 6142,  'San Antonio', 78249, 'For Sale', 'TX'),
  (23, 2, '8919 Shade Tree St',    'Beautiful 4 bedroom', 4, 2, 2451,  277535,  1988, 9235,  'San Antonio', 78254, 'For Sale', 'TX'),
  (24, 2, '1207 Silverway St',     'Beautiful 3 bedroom', 3, 2, 1384,  155408,  1982, 7057,  'San Antonio', 78251, 'For Sale', 'TX'),
  (25, 2, '11403 Big Elk Dr Rd',   'Beautiful 3 bedroom', 3, 2, 1374,  141433,  1984, 8015,  'San Antonio', 78245, 'For Sale', 'TX'),
  (26, 2, '5641 Lopez Valley Rd',  'Beautiful 4 bedroom', 4, 2, 1936,  176636,  1981, 75707, 'San Antonio', 78703, 'For Sale', 'TX'),
  (27, 2, '8803 Garnett Ave',      'Beautiful 2 bedroom', 2, 1, 640,   80804,   1951, 21693, 'San Antonio', 78221, 'For Sale', 'TX'),
  (28, 2, '252 Koehler Ct',        'Beautiful 2 bedroom', 2, 1, 984,   85207,   1945, 7013,  'San Antonio', 78223, 'For Sale', 'TX'),
  (29, 2, '426 South Polaris',     'Beautiful 3 bedroom', 3, 2, 1072,  113200,  2001, 8265,  'San Antonio', 78203, 'For Sale', 'TX'),
  (30, 2, '3826 Kirby Dr',         'Beautiful 4 bedroom', 4, 2, 1766,  141091,  1963, 9147,  'San Antonio', 78219, 'For Sale', 'TX'),
  (31, 2, '3615 Vinecrest Dr',     'Beautiful 3 bedroom', 3, 2, 1182,  128526,  1967, 10193, 'San Antonio', 78219, 'For Sale', 'TX'),
  (32, 2, '5004 Viking Coral Dr',  'Beautiful 3 bedroom', 3, 3, 21195, 177950,  2001, 11674, 'San Antonio', 78244, 'For Sale', 'TX'),
  (33, 2, '8510 Secret Hollow Dr', 'Beautiful 5 bedroom', 5, 3, 3288,  208338,  2001, 6229,  'San Antonio', 78109, 'For Sale', 'TX'),
  (34, 2, '18425 Kinney Rd',       'Beautiful 3 bedroom', 3, 2, 2715,  260267,  2010, 57238, 'San Antonio', 78073, 'For Sale', 'TX'),
  (35, 2, '118 West Bonner Ave',   'Beautiful 3 bedroom', 3, 1, 1276,  123295,  1950, 9627,  'San Antonio', 78214, 'For Sale', 'TX'),
  (36, 2, '210 Congress Ave',      'Beautiful 2 bedroom', 2, 1, 1174,  118020,  1920, 9627,  'San Antonio', 78214, 'For Sale', 'TX'),
  (37, 2, '11900 Casa Nueva St',   'Beautiful 3 bedroom', 3, 2, 1412,  143677,  1971, 8756,  'San Antonio', 78233, 'For Sale', 'TX'),
  (38, 2, '11514 Sharpsburg St',   'Beautiful 3 bedroom', 3, 2, 1905,  216233,  1970, 7928,  'San Antonio', 78230, 'For Sale', 'TX'),
  (39, 2, '327 Ridgehaven Pl',     'Beautiful 4 bedroom', 4, 2, 2105,  446090,  1963, 8276,  'San Antonio', 78209, 'For Sale', 'TX'),
  (41, 2, '6706 Sunlite Pass Dr',  'Beautiful 4 bedroom', 4, 2, 2180,  142673,  1996, 7928,  'San Antonio', 78239, 'For Sale', 'TX'),
  (42, 2, '14207 Bobolink Cv',     'Beautiful 3 bedroom', 3, 2, 1656,  177720,  2007, 4356,  'San Antonio', 78233, 'For Sale', 'TX'),
  (43, 2, '8223 North Verde Dr',   'Beautiful 3 bedroom', 3, 3, 2295,  382244,  1967, 71874, 'San Antonio', 78240, 'For Sale', 'TX'),
  (44, 2, '51 Morgans Bluff',      'Beautiful 3 bedroom', 3, 2, 1744,  262004,  1997, 9147,  'San Antonio', 78216, 'For Sale', 'TX'),
  (45, 2, '154 Pelican Ct',        'Beautiful 3 bedroom', 3, 2, 3242,  687302,  2003, 2003,  'San Antonio', 78070, 'For Sale', 'TX');



INSERT INTO user(id, email, first_name, is_buyer, last_name, password, phone_number, username) VALUES
  (1,  john1@gmail.com,      'John',     true,   'Salazar',   'pass1',  2104558744,      'john1'),
  (2,  samuel2@gmail.com,    'Samuel',   true,   'Combs',     'pass2',  2102168465,    'samuel2'),
  (3,  jim3@gmail.com,       'Jim',      true,   'Ham',       'pass3',  6808774539,       'jim3'),
  (4,  shawn4@gmail.com,     'Shawn',    true,   'White',     'pass4',  2107175346,     'shawn4'),
  (5,  noah5@gmail.com,      'Noah',     true,   'Holdstein', 'pass5',  2109805463,      'noah5'),
  (6,  carol6@gmail.com,     'Carol',    true,   'Schwertz',  'pass6',  2108304494,     'carol6'),
  (7,  david7@gmail.com,     'David',    true,   'Dunhill',   'pass7',  2106505535,     'david7'),
  (8,  jacob8 @gmail.com,    'Jacob',    true,   'Myers',     'pass8',  2108792769,     'jacob8'),
  (9,  mary9@gmail.com,      'Mary',     true,   'Darnell',   'pass9',  8304307860,      'mary9'),
  (10, joline10@gmail.com,   'Joline',   true,   'Jacobson',  'pass10', 3214123588,   'joline10'),
  (11, walter11@gmail.com,   'Walter',   true,   'Terrence',  'pass11', 2708976554,   'walter11'),
  (12, justin12@gmail.com,   'Justin',   true,   'Long',      'pass12', 8508792769,   'justin12'),
  (13, jin13@gmail.com,      'Jin',      true,   'Cho',       'pass13', 9804452376,      'jin13'),
  (14, lauren14@gmail.com,   'Lauren',   true,   'McDowell',  'pass14', 2107178890,   'lauren14'),
  (15, zackery15@gmail.com,  'Zackery',  true,   'Henderson', 'pass15', 3602338346,  'zackery15'),
  (16, adam16@gmail.com,     'Adam',     false,  'Shaw',      'pass16', 8793468756,     'adam16'),
  (17, robert17@gmail.com,   'Robert',   false,  'Davis',     'pass17', 5558675309,   'robert17'),
  (18, harold18@gmail.com,   'Harold',   false,  'Washington','pass18', 2146637589,   'harold18'),
  (19, barbara19@gmail.com,  'Barbara',  false,  'Rand',      'pass19', 2103385028,  'barbara19'),
  (20, franklin20@gmail.com, 'Franklin', false,  'Bell',      'pass20', 2107473848, 'franklin20');


