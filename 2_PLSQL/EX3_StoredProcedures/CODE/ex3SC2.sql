CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus( deptName IN VARCHAR2, bonus IN NUMBER) IS
BEGIN
UPDATE Employees
SET Salary = Salary + (Salary * bonus/100),
    Bonus = bonus
WHERE Department = deptName;
COMMIT;
dbms_output.put_line('Employees table updated for Salary');
END;
/
