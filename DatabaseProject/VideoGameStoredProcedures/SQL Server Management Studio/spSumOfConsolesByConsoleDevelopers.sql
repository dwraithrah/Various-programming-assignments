
CREATE PROCEDURE spSumOfConsolesByConsoleDevelopers 
	@consoleDeveloper varchar(50)
AS
BEGIN
	SELECT COUNT(consoleName) AS NumberOfConsoles
	FROM Console
	WHERE consoleDeveloper = @consoleDeveloper
END
GO
