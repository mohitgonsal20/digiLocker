/*
create table ADMIN(
    A_ID INTEGER not null primary key,
    FIRSTNAME VARCHAR(30),
    LASTNAME VARCHAR(30),
    A_USERNAME VARCHAR(10),
    A_PASSWD VARCHAR(20)
);

create table USER(
    FIRSTNAME VARCHAR(30),
    LASTNAME VARCHAR(30),
    U_USERNAME VARCHAR(10) not null primary key ,
    U_PASSWD VARCHAR(20),
    digiid integer,
    Status varchar(30),
    Email varchar(50)


);

create table IMAGEDATA(
ID INTEGER not null primary key,
ONE VARCHAR(50),
TWO VARCHAR(50),
THREE VARCHAR(50)
);

alter table USER
modify U_USERNAME varchar(30) not null

alter table user
add digiid integer 



alter table user
add Status varchar(30)



alter table user
add Email varchar(50)

*/






