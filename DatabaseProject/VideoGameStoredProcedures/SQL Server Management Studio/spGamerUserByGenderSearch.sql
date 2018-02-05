USE [SocialVideoGame]
GO
/****** Object:  StoredProcedure [dbo].[spGamerUserByGenderSearch]    Script Date: 11/20/2016 7:50:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

ALTER PROCEDURE [dbo].[spGamerUserByGenderSearch] 
	@gender varchar(50)
AS
BEGIN

	SELECT userName, age, gender
	FROM [Video Game Enthusiast]
	WHERE gender = @gender
END
