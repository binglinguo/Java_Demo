--学校食堂管理系统，包含食堂表，食堂仓口表，仓口收费记录表
create table canteen_hatch(id int primary key auto_increment,name varchar(30));
create table canteen_charga(id int primary key auto_increment,hatch_id int,name varchar(30),foreigh key(hatch_id) references canteen_hatch(id));
create teble canteen_list(id int primary key auto_increment,charga_id int,canteen_id int,word varchar(30),time datetime,foreigh key(charga_id)
references canteen_charga(id),froeigh(canteen_id) references canteen_hatch(id));
--有一张员工表emp，字段：姓名name，性别sex，部门depart，工资salary。查询以下数据：
--1、查询男女员工的平均工资
select avg(salary) from emp;
--2、查询各部门的总薪水
select sum(salary) from emp group by depart;
--3、查询总薪水排名第二的部门
select depart from emp group by depart order by sum(salary) desc limit 2 offset 0;
--4、查询姓名重复的员工信息
select * from emp where name in(select name from emp group by name having count(name) >1);
--5、查询各部门薪水大于10000的男性员工的平均薪水
select depart,avg(salary) from emp where name in(select name from emp where salary > 10000) group by depart;
--写出以下数据库的查询条件【交大思诺2020届校招笔试题】
select b.name,a.grade,b.age from b left join a on a.name = b.name;
--同程艺龙2020届校招笔试题
 create table depart(depart_id int,name varchar(20));
 create table staff(staff_id int,name varchar(30),age int,depart_id int);
 create table salary(salary_id int,staff_id int,salary int,month datetime);
--：求每个部门'2016-09'月份的部门薪水总额
select depart.name,sum(salary) from salary inner join staff on salary.staff_id = staff.staff_id
join depart on depart.depart_id = staff.depart_id  where salary.month = '2016-09 0:00:00' group by
depart.depart_id;
--求每个部门的部门人数，要求输出部门名称和人数
select depart.name,count(staff.depart_id) from depart,staff where
 depart.depart_id = staff.depart_id group by staff.depart_id;
 --求公司每个部门的月支出薪资数，要求输出月份和本月薪资总数
 select dep.name,sal.month,sum(sal.salary) from depart dep inner join staff sta on
 dep.depart_id = sta.depart_id join salary sal on sal.staff_id = sta.staff_id group by
  dep.depart_id,sal.month;