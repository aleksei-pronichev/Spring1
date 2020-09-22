create table products (
    id                      bigserial primary key,
    title                   varchar(255),
    price                   int
);

insert into products (title, price)
values
('Apple', 21),
('Orange', 22),
('Banana', 23),
('Mango', 24),
('Potato', 25),
('peach', 26),
('apricot', 27),
('fig', 28),
('date', 29),
('kiwi', 31),
('grapes', 32),
('lime', 33),
('lemon', 34),
('litchi', 35),
('melon', 36),
('avocado', 37),
('nectarine', 38),
('grapefruit', 39),
('papaya', 40);