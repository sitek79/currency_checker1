package ru.dudeandrey;

/**
 * This example uses the Apache HTTPComponents library.
 */

import com.google.gson.*;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RequestHTTPGet {

    //private static String apiKey = "1c22c593-0562-42ad-819d-581ee79d5bb4";
    // loading API_KEY from config.properties
    private static String apiKey = ReadProperties.loadProperty("API_KEY");

    //private static SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");

    public static void requestHTTPGet() {
        String uri = "https://pro-api.coinmarketcap.com/v2/cryptocurrency/quotes/latest";
        List<NameValuePair> parameters = new ArrayList<NameValuePair>();
        //paratmers.add(new BasicNameValuePair("start","1"));
        //paratmers.add(new BasicNameValuePair("limit","5000"));
        //paratmers.add(new BasicNameValuePair("convert","USD"));
        parameters.add(new BasicNameValuePair("symbol","ADA"));
        parameters.add(new BasicNameValuePair("convert","RUB"));

        try {
            String result = makeAPICall(uri, parameters);
            System.out.println("Result");
            System.out.println(result);
            // ------------ разбираем JSON ответ ------------
            // Считываем json
            try {
                // Чтение Gson
                JsonObject rootObject = JsonParser.parseString(result).getAsJsonObject(); //Ok
                System.out.println(rootObject.get("status")); // Ok. Печатаем содержимое root объектов
                System.out.println(rootObject.get("data")); // Ok. Печатаем содержимое root объектов
                JsonObject jsonObject = JsonParser.parseString(String.valueOf(rootObject.get("status"))).getAsJsonObject(); //Ok
                System.out.println(jsonObject.get("timestamp")); // Ok. получить поле "timestamp" как Объект
                String timestamp = jsonObject.get("timestamp").getAsString(); // получить поле "timestamp" как строку
                System.out.println(timestamp);
                JsonObject jsonObject2 = JsonParser.parseString(String.valueOf(rootObject.get("data"))).getAsJsonObject(); //Ok
                String price = String.valueOf(jsonObject2.get("ADA").getAsJsonArray()); // получить поле "ADA" как массив
                String price2 = jsonObject2.get("ADA").getAsJsonArray().toString(); // получить поле "ADA" как массив (выражения эквивалентны)
                System.out.println(price);
                System.out.println(price2);
                //
                JsonObject jsonObject3 = new Gson().fromJson(result, JsonObject.class); // Ok
                System.out.println(jsonObject3.get("status"));
                System.out.println(jsonObject3.get("data"));
                System.out.println(jsonObject3.get("symbol"));
                //System.out.println(jsonObject3.get("email"));
                //
                ObjectMapper mapper = new ObjectMapper();
                try {
                    // convert JSON string to Map
                    // у нас два root объекта: status и data
                    // это сеты: result -> все объекты, jsonObject -> status, jsonObject2 -> data
                    Map<String, String> map = mapper.readValue(jsonObject2.toString(), Map.class);
                    //Map<String, String> map = mapper.readValue(json, new TypeReference<Map<String, String>>() {});
                    System.out.println("All Map");
                    System.out.println(map);
                    // получим весь набор ключей root (status, data)
                    Set<String> keys = map.keySet();
                    System.out.println("All keys"); // все ключи это root объекты
                    System.out.println(keys);
                    // получим объект по ключу ...
                    System.out.println("key ..."); // все ключи это root объекты
                    String first = map.get("name");
                    System.out.println(first);
                    // получить набор всех значений
                    Collection<String> values = map.values();
                    System.out.println("All values");
                    System.out.println(values);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //
            } catch (ClassCastException ecl) {
                // ключ имеет неподходящий тип для этой карты
                System.out.println("key is of an inappropriate type for this map");
            } catch (NullPointerException npex) {
                // указанный ключ равен null и эта карта не допускает нулевых ключей
                System.out.println("Null pointer exception...");
            }
            catch (Exception ex) {
                //System.out.println("Error...");
                ex.printStackTrace();
            }
            //
        } catch (IOException e) {
            System.out.println("Error: cannot access content - " + e.toString());
        } catch (URISyntaxException e) {
            System.out.println("Error: Invalid URL " + e.toString());
        }
    }

    public static String makeAPICall(String uri, List<NameValuePair> parameters)
            throws URISyntaxException, IOException {
        String response_content = "";

        URIBuilder query = new URIBuilder(uri);
        query.addParameters(parameters);

        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet request = new HttpGet(query.build());

        request.setHeader(HttpHeaders.ACCEPT, "application/json");
        request.addHeader("X-CMC_PRO_API_KEY", apiKey);

        CloseableHttpResponse response = client.execute(request);

        try {
            System.out.println(response.getStatusLine());
            HttpEntity entity = response.getEntity();
            response_content = EntityUtils.toString(entity);
            EntityUtils.consume(entity);
        } finally {
            response.close();
        }
        System.out.println("Response_content");
        System.out.println(response_content);
        return response_content;
    }
}