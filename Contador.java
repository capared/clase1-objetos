package Clase2;

public class Contador {
    private int valor;

    public Contador() {
    }

    public Contador(int valor) {
        this.valor = valor;
    }

    public Contador(Contador otroContador) {
        this.valor = otroContador.getValor();
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void incrementar(){
        this.valor++;
    }

    public void decrementar(){
        this.valor--;
    }
}
