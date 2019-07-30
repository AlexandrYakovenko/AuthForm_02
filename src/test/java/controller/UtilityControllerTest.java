package controller;

import static org.junit.Assert.*;

import org.junit.*;

import view.View;


public class UtilityControllerTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void inputStringData() {
    }

    @Test
    public void checkRegEx() {
        String locale = View.bundle.getLocale().toString();
        assertEquals("en", locale);
    }
}