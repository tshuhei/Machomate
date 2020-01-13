package shuhei.muscleapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class RewardAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;

    RewardAdapter(Context applicationContext){
        this.context = applicationContext;
        inflater = LayoutInflater.from(applicationContext);
    }

    ListView rewardList;
    String itemList[] = {"Protein", "Organic Protein", "EAA", "BCAA", "Creatine", "Glutamine", "HMB", "Energy Drink","Wrist Wrap", "Training Tube", "Lifting Belt", "Ab-Roller", "Push-Up Bars"};
    int itemImages[] = {R.drawable.supplement, R.drawable.dumbbell};

    @Override
    public int getCount() {
        return itemList.length;
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
        view = inflater.inflate(R.layout.list_reward, null);
        TextView item_name = (TextView)view.findViewById(R.id.item_name);
        TextView item_description = (TextView)view.findViewById(R.id.item_description);
        TextView point = (TextView)view.findViewById(R.id.point);
        item_name.setText(itemList[i]);
        return view;
    }
}
