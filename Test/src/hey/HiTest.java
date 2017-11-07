package hey;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HiTest {
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
        String []test= {"不存在桥接词","wear ","summer the ","不存在 ","不存在 none1 none2"};
        String []testword1= {"can","can","in","summer","none1"};
        String []testword2= {"the","skirt","swimming","","none2"};
        for(int i=0;i<5;i++) {
        String result = test[i];
        assertEquals("error in bridge",result,hi.queryBridgeWords(testword1[i],testword2[i]));
        }
    }
}

