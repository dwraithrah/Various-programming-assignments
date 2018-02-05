
CREATE PROCEDURE spDevHasPlayedAndNotOwns

AS
BEGIN
	SELECT        dbo.hasCatalogueOf.userName, dbo.hasCatalogueOf.videoGameName, dbo.hasCatalogueOf.rating, dbo.hasCatalogueOf.comment, 
                         dbo.[Video Game Enthusiast].age, dbo.[Video Game Enthusiast].gender
FROM            dbo.hasCatalogueOf INNER JOIN
                         dbo.[Video Game Enthusiast] ON dbo.hasCatalogueOf.userName = dbo.[Video Game Enthusiast].userName
WHERE        (dbo.hasCatalogueOf.hasPlayed = 1) AND (dbo.hasCatalogueOf.owns = 0)
END
GO
