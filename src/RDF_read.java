

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
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
        
//      to run in command line sparql.bat --data=vc-db-1.rdf --query=q1.rq               
        // write it to standard outString queryString = " .... " ;
        String queryString = "....";
        Query query = QueryFactory.create(queryString) ;
         
        try (QueryExecution qexec = QueryExecutionFactory.create(query, model)) {
        	
          ResultSet results = qexec.execSelect() ;
          for ( ; results.hasNext() ; )
          {
            QuerySolution soln = results.nextSolution() ;
            RDFNode x = soln.get("varName") ;       // Get a result variable by name.
            Resource r = soln.getResource("VarR") ; // Get a result variable - must be a resource
            Literal l = soln.getLiteral("VarL") ;   // Get a result variable - must be a literal
          }
        }
     model.write(System.out,"TURTLE");            
    }
}