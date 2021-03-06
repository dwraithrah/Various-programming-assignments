
CREATE PROCEDURE spSumOfVideoGamesByGenreAndConsole
	@genre varchar(50), @consoleName varchar(50)
AS
BEGIN
	SELECT DISTINCT COUNT(videoGameName) AS NumberOfGames
	FROM [Video Game]
	WHERE genre = @genre AND consoleName = @consoleName
END
