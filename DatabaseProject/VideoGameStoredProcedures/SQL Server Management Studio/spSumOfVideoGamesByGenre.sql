USE [SocialVideoGame]
GO
/****** Object:  StoredProcedure [dbo].[spSumVideoGamesByGenre]    Script Date: 11/22/2016 10:24:26 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

ALTER PROCEDURE [dbo].[spSumVideoGamesByGenre] 
	@genre varchar(50)
AS
BEGIN
	SELECT DISTINCT COUNT(videoGameName) AS NumberOfGames
	FROM [Video Game]
	WHERE genre = @genre
END
