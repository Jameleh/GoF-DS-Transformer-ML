import java.util.ArrayList;
import java.util.List;

//Composite
public class Folder extends Component{

    private List<Component> childs = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public Component add(Component c){
        c.level=this.level+1;
        childs.add(c);
        return c;
    }
    @Override
    public void show() {

        System.out.println(tab()+"Folder :"+name);
        for(Component c:childs){
            c.show();
        }
    }
}
