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
public class Scene {

    private String description;
    private Door door;

    public Scene(String description) {
        this.description = description;
    }

    public void setDoor(Door door) {
        this.door = door;
    }
    
    public Scene goThrough() {
        if (door != null) {
            if (door.isOpen()) {
                return door.getOtherSide(this);
            }
        }
        return this;
    }
    
    public String getDescription() {
        String doorState = door.isOpen() ? "nyitva" : "csukva";
        return description + "\nAz ajtó " + doorState + " van.";
    }
    
    
    
}
