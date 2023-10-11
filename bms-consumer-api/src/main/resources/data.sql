INSERT INTO bms.authorities (username, authority) VALUES ('kalam', 'write');

-- USERS
INSERT INTO bms.users
(username, password, enabled, firstname, lastname, email, mobile, address, created, modified)
VALUES ('kalam', '12345', 1,  'Abdul', 'Kalam', 'abdul.kalam@gmail.com', '9999999999', 'Rameshwaram', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- THEATRES @BENGALURU
INSERT INTO bms.theatres
(theatrename, address, city, state, pincode, created, modified)
VALUES ('Urvashi Cinema', '40 Lal Bagh Road', 'Bengaluru', 'Karnataka', 560002, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO bms.theatres
(theatrename, address, city, state, pincode, created, modified)
VALUES ('PVR', 'The NEXUS Mall', 'Bengaluru', 'Karnataka', 560095, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO bms.theatres
(theatrename, address, city, state, pincode, created, modified)
VALUES ('INOX', 'Brookefield Mall', 'Bengaluru', 'Karnataka', 560037, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- THEATRES @CHENNAI
INSERT INTO bms.theatres
(theatrename, address, city, state, pincode, created, modified)
VALUES ('Sathyam Cinemas', 'Royapettah', 'Chennai', 'Tamil Nadu', 600014, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO bms.theatres
(theatrename, address, city, state, pincode, created, modified)
VALUES ('Luxe Cinemas', 'Velachery', 'Chennai', 'Tamil Nadu', 600042, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO bms.theatres
(theatrename, address, city, state, pincode, created, modified)
VALUES ('Palazzo', 'Vadapalani', 'Chennai', 'Tamil Nadu', 600026, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- THEATRES @MADURAI
INSERT INTO bms.theatres
(theatrename, address, city, state, pincode, created, modified)
VALUES ('Central Cinema', ' 281, W Masi St, Madurai Main', 'Madurai', 'Tamil Nadu', 625001, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO bms.theatres
(theatrename, address, city, state, pincode, created, modified)
VALUES ('Vetri Cinemas', 'Villapuram', 'Madurai', 'Tamil Nadu', 625012, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO bms.theatres
(theatrename, address, city, state, pincode, created, modified)
VALUES ('Guru Theatre', 'Arappalayam, Gnanavolivupuram', 'Madurai', 'Tamil Nadu', 625016, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
