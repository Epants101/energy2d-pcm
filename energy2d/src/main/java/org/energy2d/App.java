package org.energy2d;

import org.energy2d.system.System2D;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Starting the application!");
        System2D.start(args);
    }
}
