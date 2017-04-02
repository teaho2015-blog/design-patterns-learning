/**
 * @author teaho2015@gmail.com
 * since 2017/4/3
 */
package com.tea.command;

import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

//
// This is the invoker
//
public class Switch {
    private Map<String, Command> commandMap = new Hashtable<>();

    public void addCommand(final String key, final Command command) {
        commandMap.put(key, command);
    }

    public void executeCommand(String key) {
        Command c = commandMap.get(key);
        Objects.requireNonNull(c);
        c.execute();
    }

    public void executeAllCommands() {
        commandMap.values().stream().forEach(t -> t.execute());
    }

}

