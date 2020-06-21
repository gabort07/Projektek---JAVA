package rotationplanner;

import java.util.ArrayList;
import java.util.Arrays;

public class Takts {

    private ArrayList<String> taktList = new ArrayList<>(Arrays.asList("AirbagLinks", "AirbagVorbLinks", "AirbagVorbRechts", "AirbagRechts", "Battery_1",
            "Battery_2", "Cabel_1", "Cabel_2", "EMCVorbLinks", "EMCVorbRechts", "FPedal_1", "FPedal_2",
            "Flex", "Masse", "Stromverteil_1", "Stromverteil_2", "SpCoverLinks", "SpCoverRechts", "BV_EinbauLinks",
            "BV_EinbauRechts", "BV_VorbereitungLinks", "BV_VorbereitungRechts"));

    public void setTaktList(ArrayList<String> listOfTakts) {
        taktList = listOfTakts;
    }
    
    public void setTaktList(String takt){
        taktList.add(takt);
    }

    public ArrayList<String> getTaktList() {
        return taktList;
    }
    
    

}
