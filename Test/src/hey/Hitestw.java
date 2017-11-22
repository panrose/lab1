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
        text=hi.readFile("E:\\软件工程\\实验\\实验1\\example.txt");
    }

    @Test
    public void test() {
        hi.neighbor.clear();
        hi.getTextmain().setText(text);
        hi.getTextmain().wordNum();
        hi.getTextmain().mapCount();
        hi.getGraphmain().graphBuild(hi.getTextmain().getNeighbor(), hi.getTextmain().getNumWord());
        
        String []test= {"","the makes happy like in","can the"};
        String []testresult= {"","the swimming makes me happy i like summer in","can the"};
        for(int i=0;i<3;i++) {
        String result=testresult[i];
        assertEquals("error in bridge",result,hi.generateNewText(test[i]));
        }
    }
}

