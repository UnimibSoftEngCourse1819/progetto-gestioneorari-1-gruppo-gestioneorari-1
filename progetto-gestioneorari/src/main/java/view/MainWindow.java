package view;

import controller.DateTimePicker;
import controller.TimetableController;

import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.TextAlignment;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import model.Timetable;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class MainWindow extends Application {

    Button insertButton;
    Button showButton;

    @Override
    public void start(Stage primaryStage) {

        ClickHandler ch = new ClickHandler();
        insertButton = new Button("Inserisci orario");
        insertButton.setOnAction(ch);

        showButton = new Button("Mostra orario");
        showButton.setOnAction(ch);
        HBox pane = new HBox(10);
        pane.getChildren().addAll( insertButton, showButton);

        Scene scene = new Scene(pane, 300, 75);
        primaryStage.setScene(scene);
        primaryStage.setTitle("TITOLO");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private class ClickHandler implements EventHandler<ActionEvent> {

        private LocalDateTime getDateTime(String s){
            Stage scndStage = new Stage();
            BorderPane pane = new BorderPane();
            Scene scene = new Scene(pane, 300, 300);
            DateTimePicker dtp = new DateTimePicker();
            pane.setCenter(dtp);
            scndStage.setTitle(s);
            scndStage.setScene(scene);
            scndStage.show();
            return dtp.getDateTime();
        }

        private void dispalyElements(ArrayList<Timetable> al){
            String output = "";
            for (int i = 0 ; i < 90 ; i++) {
                output += "-";
            }
            output += String.format("\n| %-31s| %-31s| %-10s| %-15s| %-30s|\n", "Inizio", "Fine", "Aula", "Lezione", "Professore");
            for (Timetable tt : al) {
                for (int i = 0 ; i < 90 ; i++) {
                    output += "-";
                }
                output += String.format("\n|%20s |%20s |%10s |%15s |%15s |\n", tt.getStart(), tt.getEnd(), tt.getClassroomID(), tt.getCourseName(), tt.getProfessor());
            }
            for (int i = 0 ; i < 90 ; i++) {
                output += "-";
            }

            Text displayedText = new Text(output);
            displayedText.setLayoutY(20);
            displayedText.setLayoutX(20);
            displayedText.setTextOrigin(VPos.TOP);
            displayedText.setTextAlignment(TextAlignment.JUSTIFY);
            Stage resStage = new Stage();
            Group root = new Group(displayedText);
            Scene scene = new Scene(root, 700, 600);
            resStage.setTitle("Sample Application");
            resStage.setScene(scene);
            resStage.show();
        }



        @Override
        public void handle(ActionEvent e) {
            if (e.getSource() == showButton) {
                ArrayList<Timetable> elements = (ArrayList<Timetable>)TimetableController.getAll().clone();
                dispalyElements(elements);
            } else if (e.getSource() == insertButton) {
                TimetableController.insertTimetable(getDateTime("inizio"), getDateTime("fine"), "AR88", "U203"); //do not work
                }
        }
    }
}