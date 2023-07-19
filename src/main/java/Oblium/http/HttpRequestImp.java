package Oblium.http;

import Oblium.ObliumClient;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;


public class HttpRequestImp {

    public final String API_KEY_FIELD = "api_key";

    public InputStream Request(Map<String,String> params, String ...pathSegments) throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

        // https://obliumfight.com/wp-json/game-api/v1/get_user?api_key={{API_KEY}}&user_id=1
        // Add the api key for every request
        HttpUrl.Builder httpBuilder = new HttpUrl.Builder();

        httpBuilder
            .scheme("https")
            .host("obliumfight.com")
            .addPathSegment("wp-json")
            .addPathSegment("game-api")
            .addPathSegment("v1")
            .addQueryParameter(API_KEY_FIELD, ObliumClient.getOblilumAPIKey());

        if (params != null) {
            for(Map.Entry<String, String> param : params.entrySet()) {
                httpBuilder.addQueryParameter(param.getKey(),param.getValue());
            }
        }

        if (Objects.nonNull(pathSegments))
            Arrays.asList(pathSegments).forEach(httpBuilder::addPathSegments);

        HttpUrl httpUrl = httpBuilder.build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .build();

        Response response = client.newCall(request).execute();

        if (response.isSuccessful())
            return Objects.requireNonNull(response.body()).byteStream();
        else
            throw new IOException();

    }
}
