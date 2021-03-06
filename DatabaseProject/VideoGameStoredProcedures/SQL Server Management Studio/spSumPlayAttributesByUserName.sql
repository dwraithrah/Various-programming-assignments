USE [SocialVideoGame]
GO
/****** Object:  StoredProcedure [dbo].[spSumPlayAttributesByUserName]    Script Date: 11/22/2016 9:44:48 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

ALTER PROCEDURE [dbo].[spSumPlayAttributesByUserName] 
	@userName varchar(50)
AS
BEGIN
	SELECT DISTINCT userName,
		(SELECT COUNT(hasPlayed) FROM hasCatalogueOf WHERE hasPlayed = 1 AND userName = @userName) AS HasPlayed,
		(SELECT COUNT(wantsToPlay) FROM hasCatalogueOf WHERE wantsToPlay = 1 AND userName = @userName) AS WantsToPlay,
		(SELECT COUNT(owns) FROM hasCatalogueOf WHERE owns = 1 AND userName = @userName) AS Owns,
		(SELECT COUNT(wantsToOwn) FROM hasCatalogueOf WHERE wantsToOwn = 1 AND userName = @userName) AS WantsToOwn
	FROM hasCatalogueOf
	WHERE userName = @userName
END
