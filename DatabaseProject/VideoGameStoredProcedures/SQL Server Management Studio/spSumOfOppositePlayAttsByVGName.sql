USE [SocialVideoGame]
GO
/****** Object:  StoredProcedure [dbo].[spSumOfOppositePlayAttsByVGName]    Script Date: 11/22/2016 9:59:02 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

ALTER PROCEDURE [dbo].[spSumOfOppositePlayAttsByVGName]
	@videoGameName varchar(50)
AS
BEGIN
	SELECT  DISTINCT videoGameName,
		(SELECT COUNT(hasPlayed) FROM hasCatalogueOf WHERE hasPlayed = 0 AND videoGameName = @videoGameName) AS HasNotPlayed,
		(SELECT COUNT(wantsToPlay) FROM hasCatalogueOf WHERE wantsToPlay = 0 AND videoGameName = @videoGameName) AS DoesNotWantToPlay,
		(SELECT COUNT(owns) FROM hasCatalogueOf WHERE owns = 0 AND videoGameName = @videoGameName) AS DoesNotOwn,
		(SELECT COUNT(wantsToOwn) FROM hasCatalogueOf WHERE wantsToOwn = 0 AND videoGameName = @videoGameName) AS DoesNotWantToOwn
	FROM hasCatalogueOf
	WHERE videoGameName = @videoGameName
END
