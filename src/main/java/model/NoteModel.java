package model;

import model.entity.Note;
import model.exceptions.NicknameException;

import static view.TextConstant.NOTHING;

public class NoteModel {
    private Note note;
    private UtilityNote utilityNote;

    public NoteModel(Note note) {
        this.note = note;
        utilityNote = new UtilityNote(note);
    }

    public void noteModelStart() throws NicknameException {
        try {
            utilityNote.checkNickname();
        } catch (NicknameException e) {
            utilityNote.getNote().setNickname(NOTHING);
            throw new NicknameException();
        }
    }
}
