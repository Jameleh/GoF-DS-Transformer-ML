import java.time.LocalDateTime;
import java.util.Arrays;

public class Memento implements IMemento {
    private int[] options;
    private boolean isSelected;
    private final LocalDateTime timestamp;

    public Memento(int[] options, boolean isSelected) {
        this.options = options.clone(); // Copy options array
        this.isSelected = isSelected;
        this.timestamp  = LocalDateTime.now();
        System.out.println("Memento created");
    }

    public int[] getOptions() {
        return options;
    }

    public boolean isSelected() {
        return isSelected;
    }

    @Override
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String getTitle() {
        return Arrays.toString(options) + (isSelected ? " yes" : " no");
    }

}