package com.imawsom.poivel;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.FileWriter;
import java.io.StringWriter;

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

        VelocityContext context = new VelocityContext();

        context.put("field1", "Record Number");
        context.put("field2", "Record Type");

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
