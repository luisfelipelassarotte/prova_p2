package prova.p2app;

import static android.content.Intent.getIntent;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class MarketAdapter extends ArrayAdapter<Market> {

    List<Market> itemList;

    public MarketAdapter(@NonNull Context context, List<Market> itemList) {
        super(context, 0, itemList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Market currentItems = getItem(position);
        TextView titleTextView = convertView.findViewById(R.id.newsTitle);
        TextView subtitleTextView = convertView.findViewById(R.id.newsSubtitle);
        TextView precoTextView = convertView.findViewById(R.id.preco);
        ImageView imageView = convertView.findViewById(R.id.newsImage);
        RatingBar ratingBar = convertView.findViewById(R.id.rating);

        titleTextView.setText(currentItems.getTitle());
        subtitleTextView.setText(currentItems.getSubtitle());
        precoTextView.setText(String.format("R$ %.2f", currentItems.getPrice()));
        imageView.setImageResource(currentItems.getImageResourceId());
        float scaledRate = currentItems.getRate() / 2.0f;
        ratingBar.setRating(scaledRate);

        return convertView;
    }
}
