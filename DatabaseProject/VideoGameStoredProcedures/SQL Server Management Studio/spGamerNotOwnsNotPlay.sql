
CREATE PROCEDURE spGamerNotOwnsNotPlay
	@videoGameName varchar(50)
AS
BEGIN
	SELECT        dbo.hasCatalogueOf.userName, dbo.hasCatalogueOf.videoGameName,  dbo.hasCatalogueOf.rating, dbo.hasCatalogueOf.comment, 
                         dbo.[Video Game Enthusiast].age, dbo.[Video Game Enthusiast].gender
FROM            dbo.hasCatalogueOf INNER JOIN
                         dbo.[Video Game Enthusiast] ON dbo.hasCatalogueOf.userName = dbo.[Video Game Enthusiast].userName
WHERE        (dbo.hasCatalogueOf.owns = 0) AND (dbo.hasCatalogueOf.wantsToPlay = 0) AND videoGameName = @videoGameName
END
