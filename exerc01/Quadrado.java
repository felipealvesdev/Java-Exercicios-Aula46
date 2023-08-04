package javabasico.aula46.interfaceeheranca.exercicios.exerc01;

public class Quadrado extends Figura2D implements DimensaoSuperficial{

    @Override
    public double calcularArea(double base, double altura) {
        return base*altura;
    }
}
