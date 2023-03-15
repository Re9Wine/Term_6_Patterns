package org.example.Service;

public class ParseService {
    public static int tryParseInt(String text) throws NumberFormatException{
        try{
            return Integer.parseInt(text);
        }
        catch (NumberFormatException ex){
            throw new NumberFormatException("Строка не содержит число");
        }
    }
}
