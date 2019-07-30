package model;

import model.entity.Note;

import static view.TextConstant.NOTHING;

public class NoteModel {
    private Note note;


    public NoteModel(Note note) {
        this.note = note;
    }

    public void noteModelStart() throws Exception {
        UtilityNote utilityNote = new UtilityNote(note);
        try {
            utilityNote.checkNickname();
        } catch (Exception e) {
            utilityNote.getNote().setNickname(NOTHING);
            throw new Exception();
        }
    }
}
