import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJockey {

    SongsOfThe70s songs70s;
    SongsOfThe80s songs80s;
    SongsOfThe90s songs90s;

    // NEW Passing in song iterators

    SongIterator iter70sSongs;
    SongIterator iter80sSongs;
    SongIterator iter90sSongs;
	
	/* OLD WAY
	public DiscJockey(SongsOfThe70s newSongs70s, SongsOfThe80s newSongs80s, SongsOfThe90s newSongs90s) {
		
		songs70s = newSongs70s;
		songs80s = newSongs80s;
		songs90s = newSongs90s;
		
	}
	*/

    // NEW WAY Initialize the iterators


    public DiscJockey(SongIterator newSongs70s, SongIterator newSongs80s, SongIterator newSongs90s) {

        iter70sSongs = newSongs70s;
        iter80sSongs = newSongs80s;
        iter90sSongs = newSongs90s;

    }

    /* OLD WAY
    public void showTheSongs(){

        // Because the SongInfo Objects are stored in different
        // collections everything must be handled on an individual
        // basis. This is BAD!

        ArrayList aL70sSongs = songs70s.getBestSongs();  // 70s passed to Disc Jockey as arrayList

        System.out.println("Songs of the 70s\n");

        for(int i=0; i < aL70sSongs.size(); i++){

            SongInfo bestSongs = (SongInfo) aL70sSongs.get(i);  // retrieves, casts and prints content

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased() + "\n");

        }

        SongInfo[] array80sSongs = songs80s.getBestSongs();  // 80s passed as Array

        System.out.println("Songs of the 80s\n");

        for(int j=0; j < array80sSongs.length; j++){

            SongInfo bestSongs = array80sSongs[j];

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased() + "\n");

        }

        Hashtable<Integer, SongInfo> ht90sSongs = songs90s.getBestSongs(); //90's passed as Hashtable

        System.out.println("Songs of the 90s\n");

        for (Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements();)
        {
            SongInfo bestSongs = ht90sSongs.get(e.nextElement());

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased() + "\n");

        }

    }

   // the net result here is that the DiscJockey class needs to handle each collection type and create loops for each

     */
    // Now that I can treat everything as an Iterator it cleans up
    // the code while allowing me to treat all collections as 1

    public void showTheSongs2(){

        System.out.println("NEW WAY WITH ITERATOR\n");

        // iterator called on each of the class objects to make them functionally all as type Iterator
        // so the Disc Jockey has to know less and the traversal of each collection type is handled by the iterator
        Iterator Songs70s = iter70sSongs.createIterator();
        Iterator Songs80s = iter80sSongs.createIterator();
        Iterator Songs90s = iter90sSongs.createIterator();

        //uses printthesong method which takes Iterator object and traverses
        System.out.println("Songs of the 70s\n");
        printTheSongs(Songs70s);

        System.out.println("Songs of the 80s\n");
        printTheSongs(Songs80s);

        System.out.println("Songs of the 90s\n");
        printTheSongs(Songs90s);

    }

    public void printTheSongs(Iterator iterator){

        while(iterator.hasNext()){

            SongInfo songInfo = (SongInfo) iterator.next();

            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased() + "\n");

        }

    }

}