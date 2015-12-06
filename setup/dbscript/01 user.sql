SELECT count(*) FROM mysql.user where User like 'Ancc';
REVOKE ALL ON *.* FROM 'Ancc'@'localhost';
DROP USER 'Ancc'@'localhost';
CREATE USER 'Ancc'@'localhost' IDENTIFIED BY '123456';
GRANT ALL PRIVILEGES ON stock.* TO 'Ancc';