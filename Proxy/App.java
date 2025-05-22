/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class App {
    public static void main(String[] args) {
        IImage myImage = new ImageProxy("test.jpg");
        //do something
        System.out.println("DO SOMETHING FOR A LONG TIMES...");
        System.out.println("WHEN WANT TO LOAD AND DISPLAY THE IMAGE...");
        myImage.display();        
    }
}
