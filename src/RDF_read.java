

import org.apache.jena.rdf.model.*;
import org.apache.jena.util.FileManager;
import org.apache.log4j.BasicConfigurator;

import java.io.*;

/** Tutorial 5 - read RDF XML from a file and write it to standard out
 */
public class RDF_read extends Object {

    /**
        NOTE that the file is loaded from the class-path and so requires that
        the data-directory, as well as the directory containing the compiled
        class, must be added to the class-path when running this and
        subsequent examples.
    */    
    static final String inputFileName  = "file_1.ttl";
                              
    public static void main (String args[]) {
    	BasicConfigurator.configure();
        // create an empty model
        Model model = ModelFactory.createDefaultModel();

        InputStream in = FileManager.get().open( inputFileName );
        if (in == null) {
            throw new IllegalArgumentException( "File: " + inputFileName + " not found");
        }
        
        // read the RDF/XML file
//         read() method call is the URI which will be used for resolving relative URI's
//        model.read(in, "TURTLE");
        model.read(inputFileName) ;
                    
        // write it to standard out
     model.write(System.out);            
    }
}