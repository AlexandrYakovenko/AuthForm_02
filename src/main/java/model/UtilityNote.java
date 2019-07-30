package model;

import model.entity.Note;
import model.entity.NoteDB;

public class UtilityNote {
    private Note note;
    private NoteDB[] noteDB;

    public UtilityNote(Note note) {
        this.note = note;
    }

    public Note getNote() {
        return note;
    }

    public void checkNickname() throws Exception {
        noteDB = NoteDB.values();
        for (NoteDB e : noteDB) {
            if ((e.getNickname()).equals(note.getNickname())) {
                throw new Exception("Rewrite Nickname");
            }
        }

        writeDataToDB(noteDB, note);
    }

    public void writeDataToDB(NoteDB[] noteDB, Note note) {
        noteDB = NoteDB.values();
        noteDB[2].
                setSurname(note.getSurname());
        noteDB[2].
                setName(note.getName());
        noteDB[2].
                setPatronymic(note.getPatronymic());
        noteDB[2].
                setNickname(note.getNickname());
        noteDB[2].
                setComment(note.getComment());
        noteDB[2].
                setGroup(note.getGroup());
        noteDB[2].
                setHomeNumber(note.getHomeNumber());
        noteDB[2].
                setFirstMobileNumber(note.getFirstMobileNumber());
        noteDB[2].
                setSecondMobileNumber(note.getSecondMobileNumber());
        noteDB[2].
                setEmail(note.getEmail());
        noteDB[2].
                setSkype(note.getSkype());
        noteDB[2].
                setIndex(note.getIndex());
        noteDB[2].
                setCity(note.getCity());
        noteDB[2].
                setStreet(note.getStreet());
        noteDB[2].
                setHouseNumber(note.getHouseNumber());
        noteDB[2].
                setFlatNumber(note.getFlatNumber());
        noteDB[2].
                setRegistrationDate(note.getRegistrationDate());
        noteDB[2].
                setChangingDataDate(note.getChangingDataDate());
    }

}
