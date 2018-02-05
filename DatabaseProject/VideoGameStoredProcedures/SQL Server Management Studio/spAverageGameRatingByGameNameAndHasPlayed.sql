
CREATE PROCEDURE spAverageGameRatingByGameNameAndHasPlayed
	@videoGameName varchar(50)
AS
BEGIN
	SELECT AVG(rating) AS AverageRating
	FROM hasCatalogueOf
	WHERE videoGameName = @videoGameName AND hasPlayed = 1
END
