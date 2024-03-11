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
       ('EUR', 'Euro', 0.9),
       ('GBP', 'British Pound', 0.8),
       ('JPY', 'Japanese Yen', 110.0),
       ('CNY', 'Chinese Yuan', 6.9),
       ('RUB', 'Russian Ruble', 65.0),
       ('INR', 'Indian Rupee', 70.0),
       ('AUD', 'Australian Dollar', 1.4),
       ('CAD', 'Canadian Dollar', 1.3),
       ('SEK', 'Swedish Krona', 10.0),
       ('NOK', 'Norwegian Krone', 10.0),
       ('KRW', 'South Korean Won', 1200.0),
       ('MXN', 'Mexican Peso', 20.0),
       ('TRY', 'Turkish Lira', 5.5);

DROP
    USER IF EXISTS 'mikko'@'localhost';

CREATE
    USER 'mikko'@'localhost' IDENTIFIED BY '1234';
GRANT SELECT, INSERT, UPDATE, DELETE ON currencies.* TO 'mikko'@'localhost';





