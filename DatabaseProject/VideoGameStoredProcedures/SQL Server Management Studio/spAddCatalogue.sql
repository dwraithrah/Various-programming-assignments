
CREATE PROCEDURE spAddCatalogue 
	(@userName varchar(50), @videoGameName varchar(50), @developerName varchar(50), @consoleName varchar(50), @owns bit, @hasPlayed bit, 
	@wantsToPlay bit, @rating int, @comment varchar(50))
AS
SET NOCOUNT ON
	INSERT INTO dbo.hasCatalogueOf
			(userName,
			 videoGameName,
			 developerName,
			 consoleName,
			 owns,
			 hasPlayed,
			 wantsToPlay,
			 rating,
			 comment)
	VALUES
		(@userName,
		 @videoGameName,
		 @developerName,
		 @consoleName,
		 @owns,
		 @hasPlayed,
		 @wantsToPlay,
		 @rating,
		 @comment)
GO
