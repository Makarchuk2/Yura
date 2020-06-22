DROP TABLE IF EXISTS BOOKS;
CREATE TABLE BOOKS
(
book_id UUID PRIMARY KEY,
book_name VARCHAR(250),
book_author VARCHAR(250),
book_year VARCHAR(250),
book_genre VARCHAR(250),
book_price INTEGER
);
