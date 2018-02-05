
CREATE PROCEDURE spSumOfUsersByAgeRange 
	@lowerAge int, @upperAge int
AS
BEGIN
	SELECT COUNT(userName) AS NumberOfUsers
	FROM [Video Game Enthusiast]
	WHERE age >= @lowerAge AND age <= @upperAge
END
GO
