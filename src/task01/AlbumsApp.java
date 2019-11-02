package task01;

public class AlbumsApp {
    public static void main(String[] args) {
        AlbumCollection albumCollection = new AlbumCollection(3);
        albumCollection.addAlbumsToCollection();
        System.out.println(albumCollection);
    }
}
