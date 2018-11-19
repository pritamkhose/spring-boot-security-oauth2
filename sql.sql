CREATE SCHEMA `oauthtest` ;

INSERT INTO user (id, username, password, salary, age) VALUES (1, 'Alex123', '$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu', 3456, 33);
INSERT INTO user (id, username, password, salary, age) VALUES (2, 'Tom234', '$2a$04$PCIX2hYrve38M7eOcqAbCO9UqjYg7gfFNpKsinAxh99nms9e.8HwK', 7823, 23);
INSERT INTO user (id, username, password, salary, age) VALUES (3, 'Adam', '$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu', 4234, 45);
INSERT INTO user (id, username, password, salary, age) VALUES (4, 'pritam', '$2a$10$corvQdKRrBrI6XBPBb7x.Ovhu5VtKediZ4ogwNcyBLnvHsx9FTmdq', 987894, 27);

SELECT * FROM oauthtest.user;


INSERT INTO `oauthtest`.`data` (`id`, `descp`, `phone`, `pin`, `title`) VALUES ('1', 'customercare no', '123', '414001', 'BSNL');
INSERT INTO `oauthtest`.`data` (`id`, `descp`, `phone`, `pin`, `title`) VALUES ('2', 'customercare no', '123', '414001', 'JIO');

SELECT * FROM oauthtest.data;
