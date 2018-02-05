
CREATE PROCEDURE spSumOfVideoGamesByDeveloper
	@developerName varchar(50)
AS
BEGIN
	SELECT DISTINCT COUNT(videoGameName) AS NumberOfGames
	FROM [Video Game]
	WHERE developerName = @developerName
END
