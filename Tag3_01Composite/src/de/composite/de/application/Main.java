package de.composite.de.application;

import de.composite.AbstractNode;
import de.composite.Leaf;
import de.composite.Node;

public class Main {

    public static void main(String[] args) {

        Node root = new Node("Root");

        Node e1_1 = new Node("E1_1");
        root.appendChild(e1_1);

        Node e1_2 = new Node("E1_2");
        root.appendChild(e1_2);

        Leaf e_2_1_1 = new Leaf("e_2_1_1");
        e1_1.appendChild(e_2_1_1);

        Leaf e_2_1_2 = new Leaf("e_2_1_2");
        e1_1.appendChild(e_2_1_2);

        travers(root);
    }

    private static void travers(AbstractNode n) {
        System.out.println(n);
        for (var child: n.getChildren()) {
            travers(child);
        }
    }
}
