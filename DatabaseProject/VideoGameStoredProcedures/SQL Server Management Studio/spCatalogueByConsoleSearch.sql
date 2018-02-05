CREATE PROCEDURE spCatalogueByConsole
	@consoleName varchar(50)
AS
BEGIN

	SELECT *
	FROM dbo.hasCatalogueOf 
	WHERE consoleName = @consoleName
END
GO