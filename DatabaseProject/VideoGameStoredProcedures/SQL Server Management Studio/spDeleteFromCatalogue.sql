
CREATE PROCEDURE spDeleteFromCatalogue
	@userName varchar(50), @videoGameName varchar(50), @consoleName varchar(50), @developerName varchar(50)
AS
BEGIN
	DELETE FROM hasCatalogueOf
	WHERE userName = @userName AND videoGameName = @videoGameName AND consoleName =@consoleName AND developerName = @developerName
END
GO
