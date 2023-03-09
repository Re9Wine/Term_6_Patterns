package org.example.Views;

import java.util.List;

public interface IView {
    void execute();

    default <T> void printList(List<T> list){
        if(list == null || list.isEmpty()){
            System.out.println("Список пуст");
        }
        else {
            for (T item: list){
                System.out.println(item);
            }
        }
    }
}
