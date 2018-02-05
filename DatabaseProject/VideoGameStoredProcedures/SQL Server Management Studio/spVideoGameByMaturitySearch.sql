
CREATE PROCEDURE spVideoGameByMaturitySearch 
	@maturityRating  varchar(50)
AS
BEGIN
	SELECT videoGameName, maturityRating, developerName, consoleName
	FROM [Video Game]
	WHERE maturityRating = @maturityRating
END
GO
