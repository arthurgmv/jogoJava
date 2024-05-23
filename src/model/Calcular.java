package model;

import java.util.Random;

public class Calcular {
    private int dificuldade;
    private int valor1;
    private int valor2;
    private int operacao;
    private int resultado;

    public Calcular(int dificuldade){
        Random rand = new Random();
        this.operacao = rand.nextInt(3);
        this.dificuldade = dificuldade;

        if(dificuldade == 1){
            //fácil
            this.valor1 = rand.nextInt(10); //de 0 a 9
            this.valor2 = rand.nextInt(10); //de 0 a 9
        } else if (dificuldade == 2) {
            //médio
            this.valor1 = rand.nextInt(100); //de 0 a 99
            this.valor2 = rand.nextInt(100); //de 0 a 99
        } else if (dificuldade == 3){
            //difícil
            this.valor1 = rand.nextInt(1000); //de 0 a 999
            this.valor2 = rand.nextInt(1000); //de 0 a 999
        } else if (dificuldade == 4){
            //muito difícil
            this.valor1 = rand.nextInt(10000); //de 0 a 9999
            this.valor2 = rand.nextInt(10000); //de 0 a 9999
        } else {
            //insano
            this.valor1 = rand.nextInt(100000); //de 0 a 99999
            this.valor2 = rand.nextInt(100000); //de 0 a 99999
        }
    }

    // Getter para dificuldade
    public int getDificuldade() {
        return dificuldade;
    }

    // Getter para valor1
    public int getValor1() {
        return valor1;
    }

    // Getter para valor2
    public int getValor2() {
        return valor2;
    }

    // Getter para operacao
    public int getOperacao() {
        return operacao;
    }

    // Getter para resultado
    public int getResultado() {
        return resultado;
    }

    public String toString(){
        String op;
        if(this.getOperacao() == 0) {
            op = "Somar";
        } else if (this.getOperacao()==1) {
            op = "Diminuir";
        } else if (this.getOperacao()== 2) {
            op = "Multiplicar";
        } else  {
            op = "Operação desconhecida";
        }
        return "Valor 1: " + this.getValor1() +
                "\nValor 2: " + this.getValor2() +
                "\nDificuldade: " + this.getDificuldade() +
                "\nOperação: " + op;

    }

    public boolean somar(int resposta){
        this.resultado = this.getValor1() + this.getValor2();
        boolean certo = false;
        if (resposta == this.getResultado()){
            System.out.println("Resposta correta!");
        } else {
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.resultado);
        return certo;
    }
    public boolean subtrair(int resposta) {
        this.resultado = this.getValor1() - this.getValor2();
        boolean certo = false;
        if (resposta == this.getResultado()) {
            System.out.println("Resposta correta!");
        } else {
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.resultado);
        return certo;
    }

    public boolean multiplicar(int resposta) {
        this.resultado = this.getValor1() * this.getValor2();
        boolean certo = false;
        if (resposta == this.getResultado()) {
            System.out.println("Resposta correta!");
        } else {
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getValor1() + " x " + this.getValor2() + " = " + this.resultado);
        return certo;
    }
}

