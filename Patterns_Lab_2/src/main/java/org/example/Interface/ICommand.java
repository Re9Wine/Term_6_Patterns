package org.example.Interface;

import java.io.IOException;

// интерфейс команды
public interface ICommand {
    // метод запуска команды.
    boolean execute() throws IOException;
}
