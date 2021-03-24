CREATE TABLE users
(
    id       INT(5) NOT NULL AUTO_INCREMENT,
    username VARCHAR(50),
    surname  VARCHAR(32),
    PRIMARY KEY (id)
);

CREATE TABLE phones
(
    id           INT(5) NOT NULL AUTO_INCREMENT,
    user_id      INT(5) NOT NULL,
    phone_number VARCHAR(10),
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users (id)
);

CREATE TABLE rooms
(
    id          INT(5) NOT NULL AUTO_INCREMENT,
    phone_id    INT(5),
    room_number INT(4),
    PRIMARY KEY (id)
);

INSERT INTO users (username, surname)
VALUES ('user1', 'Иванов'),
       ('user2', 'Кузнецов'),
       ('user3', 'Иванов'),
       ('user4', 'Иванов'),
       ('user5', 'Кузнецов'),
       ('user6', 'Матвеев');

INSERT INTO phones (user_id, phone_number)
VALUES (1, '000000'),
       (2, '000111'),
       (3, '000001'),
       (4, '111000');

INSERT INTO rooms (phone_id, room_number)
VALUES (1, 100),
       (2, 101),
       (3, 102),
       (4, 103),
       (5, 105);

# Выбрать все строки из таблицы phones где телефоны начинаются с ‘0’. Отсортировать по номеру телефона.
SELECT *
FROM phones
WHERE phone_number LIKE '0%'
ORDER BY phone_number;

# Посчитать количество однофамильцев. Вывести на экран количество только теx фамилии, которые повторяются.
SELECT surname, count(*)
FROM users
GROUP BY surname
HAVING count(surname) > 1;

# Вывести номер комнаты для пользователя с заданной фамилией. Используем INNER JOIN.
SELECT u.id, u.username, u.surname, r.room_number
FROM users u
         JOIN phones p ON u.id = p.user_id
         JOIN rooms r ON p.id = r.phone_id
WHERE u.surname LIKE 'Иванов';

# Вывести пользователей, у которых нет телефона. Используем LEFT JOIN c проверкой IS NULL.
SELECT u.*
FROM users u
         LEFT JOIN phones p ON u.id = p.user_id
WHERE p.id IS NULL;

# Вывести все комнаты, для которых нет телефона. Используем RIGHT JOIN c проверкой IS NULL.
SELECT r.*
FROM phones p
         RIGHT JOIN rooms r on p.id = r.phone_id
WHERE p.id IS NULL;

# Добавить внешний ключ для таблицы rooms.
ALTER TABLE rooms
    ADD FOREIGN KEY (phone_id) REFERENCES phones (id);
