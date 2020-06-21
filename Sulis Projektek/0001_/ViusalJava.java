

class VisualJava {

	 public static void main(String[] args){
		 reduceOne(10);
	 }

	 public static void reduceOne(int n){
		 if(n>=0){
			 reudceOne(n-1);
		 }
		 System.out.println("Completed call: " + n);
	 }
} 