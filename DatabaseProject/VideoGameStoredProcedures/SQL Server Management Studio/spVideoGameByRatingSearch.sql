
CREATE PROCEDURE spVideoGameByRatingSearch
	@rating int
AS
BEGIN
	SELECT dbo.[Video Game].videoGameName, dbo.[Video Game].consoleName, dbo.hasCatalogueOf.rating
	FROM dbo.[hasCatalogueOf] INNER JOIN dbo.[Video Game] ON dbo.[hasCatalogueOf].videoGameName = dbo.[Video Game].videoGameName
	WHERE dbo.hasCatalogueOf.rating = @rating
END
