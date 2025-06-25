CREATE OR REPLACE PROCEDURE TransferFunds( frmAccountID IN NUMBER, toAccountID IN NUMBER, amt IN NUMBER) IS
frmBalance NUMBER;
BEGIN
SELECT Balance INTO frmBalance FROM Accounts WHERE AccountID = frmAccountID FOR UPDATE;

IF frmBalance >= amt THEN 
UPDATE Accounts SET Balance = Balance - amt WHERE AccountID = frmAccountID;
UPDATE Accounts SET Balance = Balance + amt WHERE AccountID = toAccountID;

COMMIT;
dbms_output.put_line('Transfer successfull');
ELSE
dbms_output.put_line('Not sufficient balance in Account ID: ' || frmAccountID);
END IF;
END;
/
