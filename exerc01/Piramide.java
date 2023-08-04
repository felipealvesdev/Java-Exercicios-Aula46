package javabasico.aula46.interfaceeheranca.exercicios.exerc01;

public class Piramide extends Figura3D implements DimensaoVolumetrica{

    @Override
    public double calcularVolume(double altura, double areaBase){
        return (altura*areaBase)/3;
    }
}
