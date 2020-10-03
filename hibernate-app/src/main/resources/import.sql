DROP TABLE products IF EXISTS;
CREATE TABLE IF NOT EXISTS products (id INTEGER, title VARCHAR(255),  cost INTEGER, PRIMARY KEY (id));
INSERT INTO products (id, name, cost) VALUES (1, 'Apple', 2) , (2, 'Orange', 3), (3, 'Banana', 4), (4, 'Mango', 5), (5, 'Potato', 1);

DROP TABLE clients IF EXISTS;
CREATE TABLE IF NOT EXISTS clients (id INTEGER, name VARCHAR(255), PRIMARY KEY (id));
INSERT INTO users (id, name) VALUES (1, 'Bob');

DROP TABLE sales IF EXISTS;
CREATE TABLE IF NOT EXISTS sales (id BIGSERIAL, client_id INTEGER, product_id INTEGER, data DATE(), PRIMARY KEY (id));

INSERT INTO items (id, title) VALUES (item_seq.NEXTVAL, 'Box');