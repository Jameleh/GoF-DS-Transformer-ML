import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements SongIterator{

    // ArrayList holds SongInfo objects

    ArrayList<SongInfo> bestSongs;

    public SongsOfThe70s() {

        bestSongs = new ArrayList<SongInfo>(); //created ArrayList of top songs

        //calls addSong method which utilizes common interface for storing song info
        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);

    }

    // Add a SongInfo object to the end of the ArrayList

    public void addSong(String songName, String bandName, int yearReleased){

        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);

        bestSongs.add(songInfo);

    }




    public ArrayList<SongInfo> getBestSongs(){

        return bestSongs;

    } // old way returned an ArrayList



    // NEW By adding this method I'll be able to treat all
    // collections the same

    //simply attaches an iterator to collection and returns it as type iterator.
    public Iterator createIterator() {
        // TODO Auto-generated method stub
        return bestSongs.iterator();
    }

}