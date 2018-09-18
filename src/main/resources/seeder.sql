CREATE DATABASE IF NOT EXISTS homefinder;

USE DATABASE homefinder;

show tables;

INSERT INTO listing(id,user_id, address, description, bedrooms, bathrooms, square_footage, price, year_built, lot_size, city, zipcode, status, state) VALUES
  (1, 2, '109 city st', 'Beautiful 1 bedroom', 3, 7, 1000, 20000, 1964, 1000, 'San Antonio', 78213, 'For Sale', 'TX'),
  (2, 2, '109 city st', 'Beautiful 1 bedroom', 3, 7, 1000, 20000, 1964, 1000, 'San Antonio', 78213, 'For Sale', 'TX'),
  (3, 3, '109 city st', 'Beautiful 1 bedroom', 3, 7, 1000, 20000, 1964, 1000, 'San Antonio', 78213, 'For Sale', 'TX'),
  (4, 1, '109 city st', 'Beautiful 1 bedroom', 3, 7, 1000, 20000, 1964, 1000, 'San Antonio', 78213, 'For Sale', 'TX'),
  (5, 4, '109 city st', 'Beautiful 1 bedroom', 3, 7, 1000, 20000, 1964, 1000, 'San Antonio', 78213, 'For Sale', 'TX'),
  (6, 4, '109 city st', 'Beautiful 1 bedroom', 3, 7, 1000, 20000, 1964, 1000, 'San Antonio', 78213, 'For Sale', 'TX'),
  (7, 2, '109 city st', 'Beautiful 1 bedroom', 3, 7, 1000, 20000, 1964, 1000, 'San Antonio', 78213, 'For Sale', 'TX');



INSERT INTO user(id, first_name, last_name,email, password, phone_number, user_type) VALUES
  (1, 'John','Hamilton','john89', 'password', 2107168756, true),
  (2, 'Jake','Hamilton','jake89', 'password', 2107168756, true),
  (3, 'Jim','Hamilton','jim89', 'password', 2107168756, true),
  (4, 'Jorje','Hamilton','jorje89', 'password', 2107168756, true);


