
package question1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author darsheel
 */
public class boysCSV 
{
    String name;// naam ladke ka.
    int att_level;//attractiveness 
    int int_level;//his IQ
    int budget;//his bidget
    //bool isCommitted;
    int min_att_lev;
    boolean isCommitted;//f=comm,t=not_comm
    String typ;
    
    /**
     *
     * @return
     * @throws FileNotFoundException
     */
    @SuppressWarnings("empty-statement")
    // ArrayList<boy> generate()throws FileNotFoundException, IOException
    public ArrayList<boy> generate() throws IOException
    {
        PrintWriter pw = new PrintWriter(new File("Boy13.csv"));
        StringBuilder sb = new StringBuilder();
        ArrayList<boy> b = new ArrayList<boy>(80);
        for(int i=0;i<100;i++)
        {
            name="BoyNo"+(i);
            att_level=(int) (10+(Math.random()*19));
            budget=(int) (10+(Math.random()*100));
            int_level=(int) (10+(Math.random()*25));
            min_att_lev=(int) (0+(Math.random()*10));
            typ = "geek";
            sb.append(name);
            sb.append(',');
            sb.append(att_level);
            sb.append(',');
            sb.append(budget);
            sb.append(',');
            sb.append(int_level);
            sb.append(',');
            sb.append(min_att_lev);
            sb.append(',');
            sb.append(typ);
            sb.append("\n");
            boy bbb = new boy (name,min_att_lev,budget);
            b.add(bbb);
        }
        pw.write(sb.toString());
        pw.close();
        return b;
    }
}
    
