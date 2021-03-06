USE [SocialVideoGame]
GO
/****** Object:  StoredProcedure [dbo].[spSumOfPlayAttributesByVGName]    Script Date: 11/22/2016 10:02:10 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO


ALTER PROCEDURE [dbo].[spSumOfPlayAttributesByVGName]
	@videoGameName varchar(50)
AS
BEGIN
	SELECT  DISTINCT videoGameName,
		(SELECT COUNT(hasPlayed) FROM hasCatalogueOf WHERE hasPlayed = 1 AND videoGameName = @videoGameName) AS HasPlayed,
		(SELECT COUNT(wantsToPlay) FROM hasCatalogueOf WHERE wantsToPlay = 1 AND videoGameName = @videoGameName) AS WantsToPlay,
		(SELECT COUNT(owns) FROM hasCatalogueOf WHERE owns = 1 AND videoGameName = @videoGameName) AS Owns,
		(SELECT COUNT(wantsToOwn) FROM hasCatalogueOf WHERE wantsToOwn = 1 AND videoGameName = @videoGameName) AS WantsToOwn
	FROM hasCatalogueOf
	WHERE videoGameName = @videoGameName
END
