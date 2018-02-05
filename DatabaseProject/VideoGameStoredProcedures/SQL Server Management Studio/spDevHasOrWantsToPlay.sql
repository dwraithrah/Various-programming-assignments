
CREATE PROCEDURE spDevHasOrWantsToPlay
AS
BEGIN
	SELECT        dbo.hasCatalogueOf.videoGameName, dbo.hasCatalogueOf.userName, dbo.hasCatalogueOf.hasPlayed, dbo.hasCatalogueOf.wantsToPlay, dbo.hasCatalogueOf.rating, dbo.hasCatalogueOf.comment, 
                         dbo.[Video Game Enthusiast].age, dbo.[Video Game Enthusiast].gender
FROM            dbo.hasCatalogueOf INNER JOIN
                         dbo.[Video Game Enthusiast] ON dbo.hasCatalogueOf.userName = dbo.[Video Game Enthusiast].userName
WHERE        (dbo.hasCatalogueOf.hasPlayed = 1) OR
                         (dbo.hasCatalogueOf.wantsToPlay = 1)
END
GO
