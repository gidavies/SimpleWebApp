-- create table people including firstname, lastname, location, id and primary key

CREATE TABLE people (
    id SERIAL PRIMARY KEY,
    firstname VARCHAR(50) NOT NULL,
    lastname VARCHAR(50) NOT NULL,
    location VARCHAR(50) NOT NULL
);

-- insert data into people table

INSERT INTO people (firstname, lastname, location)
VALUES ('John', 'Doe', 'New York'),
       ('Jane', 'Doe', 'New York'),
       ('John', 'Smith', 'California'),
       ('Jane', 'Smith', 'California'),
       ('John', 'Doe', 'California'),
       ('Jane', 'Doe', 'California'),
       ('John', 'Smith', 'New York'),
       ('Jane', 'Smith', 'New York');

       