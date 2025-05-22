import java.time.format.DateTimeFormatter;

import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HistoryWindow extends Stage {

    public HistoryWindow(Controller controller) {

        setTitle("History");
        initModality(Modality.NONE);

        ListView<IMemento> list = new ListView<>(
                FXCollections.observableArrayList(controller.getHistory()));

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss");

        list.setCellFactory(v -> new ListCell<>() {
            @Override protected void updateItem(IMemento m, boolean empty) {
                super.updateItem(m, empty);
                setText(empty || m == null ? "" :
                        fmt.format(m.getTimestamp()) + "  " + m.getTitle());
            }
        });

        list.setOnMouseClicked(e -> {
            if (e.getClickCount() == 2)
                controller.jumpTo(list.getSelectionModel().getSelectedItem());
        });
        list.setOnKeyPressed(e -> {
            if (e.getCode().isLetterKey() || e.getCode().isDigitKey()) return;
            if (e.getCode() == javafx.scene.input.KeyCode.ENTER)
                controller.jumpTo(list.getSelectionModel().getSelectedItem());
        });

        setScene(new Scene(list, 260, 400));
    }
}
