
CREATE PROCEDURE spSumOfVideoGamesByDeveloperAndConsole
	@developerName varchar(50), @consoleName varchar(50)
AS
BEGIN
	SELECT DISTINCT COUNT(videoGameName) AS NumberOfGames
	FROM [Video Game]
	WHERE developerName = @developerName AND consoleName = @consoleName
END
