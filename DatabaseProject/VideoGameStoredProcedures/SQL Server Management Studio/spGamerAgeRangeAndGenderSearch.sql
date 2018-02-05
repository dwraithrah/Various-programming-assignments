
CREATE PROCEDURE spGamerAgeRangeAndGenderSearch 
	@lowerAge int, @upperAge int, @gender varchar(50)
AS
BEGIN

	SELECT userName, age, gender
	FROM [Video Game Enthusiast]
	WHERE (age >= @lowerAge AND age <= @upperAge) AND gender = @gender
END
GO
