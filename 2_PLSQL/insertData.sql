BEGIN
    
    INSERT INTO Customers VALUES (1, 'Arghya Banerjee', TO_DATE('15-03-1950', 'DD-MM-YYYY'), 12000, SYSDATE, 'N');
    INSERT INTO Customers VALUES (2, 'Aditya Lahiri', TO_DATE('22-07-1990', 'DD-MM-YYYY'), 3000, SYSDATE, 'N');
    INSERT INTO Customers VALUES (3, 'Raj Hajrah', TO_DATE('10-11-1975', 'DD-MM-YYYY'), 7000, SYSDATE, 'N');
    INSERT INTO Customers VALUES (4, 'Soham Mukherjee', TO_DATE('01-01-1940', 'DD-MM-YYYY'), 9000, SYSDATE, 'N');

    
    INSERT INTO Accounts VALUES (101, 1, 'Savings', 12000, SYSDATE);
    INSERT INTO Accounts VALUES (102, 2, 'Checking', 1000, SYSDATE);
    INSERT INTO Accounts VALUES (103, 3, 'Savings', 3000, SYSDATE);
    INSERT INTO Accounts VALUES (104, 4, 'Savings', 4000, SYSDATE);

   
    INSERT INTO Transactions VALUES (1001, 101, TO_DATE('01-06-2024', 'DD-MM-YYYY'), 500, 'Credit');
    INSERT INTO Transactions VALUES (1002, 102, TO_DATE('03-06-2024', 'DD-MM-YYYY'), 200, 'Debit');
    INSERT INTO Transactions VALUES (1003, 103, TO_DATE('05-06-2024', 'DD-MM-YYYY'), 150, 'Credit');

    
    INSERT INTO Loans VALUES (201, 1, 10000, 5.5, TO_DATE('01-01-2023', 'DD-MM-YYYY'), TO_DATE(SYSDATE + 10, 'DD-MM-YYYY'));
    INSERT INTO Loans VALUES (202, 2, 15000, 6.0, TO_DATE('01-02-2024', 'DD-MM-YYYY'), TO_DATE(SYSDATE + 45, 'DD-MM-YYYY'));
    INSERT INTO Loans VALUES (203, 4, 8000, 7.0, TO_DATE('01-01-2023', 'DD-MM-YYYY'), TO_DATE(SYSDATE + 5, 'DD-MM-YYYY'));

   
    INSERT INTO Employees VALUES (301, 'Snehashis Mandal', 'Manager', 80000, 'Finance', TO_DATE('01-01-2020', 'DD-MM-YYYY'), NULL);
    INSERT INTO Employees VALUES (302, 'Sayan Das', 'Clerk', 40000, 'Customer Service', TO_DATE('10-03-2022', 'DD-MM-YYYY'), NULL);
    INSERT INTO Employees VALUES (303, 'Soumya Mallick', 'Analyst', 60000, 'IT', TO_DATE('15-07-2021', 'DD-MM-YYYY'), NULL);

    COMMIT;
dbms_output.put_line('Data inserted into tables successfully');
END;
/