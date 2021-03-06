USE [SocialVideoGame]
GO
/****** Object:  StoredProcedure [dbo].[spSumHasPlayedByUserName]    Script Date: 11/22/2016 9:30:09 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

ALTER PROCEDURE [dbo].[spSumHasPlayedByUserName] 
	@userName varchar(50)
AS
BEGIN
	SELECT COUNT(hasPlayed) AS GamesPlayed
	FROM hasCatalogueOf
	WHERE userName = @userName AND hasPlayed = 1
END
