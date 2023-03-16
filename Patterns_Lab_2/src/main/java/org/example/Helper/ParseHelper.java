package org.example.Helper;

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
