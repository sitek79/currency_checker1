CREATE TABLE products (id INTEGER PRIMARY KEY AUTOINCREMENT, date_time REAL, name character varying(200) NOT NULL, price numeric NOT NULL, category character varying(100), in_stock integer DEFAULT 0);
--drop table products;
--SELECT * FROM products;