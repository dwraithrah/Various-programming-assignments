
CREATE PROCEDURE spUserNameByVideoGameSearch 
	@videoGameName varchar(50)
AS
BEGIN

	SELECT dbo.[hasCatalogueOf].userName, dbo.hasCatalogueOf.videoGameName,
	dbo.hasCatalogueOf.consoleName, dbo.hasCatalogueOf.developerName
	FROM   hasCatalogueOf 
	WHERE hasCatalogueOf.videoGameName = @videoGameName
END
