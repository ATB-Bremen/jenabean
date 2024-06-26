/* CVS $Id: $ */
package example; 
import org.apache.jena.rdf.model.*;
 
/**
 * Vocabulary definitions from file:src/example/assembler.n3 
 * @author Auto-generated by schemagen on 07 Jan 2008 21:54 
 */
public class AssemblerVocabulary {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://jena.hpl.hp.com/2005/11/Assembler#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>property of a Connection that specifies as a URI Resource the URL of the database 
     *  to connect to.</p>
     */
    public static final Property dbURL = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#dbURL" );
    
    /** <p>property of a UnionModel that specifies one of its non-root sub-models. Arbitrarily 
     *  many sub-models can be supplied.</p>
     */
    public static final Property subModel = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#subModel" );
    
    /** <p>property of a DocumentManager whose value is its FileManager</p> */
    public static final Property fileManager = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#fileManager" );
    
    /** <p>property of an OntModelSpec that specifies the ontology language.</p> */
    public static final Property ontLanguage = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#ontLanguage" );
    
    /** <p>FileManager property which identifies its LocationMapper.</p> */
    public static final Property locationMapper = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#locationMapper" );
    
    /** <p>FileModel property to give language encoding</p> */
    public static final Property fileEncoding = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#fileEncoding" );
    
    /** <p>property of a FileModel giving the directory in which the modelName is to 
     *  be resolved. Query: is the current behaviour of FileModels to be preserved?</p>
     */
    public static final Property directory = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#directory" );
    
    /** <p>property specifying that the subject RDBModel is built using the connection 
     *  specified by the object.</p>
     */
    public static final Property connection = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#connection" );
    
    /** <p>property for specifying the URL of a SimplePrefixMapping</p> */
    public static final Property namespace = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#namespace" );
    
    /** <p>optional property of an inference model that specifies the base model over 
     *  which inference is done.</p>
     */
    public static final Property baseModel = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#baseModel" );
    
    /** <p>specifies the name of the encoding language (N3, RDF/XML, etc) for the associated 
     *  file or string. Overrides any guess that might otherwise be made. Guesses 
     *  when omitted: starts with '&lt;' means RDF/XML, starts with '@' or '#' means 
     *  N3, otherwise NTRIPLE</p>
     */
    public static final Property contentEncoding = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#contentEncoding" );
    
    /** <p>property of a database connection that specifies as a string the name of a 
     *  Java class to be loaded before connection is attemped.</p>
     */
    public static final Property dbClass = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#dbClass" );
    
    /** <p>property of an OntModel giving its OntModelSpec</p> */
    public static final Property ontModelSpec = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#ontModelSpec" );
    
    /** <p>specifies that the subject Loadable is to be loaded with all the contents 
     *  specified by the object Content.</p>
     */
    public static final Property content = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#content" );
    
    /** <p>specifies that the subject Loadable is to be loaded with all the contents 
     *  specified by the object Load when it is first created - ie not when eg an 
     *  existing database model is opened.</p>
     */
    public static final Property initialContent = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#initialContent" );
    
    /** <p>property of a Reasoner specifying schema Models to be loaded. Multiple schemas 
     *  can be given; they are unioned together before being supplied to the reasoner.</p>
     */
    public static final Property schema = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#schema" );
    
    /** <p>property of a GenericRuleReasoner or RuleSet which specifies rules given witin 
     *  rulesets within the Assembler RDF. Multiple such properties can be given.</p>
     */
    public static final Property rules = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#rules" );
    
    /** <p>property for specifing the prefix of a SimplePrefixMapping</p> */
    public static final Property prefix = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#prefix" );
    
    /** <p>property of a ReasonerFactory specifying the URL of the reasoner in the reasoner 
     *  registry; only one such property per reasoner.</p>
     */
    public static final Property reasonerURL = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#reasonerURL" );
    
    /** <p>property of a UnionModel that specifies its mutable base model</p> */
    public static final Property rootModel = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#rootModel" );
    
    /** <p>property of a database connection that specifies the name of a Java system 
     *  property the password used to authorise the connection.</p>
     */
    public static final Property dbPasswordProperty = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#dbPasswordProperty" );
    
