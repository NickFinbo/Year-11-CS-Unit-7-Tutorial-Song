import java.util.ArrayList;

public class Song {

    private String title;
    private String artist;
    private ArrayList<String> Listened = new ArrayList<>();

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int howMany(ArrayList<String> listeners) {
        int newListeners = 0;

        for (int i = 0; i < listeners.size(); i++) {
            String currListener = listeners.get(i).toLowerCase();

            if(!Listened.contains(currListener)) {
                Listened.add(currListener);
                newListeners++;
            }
        }

        return newListeners;
    }
}
