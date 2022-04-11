package ru.dudeandrey.jsonworker2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

import static com.google.gson.JsonParser.parseString;

public class ResponseParser {
    private String responseServer;

    public String startParser(String responseServer) {
        this.responseServer = responseServer;
        System.out.println("JSON Processing ...");
        // ------------ разбираем JSON ответ ------------
        try {
            JsonObject rootObject = parseString(responseServer).getAsJsonObject(); //Ok
            System.out.println("Object status");
            System.out.println(rootObject.get("status")); // Ok. Печатаем содержимое root объектов
            System.out.println("Object data");
            System.out.println(rootObject.get("data")); // Ok. Печатаем содержимое root объектов
            JsonObject jsonObject = parseString(String.valueOf(rootObject.get("status"))).getAsJsonObject(); //Ok
            System.out.println(jsonObject.get("timestamp")); // Ok. получить поле "timestamp" как Объект
            String timestamp = jsonObject.get("timestamp").getAsString(); // получить поле "timestamp" как строку
            System.out.println(timestamp);
            JsonObject jsonObject2 = parseString(String.valueOf(rootObject.get("data"))).getAsJsonObject(); //Ok
            System.out.println("this is json data");
            // это наш ответ JSON
            System.out.println(jsonObject2);
            String price = String.valueOf(jsonObject2.get("ADA").getAsJsonArray()); // получить поле "ADA" как массив
            String price2 = jsonObject2.get("ADA").getAsJsonArray().toString(); // получить поле "ADA" как массив (выражения эквивалентны)
            System.out.println(price);
            System.out.println(price2);
            //
            ObjectMapper om = new ObjectMapper();
            Root root = om.readValue(price2, Root.class);

            //
            //ObjectMapper om = new ObjectMapper();
            //Root root = om.readValue(jsonObject, Root.class);
            //Root root = om.convertValue(jsonObject, Root.class);
            //
            /*Gson gson = new Gson();
            Type userListType = new TypeToken<ArrayList<Root>>(){}.getType();
            ArrayList<Root> userArray = gson.fromJson(jsonObject2, userListType);
            //Root root = gson.fromJson(price, Root.class);
            for(Root root : userArray) {
                System.out.println(root);
            } */
        } catch (ClassCastException cce) {
            System.out.println("ClassCastException" + cce.toString());
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return responseServer;
    }
}
