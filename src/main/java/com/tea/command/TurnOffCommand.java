/**
 * @author teaho2015@gmail.com
 * since 2017/4/3
 */
package com.tea.command;

public class TurnOffCommand implements Command {
    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
