CREATE TABLE apartments(
	apartment_id serial PRIMARY KEY,
	max_occupancy int check(max_occupancy <= 4),
	rooms int,
	handicap_accessible boolean
);

INSERT INTO apartments(max_occupancy, rooms, handicap_accessible) 
VALUES (4, 6, true), (2, 4, false), (4, 6, false);

SELECT * FROM apartments;

CREATE TABLE tenants(
	tenant_id serial PRIMARY KEY,
	first_name TEXT,
	last_name TEXT,
	handicapped boolean,
	apartment_id_fk int REFERENCES apartments(apartment_id)
);

INSERT INTO tenants(first_name, last_name, handicapped, apartment_id_fk)
VALUES ('Bob', 'Ross', FALSE, 2), ('Claude', 'Monet', TRUE, 1), 
('Vincent', 'Van Gogh', TRUE, 1), ('David', 'Bowie', FALSE, 2);

SELECT * FROM tenants;


ALTER TABLE tenants ADD COLUMN year_of_death int;


--joins (selecting data from two tables at once)--------------------------------------------

--everything from the left table (tenants) and matching rows on the right table
SELECT * FROM tenants LEFT JOIN apartments ON apartment_id_fk = apartment_id;

--everything from the rightt table (apartments) and matching rows on the left table
SELECT * FROM tenants RIGHT JOIN apartments ON apartment_id_fk = apartment_id;

--everything with matching rows
SELECT * FROM tenants INNER JOIN apartments ON apartment_id_fk = apartment_id;

--everything! no matter if there are PK/FK matches, you'll get it all
SELECT * FROM tenants FULL OUTER JOIN apartments ON apartment_id_fk = apartment_id;


--set operations (selecting data from two queries at once)--------------------------------------------

--UNION (all distinct records from both queries - no duplicates)
SELECT apartment_id_fk FROM tenants UNION SELECT apartment_id FROM apartments;

--UNION ALL (all distinct records from both queries - including duplicates)
SELECT apartment_id_fk FROM tenants UNION ALL SELECT apartment_id FROM apartments;

--INTERSECT (returns unique rows - no duplicates - found in BOTH queries)
SELECT apartment_id_fk FROM tenants intersect SELECT apartment_id FROM apartments;

--EXCEPT (returns unique rows - no duplicates) found in the first query, but not the second
SELECT apartment_id FROM apartments except SELECT apartment_id_fk FROM tenants;

--subquery (nested statement)--------------------------------------------

--I want to select apartments with greater than average max occupancy
--I need a query to FIND that average, and then another query to run against that average
SELECT * FROM apartments WHERE max_occupancy > (SELECT avg(max_occupancy) FROM apartments);


--like keyword (with % - wildcard)--------------------------------------------

SELECT * FROM tenants WHERE first_name LIKE 'B%';

SELECT * FROM tenants WHERE first_name LIKE '%a%';

--where vs having

SELECT * FROM tenants WHERE handicapped = TRUE;

--HAVING happens after aggregation. it's like a WHERE clause for aggregated data (where doesn't work on aggregations)
SELECT count(apartment_id_fk) FROM tenants GROUP BY apartment_id_fk;
--so in this case, we're counting the instances of each different apartment_id_fk.

SELECT count(apartment_id_fk) FROM tenants GROUP BY apartment_id_fk HAVING apartment_id_fk > 1;
--in THIS case, we're doing the same thing but only getting ids above 1.


--We'll look at acid properties in the SQL reading







