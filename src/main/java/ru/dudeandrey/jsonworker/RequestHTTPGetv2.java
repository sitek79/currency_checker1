package ru.dudeandrey.jsonworker;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
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
import ru.dudeandrey.ReadProperties;
import ru.dudeandrey.jsonobject.Data;
import ru.dudeandrey.jsonobject.Example;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class RequestHTTPGetv2 {
    //private static String apiKey = "1c22c593-0562-42ad-819d-581ee79d5bb4";
    // loading API_KEY from config.properties
    private static String apiKey = ReadProperties.loadProperty("API_KEY");

    public void requestHTTPGetv2() {
        String uri = "https://pro-api.coinmarketcap.com/v2/cryptocurrency/quotes/latest";
        List<NameValuePair> parameters = new ArrayList<NameValuePair>();
        //paratmers.add(new BasicNameValuePair("start","1"));
        //paratmers.add(new BasicNameValuePair("limit","5000"));
        //paratmers.add(new BasicNameValuePair("convert","USD"));
        parameters.add(new BasicNameValuePair("symbol","ADA"));
        parameters.add(new BasicNameValuePair("convert","RUB"));

        try {
            String result = makeAPICallv2(uri, parameters);
            System.out.println("Result");
            System.out.println(result);
            // построим объект
            try {
                //Gson gson = new Gson();
                //Example example = gson.fromJson(result, Example.class);
                //Codebeautify example = gson.fromJson(makeAPICallv2(uri, parameters), Codebeautify.class);
                //Status status = gson.fromJson(result, Root.class)
                //status.getTimestamp();
                //System.out.println(status);
                //
                ObjectMapper om = new ObjectMapper();
                //Root root = om.readValue(result, Root.class);
                Status root = om.readValue(result, Status.class);
                //System.out.println(root.toString());
                //
            } catch (JsonSyntaxException jsonSyntaxException) {
                System.out.println("jsonSyntaxException" + jsonSyntaxException);
            } catch (JsonIOException jsonIOException) {
                System.out.println("jsonIOException" + jsonIOException);
            }
        } catch (URISyntaxException | IOException e) {
            System.out.println("Error: Invalid URL " + e.toString());
        }
    }

    public static String makeAPICallv2(String uri, List<NameValuePair> parameters)
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
