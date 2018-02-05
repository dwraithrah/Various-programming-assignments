
CREATE PROCEDURE spDeveloperByNameSearch 
	@developerName varchar(50)
AS
BEGIN

	SELECT developerName, developerAddress
	FROM Developer
	WHERE developerName = @developerName
END
GO
