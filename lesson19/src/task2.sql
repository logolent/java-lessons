CREATE TABLE users
(
    id       INT          NOT NULL AUTO_INCREMENT,
    username VARCHAR(32)  NOT NULL,
    password VARCHAR(256) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE catalogs
(
    id   INT         NOT NULL AUTO_INCREMENT,
    name VARCHAR(32) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE products
(
    id         INT          NOT NULL AUTO_INCREMENT,
    catalog_id INT,
    name       VARCHAR(256) NOT NULL,
    price      FLOAT        NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (catalog_id) REFERENCES catalogs (id)
);

CREATE TABLE orders
(
    id      INT                                             NOT NULL AUTO_INCREMENT,
    user_id INT                                             NOT NULL,
    status  ENUM ('AWAITING', 'SHIPPED', 'READY', 'CLOSED') NOT NULL,
    date    DATE DEFAULT CURRENT_DATE,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users (id)
);

CREATE TABLE orders_products
(
    id         INT NOT NULL AUTO_INCREMENT,
    order_id   INT NOT NULL,
    product_id INT NOT NULL,
    amount     SMALLINT DEFAULT 1,
    PRIMARY KEY (id),
    FOREIGN KEY (order_id) REFERENCES orders (id),
    FOREIGN KEY (product_id) REFERENCES products (id)
);

/*INSERT INTO users (username, password)
VALUES ('user1', '123'),
       ('user2', '123');

INSERT INTO catalogs (name)
VALUES ('catalog1'),
       ('catalog2');

INSERT INTO products (catalog_id, name, price)
VALUES (1, 'Product 1', 123.123),
       (1, 'Product 2', 123.123),
       (2, 'Product 3', 444.123);

INSERT INTO orders (user_id, status)
VALUES (1, 'SHIPPED'),
       (2, 'AWAITING');

INSERT INTO orders_products (order_id, product_id, amount)
VALUES (1, 1, 10),
       (1, 2, 1),
       (2, 3, 10),
       (2, 1, 10);*/
