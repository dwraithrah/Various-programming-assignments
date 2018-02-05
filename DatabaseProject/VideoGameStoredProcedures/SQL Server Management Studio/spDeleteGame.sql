USE [SocialVideoGame]
GO
/****** Object:  StoredProcedure [dbo].[spDeleteFromCatalogue]    Script Date: 11/20/2016 5:03:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE spDeleteGame
	@videoGameName varchar(50), @consoleName varchar(50), @developerName varchar(50)
AS
BEGIN
	DELETE FROM [Video Game]
	WHERE videoGameName = @videoGameName AND consoleName =@consoleName AND developerName = @developerName
END
