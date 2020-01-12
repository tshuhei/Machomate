package shuhei.muscleapplication;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class InputProfileActivity extends AppCompatActivity {
    Button next;
    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    private DatabaseReference mDatabase;
    private String mUserId;
    private RadioGroup userTypeRadioGroup;
    private RadioGroup genderRadioGroup;
    private RadioGroup workoutExperienceRadioGroup;
    private EditText inputHeight;
    private EditText inputWeight;
    private EditText inputNickname;
    private EditText inputIntroduction;
    private String strUserType;
    private String strGender;
    private String strWorkoutExperience;
    private String strHeight;
    private String strWeight;
    private String strNickname;
    private String strIntroduction;

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
                strHeight = inputHeight.getText().toString();
                strWeight = inputWeight.getText().toString();
                strNickname = inputNickname.getText().toString();
                strIntroduction = inputIntroduction.getText().toString();

                mFirebaseAuth = FirebaseAuth.getInstance();
                mFirebaseUser = mFirebaseAuth.getCurrentUser();
                mDatabase = FirebaseDatabase.getInstance().getReference();

                if(mFirebaseUser == null){
                    Log.println(0,"login","user not login");
                }else{
                    mUserId = mFirebaseUser.getUid();
                    mDatabase.child("users").child(mUserId).child("items").child("usertype").setValue(strUserType);
                    mDatabase.child("users").child(mUserId).child("items").child("gender").setValue(strGender);
                    mDatabase.child("users").child(mUserId).child("items").child("experience").setValue(strWorkoutExperience);
                    mDatabase.child("users").child(mUserId).child("items").child("height").setValue(strHeight);
                    mDatabase.child("users").child(mUserId).child("items").child("weight").setValue(strWeight);
                    mDatabase.child("users").child(mUserId).child("items").child("nickname").setValue(strNickname);
                    mDatabase.child("users").child(mUserId).child("items").child("introduction").setValue(strIntroduction);
                }

                loadImputPhotoView();
            }
        });

        userTypeRadioGroup = (RadioGroup)findViewById(R.id.userTypeRadioGroup);
        genderRadioGroup = (RadioGroup)findViewById(R.id.genderRadioGroup);
        workoutExperienceRadioGroup = (RadioGroup)findViewById(R.id.workoutExperienceRadioGroup);
        inputHeight = (EditText)findViewById(R.id.inputHeight);
        inputWeight = (EditText)findViewById(R.id.inputWeight);
        inputNickname = (EditText)findViewById(R.id.inputNickname);
        inputIntroduction = (EditText)findViewById(R.id.inputIntroduction);

        userTypeRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton userType = (RadioButton)findViewById(i);
                strUserType = userType.getText().toString();
            }
        });

        genderRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton gender = (RadioButton)findViewById(i);
                strGender = gender.getText().toString();
            }
        });

        workoutExperienceRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton workoutExperience = (RadioButton)findViewById(i);
                strWorkoutExperience = workoutExperience.getText().toString();
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
