
CREATE PROCEDURE spDeleteDeveloper
	 @developerName varchar(50), @developerAddress varchar(50)
AS
BEGIN
	DELETE FROM Developer
	WHERE developerName = @developerName AND developerAddress = @developerAddress
END
