USE [SocialVideoGame]
GO
/****** Object:  StoredProcedure [dbo].[spAddCatalogue]    Script Date: 11/20/2016 4:55:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spAddGame 
	( @videoGameName varchar(50), @developerName varchar(50), @consoleName varchar(50), @maturityRating varchar(50), @genre varchar(50), 
	@releaseDate varchar(50))
AS
SET NOCOUNT ON
	INSERT INTO dbo.[Video Game]
			(videoGameName,
			 developerName,
			 consoleName,
			 maturityRating,
			 genre,
			 releaseDate)
	VALUES
		(@videoGameName,
		 @developerName,
		 @consoleName,
		 @maturityRating,
		 @genre,
		 @releaseDate)