
CREATE PROCEDURE spCatalogueByRatingSearch 
	@rating int
AS
BEGIN
	SELECT *
	FROM dbo.hasCatalogueOf
	WHERE rating = @rating
END
GO
