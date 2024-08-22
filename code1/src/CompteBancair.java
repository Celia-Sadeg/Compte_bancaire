public class CompteBancair {
    private final int numcompte ;
    private float solde ;


    public CompteBancair(int numcompte, float solde){

        this.numcompte=numcompte;
        this.solde=solde;

    }


    public float getsolde(){
        return this.solde;

    }
    public void setSolde(float s){
        this.solde= s;
    }


    public int getnumcompte(){
        return this.numcompte;
    }

    public void crediter(float somme){
        if(somme<0){
            System.out.println("la somme est negtive ");
        }
        else{
            System.out.println(("vous avez reussis a deposer la somme .merci Aurevoir !"));
            this.setSolde(this.solde+somme);
        }



    }
    public void debiter(float somme ){
        if(somme>this.solde){
            System.out.println(("somme inexistante dans le compte esseyer moin"));
        }
        else{
        this.setSolde(this.solde-somme);}

    }
}
