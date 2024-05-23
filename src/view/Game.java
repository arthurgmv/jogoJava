package view;

import model.Calcular;

import java.util.Scanner;

public class Game {
    static Scanner teclado = new Scanner(System.in);
    static int pontos = 0;
    static Calcular cal;



    public static void main(String[] args) {
        Game.jogar();
    }

    public static void jogar(){
        System.out.println("Informe o nível de dificuldade desejado [1,2,3 ou 4]: ");
        int dificuldade = Game.teclado.nextInt();
        Game.cal = new Calcular(dificuldade);

        System.out.println("Informe o resultado apra a seguinte operação: ");

        if (cal.getOperacao() == 0) { // Soma
            System.out.println(cal.getValor1() + " + " + cal.getValor2());
            int resposta = Game.teclado.nextInt();

            if (cal.somar(resposta)) {
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s).");
            }
        } else if (cal.getOperacao() == 1) { // Subtração
            System.out.println(cal.getValor1() + " - " + cal.getValor2());
            int resposta = Game.teclado.nextInt();

            if (cal.subtrair(resposta)) {
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s).");
            }
        } else if (cal.getOperacao() == 2) { // Multiplicação
            System.out.println(cal.getValor1() + " x " + cal.getValor2());
            int resposta = Game.teclado.nextInt();

            if (cal.multiplicar(resposta)) {
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s).");
            } else {
                System.out.println("A opração " + cal.getOperacao() + " não é reconhecida.");
            }
        }
        System.out.println("Desenha continuar [1 - sim, 0 - não]? ");
        int continuar = Game.teclado.nextInt();
        if(continuar == 1){
            Game.jogar();
        } else {
            System.out.println("Você fez " + Game.pontos + " ponto(s). ");
            System.out.println("Até a próxima!");
            System.exit(0);
        }
    }
}
