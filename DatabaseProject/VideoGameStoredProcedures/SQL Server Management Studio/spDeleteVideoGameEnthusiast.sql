
CREATE PROCEDURE spDeleteVideoGameEnthusiast
	@userName varchar(50)
AS
BEGIN
	DELETE FROM [Video Game Enthusiast]
	WHERE userName = @userName 
END
