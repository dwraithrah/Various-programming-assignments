
CREATE PROCEDURE spAverageAgeByAgeRange
	@lowerAge int, @upperAge int
AS
BEGIN
	SELECT AVG(age) AS AverageAge
	FROM [Video Game Enthusiast]
	WHERE age >= @lowerAge AND age <= @upperAge
END
GO
