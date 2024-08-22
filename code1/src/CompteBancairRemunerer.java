public class CompteBancairRemunerer extends CompteBancair{

    private float plafond ;
    private static  float tauxremuneration =12;//similaire a toutes
                        // les instances compte bancairesremunerer
                        // n'est pas pris dans le constructeure il est stockre dans la memoire

    public float getTauxremuneration(){
        return this.tauxremuneration;
    }


    public CompteBancairRemunerer(int numcompte,float solde,float plafond ){
        super(numcompte,solde);
        this.plafond=plafond;
    }


    public void setTauxremuneration(float s){/**je peux modifier car pas final*/
         this.tauxremuneration=s;
    }


    /**@Override
    public void  crediter(float somme){

        if(somme>plafond){
            System.out.println("impossibe vous avez depasser le plafond de versement ");
        }

        if(somme<=plafond){
            System.out.println(("vous avez reussis a deposer la somme .merci Aurevoir !"));
            super.crediter(somme);
        }*/
    @Override
    public void crediter(float somme ){
        if(somme >plafond){
            System.out.println("vous avez depasser le plafond");
        }
        else if(somme<=plafond){


            super.crediter(somme );
            System.out.println("vous venez d'ajouter la somme"+somme+" dans un objet fille ");
        }
    }
    public float interer_calcule(){

       return this.getsolde()*this.tauxremuneration;
        /**
         tres important l'attribut est bien sur heritee mais
         Si les attributs de la classe mère sont définis comme private,
         ils ne sont pas directement visibles ou accessibles depuis les classes filles.
         Pour permettre aux classes filles d'accéder à ces attributs,
         vous devez généralement utiliser des méthodes publiques (getters et setters
         */

    }
    public void ajoutInteret(){
        this.setSolde(this.getsolde()+ this.interer_calcule());

    }







}
