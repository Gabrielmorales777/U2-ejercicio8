public class Personaje {
    private String nombre;
    private int puntosVida;
    private int poderAtaque;

    public Personaje(String nombre, int puntosVida, int poderAtaque){
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.poderAtaque = poderAtaque;

    }
    public void atacar(Personaje oponente){
        if(this.puntosVida <= 0){
            System.out.println(nombre + "no puede atacar poprque no tiene puntos de vida");
            return;
        }
        if(oponente.puntosVida <= 0){
            System.out.println(oponente +"ya esta derrotado");
            return;
        }
System.out.println(nombre +" ataca a " + oponente.nombre);
        oponente.recibirDanio(this.poderAtaque);

    }


    public void recibirDanio(int cantidad){
        if(puntosVida <= 0){
            System.out.println(nombre + " ya esta derrodato");
            return;

        }

        puntosVida -= cantidad;

        if(puntosVida < 0){
            puntosVida = 0;
        }
        System.out.println(nombre +" recibe" + cantidad + " puntos de daño. Vida restante: " + puntosVida);

        if(puntosVida == 0){
            System.out.println(nombre + " ha sido derrotado.");

        }
    }

}