    /** <p>property of a RuleSet specifying a rule (or rules) as a literal string.</p> */
    public static final Property rule = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#rule" );
    
    /** <p>the subject Load is to be loaded from the object String</p> */
    public static final Property literalContent = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#literalContent" );
    
    /** <p>property whose object is another JA description to be loaded into this one; 
     *  equivalent to owl:imports.</p>
     */
    public static final Property imports = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#imports" );
    
    /** <p>property of a Connection that specifies the name of a Java system property 
     *  containing the URL of the database to connect to.</p>
     */
    public static final Property dbURLProperty = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#dbURLProperty" );
    
    /** <p>property of an OntModelSpec that specifies the importSource of the model. 
     *  If omitted, the model has a default MemoryModelMaker.</p>
     */
    public static final Property importSource = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#importSource" );
    
    /** <p>property of an OntModelSpec that specifies the document manager of the model. 
     *  If omitted, the model has the default document manager.</p>
     */
    public static final Property documentManager = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#documentManager" );
    
    /** <p>property of a database connection that specifies as a string the name of the 
     *  database user for which the connection is to be made.</p>
     */
    public static final Property dbUser = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#dbUser" );
    
    /** <p>property used to attach a PrefixMapping to a Model</p> */
    public static final Property prefixMapping = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#prefixMapping" );
    
    /** <p>property to attach a ReificationMode to a Model</p> */
    public static final Property reificationMode = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#reificationMode" );
    
    /** <p>property of a database connection that specifies the name of a Java system 
     *  property containing the type of the database to connect to.</p>
     */
    public static final Property dbTypeProperty = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#dbTypeProperty" );
    
    /** <p>property to allow one prefix mapping to include another</p> */
    public static final Property includes = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#includes" );
    
    /** <p>property of a database connection that specifies the name of a Java system 
     *  property containing the name of the database user for which the connection 
     *  is to be made.</p>
     */
    public static final Property dbUserProperty = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#dbUserProperty" );
    
    /** <p>the subject Load is to be loaded from the object URL</p> */
    public static final Property externalContent = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#externalContent" );
    
    /** <p>property of a RuleSet which identifies rules by their URL. The target resource 
     *  is loaded and parsed as a rule string.</p>
     */
    public static final Property rulesFrom = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#rulesFrom" );
    
    /** <p>property of a database connection that specifies as a string the name a Java 
     *  system property containing the name of a Java class to be loaded before connection 
     *  is attemped.</p>
     */
    public static final Property dbClassProperty = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#dbClassProperty" );
    
    /** <p>property of an OntModelSpec giving the reasoner for the spec</p> */
    public static final Property reasonerFactory = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#reasonerFactory" );
    
    /** <p>property of a FileModel specifying whether the modelName should be escaped 
     *  by replacing _, /, and : by __, _S, _C before being used, to allow URIs as 
     *  model names without implying nested directory strucure. If ommitted or not 
     *  ja:true, no translation is done.</p>
     */
    public static final Property mapName = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#mapName" );
    
    /** <p>property of a ReasonerFactory giving the class name</p> */
    public static final Property reasonerClass = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#reasonerClass" );
    
    /** <p>property of an inference model that specifies the reasoner to use.</p> */
    public static final Property reasoner = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#reasoner" );
    
    /** <p>property specifying that the subject NamedModel shall have the object String 
     *  as its name. If the object is a URI node, it has the spelling of the URI as 
     *  its name.</p>
     */
    public static final Property modelName = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#modelName" );
    
    /** <p>property of a database connection that specifies as a string the type of the 
     *  database to connect to.</p>
     */
    public static final Property dbType = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#dbType" );
    
    /** <p>property of a database connection that specifies as a string the password 
     *  used to authorise the connection.</p>
     */
    public static final Property dbPassword = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#dbPassword" );
    
    /** <p>property of a DocumentManager whose value is its metadata policy path</p> */
    public static final Property policyPath = m_model.createProperty( "http://jena.hpl.hp.com/2005/11/Assembler#policyPath" );
    
    /** <p>class encoding a single prefix mapping maplet</p> */
    public static final Resource SinglePrefixMapping = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#SinglePrefixMapping" );
    
