create sequence employee_id_seq start 9;

insert into employee (employeeid, firstname, lastname) values((select nextval('employee_id_seq')), 'Blake', 'K');

select * from employee;

create or replace 
	function insert_into_employee()
	returns trigger as $$
	begin
		if(TG_OP = 'INSERT') then
			new.employeeid = (select nextval('employee_id_seq'));
		end if;
		return new;
	end;
$$ language plpgsql;

create trigger employee_insert
	before insert on employee
	for each row
	execute procedure insert_into_employee();

insert into employee(employeeid, firstname, lastname) values(-1, 'Alex', 'R');

