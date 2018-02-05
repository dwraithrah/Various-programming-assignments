
CREATE PROCEDURE spVideoGameByUserNameSearch
	@userName varchar(50)
AS
BEGIN
	SELECT dbo.[hasCatalogueOf].userName, dbo.[Video Game].videoGameName, dbo.[Video Game].consoleName
	FROM dbo.[hasCatalogueOf] INNER JOIN dbo.[Video Game] ON dbo.[hasCatalogueOf].videoGameName = dbo.[Video Game].videoGameName
	WHERE dbo.hasCatalogueOf.userName = @userName
END
GO
