package gyaksi_rekurzio;


public class Gyaksi_Rekurzio {

   
    public static void main(String[] args) {
        
        reducedByOne(10);
      
    }
    
    public static void reducedByOne(int n){
        if(n > 0){
            reducedByOne(n-1);
        }
        System.out.println("Completed call: "+n);
    }

}
