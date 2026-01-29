-- Write your PostgreSQL query statement below
select D.name as Department,
       Employee.name as Employee,
       max(salary) as Salary from Employee
join Department D on Employee.departmentId = D.id
where salary >= (select max(salary) from Employee where Employee.departmentId = D.id group by departmentId )
group by D.name, Employee.name order by Employee.name desc;
