DROP
    DATABASE IF EXISTS currencies;
CREATE
    DATABASE currencies;
use currencies;
CREATE table currencies
(
    abbreviation   VARCHAR(5)  NOT NULL,
    name           VARCHAR(30) NOT NULL,
    conversionrate FLOAT       NOT NULL,
    PRIMARY KEY (abbreviation)
);
INSERT INTO currencies (abbreviation, name, conversionrate)
VALUES ('USD', 'US Dollar', 1.0),
       ('EUR', 'Euro', 0.92),
       ('GBP', 'British Pound', 0.78),
       ('JPY', 'Japanese Yen', 146.95),
       ('CNY', 'Chinese Yuan', 7.18),
       ('RUB', 'Russian Ruble', 90.69),
       ('INR', 'Indian Rupee', 82.74),
       ('AUD', 'Australian Dollar', 1.51),
       ('CAD', 'Canadian Dollar', 1.35),
       ('SEK', 'Swedish Krona', 10.24),
       ('NOK', 'Norwegian Krone', 10.45),
       ('KRW', 'South Korean Won', 1311.18),
       ('MXN', 'Mexican Peso', 16.8),
       ('TRY', 'Turkish Lira', 32);

DROP
    USER IF EXISTS 'mikko'@'localhost';

CREATE
    USER 'mikko'@'localhost' IDENTIFIED BY '1234';
GRANT SELECT, INSERT, UPDATE, DELETE ON currencies.* TO 'mikko'@'localhost';





