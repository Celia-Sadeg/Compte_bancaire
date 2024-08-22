public class Document {
    private String titre;
    private String texte;


    public Document(String titre, String texte) {
        this.titre = titre;
        this.texte = texte;
    }

    public int nbCar() {
        return titre.length() + texte.length();

    }

    public String export() {
        return "#"+titre+"\n" +
                "#"+texte+"\n";

    }
}
        /** retourne document_imprimer



    }

    public String getTitre() {
        return titre;
    }

    public String getTexte() {
        return texte;
    }

    @Override
    public String toString() {
        return "Document{" +
                "titre='" + titre + '\'' +
                ", texte='" + texte + '\'' +
                '}';
    }
}
/**public class

 Document {
 private String titre;
 private String texte;
 public Document(String titre, String texte) {
 this.titre = titre;
 this.texte = texte;
 }

 public int nbCars() {
 return titre.length()+texte.length();
 }
 public String export() {
 //return titre+" "+texte;
 return "# "+titre+"\n"+texte;
 }
 }*/
