CREATE TABLE brands (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE categories (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE sizes (
    id SERIAL PRIMARY KEY,
    value VARCHAR(10) NOT NULL UNIQUE
);

CREATE TABLE products (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL,
    color VARCHAR(50),
    brand_id INTEGER,
    category_id INTEGER,
    size_id INTEGER,
    
    CONSTRAINT fk_brand FOREIGN KEY (brand_id) REFERENCES brands(id),
    CONSTRAINT fk_category FOREIGN KEY (category_id) REFERENCES categories(id),
    CONSTRAINT fk_size FOREIGN KEY (size_id) REFERENCES sizes(id)
);

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL
);"Cafe"

INSERT INTO brands (name) VALUES 
('Nike'),
('Adidas'),
('Reebok'),
('Puma'),
('Under Armour');

INSERT INTO categories (name) VALUES 
('Футболки'),
('Шорты'),
('Кроссовки'),
('Спортивные штаны'),
('Джинсы');

INSERT INTO sizes (value) VALUES 
('S'),
('M'),
('L'),
('XL'),
('XXL'),
('42'),
('43'),
('44'),
('45');

INSERT INTO products (name, description, price, color, brand_id, category_id, size_id)
VALUES 
('Футболка Nike', 'Спортивная футболка', 50.00, 'Синий', 1, 1, 3),
('Шорты Adidas', 'Легкие шорты', 30.00, 'Белый', 2, 2, 2),
('Кроссовки Reebok', 'Удобные кроссовки', 80.00, 'Черный', 3, 3, 6),
('Спортивные штаны Puma', 'Теплые штаны', 60.00, 'Серый', 4, 4, 4),
('Джинсы Under Armour', 'Удобные джинсы', 70.00, 'Синий', 5, 5, 8);
