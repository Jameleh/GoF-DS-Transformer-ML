public class RadioStation {

    public static void main(String[] args){

        // creates new objects of each type
        SongsOfThe70s songs70s = new SongsOfThe70s();
        SongsOfThe80s songs80s = new SongsOfThe80s();
        SongsOfThe90s songs90s = new SongsOfThe90s();

        DiscJockey madMike = new DiscJockey(songs70s, songs80s, songs90s);

        // madMike.showTheSongs();

        // the showTheSongs2 method will take those objects as field values, then assign new Iterator objects from the
        // returned Iterator from each class. Then iterates through and prints each collection
        madMike.showTheSongs2();

    }

}