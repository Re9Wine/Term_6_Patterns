package org.example.View;

import java.util.List;

public class ListView {
    public static  <T> void printList(List<T> list){
        if(list == null || list.isEmpty()){
            System.out.println("Пусто");
        } else {
            for(T item: list){
                System.out.println(item);
            }
        }
    }
}
