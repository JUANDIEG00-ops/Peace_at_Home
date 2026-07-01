CREATE LOGIN peaceadmin
WITH PASSWORD = 'Peace12345!';
GO

USE PeaceAtHome;
GO

IF NOT EXISTS (
    SELECT *
    FROM sys.database_principals
    WHERE name = 'peaceadmin'
)
BEGIN
    CREATE USER peaceadmin FOR LOGIN peaceadmin;
END
GO

ALTER ROLE db_owner ADD MEMBER peaceadmin;
GO