UPDATE Customer
SET CustomerName = 'Jack'
Where Country = 'Maxico';

Delete FROM Customer
Where CustomerId = '1';

SELECT TOP 3* FROM Customer;

SELECT Min(CustomerId)
FROM Customer;

SELECT MAX(Price)
FROM Customer;

SELECT Count(Country)
FROM Customer;

SELECT SUM(Quntity)
FROM Customer
Where CustomerId > 5;

SELECT AVG(Price)
FROM Customer;

SELECT * FROM Customer
Where CustomerName LIKE 'A%'; --Start name with A

SELECT CustomerName FROM Customer
Where CustomerName LIKE 'L_nd_'; --use for wildcart charecter

SELECT *
FROM Customer
Where Country IN ('India', 'Mexico','Germany');

SELECT * FROM Customer
Where Country NOT IN ('France');

SELECT * FROM Product
Where Price BETWEEN 100 AND 200;

SELECT * FROM Product
Where CustomerId NOT BETWEEN 10 AND 20
ORDER BY CustomerName;

SELECT Order.OrderID ,Customer.CustomerId,Order.OrderDate
FROM Order
INNER JOIN Customer 
ON Order.CustomerId = Customer.CustomerId;

SELECT Order.OrderID, Customer.CustomerId , Order.OrderDate
FROM Order
LEFT JOIN Product 
ON Order.CustomerId = Customer.CustomerId;

SELECT Order.OrderID, Order.OrderDate, Customer.CustomerName
FROM Order
RIGHT JOIN Customer
ON Order.CustomerId = Customer.CustomerId;

SELECT Order.OrderID, Customer.CustomerName, Order.OrderDate
FROM Order
FULL JOIN Customer
ON Order.CustomerId = Customer.CustomerId;

SELECT City FROM Customer
UNION
SELECT City FROM Product
ORDER BY City;

SELECT City FROM Customer
UNION ALL
SELECT City FROM Product
ORDER BY City;        --it provide the dublicate record also

SELECT Count(CustomerId) Country
FROM Customer
GROUP BY Country;

SELECT Country, CustomerName
FROM Customer
Where Country = 'India'
GROUP BY Country , CustomerName
HAVING Count(Country) > 5
ORDER BY CustomerName;

SELECT SuppilerName
FROM Suppiler
Where EXISTS (SELECT ProductName FROM Product Where Suppiler.SuppilerID = Product.SuppilerID AND Price < 20);

SELECT CustomerName 
FROM Customer
Where CustomerId = ANY (SELECT CustomerId FROM Product Where Price = 10);

SELECT ProductName 
FROM Customer
Where ProductID = ALL (SELECT ProductID FROM Product Where ProductID > 90);

SELECT * 
INTO Seller [IN Sell]
FROM Product
Where Price > 12;   -- Select into use to copy data from one table to another table 

SELECT ProductID , ProductName 
INTO Seller [IN Sell]
FROM Product 
Where Price > 1;

INSERT INTO Seller(ProductID , ProductName)
SELECT * FROM Product
Where ProductID > 22;

CREATE DATABASE SellSYStem;

DROP DATABASE SellSYStem;

BACKUP DATABASE SellSYStem
TO DISK "File_Path";

CREATE TABLE Seller (ID Int(255) , ProductName Varchar(255) Primary Key);

DROP TABLE Seller;

TRUNCATE TABLE Seller;

ALTER TABLE Seller
ADD Price Int(255);

ALTER TABLE Seller
ALTER COLUMN Price Int(255);

CREATE VIEW [COMO] AS
SELECT ProductID ,ProductName
FROM Product
Where ID > 13
ORDER BY ProductName DES; 