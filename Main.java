public class Main{
    public static void main(String[] args){

        Personaje guerrero = new Personaje("Guerrero", 100, 30);
        Personaje mago = new Personaje("Mago", 80, 40);

        guerrero.atacar(mago);
        mago.atacar(guerrero);

        guerrero.atacar(mago);
        mago.atacar(guerrero);
    }
}