package DotComGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;
import java.io.*;

class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        //first make some dot coms and give them locations
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (DotCom dotComToSet : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for (DotCom dotComToTest : dotComList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now wothless.");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println(" You got out before your options snak.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();

    }
}

class GameHelper {

    private static final String alphabet = "abcdefg";
    private int gridLenght = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }

        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<>();       //holds 'f6' type coords

        String temp = null;                          //temporary String for concat
        int[] coords = new int[comSize];                  //current candidate coords
        int attempts = 0;                            //current attempts counter
        boolean succes = false;                         //flag = found a good location ?
        int location = 0;                            //current starting location

        comCount++;                               //n'th dot com to place
        int incr = 1;                               //set horizontal increment
        if ((comCount % 2) == 1) {                     //if odd dot com (place vertically)
            incr = gridLenght;                       //set vertical increment
        }

        while (!succes & attempts++ < 200) {                //main serch loop (32)
            location = (int) (Math.random() * gridSize);         //get random starting point
            System.out.print(" try " + location);
            int x = 0;                           //n'th position in dotcom to place
            succes = true;                       //assume succes
            while (succes && x < comSize) {           //look for adjacent(szomszédos) unused spots
                if (grid[location] == 0) {           //if not already used
                    coords[x++] = location;           //save location
                    location += incr;             //try 'next" adjacent
                    if (location >= gridSize) {        //out of bounds - 'bottom'
                        succes = false;           //failure
                    }
                    if (x > 0 && (location % gridLenght == 0)) {      //out of bound- right edge
                        succes = false;                        //failure
                    }
                } else {
                    System.out.print(" used " + location);
                    succes = false;                         //failure
                }
            }
        }                       //end while

        int x = 0;             //turn location into alpha coords
        int row = 0;
        int collumn = 0;
        System.out.print("\n");

        while (x < comSize) {
            grid[coords[x]] = 1;                //mark master grid pts. as 'used'
            row = (int) (coords[x] / gridLenght);        //get row value
            collumn = coords[x] % gridLenght;        //get numeric collumn value
            temp = String.valueOf(alphabet.charAt(collumn));        //convert to alpha

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            System.out.print(" coord " + x + " = " + alphaCells.get(x - 1));   //tell us where the DotCom is located
        }
        System.out.println("\n");
        return alphaCells;
    }
}

class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {

        String result = "miss";

        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " : ( ");
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
