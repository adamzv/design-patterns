package com.github.adamzv;

/**
 *
 * @author KI
 */
public interface Command {
    void execute();
    void undo();
}
