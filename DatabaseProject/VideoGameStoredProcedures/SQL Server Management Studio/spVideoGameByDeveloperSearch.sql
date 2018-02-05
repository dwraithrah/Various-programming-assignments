-- ================================================
-- Template generated from Template Explorer using:

CREATE PROCEDURE spVideoGameByDeveloperSearch
	@developerName varchar(50)
AS
BEGIN

	SELECT dbo.[Video Game].videoGameName, dbo.[Video Game].consoleName,  dbo.Developer.developerName, dbo.Developer.developerAddress
	FROM dbo.[Video Game] INNER JOIN dbo.Developer ON dbo.[Video Game].developerName = dbo.Developer.developerName
	WHERE dbo.[Video Game].developerName = @developerName
END
GO
