public class Main {
    public static void main(String[] args) {
        Document doc=new Document ("document","voila le texte ");
        DocumentAvecMentionEgale docMention=new DocumentAvecMentionEgale ("document","voila le texte ","mention legale");
        DocumentCrypte doccrypter= new DocumentCrypte("titre_du document crypter","texte_du document crypter");
        System.out.println("nombre de caracteres de doc:"+doc.nbCar());
        System.out.println("voila un document crypter:"+DocumentCrypte.crypter("texte"));
        System.out.println("methode export sur doccrypter :"+doccrypter.export());





    }
}