USE [SocialVideoGame]
GO
/****** Object:  StoredProcedure [dbo].[spSumOfVideoGames]    Script Date: 11/22/2016 10:16:01 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

ALTER PROCEDURE [dbo].[spSumOfVideoGames] 
AS
BEGIN
	SELECT DISTINCT COUNT(videoGameName) AS NumberOfGames
	FROM [Video Game]
END
