package org.example.Helpers;

public class ParseHelper {
    public static int tryParseInt(String text) throws NumberFormatException{
        try{
            return Integer.parseInt(text);
        }
        catch (NumberFormatException ex){
            throw new NumberFormatException("Строка не содержит число");
        }
    }
}
