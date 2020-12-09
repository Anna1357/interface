package org.itstep.command;

public class EchoCommand implements Command{
    public void execute(String... args) {
        System.out.println(String.join( " ",args ));

    }
}
