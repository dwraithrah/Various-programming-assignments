
CREATE PROCEDURE spCatalogueByRatingRangeSearch
	@lowerRating int, @upperRating int
AS
BEGIN
	SELECT [Video Game Enthusiast].userName, hasCatalogueOf.videoGameName, hasCatalogueOf.consoleName, hasCatalogueOf.developerName,hasCatalogueOf.owns,
		hasCatalogueOf.wantsToOwn, hasCatalogueOf.hasPlayed, hasCatalogueOf.wantsToPlay, hasCatalogueOf.rating, hasCatalogueOf.Comment
	FROM dbo.hasCatalogueOf INNER JOIN dbo.[Video Game Enthusiast] ON hasCatalogueOf.userName = [Video Game Enthusiast].userName
	WHERE [hasCatalogueOf].rating >= @lowerRating AND [hasCatalogueOf].rating <= @upperRating
END
