
CREATE PROCEDURE spModifyConsole
	@consoleName varchar(50), @consoleDeveloper varchar(50)
AS
BEGIN
	IF @consoleDeveloper IS NOT NULL
		UPDATE Console SET consoleDeveloper = @consoleDeveloper WHERE consoleName = @consoleName
END
