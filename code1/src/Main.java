public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("l'attribut taux remuneration est static ");


        CompteBancairRemunerer cptR=new CompteBancairRemunerer(6565,10000,100);
        CompteBancairRemunerer cptRR =new CompteBancairRemunerer(6565,10000,100);
        CompteBancair cpt=new CompteBancair(6969,20000);
        cpt.crediter(88);
        cptR.setTauxremuneration(12) ;
        System.out.println(("bonjour :"+cpt.getsolde()));
        System.out.println(("**************************************************"));

        System.out.println("appeles des attribut de la classe elle meme si l'attribut pas  private faire Objet.attribut");
        System.out.println("***************************");
        System.out.println(("cpt.numcompte="+cpt.getnumcompte()));
        System.out.println("appeles des attribut de la classe elle meme si  l'attribut est private et je suis a lexterieure :faire Objet.getattribut()");
        System.out.println("***************************");
        System.out.println(("cpt.getnumcompte()="+cpt.getnumcompte()));


        cptR.crediter(20000);

        System.out.println("methode calculer"+cptRR.interer_calcule());/**
         chaque fois que je modifie la variable statique
         elleest modifier dans la memeoire et
         surtout similaires danstout les objet crer */




    }
}