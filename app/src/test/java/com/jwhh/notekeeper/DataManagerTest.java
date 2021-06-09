package com.jwhh.notekeeper;

import junit.framework.TestCase;

public class DataManagerTest extends TestCase {

    public void testCreateNewNote() {
        DataManager instance = DataManager.getInstance();
        final CourseInfo courseInfo = instance.getCourse("android_async");
        final  String noteTitle ="Test title";
        final String noteText = "kososkos";
        int noteIndex = instance.createNewNote();
        NoteInfo newNote = instance.getNotes().get(noteIndex);
        newNote.setCourse(courseInfo);
        newNote.setTitle(noteTitle);
        newNote.setText(noteText);

        NoteInfo compareNote= instance.getNotes().get(noteIndex);
        assertEquals(compareNote.getCourse(),courseInfo);
        assertEquals(compareNote.getTitle(),noteTitle);
        assertEquals(compareNote.getText(),noteText);


    }
}