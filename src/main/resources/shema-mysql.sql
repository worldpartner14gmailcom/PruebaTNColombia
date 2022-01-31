create database pruebaTN;
use pruebaTN;

drop table if exists tnColombia;



create table tncolombia(
    id int primary key auto_increment,
    nombre varchar (200) not null,
    dependencia varchar (3000),
    fecha varchar (500),
    archivo mediumblob
    
);