package android.apteligent.crashreporter;

import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class CrashTypeActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<CrashDetail>> {

    private ListView crashTypesLV;
    private LVAdapter lvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crash_type);
        crashTypesLV = (ListView) findViewById(R.id.lv_crash_types);
        lvAdapter = new LVAdapter(this);
        crashTypesLV.setAdapter(lvAdapter);
        getSupportLoaderManager().initLoader(1, null, this).forceLoad();

    }


    @Override
    public Loader<List<CrashDetail>> onCreateLoader(int id, Bundle args) {
        return new CrashDetailLoader(CrashTypeActivity.this);
    }

    @Override
    public void onLoadFinished(Loader<List<CrashDetail>> loader, List<CrashDetail> data) {
        lvAdapter.setCrashDetails(data);
        lvAdapter.notifyDataSetChanged();
    }

    @Override
    public void onLoaderReset(Loader<List<CrashDetail>> loader) {
        lvAdapter.setCrashDetails(new ArrayList<CrashDetail>());
        lvAdapter.notifyDataSetChanged();
    }
}
