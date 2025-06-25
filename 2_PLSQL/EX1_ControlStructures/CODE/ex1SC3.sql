BEGIN
FOR loan IN (
	SELECT L.LoanID, L.CustomerID, C.Name, L.EndDate FROM Loans L 
	JOIN Customers C on L.CustomerID = C.CustomerID WHERE L.EndDate <= SYSDATE + 30 )
LOOP 
dbms_output.put_line('Reminder for: Loan ID ' || loan.LoanID || 
		     ' for customer ' || loan.name ||
		     ' is due on ' || TO_CHAR(loan.EndDate, 'DD-MM-YYYY'));
END LOOP;
END;
/
