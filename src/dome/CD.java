package dome;

/**
 *
 * @author gabriel.braga
 */
public class CD {
    
    private String title;
    private String artist;
    private int numberOfTracks;
    private double playingTime;
    private boolean owned;
    private String comment;

    public CD(String title, String artist, int numberOfTracks, double playingTime) {
        this.title = title;
        this.artist = artist;
        this.numberOfTracks = numberOfTracks;
        this.playingTime = playingTime;
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
    
    
    

}
