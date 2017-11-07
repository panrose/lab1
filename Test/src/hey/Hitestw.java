package hey;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Hitestw {
    private Hi hi; 
    String text;
    @Before
    public void setUp() throws Exception {
        hi = new Hi();
        text=hi.readFile("D:\\360Downloads\\a.txt");
    }

    @Test
    public void test() {
        text = text.replaceAll("[^a-zA-Z]", " ").toLowerCase();
        String[] wordlist = text.split("\\s+");
        hi.neighbor.clear();
        hi.numWord.clear();
        hi.wordNum(wordlist);
        hi.mapCount(wordlist);
        hi.graphBuild(hi.neighbor, hi.numWord);
        String []test= {"","the makes happy like in","can the"};
        String []testresult= {"","the swimming makes me happy i like summer in","can the"};
        for(int i=0;i<3;i++) {
        String result=testresult[i];
        assertEquals("error in bridge",result,hi.generateNewText(test[i]));
        }
    }
}

