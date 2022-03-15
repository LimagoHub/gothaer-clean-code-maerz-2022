package de;

import de.commands.Command;
import de.commands.CommandFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {

            while(true) {
                System.out.print("#>");
                String zeile = scanner.nextLine();

                if(zeile.equalsIgnoreCase("ende")) break;

                Command command = CommandFactory.create(zeile);
                if(command == null) continue;;

                command.execute();
            }

        }
    }
}
