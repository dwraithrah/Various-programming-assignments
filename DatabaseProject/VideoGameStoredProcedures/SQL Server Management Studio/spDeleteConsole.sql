
CREATE PROCEDURE spDeleteConsole
	 @consoleName varchar(50), @consoleDeveloper varchar(50)
AS
BEGIN
	DELETE FROM Console
	WHERE consoleName = @consoleName AND consoleDeveloper = @consoleDeveloper
END
