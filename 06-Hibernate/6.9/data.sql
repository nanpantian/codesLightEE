drop database hibernate;

create database hibernate;

use hibernate;

create table news_inf
(
 news_id int primary key auto_increment,
 title varchar(255),
 content varchar(255)
);

insert into news_inf
values(null , '���Java����' , '���Java���˳����ˣ���ַ��www.crazyit.org');

insert into news_inf
values(null , '�������' , '�ȵ���һ�죬����һ�¹����ˣ����������������ɡ������ķҷ���');

