public abstract class Moneda implements Comparable<Moneda>{
    public abstract int getValor();

    public String toString(){
        return "Moneda: " + "n° serie: " + this.hashCode() + " Valor: " + getValor() + ".";
    }
}
