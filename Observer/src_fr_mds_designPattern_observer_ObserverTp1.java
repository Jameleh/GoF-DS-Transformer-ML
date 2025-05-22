package fr.mds.designPattern.observer;

/**
*
* @author tactfactory
*
* - Le programme doit utiliser un design pattern "Observer" afin d'avoir les éléments suivant :
*   - 1 : Un Subject sera observé par 3 observer
*   - 2 : Le Subject possédera un state de type int
*   - 3 : Lors de la modification du state du Subject les observers attachés seront appelé avec :
*       - 1 : Un observer affichera l'entier en hexadécimal
*       - 2 : Un observer affichera l'entier en octal
*       - 3 : Un observer affichera l'entier en binaire
*   - 3 : Le lancement de l'application doit afficher les éléments suivant :
*
*       First state change: 15
*       Hex String: F
*       Octal String: 17
*       Binary String: 1111
*       Second state change: 10
*       Hex String: A
*       Octal String: 12
*       Binary String: 1010
*/
public class ObserverTp1 {
  public static void main(String[] args) {

    Subject sub = new Subject();
    HexaObserver hexObs = new HexaObserver("Hex");
    OctalObserver octObs = new OctalObserver("Octal");
    BinaryObserver binObs = new BinaryObserver("Binary");

    sub.attach(hexObs);
    sub.attach(octObs);
    sub.attach(binObs);

    System.out.println("First state change: 15");
    sub.setState(15);

    System.out.println("Second state change: 10");
    sub.setState(10);

  }
}
