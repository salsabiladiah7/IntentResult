package com.salsabila.intentresult2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EditNameActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "EXTRA_NAME";
    public static final String EXTRA_DATE = "EXTRA_DATE";
    public static final String EXTRA_AGE = "EXTRA_AGE";
    public static final String EXTRA_HOBBY = "EXTRA_HOBBY";
    public static final String EXTRA_EMAIL = "EXTRA_EMAIL";
    @BindView(R.id.editText2)
    EditText editText2;
    @BindView(R.id.btn_save)
    Button btnSave;
    @BindView(R.id.bio)
    TextView bio;
    @BindView(R.id.editText3)
    EditText editText3;
    @BindView(R.id.editText4)
    EditText editText4;
    @BindView(R.id.editText5)
    EditText editText5;
    @BindView(R.id.editText6)
    EditText editText6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_name);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_save)
    public void onViewClicked() {
        String name = editText2.getText().toString();
        String date = editText3.getText().toString();
        String age = editText4.getText().toString();
        String hobby = editText5.getText().toString();
        String email = editText6.getText().toString();
        Intent intent = new Intent();
        intent.putExtra(EXTRA_NAME, name);
        intent.putExtra(EXTRA_DATE, date);
        intent.putExtra(EXTRA_AGE, age);
        intent.putExtra(EXTRA_HOBBY, hobby);
        intent.putExtra(EXTRA_EMAIL, email);
        setResult(RESULT_OK, intent);
        finish();
    }
}