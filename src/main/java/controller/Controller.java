package controller;

import model.exceptions.NicknameException;
import model.entity.Note;
import model.NoteModel;
import view.View;

import java.util.Scanner;

import static view.TextConstant.INPUT_NICKNAME;

public class Controller {
    private Note note;
    private View view;

    public Controller(Note note, View view) {
        this.note = note;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNote inputNote = new InputNote(note, view, sc);
        note = inputNote.writeNote();

        NoteModel noteModel = new NoteModel(note);
        boolean isTrue = false;
        while (!isTrue) {
           try {
               noteModel.noteModelStart();
               isTrue = true;
           } catch (NicknameException e) {
               note = inputNote.rewriteNickname(note);
           }
        }

        view.printMessage(note.toString());
    }
}
