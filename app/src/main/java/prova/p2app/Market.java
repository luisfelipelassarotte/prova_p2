package prova.p2app;

public class Market {
    private String title;
    private String subtitle;
    private int imageResourceId;
    private float rate;
    private float price;

    public Market(String title, String subtitle, int imageResourceId, float price, float rate) {
        this.title = title;
        this.subtitle = subtitle;
        this.imageResourceId = imageResourceId;
        this.price = price;
        this.rate = rate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}