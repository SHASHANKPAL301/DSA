# Write your MySQL query statement below
SELECT e1.name from employee e
join employee e1 on e.managerId=e1.Id
group by e1.id having count(e.id)>=5;