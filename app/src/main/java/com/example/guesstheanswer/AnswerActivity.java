package com.example.guesstheanswer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {
        TextView mtextViewAnswer;
        Button button_return;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        button_return = findViewById(R.id.button_return);
        mtextViewAnswer = findViewById(R.id.text_view_answer);
        String answer = getIntent().getStringExtra("question_answer");
        if (answer != null){

            mtextViewAnswer.setText(answer);
        }


    }
    public void onReturnClicked(View view){
        finish();
    }
}
