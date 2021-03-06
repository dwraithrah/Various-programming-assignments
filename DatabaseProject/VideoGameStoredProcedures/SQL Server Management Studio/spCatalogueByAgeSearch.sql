USE [SocialVideoGame]
GO
/****** Object:  StoredProcedure [dbo].[spCatalogueByAgeSearch]    Script Date: 11/22/2016 8:49:14 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

ALTER PROCEDURE [dbo].[spCatalogueByAgeSearch] 
	@age int
AS
BEGIN
	SELECT [Video Game Enthusiast].userName, hasCatalogueOf.videoGameName, hasCatalogueOf.consoleName, hasCatalogueOf.developerName, hasCatalogueOf.owns,
		hasCatalogueOf.wantsToOwn, hasCatalogueOf.hasPlayed, hasCatalogueOf.wantsToPlay, hasCatalogueOf.rating, hasCatalogueOf.Comment
	FROM dbo.hasCatalogueOf INNER JOIN dbo.[Video Game Enthusiast] ON hasCatalogueOf.userName = [Video Game Enthusiast].userName
	WHERE [Video Game Enthusiast].age = @age
END
