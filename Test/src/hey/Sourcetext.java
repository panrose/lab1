package hey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sourcetext {
    private String text;
    private HashMap<String,String> neiColor = new HashMap<String,String>();
    private HashMap<String,Integer> neighbor = new HashMap<String, Integer>();
    private HashMap<String,Integer> numWord = new HashMap<String, Integer>();
    private HashMap<Integer,String> word = new HashMap<Integer, String>();
    private HashMap<String, Integer> pathRecord = new HashMap<String, Integer>();
    //private Graph graph = new Graph();
    //private int num_of_word;
    private int numofWord;
    private  ArrayList<HashSet<Integer>> arraylist = new ArrayList<HashSet<Integer>>();
    public void wordNum() { //给已出现单词标序号
        String text1 = text.replaceAll("[^a-zA-Z]", " ").toLowerCase();
        String[] list = text1.split("\\s+");
        int count = 0;
        
        for (int i = 0; i < list.length; i++) {
        if (!numWord.containsKey(list[i])) {
        numWord.put(list[i], count);
        word.put(count++, list[i]);
        }
        }
        setNumofWord(count);
        }

    public void mapCount() {
        String text1 = text.replaceAll("[^a-zA-Z]", " ").toLowerCase();
        String[] list = text1.split("\\s+");
        String temp;
        for (int i = 0; i < list.length - 1; i++) {
            arraylist.add(new HashSet<Integer>());
        }
        for (int i = 0; i < list.length - 1; i++) {
            temp = list[i] + " -> " + list[i + 1];
            if (neighbor.containsKey(temp)) {
            Integer count = neighbor.get(temp) + 1;
            neighbor.put(temp, count);
            } else {
                 neighbor.put(temp, 1);
        }
        arraylist.get(numWord.get(list[i])).add(numWord.get(list[i + 1]));
        pathRecord.put(temp, 0);
    }
}

    public void mapColor(String[] list) {  //边出现次数统计与记录
        String temp;
        for (int i = list.length - 1; i > 0; i--) {
            temp = list[i] + " -> " + list[i - 1];
            if (!neiColor.containsKey(temp)) {
                neiColor.put(temp, "color = " + "red");
            }
        }
    }

public ArrayList<HashSet<Integer>> getArraylist() {
    return arraylist;
}
public HashMap<String, Integer> getPathRecord() {
    return pathRecord;
}
public void setPathRecord(HashMap<String, Integer> pathRecord) {
    this.pathRecord = pathRecord;
}
public void setArraylist(ArrayList<HashSet<Integer>> arraylist) {
    this.arraylist = arraylist;
}
public HashMap<String, String> getNeiColor() {
    return neiColor;
}

public void setNeiColor(HashMap<String, String> neiColor) {
    this.neiColor = neiColor;
}

public HashMap<String, Integer> getNeighbor() {
    return neighbor;
}

public void setNeighbor(HashMap<String, Integer> neighbor) {
    this.neighbor = neighbor;
}

public HashMap<String, Integer> getNumWord() {
    return numWord;
}

public void setNumWord(HashMap<String, Integer> numWord) {
    this.numWord = numWord;
}

public HashMap<Integer, String> getWord() {
    return word;
}

public String getText() {
    return text;
}

public void setText(String text) {
    this.text = text;
}

public void setWord(HashMap<Integer, String> word) {
    this.word = word;
}

public int getNumofWord() {
    return numofWord;
}

public void setNumofWord(int numofWord) {
    this.numofWord = numofWord;
}
}
