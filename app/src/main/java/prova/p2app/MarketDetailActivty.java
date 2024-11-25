package prova.p2app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MarketDetailActivty extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String content = intent.getStringExtra("content");
        String price = intent.getStringExtra("price");
        int imageResourceId = intent.getIntExtra("image", -1);

        TextView titleTextView = findViewById(R.id.detailNewsTitle);
        TextView contentTextView = findViewById(R.id.detailNewsContent);
        TextView priceTextView = findViewById(R.id.detailMarketPrice);
        ImageView imageView = findViewById(R.id.detailNewsImage);
        Button backButton = findViewById(R.id.backButton);

        titleTextView.setText(title);
        contentTextView.setText(content);
        priceTextView.setText(price);
        imageView.setImageResource(imageResourceId);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(MarketDetailActivty.this, MainActivity.class);
                startActivity(backIntent);
            }
        });
    }
}
