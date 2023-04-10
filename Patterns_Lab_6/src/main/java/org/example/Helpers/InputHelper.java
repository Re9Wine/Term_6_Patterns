package org.example.Helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class InputHelper {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(in));

    public static String readTextFromKeyboard() throws IOException {
        try{
            return reader.readLine();
        }
        catch (IOException e) {
            throw new IOException("Keyboard entry error");
        }
    }
}
