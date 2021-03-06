USE [SocialVideoGame]
GO
/****** Object:  StoredProcedure [dbo].[spSumHasNotPlayedByUserName]    Script Date: 11/22/2016 9:32:57 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

ALTER PROCEDURE [dbo].[spSumHasNotPlayedByUserName] 
	@userName varchar(50)
AS
BEGIN
	SELECT COUNT(hasPlayed) AS GamesNotPlayed
	FROM hasCatalogueOf
	WHERE userName = @userName AND hasPlayed = 0
END
