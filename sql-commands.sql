-- create a database
create database ust_db;

-- switch to the database
use ust_db;

-- create a table

create table trainee(id int auto_increment primary key, trainee_name varchar(50), location varchar(50));

-- insert some records

insert into trainee(trainee_name,location) values ('Sandra John','Kerala');

insert into trainee(trainee_name, location) values ('Shreya Gupta', 'Bangalore'),
													('Suhas','Bengaluru'),
                                                    ('Gururaj','Bengaluru'),
                                                    ('Rose','Kerala'),
                                                    ('Vishnu','Kerala'),
                                                    ('Archit','Bangalore'),
                                                    ('Ashwini','Bengaluru'),
                                                    ('Varsha','Bangalore'),
                                                    ('SUNNY','BANGALORE'),
                                                    ('Abhishek','Bangalore');

-- retrieve the records

select * from trainee;

												
											
-- update the data
 
update trainee set location='Bengaluru' where location='Bangalore';

update trainee set  location ='Kochi' where id =5;

update trainee set location='Kozhikode' where id=6;

update trainee set  location ='Kochi' where id=1;


-- truncate records

truncate table trainee;

-- drop the table

drop table trainee;

-- alter a table

-- create a new column gender

alter table trainee add gender char(6);

update  trainee set  gender = 'F' WHERE id IN(1,2,5,8,9);

update trainee set gender='M' WHERE ID IN (3,4,6,7,10,11);

-- delete some records

delete from trainee where id = 12;

-- retrieveing data conditionally

-- find all the trainees from Bengaluru 

select * from trainee where location ='Bengaluru';

-- find all the trainees from Bengaluru who are female


select * from trainee where location='Bengaluru' and gender ='F';
 

-- Group Functions

-- count the trainees location wise

select location, count(id) as 'total trainees' from trainee group by location;


-- find the location where most trainees belong to

select location, COUNT(*) from trainee group by location order by 2 desc limit 1;


-- create a new table project with columns id, title

create  table project(id int auto_increment primary key,title varchar(40));

-- insert some data

insert into project (title) values ('Library Management System');

insert into project(title) values('Hospital Management');

insert into project(title) values('Amazon Clone');

insert into project(title) values('Baking App');


-- add a new column project_id to trainee

Alter table trainee add project_id int;


-- create a frreign key

alter table trainee add constraint fk_project_id foreign key(project_id) references project(id);


update trainee set project_id=1 where id=2;


-- find the project that does not have any trainee
 
select p.id, title from project p left join trainee t on p.id = t.project_id where t.project_id IS NULL;

select p.id, title from trainee t right join project p on p.id = t.project_id where t.project_id IS NULL;


