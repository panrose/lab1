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
         text=hi.readFile("E:\\软件工程\\实验\\实验1\\example.txt");
    }

    @Test
    public void test() {
        hi.neighbor.clear();
        hi.getTextmain().setText(text);
        hi.getTextmain().wordNum();
        hi.getTextmain().mapCount();
        hi.getGraphmain().graphBuild(hi.getTextmain().getNeighbor(), hi.getTextmain().getNumWord());
        String []test= {"不存在桥接词","wear ","summer the ","不存在 ","不存在 none1 none2"};
        String []testword1= {"can","can","in","summer","none1"};
        String []testword2= {"the","skirt","swimming","","none2"};
        for(int i=0;i<5;i++) {
        String result = test[i];
        assertEquals("error in bridge",result,hi.queryBridgeWords(testword1[i],testword2[i]));
        }
    }
}

