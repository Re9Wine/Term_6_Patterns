package org.example.Helpers;

// класс-парсер
public class ParseHelper {
    // парс строки в число
    public static int tryParseInt(String data) throws NumberFormatException {
        try{
            return Integer.parseInt(data);
        }
        catch (NumberFormatException ex){
            throw new NumberFormatException("Parse to int error");
        }
    }
}
