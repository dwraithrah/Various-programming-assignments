
ALTER PROCEDURE [dbo].[spCatalogueByVideoGameNameSearch]
	-- Add the parameters for the stored procedure here
	@videoGameName varchar(50)
AS
BEGIN
	SELECT userName, videoGameName, consoleName, developerName, owns, wantsToOwn, hasPlayed,wantsToPlay, rating, comment
	FROM   hasCatalogueOf
	WHERE videoGameName = @videoGameName
END
