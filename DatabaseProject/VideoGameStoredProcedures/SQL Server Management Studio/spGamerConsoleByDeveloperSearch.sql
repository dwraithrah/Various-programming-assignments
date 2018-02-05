
CREATE PROCEDURE spGamerConsoleByDeveloperSearch 
	@consoleDeveloper varchar(50)
AS
BEGIN

	SELECT consoleName, consoleDeveloper
	FROM Console		
	WHERE consoleDeveloper = @consoleDeveloper
END
GO
