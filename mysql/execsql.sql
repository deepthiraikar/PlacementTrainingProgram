use PTP2026;

insert into creditcard values(12340010,'Prakash',5000,'active');
select * from creditcard;

update creditcard set card_limit=10000 where card_no=1234005;
update creditcard set card_status='active' where card_no=1234002;


