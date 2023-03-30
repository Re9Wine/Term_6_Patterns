package org.example.Helpers;

public class ParseHelper {
    public static int tryParseInt(String data) throws NumberFormatException {
        try{
            return Integer.parseInt(data);
        }
        catch (NumberFormatException ex){
            throw new NumberFormatException("Parse to int error");
        }
    }
}
