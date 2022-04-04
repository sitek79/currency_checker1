package ru.dudeandrey;

/**
 * This example uses the Apache HTTPComponents library.
 */

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

public class RequestHTTPGet {

    //private static String apiKey = "1c22c593-0562-42ad-819d-581ee79d5bb4";
    // loading API_KEY from config.properties
    private static String apiKey = ReadProperties.loadProperty("API_KEY");

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
                System.out.println(price);
                //
                String price2 = String.valueOf(jsonObject2.get("ADA").getAsJsonObject().toString()); // получить поле "ADA" как массив
                System.out.println("Это строка");
                System.out.println(price2);
                //JsonArray ada = jsonObject.getAsJsonArray("data");
                //JsonArray ada = (JsonArray) jsonObject.get("data");
                //System.out.println(ada);
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