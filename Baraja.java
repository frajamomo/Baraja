import java.util.ArrayList;
import java.util.List;

public class Baraja {
    protected List<Carta> cartas;

    public Baraja(){

        Palo[] palos = Palo.values();
        Valor[] valores = Valor.values();

        this.cartas = new ArrayList<>();
        for (Palo palo : palos){
            for (Valor valor : valores){
                Carta carta = new Carta(valor, palo);
                this.cartas.add(carta);
            }

        }
    }

    public String toString(){
        return cartas.toString();
    }


    

}
