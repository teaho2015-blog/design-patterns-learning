/**
 * @author teaho2015@gmail.com
 * since 2017/4/3
 */
package com.tea.command;

/**
    The client
 */
public class Java8TestMain {
    public static void main(String[] args) {
        Switch mySwitch = new Switch();
        Light light = new Light();

        Command command1 = new TurnOnCommand(light);
        Command command2 = new TurnOffCommand(light);

        mySwitch.addCommand("turnOn", () -> light.turnOn());
        mySwitch.addCommand("turnOff", () -> light.turnOff());

        mySwitch.executeCommand("turnOn");
        mySwitch.executeCommand("turnOff");

        mySwitch.executeAllCommands();

    }

}
