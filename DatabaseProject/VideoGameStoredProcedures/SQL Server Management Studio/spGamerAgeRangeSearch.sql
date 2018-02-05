
CREATE PROCEDURE spGamerAgeRangeSearch 
	@lowerAge int, @upperAge int
AS
BEGIN

	SELECT userName, age, gender
	FROM [Video Game Enthusiast]
	WHERE age >= @lowerAge AND age <= @upperAge
END
GO
