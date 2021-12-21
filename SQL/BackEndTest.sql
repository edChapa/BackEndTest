-- Task 1
CREATE TABLE Languages (
    LanguageID numeric PRIMARY KEY IDENTITY(1, 1),
    Name varchar(25)
);

CREATE TABLE Countries (
    CountryID numeric IDENTITY(1, 1) PRIMARY KEY,
    Name varchar(25),
    Capital varchar(25),
    Population numeric,
    LangageID numeric FOREIGN KEY REFERENCES Languages(LanguageID),
);

--Task 2
INSERT INTO Languages(Name) VALUES ('English');
INSERT INTO Languages(Name) VALUES ('Spanish');

INSERT INTO Countries(Name, Capital, Population, LanguageID) VALUES ('México', 'Ciudad de México', 500000, 2);
INSERT INTO Countries(Name, Capital, Population, LanguageID) VALUES ('USA', 'Washington D.C.', 700000, 1);

INSERT INTO Countries(Name, Capital, Population, LanguageID) VALUES ('Argentina', 'No c', 500000, 2);
INSERT INTO Countries(Name, Capital, Population, LanguageID) VALUES ('Ecuador', 'No c', 700000, 2);

--Task 3
UPDATE Countries
SET Population = 250000
WHERE CountryID = 1;

--Task 4
DELETE FROM Countries
WHERE Population > 100000;

--Task 5
SELECT Countries.Name, Countries.Capital, Countries.Population, Languages.Name
FROM Countries
INNER JOIN Languages ON Countries.LanguageID = Languages.LanguageID;

--Task 6
SELECT LanguageID, COUNT(CountryID) AS 'Number Of Countries'
FROM Countries
GROUP BY LanguageID;

--Task 7
CREATE PROCEDURE InsertCountry @Name varchar(25), @Capital varchar(25), @Population numeric, @LanguageID numeric
AS
INSERT INTO Countries(Name, Capital, Population, LanguageID) VALUES (@Name, @Capital, @Population, @LanguageID)
GO

CREATE PROCEDURE UpdateCountry @ID numeric, @Name varchar(25), @Capital varchar(25), @Population numeric, @LanguageID numeric
AS
UPDATE Countries
SET Name = @Name, Capital = @Capital, Population = @Population, LanguageID = @LanguageID
WHERE CountryID = @ID
GO

CREATE PROCEDURE DeleteCountry @ID numeric
AS
DELETE FROM Countries
WHERE CountryID = @ID
Go

CREATE PROCEDURE ShowAllCountries
AS
SELECT * FROM COUNTRIES
GO