--超过经理收入的员工
select
    e1.name as employee
from
    employee e1,employee e2
where e1.managerid = e2.id and e1.salary > e2.salary;
--第二高的薪水 如果不存在返回null未解决
select
    e1.salary as secondhighestsalary
from
    employee e1
group by salary
order by salary
limit 1 offset 1;
--完美解决
select
    (select
        salary
    from
        employee
    group by
        salary
    order by
        salary
    desc limit 1 offset 1)
as
    secondhighestsalary;