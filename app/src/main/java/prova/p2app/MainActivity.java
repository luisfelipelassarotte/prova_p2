package prova.p2app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        MarketRepository marketRepository = new MarketRepository();
        List<Market> itemList = marketRepository.getMarketList();

        MarketAdapter adapter = new MarketAdapter(this, itemList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Market market = itemList.get(position);

                Intent intent = new Intent(MainActivity.this, MarketDetailActivty.class);
                intent.putExtra("title", market.getTitle());
                intent.putExtra("content", market.getSubtitle());
                intent.putExtra("image", market.getImageResourceId());
                intent.putExtra("rate", market.getRate());
                intent.putExtra("price", market.getPrice());

                startActivity(intent);
            }
        });
    }
}
