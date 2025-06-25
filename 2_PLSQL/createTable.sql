begin
execute immediate 'create table emp(Emp_ID number, Emp_name varchar2(20))';
dbms_output.put_line('Table created successfully');
end;
/