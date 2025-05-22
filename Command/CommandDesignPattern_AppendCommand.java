import java.util.Scanner;

public class AppendCommand extends Command {
    private Scanner in=new Scanner(System.in);

    /**
     * appends/adds the users request to the text file
     * @param doc
     */
    public AppendCommand(Document doc) {
        super(doc);
        this.document=doc;
        System.out.println("What would you like to append?");
        String line = in.nextLine();
        doc.append(line);
    }

    /**
     * @return Asks the user what they want to append to the file and then tells the user it has been appended
     */
    public String execute() {
        System.out.println("What would you like to append?");
        String line = in.nextLine();
        return (document.append(line));
    }
}
