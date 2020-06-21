package DogBark;

public class Dog {

    private int size;
    String name;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark(int numOfBarks) {
        while (numOfBarks > 0) {
            if (size > 60) {
                System.out.println("Wooof! wooof");
            } else if (size > 14) {
                System.out.println("Ruff! Ruff!");
            } else {
                System.out.println("Yip! Yip!");
            }
            numOfBarks--;
        }
    }
}

class DogTestDrive {

    public static void main(String[] args) {
        Dog[] pets = new Dog[7];
        pets[0] = new Dog();
        pets[1] = new Dog();
        pets[0].setSize(30);
        int x = pets[0].getSize();
        pets[1].setSize(8);
        
        Dog one = new Dog();
        one.setSize(70);
        Dog two = new Dog();
        two.setSize(8);
        Dog three = new Dog();
        three.setSize(35);

        one.bark(1);
        two.bark(2);
        three.bark(3);
    }
}
