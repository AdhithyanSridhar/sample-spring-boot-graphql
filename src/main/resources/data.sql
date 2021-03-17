INSERT INTO continent (id, name, area, population) VALUES (RANDOM_UUID(), 'Africa', 30370000, 1287920000);
INSERT INTO country (id, continent_id, name, population, area, density) SELECT RANDOM_UUID(), continent.id, 'Algeria', 4200, 2380, 18 FROM continent WHERE continent.name = 'Africa';
INSERT INTO country (id, continent_id, name, population, area, density) SELECT RANDOM_UUID(), continent.id, 'Angola', 30774205, 1200, 25 FROM continent WHERE continent.name = 'Africa';
INSERT INTO country (id, continent_id, name, population, area, density) SELECT RANDOM_UUID(), continent.id, 'Benin', 11485674, 112760, 102 FROM continent WHERE continent.name = 'Africa';
INSERT INTO country (id, continent_id, name, population, area, density) SELECT RANDOM_UUID(), continent.id, 'Botswana', 2333201, 566730, 4 FROM continent WHERE continent.name = 'Africa';

INSERT INTO continent (id, name, area, population) VALUES (RANDOM_UUID(), 'Antarctica', 14000000, 4490);
INSERT INTO continent (id, name, area, population) VALUES (RANDOM_UUID(), 'Asia', 44579000, 4545);
INSERT INTO continent (id, name, area, population) VALUES (RANDOM_UUID(), 'Australia', 8600000, 4126);
INSERT INTO continent (id, name, area, population) VALUES (RANDOM_UUID(), 'Europe', 10180000, 7424);
INSERT INTO continent (id, name, area, population) VALUES (RANDOM_UUID(), 'North America', 24709000, 5876);
INSERT INTO continent (id, name, area, population) VALUES (RANDOM_UUID(), 'South America', 17840000, 4282);

