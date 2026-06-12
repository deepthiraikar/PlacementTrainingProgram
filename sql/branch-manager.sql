use InsuranceDB;

insert into Policy
values ('P4','C2','Health',25000,'B2');

update Policy
set PremiumAmount = 30000
where PolicyID='P4';