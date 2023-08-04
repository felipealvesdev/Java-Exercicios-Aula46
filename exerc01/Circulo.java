package javabasico.aula46.interfaceeheranca.exercicios.exerc01;

public class Circulo extends Figura2D implements DimensaoSuperficial{

    @Override
    public double calcularArea(double raio, double pi) {
        pi = 3.14;
        return 2*raio*pi;
    }
}
