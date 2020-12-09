package org.itstep.command;

import jdk.swing.interop.SwingInterOpUtils;

public class ExitCommand implements Command{
    @Override
    public void execute(String... args) {
        System.out.println("Goodbye!");
        System.exit( 0 );
    }
}
