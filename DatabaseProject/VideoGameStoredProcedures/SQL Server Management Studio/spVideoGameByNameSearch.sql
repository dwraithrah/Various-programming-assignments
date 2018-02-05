
CREATE PROCEDURE spGamerVideoGameByNameSearch
	@videoGameName varchar(50)
AS
BEGIN

	SELECT videoGameName, developerName, consoleName
	FROM [Video Game]
	WHERE videoGameName = @videoGameName
END
GO
