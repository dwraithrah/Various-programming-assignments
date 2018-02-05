
CREATE PROCEDURE spAverageGameRatingByGameName 
	@videoGameName varchar(50)
AS
BEGIN
	SELECT AVG(rating) AS AverageRating
	FROM hasCatalogueOf
	WHERE videoGameName = @videoGameName
END
GO
