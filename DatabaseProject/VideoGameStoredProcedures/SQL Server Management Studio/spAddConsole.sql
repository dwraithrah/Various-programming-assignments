
CREATE PROCEDURE spAddConsole 
	( @consoleName varchar(50), @consoleDeveloper varchar(50))
AS
SET NOCOUNT ON
	INSERT INTO dbo.Console
			(consoleName,
			consoleDeveloper)
	VALUES
		(@consoleName,
		@consoleDeveloper)
