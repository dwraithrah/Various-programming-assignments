
CREATE PROCEDURE spModifyCatalogue
	@userName varchar(50), @videoGameName varchar(50), @developerName varchar(50), @consoleName varchar(50), 
	@owns bit, @wantsToOwn bit, @hasPlayed bit, @wantsToPlay bit, @rating int, @comment bit
AS
BEGIN
	IF @owns IS NOT NULL
		UPDATE hasCatalogueOf SET owns = @owns WHERE userName = @userName AND videoGameName = @videoGameName AND developerName = @developerName
			AND  consoleName = @consoleName
	IF @wantsToOwn IS NOT NULL
		UPDATE hasCatalogueOf SET wantsToOwn = @wantsToOwn WHERE userName = @userName AND videoGameName = @videoGameName AND developerName = @developerName
			AND  consoleName = @consoleName
	IF @wantsToPlay IS NOT NULL
		UPDATE hasCatalogueOf SET wantsToPlay = @wantsToPlay WHERE userName = @userName AND videoGameName = @videoGameName AND developerName = @developerName
			AND  consoleName = @consoleName
	IF @rating IS NOT NULL
		UPDATE hasCatalogueOf SET rating = @rating WHERE userName = @userName AND videoGameName = @videoGameName AND developerName = @developerName
			AND  consoleName = @consoleName
	IF @comment IS NOT NULL
		UPDATE hasCatalogueOf SET comment = @comment WHERE userName = @userName AND videoGameName = @videoGameName AND developerName = @developerName
			AND  consoleName = @consoleName
	IF @hasPlayed IS NOT NULL
		UPDATE hasCatalogueOf SET hasPlayed = @hasPlayed WHERE userName = @userName AND videoGameName = @videoGameName AND developerName = @developerName
			AND  consoleName = @consoleName
END
GO
