package shuhei.muscleapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private List<UserItem> userList;

    public CustomAdapter(Context applicationContext, List<UserItem> userList){
        this.context = applicationContext;
        inflater = LayoutInflater.from(applicationContext);
        this.userList = userList;
    }

    @Override
    public int getCount() {
        return userList.size();
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
        TextView weight = (TextView)view.findViewById(R.id.weight);
        TextView id = (TextView)view.findViewById(R.id.id);
        UserItem userItem = userList.get(i);
        String userId = userItem.getUserId();
        name.setText(userItem.getNickName());
        gender.setText(userItem.getGender());
        workoutExperience.setText(userItem.getWorkoutExperience());
        height.setText(userItem.getHeight());
        weight.setText(userItem.getWeight());
        id.setText(userItem.getUserId());
        return view;
    }
}