    /** <p>class of inference models given by applying a reasoner to a base model (which 
     *  might be implictly the a default model)</p>
     */
    public static final Resource InfModel = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#InfModel" );
    
    /** <p>class of ReasonerFactory objects, allowing arbitrary reasoner properties to 
     *  be attached.</p>
     */
    public static final Resource ReasonerFactory = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#ReasonerFactory" );
    
    /** <p>the class of Assembler objects</p> */
    public static final Resource Object = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#Object" );
    
    public static final Resource ContentGroup = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#ContentGroup" );
    
    /** <p>a single loadable model item</p> */
    public static final Resource ContentItem = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#ContentItem" );
    
    /** <p>shared superclass for FileModel and RDBModel, accepting the modelName property</p> */
    public static final Resource NamedModel = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#NamedModel" );
    
    /** <p>content to be loaded into a Loadable</p> */
    public static final Resource Content = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#Content" );
    
    /** <p>class of FileManager specifications</p> */
    public static final Resource FileManager = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#FileManager" );
    
    /** <p>a Model from a Jena relational database, specified by a Connection and with 
     *  a given name.</p>
     */
    public static final Resource RDBModel = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#RDBModel" );
    
    /** <p>class encoding a Jena prefix mapping</p> */
    public static final Resource PrefixMapping = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#PrefixMapping" );
    
    /** <p>class of sets of rules (for a Jena rule engine) specified within the Assembler 
     *  file. A RuleSet may refer to rules by their URL, by their containing RuleSets, 
     *  or by including them as string literals.</p>
     */
    public static final Resource RuleSet = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#RuleSet" );
    
    /** <p>class of OntModelSpec objects for OntModel construction</p> */
    public static final Resource OntModelSpec = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#OntModelSpec" );
    
    /** <p>Source of models by name for an OntModelSpec</p> */
    public static final Resource ModelSource = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#ModelSource" );
    
    /** <p>class of LocationMapper specificiations</p> */
    public static final Resource LocationMapper = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#LocationMapper" );
    
    /** <p>a Loadable object, namely a Model or a Load</p> */
    public static final Resource Loadable = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#Loadable" );
    
    /** <p>the class of Assembler model objects</p> */
    public static final Resource Model = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#Model" );
    
    /** <p>class of Union models</p> */
    public static final Resource UnionModel = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#UnionModel" );
    
    /** <p>class of OntDocumentManager specificiations</p> */
    public static final Resource DocumentManager = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#DocumentManager" );
    
    /** <p>class of RDB Connection objects for JDBC database connections.</p> */
    public static final Resource Connection = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#Connection" );
    
    /** <p>the default model description</p> */
    public static final Resource DefaultModel = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#DefaultModel" );
    
    /** <p>A ModelSource backed by an RDB</p> */
    public static final Resource RDBModelSource = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#RDBModelSource" );
    
    /** <p>the class of reification modes</p> */
    public static final Resource ReificationMode = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#ReificationMode" );
    
    /** <p>the class of OntModel specifications</p> */
    public static final Resource OntModel = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#OntModel" );
    
    /** <p>a FileModel is a file-backed NamedModel implemented as a MemoryModel with 
     *  the name given by the modelName and in the directory given by fromDirectory.</p>
     */
    public static final Resource FileModel = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#FileModel" );
    
    /** <p>the class of things that can have rules attached, viz, Reasoners and RuleSets.</p> */
    public static final Resource HasRules = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#HasRules" );
    
    /** <p>The class of Objects which can be the subject of a ja:connection property.</p> */
    public static final Resource Connectable = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#Connectable" );
    
    /** <p>description of a memory model</p> */
    public static final Resource MemoryModel = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#MemoryModel" );
    
    /** <p>reification mode Standard - all reification triples visible</p> */
    public static final Resource standard = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#standard" );
    
    /** <p>reification mode Minimal - no reification triples visible</p> */
    public static final Resource minimal = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#minimal" );
    
    /** <p>reification mode Convenient</p> */
    public static final Resource convenient = m_model.createResource( "http://jena.hpl.hp.com/2005/11/Assembler#convenient" );
    
}
