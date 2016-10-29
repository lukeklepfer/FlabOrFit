package lukeklepfer.com.flaborfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM_TITLE = "etxra.item.title";
    public static final String EXCERCISE_WEIGHT = "Weight lifting";
    public static final String EXCERCISE_YOGA = "Yoga";
    public static final String EXCERCISE_CARDIO = "Cardio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout weightBtn = (RelativeLayout)findViewById(R.id.weightBtn);
        RelativeLayout yogaBtn = (RelativeLayout)findViewById(R.id.yogaBtn);
        RelativeLayout cardioBtn = (RelativeLayout)findViewById(R.id.cardioBtn);

        weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.EXCERCISE_WEIGHT);
            }
        });
        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.EXCERCISE_YOGA);
            }
        });
        cardioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.EXCERCISE_CARDIO);
            }
        });

    }

    private void loadDetailActivity(String excercizeTitle){
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);//load new activity from this activity
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, excercizeTitle); //pass the title to the new activity
        startActivity(intent);

    }
}
