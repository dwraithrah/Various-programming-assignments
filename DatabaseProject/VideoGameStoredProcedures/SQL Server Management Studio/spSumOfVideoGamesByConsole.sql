
CREATE PROCEDURE spSumOfVideoGamesByConsole
	@consoleName varchar(50)
AS
BEGIN
	SELECT DISTINCT COUNT(videoGameName) AS NumberOfGames
	FROM [Video Game]
	WHERE consoleName = @consoleName
END
