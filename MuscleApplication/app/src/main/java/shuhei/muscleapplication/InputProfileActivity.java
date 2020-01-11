package shuhei.muscleapplication;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class InputProfileActivity extends AppCompatActivity {
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_profile);
        setTitle(R.string.inputprofile);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        next = (Button)findViewById(R.id.done);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadImputPhotoView();
            }
        });

    }

    public void loadImputPhotoView(){
        Intent intent = new Intent(this, ImputPhotoActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
