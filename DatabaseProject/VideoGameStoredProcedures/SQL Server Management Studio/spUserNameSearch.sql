
CREATE PROCEDURE spUserNameSearch 
	@userName varchar(50)
AS
BEGIN

	SELECT dbo.[Video Game Enthusiast].userName, dbo.[Video Game Enthusiast].age, dbo.[Video Game Enthusiast].gender, dbo.hasCatalogueOf.videoGameName,
	dbo.hasCatalogueOf.consoleName, dbo.hasCatalogueOf.rating, dbo.hasCatalogueOf.comment
	FROM  [Video Game Enthusiast] INNER JOIN hasCatalogueOf ON dbo.[Video Game Enthusiast].userName = hasCatalogueOf.userName
	WHERE dbo.hasCatalogueOf.userName = @userName
END
GO
