    package addin1;
    
    import javafx.scene.Scene;
    import javafx.scene.control.Button;
    import javafx.scene.layout.GridPane;
    
    import com.wilutions.com.ComException;
    import com.wilutions.joa.TaskPane;
    
    public class ExplorerTaskPane extends TaskPane {
    
        @Override
        protected Scene createScene() throws ComException {
            GridPane grid = new GridPane();
            Button clear = new Button("Klickme!");
            GridPane.setConstraints(clear, 0, 0);
            grid.getChildren().add(clear);
            Scene scene = new Scene(grid);
            return scene;
        }
    
    }
