package AnimalSimulation;


public class AnimalSimulation {
    
    abstract class Animal {
       // private picture;
        private String food;
        private int hunger;
        private String bundaries;
        private int[] location = new int[2];
        
        public void makeNoise(){}
        
        public abstract void eat(); 
        public void sleep(){}
        public void roam(){}
        
    }
    
    abstract class Feline extends Animal{

        @Override
        public void roam(){}
    }
    
    abstract class Canine extends Animal {
        
        @Override
        public void roam(){}
    }
    
    class Hippo extends Animal {
        
        @Override
        public void makeNoise(){}
        
        @Override
        public void eat(){}
    }
    
    class Lion extends Feline {
        
        @Override
        public void makeNoise(){}
        
        @Override
        public void eat(){}
        
    }
    
    class Tiger extends Feline {
                
        @Override
        public void makeNoise(){}
        
        @Override
        public void eat(){}

    }

    class Cat extends Feline {
                
        @Override
        public void makeNoise(){}
        
        @Override
        public void eat(){}

    }
    
    class Wolf extends Canine {
                
        @Override
        public void makeNoise(){}
        
        @Override
        public void eat(){}

    }
    
    class Dog extends Canine {
                
        @Override
        public void makeNoise(){}
        
        @Override
        public void eat(){}

    }
}
