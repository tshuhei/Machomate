package shuhei.muscleapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
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
    int whichImage[] = {0,0,0,0,0,0,0,0,1,1,1,1,1};
    int itemDescription [] = {R.string.protein_des, R.string.organic_protein_des, R.string.eaa_des, R.string.bcaa_des, R.string.creatine_des, R.string.glutamine_des, R.string.hmb_des, R.string.energy_drink_des, R.string.wrist_wrap_des, R.string.training_tube_des, R.string.lifting_belt_des, R.string.ab_roller_des, R.string.push_up_bars_des};
    String point [] = {"23", "34", "12", "15", "15", "15", "12", "6", "8", "8", "25", "25", "28"};

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
        ImageView icon = (ImageView)view.findViewById(R.id.icon);
        TextView item_name = (TextView)view.findViewById(R.id.item_name);
        TextView item_description = (TextView)view.findViewById(R.id.item_description);
        TextView needed_point = (TextView)view.findViewById(R.id.needed_point);
        item_name.setText(itemList[i]);
        item_description.setText(itemDescription[i]);
        needed_point.setText(point[i]);
        if (whichImage[i] == 0){
            icon.setImageResource(itemImages[0]);
        }
        else/*if (whichImage[i] == 1)*/{
            icon.setImageResource(itemImages[1]);
        }

        return view;
    }
}
