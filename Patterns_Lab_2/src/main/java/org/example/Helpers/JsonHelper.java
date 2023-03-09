package org.example.Helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.util.ArrayList;
import java.util.List;

public class JsonHelper {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static <T> T Deserialize(String data, Class<T> tClass) throws JsonProcessingException {
        try{
            JavaType javaType = objectMapper.getTypeFactory().constructType(tClass);

            return objectMapper.readValue(data, javaType);
        }
        catch (JsonProcessingException ex){
            throw new JsonProcessingException("Ошибка десереализации данных"){};
        }
    }
    public static <T> List<T> DeserializeList(String data, Class<T> tClass) throws JsonProcessingException {
        try{
            CollectionType collectionType = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, tClass);

            return objectMapper.readValue(data, collectionType);
        }
        catch (JsonProcessingException ex){
            throw new JsonProcessingException("Ошибка десереализации данных"){};
        }
    }


    public static <T> String Serialize(T data) throws JsonProcessingException {
        try {
            return objectMapper.writeValueAsString(data);
        } catch (JsonProcessingException ex) {
            throw new JsonProcessingException("Ошибка сереализации данных") {
            };
        }
    }
}
