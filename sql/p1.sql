create database Nitte2026;
use Nitte2026;
create table creditcard(
    card_no bigint not null primary key,
    card_holder varchar(255) not null,
    card_limit int not null,
    card_status varchar(255) default 'active'
);
select * from creditcard;

create table merchant(
    merchant_id int not null primary key,
    merchant_name varchar(255) not null,
    merchant_acc bigint not null
);
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
select * from transactions;
