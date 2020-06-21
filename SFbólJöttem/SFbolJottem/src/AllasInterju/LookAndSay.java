package AllasInterju;


public class LookAndSay {

   
    public static void main(String[] args) {
        String result = "1";
        
        for(int i = 0; i <10; i++){
            System.out.println(result);
            result = lookAndSay(result);
        }    
    }
    
    public static String lookAndSay(String szam){
        //Számoljuk meg hány db előfordulás van
        //Mit számoltunk meg
        if(szam == null || szam.isEmpty())
            return "";
            
        StringBuilder sB = new StringBuilder();
        
        int firstCharPos = 0;
        for(int i = 0; i< szam.length(); i++){
            if(szam.charAt(firstCharPos) != szam.charAt(i)){
                String digitsTotal = szam.substring(firstCharPos, i);
                sB.append(digitsTotal.length()).append(szam.charAt(firstCharPos));
                firstCharPos = i;
            }
        }
        sB.append(szam.substring(firstCharPos, szam.length()).length()).append(szam.charAt(firstCharPos));
        
        return sB.toString();
    }

} 
