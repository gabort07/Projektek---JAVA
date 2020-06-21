
package elsoprojekt;


public class Cat extends Animal {
    
    public Cat(){}
    
    public Cat(String name){
        this.setName(name);
    }
    
    public Cat(String name, int weight){
        this.setName(name);
        this.setWeight(weight);
    }
    
    @Override
    public void makeSound(){
        System.out.println("MEOW");
    }
    

}
