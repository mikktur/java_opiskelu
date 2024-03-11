package Module6.t4_1.controller;

import Module6.t4_1.model.Note;
import Module6.t4_1.model.NoteBook;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

import java.util.Optional;

public class Controller {
    @FXML
    public ListView noteListView;
    @FXML
    private Button addNoteButton;
    @FXML
    private TextField titleField;
    @FXML
    private TextArea textArea;
    private boolean isEditing = false;

    private NoteBook noteBook = new NoteBook();

    @FXML
    public void handleNote() {
        if (isEditing) {
            noteBook.getNoteByIndex(noteListView.getSelectionModel().getSelectedIndex()).setTitle(titleField.getText());
            noteBook.getNoteByIndex(noteListView.getSelectionModel().getSelectedIndex()).setText(textArea.getText());
            noteListView.getItems().set(noteListView.getSelectionModel().getSelectedIndex(), "Title: " + noteBook.getNoteByIndex(noteListView.getSelectionModel().getSelectedIndex()).getTitle() + "\n" + noteBook.getNoteByIndex(noteListView.getSelectionModel().getSelectedIndex()).getText());
            isEditing = false;
            addNoteButton.setText("Add Note");
        } else {
            Note note = new Note(
                    titleField.getText(),
                    textArea.getText()
            );
            noteBook.addNote(note);
            noteListView.getItems().add("Title: " + noteBook.getLatestNote().getTitle() + "\n" + noteBook.getLatestNote().getText());
        }
    }



    @FXML
    public void editNote() {
        if (noteListView.getSelectionModel().getSelectedIndex() == -1) {
            return;
        } else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Edit Note");
            alert.setHeaderText("Do you want to edit the selected note?");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                isEditing = true;
                addNoteButton.setText("Edit Note");
                titleField.setText(noteBook.getNoteByIndex(noteListView.getSelectionModel().getSelectedIndex()).getTitle());
                textArea.setText(noteBook.getNoteByIndex(noteListView.getSelectionModel().getSelectedIndex()).getText());

            }
        }

    }
    @FXML
    public void removeNote() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete Note");
        alert.setHeaderText("Do you want to delete the selected note?");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            noteBook.removeNoteByIndex(noteListView.getSelectionModel().getSelectedIndex());
            noteListView.getItems().remove(noteListView.getSelectionModel().getSelectedIndex());


        }
    }
@FXML
    public void handleMouseClick(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            editNote();
        } else if (event.getButton() == MouseButton.SECONDARY) {
            removeNote();
        }
    }


}





