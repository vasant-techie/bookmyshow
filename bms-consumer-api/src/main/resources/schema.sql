CREATE SCHEMA IF NOT EXISTS bms;

CREATE TABLE IF NOT EXISTS bms.users (
  userid INT NOT NULL AUTO_INCREMENT,
  username VARCHAR(45) NOT NULL,
  password VARCHAR(45) NOT NULL,
  enabled INT NOT NULL,
  firstname VARCHAR(45) NOT NULL,
  lastname VARCHAR(45) NOT NULL,
  email VARCHAR(45) NOT NULL,
  mobile VARCHAR(45) NOT NULL,
  address VARCHAR(45) NOT NULL,
  created TIMESTAMP NOT NULL,
  modified TIMESTAMP NOT NULL,
  PRIMARY KEY (userid));

CREATE TABLE IF NOT EXISTS bms.authorities (
    id INT NOT NULL AUTO_INCREMENT,
    username VARCHAR(45) NOT NULL,
    authority VARCHAR(45) NOT NULL,
    PRIMARY KEY (id));

CREATE TABLE IF NOT EXISTS bms.movies (
  movieid INT NOT NULL AUTO_INCREMENT,
  moviename VARCHAR(50) NOT NULL,
  description VARCHAR(400) NOT NULL,
  language VARCHAR(80) NOT NULL,
  director VARCHAR(80) NOT NULL,
  casting VARCHAR(400) NOT NULL,
  genre VARCHAR(45) NOT NULL,
  releasedate DATE NOT NULL,
  duration INT NOT NULL,
  created TIMESTAMP NOT NULL,
  modified TIMESTAMP NOT NULL,
  PRIMARY KEY (movieid));

CREATE TABLE IF NOT EXISTS bms.theatres (
  theatreid INT NOT NULL AUTO_INCREMENT,
  theatrename VARCHAR(60) NOT NULL,
  address VARCHAR(500) NOT NULL,
  city VARCHAR(45) NOT NULL,
  state VARCHAR(45) NOT NULL,
  pincode INT NOT NULL,
  created TIMESTAMP NOT NULL,
  modified TIMESTAMP NOT NULL,
  PRIMARY KEY (theatreid));

CREATE TABLE IF NOT EXISTS bms.shows (
  showid INT NOT NULL AUTO_INCREMENT,
  theatreid INT NOT NULL REFERENCES bms.theatres(theatreid) ON DELETE CASCADE,
  movieid INT NOT NULL REFERENCES  bms.movies(movieid) ON DELETE CASCADE,
  enabled INT NOT NULL,
  ticketcost INT NOT NULL,
  created TIMESTAMP NOT NULL,
  modified TIMESTAMP NOT NULL,
  PRIMARY KEY (showid));

CREATE TABLE IF NOT EXISTS bms.bookings (
  bookingid INT NOT NULL AUTO_INCREMENT,
  showid INT NOT NULL REFERENCES bms.shows(showid) ON DELETE CASCADE,
  userid INT NOT NULL REFERENCES bms.users(userid) ON DELETE CASCADE,
  seats INT NOT NULL,
  bookingdate TIMESTAMP NOT NULL,
  amount INT NOT NULL,
  PRIMARY KEY (bookingid));


