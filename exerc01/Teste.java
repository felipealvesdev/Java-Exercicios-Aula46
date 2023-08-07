package javabasico.aula46.interfaceeheranca.exercicios.exerc01;

public class Teste {
    public static void main(String[] args){
        Cilindro cilindro = new Cilindro();
        Circulo circulo = new Circulo();
        Cubo cubo = new Cubo();
        Piramide piramide = new Piramide();
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];

        cilindro.setNome("Cilindro");
        cilindro.setCor("Rosa");

        circulo.setNome("Circulo");
        circulo.setCor("Amarelo");

        cubo.setNome("Cubo");
        cubo.setCor("Verde");

        piramide.setNome("Piramide");
        piramide.setCor("Ciano");

        quadrado.setNome("Quadrado");
        quadrado.setCor("Cinza");

        triangulo.setNome("Triangulo");
        triangulo.setCor("Preto");

        figuras[0] = cilindro;
        figuras[1] = circulo;
        figuras[2] = cubo;
        figuras[3] = piramide;
        figuras[4] = quadrado;
        figuras[5] = triangulo;

        for(int i = 0; i< figuras.length; i++){
            System.out.print(" "+figuras[i].getNome() +" "+ figuras[i].getCor()+" ");
            if(figuras[i] instanceof Cilindro){
                System.out.println(((Cilindro) figuras[i]).calcularVolume(1,2));
            }else if(figuras[i] instanceof Circulo){
                System.out.println(((Circulo) figuras[i]).calcularArea(21, 3.14));
            }else if(figuras[i] instanceof Cubo){
                System.out.println(((Cubo) figuras[i]).calcularVolume(2, 10));
            }else if(figuras[i] instanceof Piramide){
                System.out.println(((Piramide) figuras[i]).calcularVolume(10,4));
            }else if(figuras[i] instanceof Quadrado){
                System.out.println(((Quadrado) figuras[i]).calcularArea(2,7));
            }else if(figuras[i] instanceof Triangulo){
                System.out.println(((Triangulo) figuras[i]).calcularArea(2,9));
            }
        }
    }
}
