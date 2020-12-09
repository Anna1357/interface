package org.itstep;
import org.itstep.command.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
Map<String,Command>commands = new HashMap<>();
commands.put("echo", new EchoCommand());
commands.put("exit",new ExitCommand() );
commands.put("help",new HelpCommand() );
commands.put("now",new NowCommand() );

        Scanner scaner=new Scanner(System.in);
        while(true){
            System.out.println(">>> ");
            String command=scaner.nextLine();
            String[] parts=command.split( "\\s+");
            if(commands.containsKey( parts[0] )){
                commands.get(parts[0]).execute( Arrays.copyOfRange(parts,1,parts.length) );

            }else
            {
                System.out.println("Error");
            }
        }
    }
}
