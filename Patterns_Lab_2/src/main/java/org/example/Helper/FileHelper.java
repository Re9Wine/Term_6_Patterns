package org.example.Helper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHelper {
    public static String readFile(String filePath) throws IOException {
        try {
            FileReader fileReader = new FileReader(filePath);
            Scanner scanner = new Scanner(fileReader);
            StringBuilder data = new StringBuilder();

            while(scanner.hasNextLine()){
                data.append(scanner.nextLine());
            }

            fileReader.close();

            return data.toString();
        }
        catch (IOException e){
            throw new IOException("Ошибка при чтении файла (возможно вы указали неверный путь к файлу)");
        }
    }

    public static void writeFile(String filePath, String data) throws IOException{
        try{
            FileWriter fileWriter = new FileWriter(filePath, false);

            fileWriter.write(data);
            fileWriter.flush();
            fileWriter.close();
        }
        catch (IOException e){
            throw new IOException("Ошибка при записи данных в файл (возможно вы указали неверный путь к файлу)");
        }
    }
}
