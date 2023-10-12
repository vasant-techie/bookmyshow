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

-- THEATRES SEATS
-- A ROW
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '1A', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '2A', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '3A', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '4A', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '5A', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '6A', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '7A', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '8A', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '9A', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '10A', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
-- B ROW
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '1B', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '2B', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '3B', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '4B', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '5B', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '6B', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '7B', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '8B', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '9B', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '10B', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
-- C ROW
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '1C', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '2C', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '3C', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '4C', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '5C', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '6C', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '7C', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '8C', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '9C', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '10C', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- D ROW
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '1D', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '2D', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '3D', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '4D', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '5D', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '6D', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '7D', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '8D', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '9D', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '10D', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- E ROW
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '1E', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '2E', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '3E', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '4E', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '5E', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '6E', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '7E', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '8E', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '9E', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '10E', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- F ROW
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '1F', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '2F', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '3F', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '4F', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '5F', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '6F', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '7F', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '8F', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '9F', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO bms.theatreseats
(theatreid, seatno, status, created, modified)
VALUES (1, '10F', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);


-- MOVIES
INSERT INTO bms.movies
(moviename, description,  language, director, casting, releasedate, genre, duration, created, modified)
VALUES ('The Avengers', 'The Avengers are a group of superheroes who have gained worldwide attention and are known for their incredible abilities.', 'English', 'Francis Ford Coppola', 'Marlon Brando, Al Pacino, James Caan', '2012-04-25',  'Action', 120, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO bms.movies
(moviename, description, language, director, casting, releasedate, genre, duration, created, modified)
VALUES ('The Godfather', 'The Godfather is a crime film directed by Francis Ford Coppola.', 'English', 'Francis Ford Coppola', 'Marlon Brando, Al Pacino, James Caan', '1972-03-14', 'Crime', 120, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO bms.movies
(moviename, description, language, director, casting, releasedate, genre, duration, created, modified)
VALUES ('The Godfather: Part II', 'The Godfather: Part II is a crime film directed by Francis Ford Coppola.', 'English', 'Francis Ford Coppola', 'Marlon Brando, Al Pacino, James Caan', '1974-12-20', 'Crime', 180, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO bms.movies
(moviename, description, language, director, casting, releasedate, genre, duration, created, modified)
VALUES ('The Dark Knight', 'The Dark Knight is a superhero film directed by Christopher Nolan.', 'English', 'Christopher Nolan', 'Christian Bale, Heath Ledger, Aaron Eckhart, Michael Caine', '2008-07-18', 'Action', 180, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- SHOWS
INSERT INTO bms.shows
(theatreid, movieid, enabled, ticketcost, showtime, startdate, enddate, created, modified)
VALUES (1, 1, 1, 180, '10:00', CURRENT_DATE, CURRENT_DATE + 7, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO bms.shows
(theatreid, movieid, enabled, ticketcost, showtime, startdate, enddate, created, modified)
VALUES (1, 2, 1, 200, '14:00', CURRENT_DATE, CURRENT_DATE + 7, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO bms.shows
(theatreid, movieid, enabled, ticketcost, showtime, startdate, enddate, created, modified)
VALUES (1, 3, 1, 190, '17:00', CURRENT_DATE, CURRENT_DATE + 7, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO bms.shows
(theatreid, movieid, enabled, ticketcost, showtime, startdate, enddate, created, modified)
VALUES (1, 4, 1, 180, '22:00', CURRENT_DATE, CURRENT_DATE + 7, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO BMS.SHOWS
(theatreid, movieid, enabled, ticketcost, showtime, startdate, enddate, created, modified)
VALUES (2, 1, 1, 180, '10:00', CURRENT_DATE, CURRENT_DATE + 7, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO BMS.SHOWS
(theatreid, movieid, enabled, ticketcost, showtime, startdate, enddate, created, modified)
VALUES (2, 2, 1, 200, '14:00', CURRENT_DATE, CURRENT_DATE + 7, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
