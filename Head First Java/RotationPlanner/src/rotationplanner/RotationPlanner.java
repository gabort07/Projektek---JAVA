package rotationplanner;

import java.util.ArrayList;

public class RotationPlanner {

    private ArrayList<String[]> rotationList = new ArrayList<String[]>();
    private ArrayList<Worker> workerArrayList = new ArrayList<Worker>();
    private ArrayList<String> taktArrayList = new ArrayList<String>();

    private void setUpSources() {
        Worker workers = new Worker();
        workers.setUpTeam();
        workerArrayList.addAll(workers.getWorkersList());
        Takts takts = new Takts();
        taktArrayList.addAll(takts.getTaktList());

        printAbilities(workers.getWorkersList());

    }

    public static void main(String[] args) {

        RotationPlanner planner = new RotationPlanner();

        planner.setUpSources();

    }

    public void printAbilities(ArrayList<Worker> objekt) {
        for (Worker element : objekt) {
            String name = element.getName();
            String canDo = element.getCanDoList().toString();
            System.out.println(name + " " + canDo);
        }
    }

    public String taktSelector(ArrayList<String> taktList) {

        return taktList.get((int) (Math.random() * taktList.size()));
    }

//    public static void main(String[] args) {
//        //Declaration of an ArrayList of String Arrays
//        ArrayList<String[]> listOfArrayList = new ArrayList<String[]>();
//
//        //Assignment of 4 different String Arrays with different lengths
//        listOfArrayList.add( new String[]{"line1: test String 1","line1: test String 2","line1: test String 3"}  );
//        listOfArrayList.add( new String[]{"line2: test String 1"}  );
//        listOfArrayList.add( new String[]{"line3: test String 1","line3: test String 2","line3: test String 3", "line3: test String 4"}  );
//        listOfArrayList.add( new String[]{"line4: test String 1","line4: test String 2"}  );
//
//        // Printing out the ArrayList Contents of String Arrays
//        // '$' is used to indicate the String elements of String Arrays
//        for( int i = 0; i < listOfArrayList.size(); i++ ) {
//            for( int j = 0; j < listOfArrayList.get(i).length; j++ )
//                System.out.printf(" $ " + listOfArrayList.get(i)[j]);
//
//            System.out.println();
//        }
//
//    }
}
