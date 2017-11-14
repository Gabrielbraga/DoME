package dome;


public class DVD {
    private String title;
    private String director;
    private double playTime;
    private boolean owned;
    public String comment;

    public DVD(String title, String director, double playTime, boolean owned, String comment) {
        this.title = title;
        this.director = director;
        this.playTime = playTime;
        this.owned = false;
        this.comment = "";
    }

    public boolean isOwned() {
        return owned;
    }

    public void setOwned(boolean owned) {
        this.owned = owned;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    public void print{
    
}
    
}

