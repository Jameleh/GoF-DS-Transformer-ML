package ProblemStatement;

public class Main {
    public static void main(String args[]){
        Directory moviDirectory= new Directory("Movie");
        File border= new File("Border");
        moviDirectory.add(border);

        Directory comedyMovieDirectory=new Directory("ComedyMovie");
        File hulchul=new File("Hulchul");
        comedyMovieDirectory.add(hulchul);
        moviDirectory.add(comedyMovieDirectory);

        moviDirectory.ls();
    }    
}
