CREATE DATABASE TrainDestinations;

CREATE TABLE Destinations
( SerialNO INT PRIMARY KEY,
Destinations VARCHAR(20) );

use TrainDestinations;
INSERT INTO Destinations (SerialNO,Destinations)
values ('1', "Churchgate");

select * from Destinations;

INSERT INTO Destinations (SerialNO,Destinations)
values ('2', "Mumbai Central"),('3', "Dadar"),('4', "Bandra"),
('5', "Andheri"),('6', "Borivali"),('7', "Dahisar"),('8', "Mira Road"),
('9', "Bhayandar"),('10', "Vasai");

update Destinations SET Destinations="Marine Lines" where SerialNO = '2';
	
select * from sakila;


