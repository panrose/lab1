package hey;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author  __USER__
 */
public  class Hi extends javax.swing.JFrame {

/** Creates new form Hi.
public Hi() {
initComponents();
event();
}
/**
 *
 */
private static Hi pmdl;

private Graph graphmain = new Graph();

public Graph getGraphmain() {
    return graphmain;
}

public void setGraphmain(Graph graphmain) {
    this.graphmain = graphmain;
}
private Sourcetext textmain = new Sourcetext();

public Sourcetext getTextmain() {
    return textmain;
}

public void setTextmain(Sourcetext textmain) {
    this.textmain = textmain;
}
/**
*
*/
private static   int CABD = 105;
/**
*
*/
private static   int CAB = 100000000;
/**
*
*/
private static   int ABUM = 93;
/**
*
*/
private static   int CDUM = 81;
/**
*
*/
private static   int EFUM = 50;
/**
*
*/
private static   int GHUM = 590;
/**
*
*/
private static   int IJUM = 79;
/**
*
*/
private static   int NUM = 47;
/**
*
*/
private static   int WUM = 65;
/**
*
*/
private static   int QUM = 103;
/**
*
*/
private static   int AZUM = 64;
/**
*
*/
private static   int MUM = 325;
/**
*
*/
private static   int HUM = 72;
/**
*
*/
private static   int VUM = 45;
/**
*
*/
private static   int BUM = 66;
/**
*
*/
private static   int UUM = 12;
/**
*
*/
private static   int GUM = 197;
/**
*
*/
private static   int FUM = 52;
/**
*
*/
private static   int LUM = 40;
/**
*
*/
private static   int RUM = 318;
/**
*
*/
private static   int EUM = 36;
/**
*
*/
private static   int IUM = 603;
/**
*
*/
private static   int TUM = 18;
/**
*
*/
private static   int OUM = 670;
/**
*
*/
private static   int AUM = 51;
/**
*
*/
private static   int XUM = 204;
/**
*
*/
private static   int PUM = 255;
/**
*
*/
private static   int SUM = 33;
/**
*
*/
private static   int ZUM = 87;
/**
 *
 */
private static   int KUM = 20;
/**
*
*/
private static   int CUM = 5;
/**
 *
 */
/**
*
*/
private  Map<String, String> neiColor = 
new HashMap<String, String>(); //
/**
 *
 */
public  Map<String, Integer> neighbor =
new HashMap<String, Integer>();
//存储图中的边及其出现次数
/**
*
*/
public  Map<String, Integer> numWord =
new HashMap<String, Integer>();
//存储不同单词的编号
/**
*
*/
public Map<Integer, String> word =
new HashMap<Integer, String>(); //与numWord键值相反

/**
*
*/
private  ArrayList<HashSet<Integer>> arraylist =
new ArrayList<HashSet<Integer>>(); //
/**
*
*/
private int[][] graph; //
/**
*
*/
private  String filepath = ""; //

/** Creates new form Hi. */
public Hi() {
initComponents();
event();
}

/** This method is called from within the constructor to
* initialize the form.
* WARNING: Do NOT modify this code. The content of this method is
* always regenerated by the Form Editor.
*/
//GEN-BEGIN:initComponents
// <editor-fold defaultstate="collapsed" desc="Generated Code">
private void initComponents() {
jTextField1 = new javax.swing.JTextField();
jButton1 = new javax.swing.JButton();
jButton2 = new javax.swing.JButton();
jButton3 = new javax.swing.JButton();
jButton4 = new javax.swing.JButton();
jButton5 = new javax.swing.JButton();
jButton6 = new javax.swing.JButton();
jScrollPane1 = new javax.swing.JScrollPane();
jTextArea1 = new javax.swing.JTextArea();
jTextField2 = new javax.swing.JTextField();
jTextField3 = new javax.swing.JTextField();
jLabel1 = new javax.swing.JLabel();
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
setBackground(new java.awt.Color(AUM, XUM, PUM));
jTextField1.setText("\u8bf7\u8f93\u5165\u6587\u672c\u8def\u5f84");
jButton1.setText("\u6253\u5f00\u6587\u4ef6");
jButton2.setText("\u786e\u8ba4\u8def\u5f84");
jButton3.setText("\u67e5\u8be2\u6865\u63a5\u8bcd");
jButton4.setText("\u751f\u6210\u65b0\u6587\u672c");
jButton5.setText("\u6700\u77ed\u8def\u5f84");
jButton5.addActionListener(new ActionListener() {
public void actionPerformed(  ActionEvent evt) {
jButton5ActionPerformed(evt);
}
});
jButton6.setText("\u968f\u673a\u6e38\u8d70");
jTextArea1.setColumns(KUM);
jTextArea1.setRows(CUM);
jScrollPane1.setViewportView(jTextArea1);
jTextField2.setColumns(KUM);
jTextField2.setText("word1");
jTextField2.setToolTipText("");
jTextField3.setText("word2");
  javax.swing.GroupLayout LaYout = new javax.swing.GroupLayout(
getContentPane());
getContentPane().setLayout(LaYout);
LaYout
.setHorizontalGroup(LaYout
.createParallelGroup(
javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(
LaYout
.createSequentialGroup()
.addGroup(
LaYout
.createParallelGroup(
javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(
LaYout
.createSequentialGroup()
.addGap(
ZUM,
ZUM,
ZUM)
.addComponent(
jScrollPane1,
javax.swing.GroupLayout.PREFERRED_SIZE,
OUM,
javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(
LaYout
.createSequentialGroup()
.addGap(
SUM,
SUM,
SUM)
.addGroup(
LaYout
.createParallelGroup(
javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(
LaYout
.createSequentialGroup()
.addGap(
KUM,
KUM,
KUM)
.addComponent(
jLabel1,
javax.swing.GroupLayout.PREFERRED_SIZE,
IUM,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(
TUM,
TUM,
TUM)
.addGroup(
LaYout
.createParallelGroup(
javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(
jButton4,
javax.swing.GroupLayout.DEFAULT_SIZE,
RUM,
Short.MAX_VALUE)
.addComponent(
jButton5,
javax.swing.GroupLayout.DEFAULT_SIZE,
RUM,
Short.MAX_VALUE)
.addComponent(
jButton3,
javax.swing.GroupLayout.Alignment.TRAILING,
javax.swing.GroupLayout.DEFAULT_SIZE,
RUM,
Short.MAX_VALUE)
.addComponent(
jButton6,
javax.swing.GroupLayout.DEFAULT_SIZE,
RUM,
Short.MAX_VALUE))
.addGap(
EUM,
EUM,
EUM))
.addGroup(
LaYout
.createSequentialGroup()
.addComponent(
jTextField1,
javax.swing.GroupLayout.PREFERRED_SIZE,
GUM,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(
FUM,
FUM,
FUM)
.addComponent(
jButton1)
.addGap(
LUM,
LUM,
LUM)
.addComponent(
jButton2)
.addPreferredGap(
javax.swing.LayoutStyle.ComponentPlacement.RELATED,
MUM,
Short.MAX_VALUE)
.addComponent(
jTextField2,
javax.swing.GroupLayout.PREFERRED_SIZE,
HUM,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(
VUM,
VUM,
VUM)
.addComponent(
jTextField3,
javax.swing.GroupLayout.PREFERRED_SIZE,
BUM,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(
UUM,
UUM,
UUM)))))
.addContainerGap()));
LaYout
.setVerticalGroup(LaYout
.createParallelGroup(
javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(
LaYout
.createSequentialGroup()
.addContainerGap()
.addGroup(
LaYout
.createParallelGroup(
javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(
LaYout
.createParallelGroup(
javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(
jTextField1,
javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(
jButton1)
.addComponent(
jButton2))
.addGroup(
LaYout
.createParallelGroup(
javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(
jTextField2,
javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(
jTextField3,
javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGroup(
LaYout
.createParallelGroup(
javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(
LaYout
.createSequentialGroup()
.addGap(
NUM,
NUM,
NUM)
.addComponent(
jButton3,
javax.swing.GroupLayout.PREFERRED_SIZE,
WUM,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(
QUM,
QUM,
QUM)
.addComponent(
jButton5,
javax.swing.GroupLayout.PREFERRED_SIZE,
AZUM,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(
ABUM,
ABUM,
ABUM)
.addComponent(
jButton4,
javax.swing.GroupLayout.PREFERRED_SIZE,
WUM,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(
javax.swing.LayoutStyle.ComponentPlacement.RELATED,
CDUM,
Short.MAX_VALUE)
.addComponent(
jButton6,
javax.swing.GroupLayout.PREFERRED_SIZE,
WUM,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(
EFUM,
EFUM,
EFUM))
.addGroup(
LaYout
.createSequentialGroup()
.addPreferredGap(
javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(
jLabel1,
javax.swing.GroupLayout.PREFERRED_SIZE,
GHUM,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(
javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
.addComponent(
jScrollPane1,
javax.swing.GroupLayout.PREFERRED_SIZE,
IJUM,
javax.swing.GroupLayout.PREFERRED_SIZE)));

pack();
} // </editor-fold>
//GEN-END:initComponents

/**
 * Function.
 * @param evt Event.
 */
private void jButton5ActionPerformed(  ActionEvent evt) {
// TODO add your handling code here:
}

/**
 *
 */

public   void event() {
jButton1.addActionListener(new ActionListener() {
@Override
public void actionPerformed(  ActionEvent evmd) {
// TODO Auto-generated method stub
String path = null;
  JFileChooser cmdf = new JFileChooser();
  int icec = cmdf.showOpenDialog(null);
if (icec == JFileChooser.APPROVE_OPTION) {
path = cmdf.getSelectedFile().getAbsolutePath();
filepath = path;
} else {
System.out.println("未选中文件");
}
try {
    neighbor = textmain.getNeighbor();
showDirectedGraph(neighbor, path, pmdl);
} catch (IOException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
  ImageIcon icon = new ImageIcon("E:/软件工程/实验/实验1jpg");
icon.setImage(icon.getImage().getScaledInstance(
jLabel1.getWidth(), jLabel1.getHeight(),
Image.SCALE_DEFAULT));
jLabel1.setIcon(icon);
jLabel1.setBounds(0, 0, CABD, EFUM);
}
});
jButton2.addActionListener(new ActionListener() {
@Override
public void actionPerformed(  ActionEvent esdf) {
// TODO Auto-generated method stub
try {
    neighbor = textmain.getNeighbor();
filepath = jTextField1.getText();
showDirectedGraph(neighbor, filepath, pmdl);
showlabel1();
} catch (IOException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
}
});
jButton3.addActionListener(new ActionListener() {
@Override
public void actionPerformed(  ActionEvent esdf) {
// TODO Auto-generated method stub
jTextArea1.setText(queryBridgeWords(jTextField2.getText(),
jTextField3.getText()));
}
});
jButton4.addActionListener(new ActionListener() {
@Override
public void actionPerformed(  ActionEvent esdf) {
// TODO Auto-generated method stub
jTextArea1.setText(generateNewText(jTextArea1.getText()));
}
});
jButton5.addActionListener(new ActionListener() {
@Override
public void actionPerformed(  ActionEvent esdf) {
// TODO Auto-generated method stub
try {
jTextArea1.setText(calcShortestPath(jTextField2.getText(),
jTextField3.getText()));
showlabel1();
} catch (IOException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
}
});
jButton6.addActionListener(new ActionListener() {
@Override
public void actionPerformed(  ActionEvent esdf) {
jTextArea1.setText(randomWalk());
showlabel1();
}
});
jTextField1.addMouseListener(new MouseListener() {
@Override
public void mouseClicked(  MouseEvent esdf) {
         jTextField1.setText("");
          }
         @Override
         public void mouseEntered(  MouseEvent esdf) {
         // TODO Auto-generated method stub
           }
           @Override
 public void mouseExited(  MouseEvent esdf) {
// TODO Auto-generated method stub
}
@Override
public void mousePressed(  MouseEvent esdf) {
// TODO Auto-generated method stub
}
@Override
public void mouseReleased(  MouseEvent esdf) {
// TODO Auto-generated method stub
}
});
jTextField2.addMouseListener(new MouseListener() {
@Override
public void mouseClicked(  MouseEvent esdf) {
// TODO Auto-generated method stub
jTextField2.setText("");
}
@Override
public void mouseEntered(  MouseEvent esdf) {
// TODO Auto-generated method stub
}
@Override
public void mouseExited(  MouseEvent esdf) {
// TODO Auto-generated method stub
}
@Override
public void mousePressed(  MouseEvent esdf) {
// TODO Auto-generated method stub
}
@Override
public void mouseReleased(  MouseEvent esdf) {
// TODO Auto-generated method stub
}
});
jTextField3.addMouseListener(new MouseListener() {
@Override
public void mouseClicked(  MouseEvent esdf) {
// TODO Auto-generated method stub
jTextField3.setText("");
}
@Override
public void mouseEntered(  MouseEvent esdf) {
// TODO Auto-generated method stub
}
@Override
public void mouseExited(  MouseEvent esdf) {
// TODO Auto-generated method stub
}
@Override
public void mousePressed(  MouseEvent esdf) {
// TODO Auto-generated method stub
}
@Override
public void mouseReleased(  MouseEvent esdf) {
// TODO Auto-generated method stub
}
});
}
/**
 * @param args ARGS.
  */
public static void main(  String[] args) {
pmdl = new Hi();
pmdl.setVisible(true);
}
/**
 *
 */
private void showlabel1() {
  ImageIcon icon = new ImageIcon("E:/软件工程/实验/实验1jpg");
icon.setImage(icon.getImage().getScaledInstance(
jLabel1.getWidth(), jLabel1.getHeight(),
Image.SCALE_DEFAULT));
jLabel1.setIcon(icon);
}
/**
 * @param filename FILE.
 * @return RETURN.
 * @throws IOException IOEC.
 */
public String readFile(  String filename) throws IOException { //读文件
  BufferedReader file = new BufferedReader(new FileReader(filename));
String text = "";
String line = file.readLine();
while (line != null) {
text += line;
line = file.readLine();
}
file.close();
return text;
}
/**
 * @param list LISTD.
 * @param path PATH.
 * @param pops P.
 * @throws IOException IOEV.
 */
public void showDirectedGraph(  Map<String, Integer> list,
  String path,   Hi pops) throws IOException {
//展示有向图，并存为.jpg
String text = pops.readFile(path);
textmain.setText(text);
//neighbor.clear();
//numWord.clear();
pops.textmain.wordNum();
pops.textmain.mapCount();
pops.graphmain.graphBuild(pops.textmain.getNeighbor(), pops.textmain.getNumWord());
//p.showDirectedGraph(neighbor);
GraphViz gvce = new GraphViz();
gvce.addln(gvce.sTart());
Set<Entry<String, Integer>> sets = list.entrySet();
for (Entry<String, Integer> entry : sets) {
  String tyui = entry.getKey();
  neiColor = pops.textmain.getNeiColor();
        if (neiColor.containsKey(tyui)) {
 gvce.addln(tyui + " [ label = " + "\""
        + entry.getValue().toString()
      + "\" " + neiColor.get(tyui) + " ];");
      } else {
      gvce.addln(tyui + " [ label = " + "\""
       + entry.getValue().toString() + "\"" + " ];");
       }
       }
gvce.addln(gvce.eNd());

String type = "jpg";
File out = new File("E:/软件工程/实验/实验1" + type);
gvce.writeGraphToFile(gvce.getGraph(gvce.getDotSource(), type), out);
}
/**
 * @param word1 WORD1.
 * @param word2 WORD2.
 * @return RETURNV.
 */
public String queryBridgeWords(String word1, String word2) {
String bridgewords = "不存在";
numWord = textmain.getNumWord();
graph = graphmain.getGraph();
word = textmain.getWord();
if (!numWord.containsKey(word1)) {
bridgewords += (" " + word1);
}
if (!numWord.containsKey(word2)) {
bridgewords += (" " + word2);
}
if (numWord.containsKey(word1) && numWord.containsKey(word2)) {
bridgewords = "";
  int word1num = numWord.get(word1);
  int word2num = numWord.get(word2);
for (int i = 0; i < numWord.size(); i++) {
  int num3 = graph[word1num][i] + graph[i][word2num];
if (i != word1num && i != word2num && num3 >= 2
&& num3 < CAB) {

bridgewords += (word.get(i) + " ");
}
}
if (bridgewords.equals("")) {
return "不存在桥接词";
}
}
return bridgewords;
} //查询桥接词
/**
 * @param inputText INPUT.
 * @return RETURNL.
 */
public String generateNewText(String inputText) {
int jdfg;
String newText = "", bridge = "";
String[] text = inputText.split("\\s+");
for (int i = 0; i < text.length - 1; i++) {
bridge = queryBridgeWords(text[i], text[i + 1]);
if (bridge != "不存在桥接词") {
  String[] bwer = bridge.split("\\s+");
  int length = bwer.length;
  Random rsed = new Random();
jdfg = rsed.nextInt(length);
newText += (text[i] + " " + bwer[jdfg] + " ");
} else {
newText += (text[i] + " ");
}
}
return (newText + text[text.length - 1]);
} //根据bridge word生成新文本
/**
 * @param word1 WORD1;
 * @param word2 WORD2.
 * @return RETURN.
 * @throws IOException IOEQ.
 */
public String calcShortestPath( String word1, String word2)
throws IOException {
    numWord = textmain.getNumWord();
    word = textmain.getWord();
String nPath = "不存在";
if (!numWord.containsKey(word1)) {
nPath += (" " + word1);
}
if ((!numWord.containsKey(word2))) {
boolean x;
if (!word2.equals("")) {
   nPath += (" " + word2);
}
}
if (numWord.containsKey(word1) && (numWord.containsKey(word2)
|| word2.equals(""))) {
  int nzxc = numWord.size();
  int vasd = numWord.get(word1);
String rePath = "";
nPath = "";
boolean[] flag = new boolean[nzxc + 1];
int[] dis = new int[nzxc + 1];
int[] path = new int[nzxc + 1];
graph = graphmain.getGraph();
for (int i = 0; i < nzxc; i++) {
dis[i] = graph[vasd][i];
if (dis[i] == CAB) {
path[i] = nzxc;
} else {
path[i] = vasd;
}
flag[i] = false;
}
flag[vasd] = true;
for (int i = 1; i < nzxc; i++) {
int min = CAB;
int u = nzxc;
for (int j = 0; j < nzxc; j++) {
if (dis[j] < min && !flag[j]) {
min = dis[j];
u = j;
}
}
flag[u] = true;
for (int j = 0; j < nzxc; j++) {
if (!flag[j] && min + graph[u][j] < dis[j]) {
dis[j] = min + graph[u][j];
path[j] = u;
}
}
}
if (numWord.containsKey(word2)) {
  int eqwe = numWord.get(word2);
int frfg = eqwe;
while (path[frfg] != nzxc) {
rePath += (word.get(frfg) + " ");
frfg = path[frfg];
}
if (!rePath.equals("")) {
rePath += word.get(frfg);
  String[] text = rePath.split(" ");
neiColor.clear();
textmain.mapColor(text);
neiColor = textmain.getNeiColor();
showDirectedGraph(neighbor, filepath, pmdl);
nPath += word1;
for (int i = text.length - 2; i >= 0; i--) {
nPath += ("->" + text[i]);
}
}
} else {
for (int i = 0; i < nzxc; i++) {
String xcvb = "";
int fert = i;
while (path[fert] != nzxc) {
xcvb += (word.get(fert) + " ");
fert = path[fert];
}
if (xcvb.equals("")) {
xcvb += word.get(fert);
  String[] text = xcvb.split(" ");
rePath += word1;
for (int j = text.length - 2; j >= 0; j--) {
rePath += ("->" + text[j]);
}
rePath += "\n";
}
}
nPath = rePath;
}
}
if (nPath.equals("")) {
nPath = "不可达";
}
return nPath;
} //计算两个单词之间的最短路径
/**
* @return RETURND.
 */
public String randomWalk() {
    
Map<String, Integer> pAth = textmain.getPathRecord();
neiColor.clear();
neiColor = textmain.getNeiColor();
arraylist = textmain.getArraylist();
neighbor = textmain.getNeighbor();
word = textmain.getWord();
Random r1 = new Random();
Random r2 = new Random();
//System.out.println(numofWord);
int begin = r1.nextInt(textmain.getNumofWord());
StringBuffer rAndom = new StringBuffer();
Integer[] nextarray = arraylist.get(begin).toArray(
new Integer[arraylist.get(begin).size()]);
if (nextarray.length == 0) {
System.out.println("后续无节点1");
return null;
}
int nextword = r2.nextInt(nextarray.length);
//System.out.println("0:"+nextarray[0]+"    1:"+nextarray[1]+"
//2:"+nextarray[2]);
//System.out.println("nextarray.length:" + nextarray.length + "begin:"
//+ begin + "next" + nextarray[nextword]);
String a = new String();
String b = new String();
a = word.get(begin);
b = word.get(nextarray[nextword]);
rAndom.append(a);
while (nextarray.length != 0 && pAth.get(a + " -> " + b) == 0) {
rAndom.append(" -> " + b);
pAth.put(word.get(begin) + " -> "
+ word.get(nextarray[nextword]), 1);
begin = nextarray[nextword];
nextarray = arraylist.get(begin).toArray(
new Integer[arraylist.get(begin).size()]);
System.out.println("nextarray.length:" + nextarray.length
+ "begin:" + begin);
if (nextarray.length == 0) {
/*path_temp.put(word.get(begin) + " -> "
+ word.get(nextarray[nextword]), 1);*/
System.out.println(rAndom.toString());
System.out.println("后续无节点");
GraphViz gv = new GraphViz();
gv.addln(gv.sTart());
Set<Entry<String, Integer>> sets = neighbor.entrySet();
for (Entry<String, Integer> entry : sets) {
String t = entry.getKey();
if (pAth.get(t) == 1) {
gv.addln(t + " [ label = "
        + "\"" + entry.getValue().toString()
       + "\" " + " color = red" + " ];");
        } else {
gv.addln(t + " [ label = " + "\""
+ entry.getValue().toString() + "\"" + " ];");
}
}
gv.addln(gv.eNd());
System.out.println(gv.getDotSource());
String type = "jpg";
File out = new File("E:/软件工程/实验/实验1" + type);
gv.writeGraphToFile(gv.getGraph(gv.getDotSource(), type), out);
return rAndom.toString();
}
nextword = r2.nextInt(nextarray.length);
a = word.get(begin);
b = word.get(nextarray[nextword]);
}
System.out.println(rAndom.toString() + " -> " + b);
rAndom = rAndom.append(" -> " + b);
GraphViz gv = new GraphViz();
gv.addln(gv.sTart());
Set<Entry<String, Integer>> sets = neighbor.entrySet();
for (Entry<String, Integer> entry : sets) {
String t = entry.getKey();
        if (pAth.get(t) == 1) {
gv.addln(t + " [ label = " + "\""
+ entry.getValue().toString() + "\" " + " color = red" + " ];");
       } else {
gv.addln(t + " [ label = " + "\""
      + entry.getValue().toString() + "\"" + " ];");
      }
     }
gv.addln(gv.eNd());
System.out.println(gv.getDotSource());
String type = "jpg";
File out = new File("E:/软件工程/实验/实验1" + type);
gv.writeGraphToFile(gv.getGraph(gv.getDotSource(), type), out);
File pathfile = new File("E:/软件工程/实验/实验1/path.txt");
FileWriter fw = null;
       BufferedWriter writer = null;
     try {
            fw = new FileWriter(pathfile);
           writer = new BufferedWriter(fw);
                writer.write(rAndom.toString());
                writer.newLine(); //换行
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }  finally {
            try {
                if(writer!=null)
                writer.close();
                if(fw!=null)
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
return rAndom.toString();
} //随机游走
//GEN-BEGIN:variables
// Variables declaration - do not modify
/**
 *
 */
private javax.swing.JButton jButton1;
/**
 *
 */
private javax.swing.JButton jButton2;
/**
 *
 */
private javax.swing.JButton jButton3;
/**
 *
 */
private javax.swing.JButton jButton4;
/**
 *
 */
private javax.swing.JButton jButton5;
/**
 *
 */
private javax.swing.JButton jButton6;
/**
 *
 */
private javax.swing.JLabel jLabel1;
/**
 *
 */
private javax.swing.JScrollPane jScrollPane1;
/**
 *
 */
private javax.swing.JTextArea jTextArea1;
/**
 *
 */
private javax.swing.JTextField jTextField1;
/**
 *
 */
private javax.swing.JTextField jTextField2;
/**
 */
private javax.swing.JTextField jTextField3;
// End of variables declaration//GEN-END:variables
}
