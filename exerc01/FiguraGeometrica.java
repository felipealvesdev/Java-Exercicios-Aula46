package javabasico.aula46.interfaceeheranca.exercicios.exerc01;

public abstract class FiguraGeometrica {
    private String nome;
    private String cor;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
}
