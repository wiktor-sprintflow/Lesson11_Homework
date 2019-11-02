package task01;

import java.util.Objects;

class Album {
    private String artistName;
    private String albumName;
    private int releaseYear;

    Album(String artistName, String albumName, int releaseYear) {
        this.artistName = artistName;
        this.albumName = albumName;
        this.releaseYear = releaseYear;
    }
    Album(){
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return releaseYear == album.releaseYear &&
                Objects.equals(artistName, album.artistName) &&
                Objects.equals(albumName, album.albumName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistName, albumName, releaseYear);
    }

    @Override
    public String toString() {
        return "Album: {" +
                "artistName='" + artistName + '\'' +
                ", albumName='" + albumName + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}

