package Logica;

public abstract class Producto {
    public abstract String consumir();
    public String toString() {
        return "Serie: " + this.hashCode() + ", Producto: " + consumir();
    }
}
