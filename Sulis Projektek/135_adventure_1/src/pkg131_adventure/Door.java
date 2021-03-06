/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg131_adventure;

/**
 *
 * @author Pasztuhov Dániel, StudiCore Kft.
 */
public class Door {

    private String key;
    private boolean locked;
    private boolean closed;

    public Door(String key) {
        this.key = key;
        this.locked = true;
        this.closed = true;
    }

    public Door(boolean closed) {
        this.closed = closed;
    }

    public boolean unlock(String key) {
        if (this.key == null || this.key.equals(key)) {
            this.locked = false;
            return true;
        }
        return false;
    }

    public boolean lock(String key) {
        if (this.key == null)
            return false;        
        if (this.key.equals(key)) {
            this.locked = true;
            this.closed = true;
            return true;
        }
        return false;
    }

    public boolean open() {
        if (locked) {
            return false;
        }
        this.closed = false;
        return true;
    }

    public void close() {
        this.closed = true;
    }

    public boolean isOpen() {
        return !this.closed;
    }

}
