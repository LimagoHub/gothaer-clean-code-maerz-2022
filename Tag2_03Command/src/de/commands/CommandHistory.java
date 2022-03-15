package de.commands;

public class CommandHistory {

    public void addCommand(Command command) {
        // keine redos mehr möglich
        // Queries ignorieren
    }

    public void undo() {
        System.out.println("can't undo");
    }

    public void redo() {
        System.out.println("can't redo");
    }

}
