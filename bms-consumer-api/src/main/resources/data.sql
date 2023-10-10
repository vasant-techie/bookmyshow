INSERT INTO bms.authorities (username, authority) VALUES ('john', 'write');
INSERT INTO bms.users
(username, password, enabled, firstname, lastname, email, mobile, address, created, modified)
VALUES ('kalam', '12345', 1,  'Abdul', 'Kalam', 'abdul.kalam@gmail.com', '9999999999', 'Rameshwaram', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);