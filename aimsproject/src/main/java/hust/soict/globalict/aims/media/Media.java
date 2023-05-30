package hust.soict.globalict.aims.media;

public class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;
    private static int nMedia=0;
    public float getCost() {
        return cost;
    }
    public String getTitle() {
        return title;
    }
    
    public int getId() {
        return id;
    }
    private void updateid(){
        nMedia++;
        this.id = nMedia;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Media))return false;
        Media tmp = (Media) obj;
        return this.title.equals(tmp.title);
    }
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        updateid();
    }
    public Media(String title) {
        this.title = title;
        updateid();
    }
}
