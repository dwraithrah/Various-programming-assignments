
CREATE PROCEDURE spDevNotPlay
AS
BEGIN
	SELECT        dbo.hasCatalogueOf.userName, dbo.hasCatalogueOf.videoGameName, dbo.hasCatalogueOf.rating, dbo.hasCatalogueOf.comment, dbo.[Video Game Enthusiast].age, 
                         dbo.[Video Game Enthusiast].gender, dbo.hasCatalogueOf.wantsToPlay
FROM            dbo.hasCatalogueOf INNER JOIN
                         dbo.[Video Game Enthusiast] ON dbo.hasCatalogueOf.userName = dbo.[Video Game Enthusiast].userName
WHERE        (dbo.hasCatalogueOf.wantsToPlay = 0)
END
GO
