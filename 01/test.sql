drop database javaee;
create database javaee;
use javaee;

create table news_inf
(
 news_id int primary key auto_increment,
 news_title varchar(255)
);

insert into news_inf
values
(null , '���Java����'),
(null , 'crazyit.org');
