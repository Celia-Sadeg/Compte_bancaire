public class DocumentCrypte extends Document {


    public DocumentCrypte(String titre, String texte) {
        super(titre, texte);}

    public static  String crypter (String s){
            return "textecryptee:----->"+s;}


    @Override
    public  String export() {

        String cryptere=super.export();
        return crypter (cryptere);
    }

    @Override
    public String toString() {

        return "DocumentCrypte{}";}

}
/**public class fac
 DocumentCrypté extends Document{

 public DocumentCrypté(String titre, String texte) {
 super(titre, texte);
 }

 public static  String crypter(String s){
 return s+"je suis cryptée";
 }

 }
**/
