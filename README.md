This project present CRUD operations of employees
Below is the script of DB works :
create database employeemanagementsystem;

use  employeemanagementsystem;

create table employee(
		id int NOT NULL AUTO_INCREMENT,
        name varchar(50),
        email varchar(50) ,
        department varchar(50),
        age varchar(50),
        PRIMARY KEY (ID));
