
package question1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author darsheel
 */
class girlCSV {
     String name;// naam ladke ka.
    int att_level;//attractiveness 
    int int_level;//his IQ
    int budget;//his bidget
    //bool isCommitted;
    int min_att_lev;
    boolean isCommitted;//f=comm,t=not_comm
    String typ;
    @SuppressWarnings("empty-statement")
    public ArrayList<girl> generate() throws IOException
    {
        PrintWriter pw = new PrintWriter(new File("girl13.csv"));
        StringBuilder sb = new StringBuilder();
        ArrayList<girl> g = new ArrayList<girl>(50);
        for(int i=0;i<100;i++)
        {
            name="girlNo"+(i);
            att_level=(int) (10+(Math.random()*9));
            budget=(int) (1+(Math.random()*1000));
            int_level=(int) (10+(Math.random()*25));
            min_att_lev=(int) (0+(Math.random()*10));
            typ = "choosy";
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
            girl ggg= new girl(name,att_level,budget);
            g.add(ggg);
        }
        pw.write(sb.toString());
        pw.close();    
        return g;
    }
}
    

    

