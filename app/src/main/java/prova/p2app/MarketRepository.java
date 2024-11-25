package prova.p2app;

import java.util.ArrayList;
import java.util.List;

public class MarketRepository {
    public List<Market> getMarketList() {
        List<Market> marketList = new ArrayList<>();
        marketList.add(new Market("Pizza",
                "Receita Inovadora de Pizza",
                R.drawable.pizza,
                65,
                10));

        marketList.add(new Market("Hamburguer",
                "Receita Inovadora de hamburguer",
                R.drawable.hamburger,
                35.50F,
                4));

        marketList.add(new Market("Sushi",
                "Receita Inivadora de sushi",
                R.drawable.sushi,
                150,
                1));

        marketList.add(new Market("Frutas",
                "Receita Inivadora de fruta",
                R.drawable.fruta,
                12,
                8));

        return marketList;
    }
}
