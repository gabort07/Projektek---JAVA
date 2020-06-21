package rotationplanner;

import java.util.ArrayList;
import java.util.Arrays;

public class Worker {

    private String name;
    private ArrayList<Worker> workersList = new ArrayList<Worker>();
    private ArrayList<String> canDoList = new ArrayList<String>();

    
    public ArrayList<Worker> getWorkersList() {
        return workersList;
    }

    public void setCanDoList(ArrayList<String> taktList) {
        canDoList = taktList;
    }

    public void setCanDoList(String takt) {
        canDoList.add(takt);
    }

    public void setCanDoList(String[] taktList) {
        canDoList.addAll(Arrays.asList(taktList));
    }

    public ArrayList<String> getCanDoList() {
        return canDoList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Worker(String name) {
        this.name = name;
    }

    public Worker() {
    }

    public void setUpTeam() {
        Worker a = new Worker("A");
        ArrayList<String> aTaktList = new ArrayList<>(Arrays.asList("AirbagLinks", "AirbagVorbLinks", "AirbagVorbRechts", "AirbagRechts",
                "Battery_1", "SpCoverLinks", "SpCoverRechts"));
        a.setCanDoList(aTaktList);
        workersList.add(a);

        Worker b = new Worker("B");
        ArrayList<String> bTaktList = new ArrayList<>(Arrays.asList("AirbagLinks", "AirbagVorbLinks", "AirbagVorbRechts", "AirbagRechts",
                "Battery_1", "SpCoverLinks", "SpCoverRechts"));
        b.setCanDoList(bTaktList);
        workersList.add(b);

        Worker c = new Worker("C");
        ArrayList<String> cTaktList = new ArrayList<>(Arrays.asList("AirbagLinks", "AirbagVorbLinks", "AirbagVorbRechts", "AirbagRechts",
                "Battery_1", "SpCoverLinks", "SpCoverRechts"));
        c.setCanDoList(cTaktList);
        workersList.add(c);

        Worker d = new Worker("D");
        ArrayList<String> dTaktList = new ArrayList<>(Arrays.asList("AirbagLinks", "AirbagVorbLinks", "AirbagVorbRechts", "AirbagRechts",
                "Battery_1", "SpCoverLinks", "SpCoverRechts"));
        d.setCanDoList(dTaktList);
        workersList.add(d);

        Worker e = new Worker("E");
        ArrayList<String> eTaktList = new ArrayList<>(Arrays.asList("AirbagLinks", "AirbagVorbLinks", "AirbagVorbRechts", "AirbagRechts", "Battery_2"));
        e.setCanDoList(eTaktList);
        workersList.add(e);

        Worker f = new Worker("F");
        ArrayList<String> fTaktList = new ArrayList<>(Arrays.asList("AirbagLinks", "AirbagVorbLinks", "AirbagVorbRechts", "AirbagRechts", "Battery_2"));
        f.setCanDoList(fTaktList);
        workersList.add(f);

        Worker g = new Worker("G");
        ArrayList<String> gTaktList = new ArrayList<>(Arrays.asList("AirbagLinks", "AirbagVorbLinks", "AirbagVorbRechts", "AirbagRechts", "Battery_2"));
        g.setCanDoList(gTaktList);
        workersList.add(g);

        Worker h = new Worker("H");
        ArrayList<String> hTaktList = new ArrayList<>(Arrays.asList("AirbagLinks", "AirbagVorbLinks", "AirbagVorbRechts", "AirbagRechts", "Battery_2"));
        h.setCanDoList(hTaktList);
        workersList.add(h);

        Worker i = new Worker("I");
        ArrayList<String> iTaktList = new ArrayList<>(Arrays.asList("AirbagLinks", "AirbagVorbLinks", "AirbagVorbRechts", "AirbagRechts", "Stromverteil_1"));
        i.setCanDoList(iTaktList);
        workersList.add(i);

        Worker j = new Worker("J");
        ArrayList<String> jTaktList = new ArrayList<>(Arrays.asList("AirbagLinks", "AirbagVorbLinks", "AirbagVorbRechts", "AirbagRechts", "Stromverteil_1"));
        j.setCanDoList(jTaktList);
        workersList.add(j);

        Worker k = new Worker("K");
        ArrayList<String> kTaktList = new ArrayList<>(Arrays.asList("AirbagLinks", "AirbagVorbLinks", "AirbagVorbRechts", "AirbagRechts", "Stromverteil_1"));
        k.setCanDoList(kTaktList);
        workersList.add(k);

        Worker l = new Worker("L");
        ArrayList<String> lTaktList = new ArrayList<>(Arrays.asList("BV_EinbauLinks", "BV_EinbauRechts",
                "BV_VorbereitungLinks", "BV_VorbereitungRechts", "AirbagLinks", "AirbagVorbLinks", "AirbagVorbRechts", "AirbagRechts", "Stromverteil_1"));
        l.setCanDoList(lTaktList);
        workersList.add(l);

        Worker m = new Worker("M");
        ArrayList<String> mTaktList = new ArrayList<>(Arrays.asList("BV_EinbauLinks",
                "BV_EinbauRechts", "BV_VorbereitungLinks", "BV_VorbereitungRechts", "AirbagLinks", "AirbagVorbLinks", "AirbagVorbRechts", "AirbagRechts", "Stromverteil_2"));
        m.setCanDoList(mTaktList);
        workersList.add(m);

        Worker n = new Worker("N");
        ArrayList<String> nTaktList = new ArrayList<>(Arrays.asList("BV_EinbauLinks",
                "BV_EinbauRechts", "BV_VorbereitungLinks", "BV_VorbereitungRechts", "Stromverteil_2", "Cabel_1", "Masse"));
        n.setCanDoList(nTaktList);
        workersList.add(n);

        Worker o = new Worker("O");
        ArrayList<String> oTaktList = new ArrayList<>(Arrays.asList("BV_EinbauLinks",
                "BV_EinbauRechts", "BV_VorbereitungLinks", "BV_VorbereitungRechts", "Stromverteil_2", "Cabel_1", "Masse"));
        o.setCanDoList(oTaktList);
        workersList.add(o);

        Worker p = new Worker("P");
        ArrayList<String> pTaktList = new ArrayList<>(Arrays.asList("BV_EinbauLinks",
                "BV_EinbauRechts", "BV_VorbereitungLinks", "BV_VorbereitungRechts", "Stromverteil_2", "Cabel_1", "Masse"));
        p.setCanDoList(pTaktList);
        workersList.add(p);

        Worker q = new Worker("Q");
        ArrayList<String> qTaktList = new ArrayList<>(Arrays.asList("BV_EinbauLinks",
                "BV_EinbauRechts", "BV_VorbereitungLinks", "BV_VorbereitungRechts", "Stromverteil_2", "Cabel_1", "FPedal_2", "Masse"));
        q.setCanDoList(qTaktList);
        workersList.add(q);

        Worker r = new Worker("R");
        ArrayList<String> rTaktList = new ArrayList<>(Arrays.asList("BV_EinbauLinks",
                "BV_EinbauRechts", "BV_VorbereitungLinks", "BV_VorbereitungRechts", "Cabel_2", "FPedal_2"));
        r.setCanDoList(rTaktList);
        workersList.add(r);

        Worker s = new Worker("S");
        ArrayList<String> sTaktList = new ArrayList<>(Arrays.asList("BV_EinbauLinks",
                "BV_EinbauRechts", "BV_VorbereitungLinks", "BV_VorbereitungRechts", "Cabel_2", "FPedal_2"));
        s.setCanDoList(sTaktList);
        workersList.add(s);

        Worker t = new Worker("T");
        ArrayList<String> tTaktList = new ArrayList<>(Arrays.asList("BV_EinbauLinks",
                "BV_EinbauRechts", "BV_VorbereitungLinks", "BV_VorbereitungRechts", "Cabel_2", "FPedal_2"));
        t.setCanDoList(tTaktList);
        workersList.add(t);

        Worker u = new Worker("U");
        ArrayList<String> uTaktList = new ArrayList<>(Arrays.asList("BV_EinbauLinks",
                "BV_EinbauRechts", "BV_VorbereitungLinks", "BV_VorbereitungRechts", "Cabel_2", "EMCVorbLinks", "EMCVorbRechts", "FPedal_1", "Flex"));
        u.setCanDoList(uTaktList);
        workersList.add(u);

        Worker v = new Worker("V");
        ArrayList<String> vTaktList = new ArrayList<>(Arrays.asList("BV_EinbauLinks",
                "BV_EinbauRechts", "BV_VorbereitungLinks", "BV_VorbereitungRechts", "EMCVorbLinks", "EMCVorbRechts", "FPedal_1", "Flex"));
        v.setCanDoList(bTaktList);
        workersList.add(v);

        Worker w = new Worker("W");
        ArrayList<String> wTaktList = new ArrayList<>(Arrays.asList("BV_EinbauLinks",
                "BV_EinbauRechts", "BV_VorbereitungLinks", "BV_VorbereitungRechts", "EMCVorbLinks", "EMCVorbRechts", "FPedal_1", "Flex"));
        w.setCanDoList(wTaktList);
        workersList.add(w);

        Worker x = new Worker("X");
        ArrayList<String> xTaktList = new ArrayList<>(Arrays.asList("BV_EinbauLinks",
                "BV_EinbauRechts", "BV_VorbereitungLinks", "BV_VorbereitungRechts", "EMCVorbLinks", "EMCVorbRechts", "FPedal_1", "Flex"));
        x.setCanDoList(xTaktList);
        workersList.add(x);
    }

}
