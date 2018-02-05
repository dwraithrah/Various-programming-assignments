
CREATE PROCEDURE spGameCommentSearch
	-- Add the parameters for the stored procedure here
	@videoGameName varchar(50)
AS
BEGIN
	SELECT videoGameName, userName, rating, comment
	FROM   hasCatalogueOf
	WHERE videoGameName = @videoGameName
END
GO
