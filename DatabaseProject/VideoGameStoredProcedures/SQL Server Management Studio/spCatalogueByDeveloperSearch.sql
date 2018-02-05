CREATE PROCEDURE spCatalogueByDeveloper
	@developerName varchar(50)
AS
BEGIN

	SELECT *
	FROM dbo.hasCatalogueOf 
	WHERE developerName = @developerName
END
GO