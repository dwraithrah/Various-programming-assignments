
CREATE PROCEDURE spAddVideoGameEnthusiast
	@userName varchar(50), @fName varchar(50), @lName varchar(50), @password varchar(50), @age int, @gender varchar(50) 	
AS
SET NOCOUNT ON
	INSERT INTO [Video Game Enthusiast]
			(userName,
			 fName,
			 lName,
			 password,
			 age,
			 gender)
	VALUES
		(@userName,
		 @fName,
		 @lName,
		 @password,
		 @age,
		 @gender)