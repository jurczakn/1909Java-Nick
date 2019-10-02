create table sample_table(

	sample_id integer primary key,
	sample_value varchar (255) unique

); --primary key(sample_id, sample_value);

create table composite_key_example(

	key_value_one serial,
	key_value_two serial,
	other_value text,
	primary key (key_value_one, key_value_two)
	
);

select * from composite_key_example;

insert into composite_key_example (other_value) values('one');
insert into composite_key_example (other_value) values('two');
insert into composite_key_example (other_value) values('three');
insert into composite_key_example (key_value_one, other_value) values(7, 'one');
insert into composite_key_example values(8);




select * from sample_table;

insert into sample_table values(1, 'this is my value');

insert into sample_table (sample_id) values(2);

