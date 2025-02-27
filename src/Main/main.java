package Main;

import Calc.Calc;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введите пример:");
            String example = in.nextLine();
            if (example.equals("0") || example.equals("exit") || example.equals("q")) System.exit(0);
            calc.decision(example);
        }
    }
}
