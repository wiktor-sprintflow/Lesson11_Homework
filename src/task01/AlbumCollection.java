package task01;

import java.util.Arrays;
import java.util.Scanner;

class AlbumCollection {
    private Album[] albumsCollection;

    AlbumCollection(int albumsNumber) {
        this.albumsCollection = new Album[albumsNumber];
    }

    public void addAlbumsToCollection() {

        for (int i = 0; i < albumsCollection.length; i++) {
            albumsCollection[i] = enterAlbumDetails(i + 1);
        }
    }

    private Album enterAlbumDetails(int i) {
        Scanner sc = new Scanner(System.in);
        Album newAlbum = new Album();
        do {
            System.out.println("Album nr " + i);
            System.out.print("Podaj nazwę artysty: ");
            newAlbum.setArtistName(sc.nextLine());
            System.out.print("Podaj nazwę albumu: ");
            newAlbum.setAlbumName(sc.nextLine());
            System.out.print("Podaj rok wydania albumu: ");
            newAlbum.setReleaseYear(sc.nextInt());
            sc.nextLine();
        } while (!isNewAlbumInCollection(newAlbum));
        return newAlbum;
    }

    private boolean isNewAlbumInCollection(Album newAlbum) {
        boolean isNew = true;
        for (Album album : albumsCollection) {
            if (newAlbum.equals(album)) {
                isNew = false;
                System.out.println(newAlbum + " już istnieje w kolekcji. ");
                break;
            }
        }
        return isNew;
    }

    @Override
    public String toString() {
        return "\nAlbumsCollection:\n" + Arrays.toString(albumsCollection);
    }

    public Album[] getAlbumsCollection() {
        return albumsCollection;
    }

    public void setAlbumsCollection(Album[] albumsCollection) {
        this.albumsCollection = albumsCollection;
    }
}