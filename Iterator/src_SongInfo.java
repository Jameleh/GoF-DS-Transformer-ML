// Will hold all of the info needed for each song

// I told all users to:
// 1. create a function named addSong() for adding song, band and release
// 2. create a function named getBestSongs() that will return the collection
//    of songs


// all 3 classes: 70s, 80s, 90s will be storing SongInfo objects but store as different collection types: Array, ArrayList,
// hashtable
public class SongInfo{

    String songName;
    String bandName;
    int yearReleased;

    public SongInfo(String newSongName, String newBandName, int newYearReleased){

        songName = newSongName;
        bandName = newBandName;
        yearReleased = newYearReleased;

    }  // constructor

    //getters
    public String getSongName(){ return songName; }
    public String getBandName(){ return bandName; }
    public int getYearReleased(){ return yearReleased; }

}