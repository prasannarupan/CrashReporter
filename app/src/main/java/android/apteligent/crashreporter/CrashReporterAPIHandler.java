package android.apteligent.crashreporter;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.Response;

/**
 * Created by prasannarupan on 11/8/16.
 */

public class CrashReporterAPIHandler {

    private static final String TAG = CrashReporterAPIHandler.class.getSimpleName();

    public static List<CrashDetail> getCrashes() {

        String crashSummaryUrl = "/v1.0/app/519d53101386202089000007/crash/summaries";
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer 5a839540a09f12373e52c7c82680318e");
        Response crashDetailsList = APICaller.makeGetRequest(headers, null, crashSummaryUrl);
        Type listType = new TypeToken<ArrayList<CrashDetail>>() {
        }.getType();
        return new GsonBuilder().create().fromJson(crashDetailsList.body().charStream(), listType);

    }
}
