package controller;

import org.junit.*;
import view.View;

import static org.junit.Assert.*;

public class UtilityControllerTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void inputStringData() {
    }

    @Test
    public void checkRegEx() {
        String locale =
                (String.valueOf(View.bundle.getLocale()).equals("ua")) ? "ua" : "en" ;
        assertEquals("en", locale);
    }
}