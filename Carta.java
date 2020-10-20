public class Carta {
    private Valor valor;
    private Palo palo;

    public Carta(Valor valor, Palo palo){
        this.valor = valor;
        this.palo = palo;
    }

    public Valor getCartaValor(){
        return valor;
    }

    public Palo getCartaPalo(){
        return palo;
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        output.append(palo.getValue());
        output.append(" - ");
        output.append(valor.getValue());
        output.append("\n");
        return output.toString();
    }
}
