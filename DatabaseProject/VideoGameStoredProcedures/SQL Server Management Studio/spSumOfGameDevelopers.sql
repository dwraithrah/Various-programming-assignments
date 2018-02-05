
CREATE PROCEDURE spSumOfGameDevelopers
AS
BEGIN
	SELECT COUNT(developerName) AS NumberOfDevelopers
	FROM Developer
END
GO
