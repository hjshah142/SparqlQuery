

import org.apache.jena.rdf.model.*;
import org.apache.jena.util.FileManager;

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
        // create an empty model
        Model model = ModelFactory.createDefaultModel();

        InputStream in = FileManager.get().open( inputFileName );
        if (in == null) {
            throw new IllegalArgumentException( "File: " + inputFileName + " not found");
        }
        
        // read the RDF/XML file
//        model.read(in, "TURTLE");
        model.read("file_1.ttl") ;
                    
        // write it to standard out
     model.write(System.out);            
    }
}