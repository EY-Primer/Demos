CREATE TABLE owners(

	owner_id serial PRIMARY KEY,
	owner_name text

);

CREATE TABLE dogs(

	dog_id serial PRIMARY KEY,
	dog_name TEXT,
	dog_age int,
	owner_id_fk int REFERENCES owners (owner_id)

);

INSERT INTO owners(owner_name) VALUES ('Tedd'), ('Todd');

INSERT INTO dogs(dog_name, dog_age, owner_id_fk)
VALUES ('Sparky', 14, 1), ('Mister', 4, 1), ('Scooby', 2, 2), ('Perrito', 6, 2);

SELECT * FROM dogs;

SELECT avg(dog_age) FROM dogs;

SELECT * FROM dogs WHERE dog_age > (SELECT avg(dog_age) FROM dogs);

SELECT * FROM dogs INNER JOIN owners ON owner_id_fk = owner_id;


