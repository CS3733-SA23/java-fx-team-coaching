package edu.wpi.teamname;

import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App extends Application {

  @Override
  public void init() {
    log.info("Starting Up");
  }

  @Override
  public void start(Stage primaryStage) throws IOException {
    //    final URL path = App.class.getResource("views/Home.fxml");
    //    final FXMLLoader loader = new FXMLLoader(path);
    //    final BorderPane mainScene = loader.load();
    //    final Scene scene = new Scene(mainScene);
    //
    //    primaryStage.setScene(scene);
    primaryStage.show();
  }

  @Override
  public void stop() {
    log.info("Shutting Down");
  }
}
