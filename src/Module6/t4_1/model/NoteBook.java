package Module6.t4_1.model;

import java.util.ArrayList;

public class NoteBook {

    ArrayList<Note> notes = new ArrayList<>();

    public NoteBook() {
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public Note getLatestNote() {
        return notes.get(notes.size() - 1);
    }

    public Note getNoteByIndex(int index) {
        return notes.get(index);
    }

    public void removeNoteByIndex(int index) {
        notes.remove(index);
    }

}
