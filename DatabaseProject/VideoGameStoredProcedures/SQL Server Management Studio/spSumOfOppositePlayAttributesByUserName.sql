
CREATE PROCEDURE spSumOfOppositePlayAttributesByUserName 
	@userName varchar(50)
AS
BEGIN
	SELECT DISTINCT userName,
		(SELECT COUNT(hasPlayed) FROM hasCatalogueOf WHERE hasPlayed = 0 AND userName = @userName) AS HasNotPlayed,
		(SELECT COUNT(wantsToPlay) FROM hasCatalogueOf WHERE wantsToPlay = 0 AND userName = @userName) AS DoesNotWantToPlay,
		(SELECT COUNT(owns) FROM hasCatalogueOf WHERE owns = 0 AND userName = @userName) AS DoesNotOwn,
		(SELECT COUNT(wantsToOwn) FROM hasCatalogueOf WHERE wantsToOwn = 0 AND userName = @userName) AS DoesNotWantToOwn
	FROM hasCatalogueOf
	WHERE userName = @userName
END
