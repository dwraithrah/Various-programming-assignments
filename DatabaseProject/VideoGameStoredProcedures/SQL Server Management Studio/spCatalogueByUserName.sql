USE [SocialVideoGame]
GO
/****** Object:  StoredProcedure [dbo].[spCatalogueByUserNameSearch]    Script Date: 11/22/2016 8:45:38 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

ALTER PROCEDURE [dbo].[spCatalogueByUserNameSearch] 
	@userName varchar(50)
AS
BEGIN

	SELECT *
	FROM  dbo.hasCatalogueOf
	WHERE dbo.hasCatalogueOf.userName = @userName
END
