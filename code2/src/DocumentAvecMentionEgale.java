public class DocumentAvecMentionEgale extends Document{
    private String Mentionlegales;

    public DocumentAvecMentionEgale(String titre, String texte,
                                    String mentionlegales) {
        super(titre, texte);
        Mentionlegales = mentionlegales;
    }


    public String getMentionlegales() {
        return Mentionlegales;
    }
    @Override
    public int nbCar(){
        int debut=super.nbCar();

        return debut+this.Mentionlegales.length();




    }
    @Override
    public String export(){
        String impressiondebut =super.export();
        return impressiondebut+Mentionlegales;

    }
}
/**public class DocumentMentionsLegales extends Document { fac
 private String mentionsLegales;

 public DocumentMentionsLegales(String titre, String texte, String mentionsLegales) {
 super(titre, texte);
 this.mentionsLegales = mentionsLegales;
 }
 public String export() {
 return super.export()+" "+mentionsLegales;
 }
 }
*/
