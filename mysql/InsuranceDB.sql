create database InsuranceDB;
use InsuranceDB;

create table Customer(
    CustomerID varchar(10) primary key,
    CustomerName varchar(50),
    DOB date,
    ContactNo varchar(15)
);

create table PolicyType(
    PolicyType varchar(20) primary key,
    PremiumRate decimal(5,2),
    CoverageYears int
);

create table Branch(
    BranchID varchar(10) primary key,
    BranchName varchar(50),
    Manager varchar(50)
);

create table Policy(
    PolicyID varchar(10) primary key,
    CustomerID varchar(10),
    PolicyType varchar(20),
    PremiumAmount decimal(10,2),
    BranchID varchar(10),
    foreign key(CustomerID) references Customer(CustomerID),
    foreign key (PolicyType) references PolicyType(PolicyType),
    foreign key (BranchID) references Branch(BranchID)
);

insert into Customer values
('C1','Ramesh','1985-05-10','9876543210'),
('C2','Kavya','1990-09-15','9123456789');

insert into PolicyType values
('Health',5,10),
('Life',8,20),
('Vehicle',6,5);

insert into Branch values
('B1','Bangalore','Anil'),
('B2','Mysore','Sneha');

insert into Policy values
('P1','C1','Health',20000,'B1'),
('P2','C1','Vehicle',15000,'B1'),
('P3','C2','Life',50000,'B2');

select * from Customer;
select * from PolicyType;
select * from Branch;
select * from Policy;

select BranchID, max(PremiumAmount) as MaxPremium
from Policy
group by BranchID;

select CustomerID, count(*) as TotalPolicies
from Policy
group by CustomerID
having COUNT(*) > 1;

select c.CustomerID, c.CustomerName,
count(*) as TotalPolicies
from Customer c
join Policy p
on c.CustomerID=p.CustomerID
group by c.CustomerID,c.CustomerName
having COUNT(*)>1;

select BranchID, sum(PremiumAmount) as TotalPremium
from Policy
group by BranchID;

create user 'branch_manager'@'localhost'
identified by 'bm123';

create user 'policy_auditor'@'localhost'
identified by 'pa123';

create user 'policy_admin'@'localhost'
identified by 'admin123';

select User, Host from mysql.user;

grant insert, update
on InsuranceDB.Policy
to 'branch_manager'@'localhost';

grant select
on InsuranceDB.Policy
to 'policy_auditor'@'localhost';

grant all privileges
on InsuranceDB.*
to 'policy_admin'@'localhost'
with grant option;

flush privileges;

show grants for 'branch_manager'@'localhost';
show grants for 'policy_auditor'@'localhost';
show grants for 'policy_admin'@'localhost';

revoke update
on InsuranceDB.Policy
from 'branch_manager'@'localhost';
flush privileges;