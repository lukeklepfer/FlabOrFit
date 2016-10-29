package lukeklepfer.com.flaborfit;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView excersizeTitle = (TextView)findViewById(R.id.excersizeTitle);
        ImageView excersizeImage = (ImageView)findViewById(R.id.excersizeImage);
        LinearLayout mainBG = (LinearLayout)findViewById(R.id.mainBG);
        String excercizeTxt = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE); //grabs string out of the intent

        excersizeTitle.setText(excercizeTxt);

        if (excercizeTxt.equalsIgnoreCase(MainActivity.EXCERCISE_WEIGHT)){
            excersizeImage.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#2ca5f5"));
        }
        else if (excercizeTxt.equalsIgnoreCase(MainActivity.EXCERCISE_YOGA)){
            excersizeImage.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#916bcd"));
        }
        else if (excercizeTxt.equalsIgnoreCase(MainActivity.EXCERCISE_CARDIO)){
            excersizeImage.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#52ad56"));
        }



    }
}
