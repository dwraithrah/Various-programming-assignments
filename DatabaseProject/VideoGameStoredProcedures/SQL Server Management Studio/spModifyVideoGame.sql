
CREATE PROCEDURE spModifyVideoGame
	@videoGameName varchar(50), @consoleName varchar(50), @developerName varchar(50), @genre varchar(50), 
	@maturityRating varchar(50), @releaseDate varchar(50)
AS
BEGIN
	IF @genre IS NOT NULL
		UPDATE [Video Game] SET genre = @genre WHERE videoGameName = @videoGameName AND consoleName = @consoleName AND developerName = @developerName
	IF @maturityRating IS NOT NULL
		UPDATE [Video Game] SET maturityRating = @maturityRating WHERE videoGameName = @videoGameName AND consoleName = @consoleName AND developerName = @developerName
	IF @releaseDate IS NOT NULL
		UPDATE [Video Game] SET releaseDate = @releaseDate WHERE videoGameName = @videoGameName AND consoleName = @consoleName AND developerName = @developerName
END
GO
