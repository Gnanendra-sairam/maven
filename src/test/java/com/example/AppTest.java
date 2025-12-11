package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testMessage() {
        assertEquals("Jenkins Maven Build Success!", App.message());
    }
}
