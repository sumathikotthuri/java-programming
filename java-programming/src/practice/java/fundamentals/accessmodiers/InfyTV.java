package practice.java.fundamentals.accessmodiers;

public class InfyTV {

    private String photographer;
    private String newsReporter;
    private String correspondant;


    
    public String getPhotographer() {
        return photographer;
    }



    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }



    public String getNewsReporter() {
        return newsReporter;
    }



    public void setNewsReporter(String newsReporter) {
        this.newsReporter = newsReporter;
    }



    public String getCorrespondant() {
        return correspondant;
    }



    public void setCorrespondant(String correspondant) {
        this.correspondant = correspondant;
    }



    void documentaryFilm(){
        System.out.println("A hundred years ago 100,000 tigres in the world."+
        " Today there are as few as 3,200. Why are tigers disappearing?...");
        System.out.println("By Correspondant: "+correspondant);
        System.out.println("Photographer: "+photographer);
        System.out.println("News Reporter: "+newsReporter);
        
    }

    
}
