
CREATE PROCEDURE spAverageAgeByGender 
	@gender varchar(50)
AS
BEGIN
	SELECT AVG(age) AS AverageAge
	FROM [Video Game Enthusiast]
	WHERE gender = @gender
END

