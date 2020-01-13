package shuhei.muscleapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private String[] nameList;

    public CustomAdapter(Context applicationContext, String[] nameList){
        this.context = context;
        inflater = LayoutInflater.from(applicationContext);
        this.nameList = nameList;
    }

    @Override
    public int getCount() {
        return nameList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.list_home, null);
        TextView name = (TextView)view.findViewById(R.id.name);
        TextView gender = (TextView)view.findViewById(R.id.gender);
        TextView workoutExperience = (TextView)view.findViewById(R.id.workoutExperience);
        TextView height = (TextView)view.findViewById(R.id.height);
        TextView Weight = (TextView)view.findViewById(R.id.weight);
        name.setText(nameList[i]);
        return view;
    }
}
