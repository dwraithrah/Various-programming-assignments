
CREATE PROCEDURE spVideoGameByGenreSearch
	@genre varchar(50)
AS
BEGIN
	SELECT DISTINCT dbo.[Video Game].videoGameName, dbo.[Video Game].genre
	FROM  dbo.[Video Game] 
	WHERE dbo.[Video Game].genre = @genre
END
