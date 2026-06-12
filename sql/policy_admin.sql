use InsuranceDB;
DROP TABLE Branch;
GRANT SELECT
ON InsuranceDB.Customer
TO 'policy_auditor'@'localhost';