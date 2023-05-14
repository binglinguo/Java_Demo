--设计一个车辆违章系统
create table user(user_id int primary key auto_increment,name varchar(30),age int);
create table car(car_id int primary key auto_increment,name varchar(30));
create table carregulations(user_id int,car_id int,word varchar(40),time datetime);
--更新
create table user(user_id int primary key auto_increment,name varchar(30),age int);
create table car(car_id int primary key auto_increment,name varchar(30));
 create table carregulations(user_id int,car_id int,word varchar(40),time datetime,
 foreign key(user_id) references user(user_id),foreign key(car_id) references car(car_id));
--设计一个学校宿舍管理系统
create table attendance_system(user_id int,checklist_id int);
create table students(id int primary key auto_increment,name varchar(20),age int,gender varchar(20));
create table dormitorylist(dormitory_id int,student_id int,word varchar(50),time datetime);
--更新
create table dormitory(id int primary key auto_increment,dormitory_name varchar(20));
create table students(id int primary key auto_increment,name varchar(20),age int,gender varchar(20));
create table dormitorylist(id int primary key auto_increment,word varchar(50),time datetime);
create table system(dormitory_id int,students_id int,dormitorylist_id int,
    -> foreign key(dormitory_id) references dormitory(id),
    -> foreign key(students_id) references student(id),
    -> foreign key(dormitorylist_id) references dormitorylist(id));

--设计一个考勤系统
create table userlist(user_id int primary key auto_increment,user_name varchar(20),age int,gender varchar(10));
create table checklist(id int primary key auto_increment,punch varchar(50),time datetime);
create table attendance_system(user_id int,checklist_id int);
--更新
create table userlist(user_id int primary key auto_increment,user_name varchar(20),age int,gender varchar(10));
create table checklist(id int primary key auto_increment,user_id int,punch varchar(50),
time datetime,foreign key(user_id) references userlist(user_id));
