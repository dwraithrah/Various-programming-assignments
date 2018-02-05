
CREATE PROCEDURE spSumOfUsersByAge
	@age int
AS
BEGIN
	SELECT COUNT(userName) AS NumberOfUsers
	FROM [Video Game Enthusiast]
	WHERE age = @age
END
GO
