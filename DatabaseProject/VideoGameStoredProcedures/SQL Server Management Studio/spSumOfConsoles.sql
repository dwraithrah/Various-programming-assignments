
CREATE PROCEDURE spSumOfConsoles 
AS
BEGIN
	SELECT COUNT(consoleName) AS NumberOfConsoles
	FROM Console
END
