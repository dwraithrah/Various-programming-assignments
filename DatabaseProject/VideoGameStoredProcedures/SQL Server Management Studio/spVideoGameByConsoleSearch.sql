
CREATE PROCEDURE spVideoGameByConsoleSearch
	@consoleName varchar(50)
AS
BEGIN

	SELECT videoGameName, dbo.Console.consoleName, dbo.Console.consoleDeveloper
	FROM [Video Game]INNER JOIN Console ON dbo.[Video Game].consoleName = dbo.Console.consoleName
	WHERE dbo.[Video Game].consoleName = @consoleName
END
GO
