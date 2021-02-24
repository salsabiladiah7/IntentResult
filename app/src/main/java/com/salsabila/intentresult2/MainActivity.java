package com.salsabila.intentresult2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final int RC_EDIT_NAME = 112;
    @BindView(R.id.text_view_result)
    TextView textViewResult;
    @BindView(R.id.btn_edit)
    Button btnEdit;
    @BindView(R.id.text_view_result2)
    TextView textViewResult2;
    @BindView(R.id.bio)
    TextView bio;
    @BindView(R.id.text_view_result3)
    TextView textViewResult3;
    @BindView(R.id.text_view_result4)
    TextView textViewResult4;
    @BindView(R.id.text_view_result5)
    TextView textViewResult5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_edit)
    public void onViewClicked() {
        Intent intent = new Intent(this, EditNameActivity.class);
        startActivityForResult(intent, RC_EDIT_NAME);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_EDIT_NAME && resultCode == RESULT_OK) {
            String name = data.getExtras().getString(EditNameActivity.EXTRA_NAME);
            String date = data.getExtras().getString(EditNameActivity.EXTRA_DATE);
            String age = data.getExtras().getString(EditNameActivity.EXTRA_AGE);
            String hobby = data.getExtras().getString(EditNameActivity.EXTRA_HOBBY);
            String email = data.getExtras().getString(EditNameActivity.EXTRA_EMAIL);
            textViewResult.setText(name);
            textViewResult2.setText(date);
            textViewResult3.setText(age);
            textViewResult4.setText(hobby);
            textViewResult5.setText(email);
        }
    }

}