package android.apteligent.crashreporter;

import android.util.Log;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by prasannarupan on 11/7/16.
 */

public class APICaller {

    private static final OkHttpClient client = new OkHttpClient();
    private static final OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
    private static final String TAG = APICaller.class.getName();
    private static final String endPoint = "https://developers.crittercism.com";

    public static Response makeGetRequest(Map<String, String> headers, List<Interceptor> interceptorList, String resourcePath) {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        okhttp3.Response response = null;
        Request.Builder builder = new Request.Builder();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            builder.addHeader(key, value);
        }
        String url = endPoint + resourcePath;
        builder.url(url);
        Request request = builder.build();
        okHttpClientBuilder.addNetworkInterceptor(httpLoggingInterceptor);
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            Log.d(TAG, e.getMessage());
        }
        return response;
    }


}
