package com.imawsom.poivel;

import com.imawsom.poivel.beans.Record;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.FileWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class VelocityUtility {
    public static void main( String args[] )
    {
        /* first, we init the runtime engine.  Defaults are fine. */
       try
        {
            Velocity.init();
        }
        catch(Exception e)
        {
            System.out.println("Problem initializing Velocity : " + e );
            return;
        }
        /* lets make a Context and put data into it */
        List<Record> records = new ArrayList<Record>();

        Record recordOne = new Record();
        recordOne.setName("crazy");
        recordOne.setType("frog");
        records.add(recordOne);

        Record recordTwo = new Record();
        recordTwo.setName("cool");
        recordTwo.setType("turtle");
        records.add(recordTwo);

        VelocityContext context = new VelocityContext();
         context.put("records", records);

        /* lets render a template */
         FileWriter fw = null;
        StringWriter w = new StringWriter();

        try
        {
            fw= new FileWriter("./src/Record.dat") ;
            Velocity.mergeTemplate("./src/DatMapping.vm", "UTF-8", context, fw);
            fw.close();
        }
        catch (Exception e )
        {
            System.out.println("Problem merging template : " + e );
        }
    }
}
