CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
FOR acc IN(SELECT AccountID, Balance FROM Accounts WHERE AccountType = 'Savings')
LOOP
UPDATE Accounts SET Balance = Balance + (acc.Balance * 0.01), 
		    LastModified = SYSDATE
WHERE AccountID = acc.AccountID;
END LOOP;
COMMIT;
dbms_output.put_line('Accounts table and Balance updated');
END;
/
