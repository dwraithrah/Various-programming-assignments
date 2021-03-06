CREATE PROCEDURE spSumOfVideoGamesByMaturityAndConsole
	@maturityRating varchar(50), @consoleName varchar(50)
AS
BEGIN
	SELECT DISTINCT COUNT(videoGameName) AS NumberOfGames
	FROM [Video Game]
	WHERE maturityRating = @maturityRating AND consoleName = @consoleName
END
