package Clase2;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void sumar(int entero){
        this.numerador = (this.denominador * entero) + this.numerador;
    }

    public void sumar(Fraccion otraFraccion){
        this.numerador = (this.denominador * otraFraccion.getNumerador()) +
                        (otraFraccion.getDenominador() * this.numerador);
        this.denominador = this.denominador * otraFraccion.getDenominador();
    }

    public void restar(int entero){
        this.numerador = (this.denominador * entero) - this.numerador;
    }

    public void restar(Fraccion otraFraccion){
        this.numerador = (this.denominador * otraFraccion.getNumerador()) -
                (otraFraccion.getDenominador() * this.numerador);
        this.denominador = this.denominador * otraFraccion.getDenominador();
    }

    public void multiplicar(int entero){
        this.numerador = this.numerador * entero;
    }

    public void multiplicar(Fraccion otraFraccion){
        this.numerador = this.numerador * otraFraccion.getNumerador();
        this.denominador = this.denominador * otraFraccion.getDenominador();
    }

    public void dividir(int entero){
        this.denominador = this.denominador * entero;
    }

    public void dividir(Fraccion otraFraccion){
        this.numerador = this.numerador * this.getDenominador();
        this.denominador = this.denominador * this.getNumerador();
    }

    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }
}
