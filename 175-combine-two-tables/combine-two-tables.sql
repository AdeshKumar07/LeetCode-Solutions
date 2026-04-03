# Write your MySQL query statement below
-- select firstName,lastName,city,state from Person,Address where Person.personId=Address.personId;
 select  Person.firstName, Person.lastName,Address.city,Address.state from Person left join Address on Person.personId=Address.personId;