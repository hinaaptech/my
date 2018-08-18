create database HMS

truncate table doctor
use HMS
select * from signup

Create table signup
(
first_name varchar(50), 
last_name varchar(50),
username varchar(50) primary key,
password varchar(50),
adress varchar(50),
city varchar(50),
email varchar(50),
gender varchar(50)
)

Create table patient
(
id varchar(50) primary key, 
prefix varchar(50),
fname varchar(50) ,
lname varchar(50),
dob varchar(50),
gender varchar(50),
country varchar(50),
city varchar(50),
address varchar(50),
pat_status varchar(50),
phone varchar(50),
mobile varchar(50),
email varchar(50),
doctor varchar(50),
type varchar(50)

)

select * from patient

Create table doctor
(
id varchar(50) primary key, 
fname varchar(50) ,
lname varchar(50),
dob varchar(50),
gender varchar(50),
country varchar(50),
city varchar(50),
address varchar(50),
zip int,
speciality varchar(50),
phone int,
mobile int,
email varchar(50),
nic int,
maritial varchar(50),
employee varchar(50),

timing varchar(50)
)

select * from doctor

truncate table doctor

Create table bill
(
id int identity(001,1),
name varchar(50), 
duration varchar(50),
hours varchar(50),
checkup varchar(50),
perday varchar(50),
total varchar(50)
)
select * from bill


Create table history
(
username varchar(50), 
login varchar(50),
logout varchar(50) 
)

select * from history