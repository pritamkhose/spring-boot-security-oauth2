CREATE SCHEMA `oauthtest` ;

INSERT INTO User (id, username, password, salary, age) VALUES (1, 'Alex123', '$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu', 3456, 33);
INSERT INTO User (id, username, password, salary, age) VALUES (2, 'Tom234', '$2a$04$PCIX2hYrve38M7eOcqAbCO9UqjYg7gfFNpKsinAxh99nms9e.8HwK', 7823, 23);
INSERT INTO User (id, username, password, salary, age) VALUES (3, 'Adam', '$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu', 4234, 45);


SELECT * FROM oauthtest.user;

SELECT * FROM oauthtest.data;
INSERT INTO `oauthtest`.`data` (`id`, `descp`, `phone`, `pin`, `title`) VALUES ('1', 'customercare no', '123', '414001', 'BSNL');


--1	33	$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu	3456	Alex123
--2	23	$2a$04$PCIX2hYrve38M7eOcqAbCO9UqjYg7gfFNpKsinAxh99nms9e.8HwK	7823	Tom234
--3	45	$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu	4234	Adam
--4	27	$2a$10$corvQdKRrBrI6XBPBb7x.Ovhu5VtKediZ4ogwNcyBLnvHsx9FTmdq	987894	pritam