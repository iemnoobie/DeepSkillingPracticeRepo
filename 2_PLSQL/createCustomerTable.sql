begin
execute immediate 'CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    DOB DATE,
    Balance NUMBER,
    LastModified DATE
)';
dbms_output.put_line('Customer table created successfully');
end;
/