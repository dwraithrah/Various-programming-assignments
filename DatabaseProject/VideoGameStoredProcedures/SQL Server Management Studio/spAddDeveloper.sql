

CREATE PROCEDURE spAddDeveloper
	(@developerName varchar(50), @developerAddress varchar(50))
AS
SET NOCOUNT ON
	INSERT INTO Developer
			(developerName,
			developerAddress)
	VALUES
		(@developerName,
		@developerAddress)
