create table characters(
  id integer primary key,
  name string
  );

create table episodes(
  id integer primary key,
  name string
  );

create table appears(
  id integer primary key,
  character integer,
  episode integer,
  foreign key(character) references characters(id),
  foreign key(episode) references episodes(id)
  ); 

create table friends(
  id integer primary key,
  character1 integer,
  character2 integer,
  foreign key(character1) references characters(id),
  foreign key(character2) references characters(id)
  ); 

create table droids(
  id integer primary key,
  primaryFunction string,
  foreign key(id) references character(id)
  ); 

create table humans(
  id integer primary key,
  homePlanet string,
  foreign key(id) references character(id)
  ); 

insert into episodes(id,name) values
  (4,"NEWHOPE"),
  (5,"EMPIRE"),
  (6,"JEDI");

insert into characters(id, name) values 
  (1000, "Luke Skywalker"), 
  (1001, "Darth Vader"), 
  (1002, "Han Solo"), 
  (1004, "Wilhuff Tarkin"), 
  (1003, "Leia Organa"), 
  (2000, "C-3PO"), 
  (2001, "R2-D2"); 

insert into humans(id, homePlanet) values 
  (1000, "Tatooine"), 
  (1001, "Tatooine"), 
  (1002, null), 
  (1003, "Alderaan"), 
  (1004, null); 

insert into friends(character1, character2) values 
  (1000,1002),(1000,1003),(1000,2000),(1000,2001), 
  (1001,1004), 
  (1002,1000),(1002,1003),(1002,2001), 
  (1003,1000),(1003,1002),(1003,2000),(1003,2001), 
  (1004,1001); 

insert into droids(id, primaryFunction) values 
  (2000, "Protocol"), 
  (2001, "Astromech"); 

insert into appears(character, episode) values 
  (1000,4),(1000,5),(1000,6), 
  (1001,4),(1001,5),(1001,6), 
  (1002,4),(1002,5),(1002,6), 
  (1003,4),(1003,5),(1003,6), 
  (1004,4),(1004,5),(1004,6), 
  (2000,4),(2000,5),(2000,6), 
  (2001,4),(2001,5),(2001,6); 
