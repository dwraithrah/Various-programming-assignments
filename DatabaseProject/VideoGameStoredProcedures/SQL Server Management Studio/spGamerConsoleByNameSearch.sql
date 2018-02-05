
CREATE PROCEDURE spGamerConsoleByNameSearch
	@consoleName varchar(50)
AS
BEGIN

	SELECT consoleName, consoleDeveloper
	FROM Console
	WHERE consoleName = @consoleName
END
GO
