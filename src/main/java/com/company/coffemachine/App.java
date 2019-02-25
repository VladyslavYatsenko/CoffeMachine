package com.company.coffemachine;

import com.company.coffemachine.coffeMachine.CoffeMachine;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CoffeMachine coffeMachine = new CoffeMachine();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(coffeMachine.getStatus() ? "Coffe Machine is ON" : "Coffe Machine is OFF(Turn it on?(1))");
            if(scanner.next().equals("1")) {
                coffeMachine.on();
                if (coffeMachine.getStatus() == true) {
                    System.out.print("Choose drink: " + "\n1->Americano" + "\n2->Espresso" + "\n3->Latte" + "\n");
                    int number = scanner.nextInt();
                    switch (number) {
                        case 1:
                            System.out.println(coffeMachine.createAmericano());
                            break;
                        case 2:
                            System.out.println(coffeMachine.createEspresso());
                            break;
                        case 3:
                            System.out.println(coffeMachine.createLatte());
                            break;
                        default:
                            System.out.println("Wrong command");
                            break;
                    }
                }
                coffeMachine.off();
            }else{
                System.out.println("Wrong command");
            }
            if(scanner.next().equals("0")){
                System.exit(1);
            }
        }
        while (coffeMachine.getStatus() != true);
    }
}

