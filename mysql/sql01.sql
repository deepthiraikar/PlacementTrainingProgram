create database PTP2026;
use PTP2026;
create table creditcard(
    card_no bigint not null primary key,
    card_holder varchar(255) not null,
    card_limit int not null,
    card_status varchar(255) default 'active'
);

insert into creditcard values (1234001,"Deepthi",25000,'active');
insert into creditcard values (1234002,"Disha",30000,'blocked');
insert into creditcard values (1234003,"Dhriti",25000,'active');
insert into creditcard values (1234004,"Diya",5000,'active');
insert into creditcard values (1234005,"Ganya",10000,'blocked');
select * from creditcard;

create table merchant(
    merchant_id int not null primary key,
    merchant_name varchar(255) not null,
    merchant_acc bigint not null
);
insert into merchant values (10001,"Deepthi",2603001);
insert into merchant values (10002,"Disha",2603002);
insert into merchant values (10003,"Bob",2603003);
insert into merchant values (10004,"Alice",2603004);
select * from merchant;

create table transactions(
    t_id bigint not null primary key auto_increment,
    t_date date not null,
    t_amount double not null,
    t_by bigint not null,
    t_to int not null,
    foreign key(t_by) references creditcard(card_no),
    foreign key(t_to) references merchant(merchant_id)
);
describe transactions;

insert into transactions values(101,'2026-01-01',5000,'1234005','10001');
insert into transactions values(102,'2026-02-03',500,'1234003','10004');
insert into transactions values(103,'2026-04-05',1000,'1234002','10002');
insert into transactions values(104,'2026-03-04',2500,'1234004','10003');
select * from transactions;

delete from transactions where t_by='1234003';
select card_holder, transactions.t_date,t_amount
from creditcard left join
transactions on card_no= transactions.t_by;

delete from transactions where t_to='10003';
select merchant_name,t_amount
from transactions right join
merchant on t_to= merchant.merchant_id;

select card_holder,transactions.t_id,merchant.merchant_name,transactions.t_amount
from creditcard left join transactions 
on card_no=transactions.t_by left join merchant
on transactions.t_to=merchant.merchant_id
union
select card_holder,transactions.t_id,merchant.merchant_name,transactions.t_amount
from creditcard right join transactions 
on card_no=transactions.t_by right join merchant
on transactions.t_to=merchant.merchant_id;

insert into transactions values(105,now(),1500,'1234002','10002');
insert into transactions values(106,now(),4000,'1234004','10001');

select creditcard.card_holder, sum(t_amount)
as spent from transactions join creditcard
on t_by=creditcard.card_no
group by creditcard.card_holder;

select merchant.merchant_name, avg(t_amount)
as AverageIncome from transactions join merchant
on t_to=merchant.merchant_id
group by merchant.merchant_name;

select creditcard.card_holder, max(t_amount) 
as MaxSpent from transactions join creditcard
on t_by=creditcard.card_no 
group by creditcard.card_holder;

select merchant_name, count(t_id) as
bills from merchant left join transactions
on merchant_id=transactions.t_to
group by merchant_name;

create user 'head' identified by 'manage123';
create user 'holder' identified by 'custom23';
create user 'executive' identified by 'exec123';

show grants;

grant update, select on creditcard to 'executive';

revoke update on creditcard from executive;

grant create on PTP2026 to 'head';

