
package dome;

public class Database {
    private ArrayList<CD> cds;
    private ArrayList<DVD> dvds;
    
    public Database(){
        cds = new ArrayList<>();
        dvds = new ArrayList<>();        
}
    public void addCD(CD cd){
        cds.add(cd);
    }
    public void addDVD(DVD dvd){
        dvds.add(dvd);
    }        
    
    




}