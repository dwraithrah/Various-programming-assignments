-- ================================================
-- Template generated from Template Explorer using:
-- Create Procedure (New Menu).SQL
--
-- Use the Specify Values for Template Parameters 
-- command (Ctrl-Shift-M) to fill in the parameter 

CREATE PROCEDURE spDevNotOwns 
AS
BEGIN
	SELECT        dbo.hasCatalogueOf.userName, dbo.hasCatalogueOf.videoGameName, dbo.hasCatalogueOf.owns, dbo.hasCatalogueOf.rating, dbo.hasCatalogueOf.comment, dbo.[Video Game Enthusiast].age, 
                         dbo.[Video Game Enthusiast].gender
FROM            dbo.hasCatalogueOf INNER JOIN
                         dbo.[Video Game Enthusiast] ON dbo.hasCatalogueOf.userName = dbo.[Video Game Enthusiast].userName
WHERE        (dbo.hasCatalogueOf.owns = 0)
END
GO
