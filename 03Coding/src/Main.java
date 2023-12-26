import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        String elementToMove;
        System.out.println("############## Reglas #####################");
        System.out.print("Debes transportar un lobo (L), Caperucita Roja (C) y un racimo de uvas (U) en una embarcación a través de un río. Ten en cuenta que solo puedes llevar a uno de ellos a la vez, y está prohibido dejar solos en cualquier momento a: \n - Caperucita y el lobo \n - Caperucita y las uvas\n");
        while(!game.isGameOver){
            game.printState();
            System.out.print("Ingrese el elemento a transportar: ");
            elementToMove = scanner.next();
            try{
                game.makeMove(elementToMove);
            }
            catch (Error e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("############## GAME OVER #####################");
    }
}
