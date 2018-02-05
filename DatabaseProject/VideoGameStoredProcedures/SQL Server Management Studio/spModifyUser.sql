
CREATE PROCEDURE spModifyUser
	@userName varchar(50), @fName varchar(50), @lName varchar(50), @password varchar(50), @age int, @gender varchar(50)
AS
BEGIN
	IF @fName IS NOT NULL
		UPDATE [Video Game Enthusiast] SET fName = @fName WHERE userName = @userName
	IF @lName IS NOT NULL
		UPDATE [Video Game Enthusiast] SET lName = @lName WHERE userName = @userName
	IF @password IS NOT NULL
		UPDATE [Video Game Enthusiast] SET password = @password WHERE userName = @userName
	IF @age IS NOT NULL
		UPDATE [Video Game Enthusiast] SET age = @age WHERE userName = @userName
	IF @gender IS NOT NULL
		UPDATE [Video Game Enthusiast] SET gender = @gender WHERE userName = @userName
END
GO
