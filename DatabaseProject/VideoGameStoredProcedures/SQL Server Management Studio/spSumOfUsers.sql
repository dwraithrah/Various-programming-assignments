
CREATE PROCEDURE spSumOfUsers 
AS
BEGIN
	SELECT COUNT(userName) AS NumberOfUsers
	FROM [Video Game Enthusiast]
END
GO
