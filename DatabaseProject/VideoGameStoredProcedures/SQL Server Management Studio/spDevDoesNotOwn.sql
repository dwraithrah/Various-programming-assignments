USE [SocialVideoGame]
GO
/****** Object:  StoredProcedure [dbo].[spDevNotOwns]    Script Date: 11/19/2016 9:03:49 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- ================================================
-- Template generated from Template Explorer using:
-- Create Procedure (New Menu).SQL
--
-- Use the Specify Values for Template Parameters 
-- command (Ctrl-Shift-M) to fill in the parameter 

ALTER PROCEDURE [dbo].[spDevNotOwns] 
AS
BEGIN
	SELECT        dbo.hasCatalogueOf.userName, dbo.hasCatalogueOf.videoGameName,  dbo.hasCatalogueOf.rating, dbo.hasCatalogueOf.comment, dbo.[Video Game Enthusiast].age, 
                         dbo.[Video Game Enthusiast].gender
FROM            dbo.hasCatalogueOf INNER JOIN
                         dbo.[Video Game Enthusiast] ON dbo.hasCatalogueOf.userName = dbo.[Video Game Enthusiast].userName
WHERE        (dbo.hasCatalogueOf.owns = 0)
END
