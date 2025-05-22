package Solution1WithCompositeDesign;

public class Main {
    public static void main(String args[]){
        Directory movieDirectory=new Directory("Movie");
        FileSystem border= new File("Border");

        movieDirectory.add(border);

        Directory comedyMoviDirectory=new Directory("ComedyMovie");
        File hulchul=new File("Hulchul");
        comedyMoviDirectory.add(hulchul);
        movieDirectory.add(comedyMoviDirectory);

        movieDirectory.ls();
    }
}
