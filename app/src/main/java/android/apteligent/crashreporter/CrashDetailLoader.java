package android.apteligent.crashreporter;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import java.util.List;

/**
 * Created by prasannarupan on 11/10/16.
 */
public class CrashDetailLoader extends AsyncTaskLoader<List<CrashDetail>> {
    public CrashDetailLoader(Context context) {
        super(context);
    }

    @Override
    public List<CrashDetail> loadInBackground() {
        List<CrashDetail> crashDetails = CrashReporterAPIHandler.getCrashes();
        return crashDetails;
    }


}
