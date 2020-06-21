
package elsoprojekt;


public abstract class Animal {
   private String name;
   private int weight;
   
   protected void makeSound(){
       System.out.println("AAAAA");
   }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
   
   
    
}
