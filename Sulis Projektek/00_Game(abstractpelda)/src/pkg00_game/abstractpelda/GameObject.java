package pkg00_game.abstractpelda;

/**
 *
 * @author gabesz
 */
public abstract class GameObject {
    
    //this method must be implemented in any calsses that extends GameObject
    public abstract void draw();
    
    public static void main(String[] args) {
      GameObject player = new Player();
      //player.draw();
      
      GameObject menu = new Menu();
      //menu.draw();
      
      GameObject[] gameObjects = new GameObject[2];
      gameObjects[0]= player;
      gameObjects[1]= menu;
      
      for(GameObject obj : gameObjects){
          obj.draw();
      }
      //GameObject myObject = new GameObject();
      // abstract classes exist to be extended, they can not be instantiated
      
      
      
    }

}
