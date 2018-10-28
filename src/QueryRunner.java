import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;

public class QueryRunner {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// Open the bloggers RDF graph from the filesystem
		InputStream in = new FileInputStream(new File("vc-db-1.rdf"));
		 
		// Create an empty in-memory model and populate it from the graph
//		Model model = ModelFactory.createMemModelMaker().createModel();
	     Model model = ModelFactory.createDefaultModel();
		model.read(in,null); // null base URI, since model URIs are absolute
//		in.close();
		 
		// Create a new query
		String queryString = 
		
		    "SELECT ?x ?name" +
		    "WHERE {" +
		    " ?x <http://www.w3.org/2001/vcard-rdf/3.0#FN> ?name " +
		    "      }";
		 
		Query query = QueryFactory.create(queryString);
		 
		// Execute the query and obtain results
		QueryExecution qe = QueryExecutionFactory.create(query, model);
		ResultSet results = qe.execSelect();
		 
		// Output query results 
		ResultSetFormatter.out(System.out, results, query);
		 
		// Important - free up resources used running the query
		qe.close();

	}

}
