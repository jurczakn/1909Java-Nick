create or replace function my_sum(val_a bigint, val_b bigint)
returns integer as $$ 
begin
	return val_a + val_b;
end;
$$ language plpgsql;

select my_sum(4, 8);

create or replace function employeeCount() 
returns integer as $$
declare
	total integer;
begin
	select count(employeeid) into total from employee;
	return total;
end; $$ language plpgsql;

select employeeCount();

drop procedure single_item_purchase;

create or replace procedure single_item_purchase(in customerid int4, in my_track int4, in quantity int4)
as $$
declare
	total numeric(10, 2);
	invoiceid int4;
	unitprice numeric(10, 2);
	invoicelineid int4;
begin
	select max(invoice.invoiceid) into invoiceid from invoice;
	invoiceid := invoiceid + 1;
	select track.unitprice into unitprice from track where track.trackid = my_track;
	total := unitprice * quantity;
	insert into invoice(invoiceid, customerid, total, invoicedate) values (invoiceid, customerid, total, current_timestamp);
	select max(invoiceline.invoicelineid) into invoicelineid from invoiceline;
	invoicelineid := invoicelineid + 1;
	insert into invoiceline(invoiceid, invoicelineid, trackid, quantity, unitprice) values(invoiceid, invoicelineid, my_track, quantity, unitprice);
end; $$ language plpgsql;

call single_item_purchase(4, 1, 57);
	
update track set unitprice = 4.00 where trackid < 100 and trackid > 90;
update track set unitprice = 7.00 where trackid < 120 and trackid > 110;

select trackid, name, unitprice from track where unitprice > 5.00;

--cursor works like a pointer to values in a table

create or replace procedure expensive_tracks(in cost double precision, inout curs refcursor)
as $$
begin
	open curs for select name, unitprice from track where unitprice > cost;
end; $$ language plpgsql;

create table proc_table (
	title varchar(200),
	price numeric(10, 2)
);

do $$
declare
	curs refcursor;
	cost numeric(10, 2);
	title varchar(200);
	price numeric(10, 2);
begin
	cost := 3.50;
	call expensive_tracks(cost, curs);
	loop
		fetch curs into title;
		exit when not found;
	
		insert into proc_table (title, price) values(title, price);
	
	end loop;
end; $$ language plpgsql;

select * from proc_table;
