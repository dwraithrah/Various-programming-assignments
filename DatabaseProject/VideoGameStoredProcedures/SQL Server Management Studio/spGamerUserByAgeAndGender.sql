
CREATE PROCEDURE spGamerUserByGenderAndAge
	@age int, @gender varchar(50)
AS
BEGIN

	SELECT username, age, gender
	FROM [Video Game Enthusiast]
	WHERE age = @age AND gender = @gender
END
GO
