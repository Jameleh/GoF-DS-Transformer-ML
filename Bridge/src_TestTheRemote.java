public class TestTheRemote{

    public static void main(String[] args){

        RemoteButton theTV = new TVRemoteMute(new TVDevice(1, 200));

        RemoteButton theTV2 = new TVRemotePause(new TVDevice(1, 200));


        System.out.println("Test TV with Mute");

        theTV.buttonFivePressed();
        theTV.buttonSixPressed();
        theTV.buttonNinePressed();

        System.out.println("\nTest TV with Pause");

        theTV2.buttonFivePressed();
        theTV2.buttonSixPressed();
        theTV2.buttonNinePressed();
        theTV2.deviceFeedback();

        //the bridge pattern is still tough to understand. but the gist seems that we have two layers of abstraction.
        // the first layer is the abstract TV class which TVDevice extends from. The abstract TV class has two abstract
        // methods for channel up and down (they are abstract in case a remote wanted to control a DVD player class that
        // would extend from entertainment device class but that's obviously not what we did). the volume buttons are also
        // never used for some reason even by the TV remotes so seems those should also be defined in the TV device and
        // remote abstract class to makee that function usable?

        // all in all this is half an example. first layer abstraction should be entertainment device that can implement
        // concrete classes of a TV and a DVD player. second layer of abstrraction is the remote which for the concrete
        // class forr TV remote can have diffeerent functions like button 9 being a mute or a pause live TV button.
        // while the abstract layer for the DVD player could have 2 concrete implementations say one DVD remote has the
        // channel up and down buttons be redefined as next and prior chapter wheereas maybee the seecond DVD remote could
        // redefine those as fast forward and rewind butttons.

        // net results is increasing variety as we include more abstract layers where different types of objects from the
        // first abstract layer can be made then differrent objects can be made at second abstraction level to interract
        // with concreete objects from first level of abstraction.


    }

}