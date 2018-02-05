
CREATE PROCEDURE spModifyDeveloper
	@developerName varchar(50), @developerAddress varchar(50)
AS
BEGIN
	IF @developerAddress IS NOT NULL
		UPDATE Developer SET developerAddress = @developerAddress WHERE developerName = @developerName
END
GO
