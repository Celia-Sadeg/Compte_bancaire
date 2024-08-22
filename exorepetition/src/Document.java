public class Document {
    private String titre;
    private String texte;
    public Document(String titre,String texte ){

    }
    public int nbCar(){
        return titre.length()+texte.length();
    }
    public String export(){
        return texte;

    }

}
