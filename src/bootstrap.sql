create table events (id int not null auto_increment primary key, dt datetime, name varchar(50));
create table people (id int not null auto_increment primary key, name varchar(50));
create table event_person (event_id int not null, person_id int not null);
insert into events(dt,name) values ('2009-12-31','New Years Eve');
insert into events(dt,name) values ('2010-1-1','New Years Day');
insert into people(name) values ('John Smith');
insert into people(name) values ('Jane Doe');
insert into event_person(event_id,person_id) select events.id, people.id from events,people where people.name='Jane Doe';
