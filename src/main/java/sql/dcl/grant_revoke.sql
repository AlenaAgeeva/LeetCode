--You have a user named john_doe. Grant him SELECT and INSERT privileges on a table named employees.
grant select, insert on employees to john_doe;
--You need to revoke the INSERT privilege from the user john_doe on the employees table.
revoke insert on employees from john_doe;
--A user named admin_user needs full control over the departments table. Grant him all privileges.
grant all privileges on departments to admin_user;
--You need to revoke all privileges from the user admin_user on the departments table.
revoke all privileges on departments from admin_user;
--You want to grant SELECT privilege on the projects table to both alice and bob.
grant select on projects to alice, bob;
--You need to revoke the SELECT privilege from both alice and bob on the projects table.
revoke select on projects from alice, bob;
--Grant USAGE privilege on a schema named finance to user jane_smith.
grant USAGE on schema finance to jane_smith;
--You need to revoke the USAGE privilege on the finance schema from jane_smith.
revoke USAGE on schema finance from jane_smith;