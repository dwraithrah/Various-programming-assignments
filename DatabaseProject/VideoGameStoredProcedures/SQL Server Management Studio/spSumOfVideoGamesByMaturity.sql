
CREATE PROCEDURE spSumOfVideoGamesByMaturity
	@maturityRating varchar(50)
AS
BEGIN
	SELECT DISTINCT COUNT(videoGameName) AS NumberOfGames
	FROM [Video Game]
	WHERE maturityRating = @maturityRating
END
GO
