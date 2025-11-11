package com.aspiredigital.cpqdesk.shell;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLauncher extends Application {
    @Override public void start(Stage stage) throws Exception {
        var root = FXMLLoader.load(getClass().getResource("/fxml/main/MainShell.fxml"));
        stage.setTitle("SAP CPQ Desk");
        stage.setScene(new Scene(root, 1100, 700));
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}
