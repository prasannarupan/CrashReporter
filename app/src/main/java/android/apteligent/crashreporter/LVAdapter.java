package android.apteligent.crashreporter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prasannarupan on 11/7/16.
 */

public class LVAdapter extends ArrayAdapter<CrashDetail> {

    private List<CrashDetail> crashes;
    private Context localContext;

    public LVAdapter(Context context) {
        super(context, R.layout.crash_detail);
        localContext = context;
        crashes = new ArrayList<>();
    }


    @Override
    public CrashDetail getItem(int position) {
        return crashes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return crashes.size();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = new ViewHolder();
        if (convertView == null) {
            convertView = LayoutInflater.from(localContext).inflate(R.layout.crash_detail, null);
        }
        viewHolder.tv_crashType = (TextView) convertView.findViewById(R.id.tv_crash_type);
        viewHolder.tv_crashType.setText(crashes.get(position).getName());
        convertView.setTag(viewHolder);
        return convertView;
    }


    public void setCrashDetails(List<CrashDetail> details) {
        crashes.addAll(details);
        notifyDataSetChanged();
    }

    static class ViewHolder {
        TextView tv_crashType;
    }
}
