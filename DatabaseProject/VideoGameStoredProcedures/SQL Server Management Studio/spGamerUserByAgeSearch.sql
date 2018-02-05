USE [SocialVideoGame]
GO
/****** Object:  StoredProcedure [dbo].[spGamerUserByAgeSearch]    Script Date: 11/20/2016 7:50:20 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

ALTER PROCEDURE [dbo].[spGamerUserByAgeSearch] 
	@age int
AS
BEGIN

	SELECT userName, age, gender
	FROM [Video Game Enthusiast]
	WHERE age = @age
END
