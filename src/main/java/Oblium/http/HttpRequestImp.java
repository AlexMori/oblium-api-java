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

/**
 * MIT License
 * <p>
 * Copyright (c) 2023 Alex Canton
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

public class HttpRequestImp {

    public final String API_KEY_FIELD = "api_key";

    public InputStream Request(Map<String,String> params, String ...pathSegments) throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

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
