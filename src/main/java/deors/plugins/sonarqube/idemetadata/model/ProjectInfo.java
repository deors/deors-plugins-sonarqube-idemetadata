package deors.plugins.sonarqube.idemetadata.model;

import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;

/**
 * The project information bean.
 *
 * @author jorge.hidalgo
 * @version 1.2
 */
public class ProjectInfo {

    /**
     * An EAR nature identifier.
     */
    static final String IBM_ETOOLS_EAR_NATURE = "com.ibm.etools.j2ee.EAR13Nature"; //$NON-NLS-1$

    /**
     * An EJB nature identifier.
     */
    static final String IBM_ETOOLS_EJB_NATURE = "com.ibm.etools.j2ee.EJB2_0Nature"; //$NON-NLS-1$

    /**
     * A Java nature identifier.
     */
    static final String IBM_ETOOLS_JAVA_NATURE = "com.ibm.etools.ctc.javaprojectnature"; //$NON-NLS-1$

    /**
     * A Web nature identifier.
     */
    static final String IBM_ETOOLS_WEB_NATURE = "com.ibm.etools.j2ee.WebNature"; //$NON-NLS-1$

    /**
     * An EJB nature identifier.
     */
    static final String IBM_WTP_EJB_NATURE = "com.ibm.wtp.ejb.EJBNature"; //$NON-NLS-1$

    /**
     * A Web nature identifier.
     */
    static final String IBM_WTP_WEB_NATURE = "com.ibm.wtp.web.WebNature"; //$NON-NLS-1$

    /**
     * A Java nature identifier.
     */
    static final String JAVA_NATURE = "org.eclipse.jdt.core.javanature"; //$NON-NLS-1$

    /**
     * A Faceted project nature identifier.
     */
    static final String FACET_NATURE = "org.eclipse.wst.common.project.facet.core.nature"; //$NON-NLS-1$

    /**
     * A Google Web Toolkit nature identifier.
     */
    static final String GWT_NATURE = "com.google.gwt.eclipse.core.gwtNature"; //$NON-NLS-1$

    /**
     * A Google App Engine nature identifier.
     */
    static final String GAE_NATURE = "com.google.appengine.eclipse.core.gaeNature"; //$NON-NLS-1$

    /**
     * A Groovy nature identifier.
     */
    static final String GROOVY_NATURE = "org.eclipse.jdt.groovy.core.groovyNature"; //$NON-NLS-1$

    /**
     * A Grails nature identifier.
     */
    static final String GRAILS_NATURE = "com.springsource.sts.grails.core.nature"; //$NON-NLS-1$

    /**
     * An Eclipse plug-in nature identifier.
     */
    static final String PDE_NATURE = "org.eclipse.pde.PluginNature"; //$NON-NLS-1$

    /**
     * A JET nature identifier.
     */
    static final String JET_NATURE = "org.eclipse.jet.jet2Nature"; //$NON-NLS-1$

    /**
     * A Web facet identifier.
     */
    static final String WEB_FACET = "jst.web"; //$NON-NLS-1$

    /**
     * An EJB facet identifier.
     */
    static final String EJB_FACET = "jst.ejb"; //$NON-NLS-1$

    /**
     * An EAR facet identifier.
     */
    static final String EAR_FACET = "jst.ear"; //$NON-NLS-1$

    /**
     * A Grails facet identifier.
     */
    static final String GRAILS_FACET = "grails.app"; //$NON-NLS-1$

    /**
     * The project classpath list.
     */
    private List<String> projectClasspath;

    /**
     * The project dependencies list.
     */
    private List<String> projectDependencies;

    /**
     * The project name.
     */
    private String projectName;

    /**
     * The project natures list.
     */
    private List<String> projectNatures;

    /**
     * The project facets list.
     */
    private List<String> projectFacets;

    /**
     * Default constructor.
     */
    public ProjectInfo() {

        super();

        this.projectName = "DEFAULT"; //$NON-NLS-1$
        this.projectClasspath = new ArrayList<>();
        this.projectDependencies = new ArrayList<>();
        this.projectNatures = new ArrayList<>();
        this.projectFacets = new ArrayList<>();
    }

    /**
     * Constructor that sets the project name.
     *
     * @param projectName the project name
     */
    public ProjectInfo(String projectName) {

        this();

        this.projectName = projectName;
    }

    /**
     * Adds a project classpath entry.
     *
     * @param classpathEntry the classpath entry
     */
    public void addProjectClasspathEntry(String classpathEntry) {

        projectClasspath.add(classpathEntry);
    }

    /**
     * Adds a project dependency.
     *
     * @param dependencyName the dependency name
     */
    public void addProjectDependency(String dependencyName) {

        projectDependencies.add(dependencyName);
    }

    /**
     * Adds a project nature.
     *
     * @param natureName the nature name
     */
    public void addProjectNature(String natureName) {

        projectNatures.add(natureName);
    }

    /**
     * Adds a project facet.
     *
     * @param facetName the facet name
     */
    public void addProjectFacet(String facetName) {

        projectFacets.add(facetName);
    }

    /**
     * Compares equality between this object and the given object.
     *
     * @param target the object to compare with
     *
     * @return whether this object and the given object are equal
     */
    public boolean equals(Object target) {

        if (target == null) {
            return false;
        }

        if (!(target instanceof ProjectInfo)) {
            return false;
        }

        ProjectInfo casted = (ProjectInfo) target;

        return projectName.equals(casted.projectName);
    }

    /**
     * Return the hash code of this object. It is calculated using
     * the AND logical operator over property values.
     *
     * @return the hash code
     */
    public int hashCode() {

        return projectName.hashCode();
    }

    /**
     * Returns the value of the property <code>projectClasspath</code>.
     *
     * @return the value of the property
     */
    public List<String> getProjectClasspath() {

        return projectClasspath;
    }

    /**
     * Returns the value of the property <code>projectDependencies</code>.
     *
     * @return the value of the property
     */
    public List<String> getProjectDependencies() {

        return projectDependencies;
    }

    /**
     * Returns the value of the property <code>projectName</code>.
     *
     * @return the value of the property
     */
    public String getProjectName() {

        return projectName;
    }

    /**
     * Returns the value of the property <code>projectNatures</code>.
     *
     * @return the value of the property
     */
    public List<String> getProjectNatures() {

        return projectNatures;
    }

    /**
     * Returns the value of the property <code>projectFacets</code>.
     *
     * @return the value of the property
     */
    public List<String> getProjectFacets() {

        return projectFacets;
    }

    /**
     * Returns whether the project has a Java nature.
     *
     * @return the Java nature flag
     */
    public boolean isJavaProject() {

        for (String nature : projectNatures) {
            if (JAVA_NATURE.equals(nature)
                || IBM_ETOOLS_JAVA_NATURE.equals(nature)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Returns whether the project has an EAR nature.
     *
     * @return the EAR nature flag
     */
    public boolean isEarProject() {

        for (String nature : projectNatures) {
            if (IBM_ETOOLS_EAR_NATURE.equals(nature)) {
                return true;
            }
        }

        if (isFacetedProject()) {
            for (String facet : projectFacets) {
                if (EAR_FACET.equals(facet)) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Returns whether the project has an EJB nature.
     *
     * @return the EJB nature flag
     */
    public boolean isEjbProject() {

        for (String nature : projectNatures) {
            if (IBM_ETOOLS_EJB_NATURE.equals(nature)
                || IBM_WTP_EJB_NATURE.equals(nature)) {
                return true;
            }
        }

        if (isFacetedProject()) {
            for (String facet : projectFacets) {
                if (EJB_FACET.equals(facet)) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Returns whether the project has a Web nature.
     *
     * @return the Web nature flag
     */
    public boolean isWebProject() {

        for (String nature : projectNatures) {
            if (IBM_ETOOLS_WEB_NATURE.equals(nature)
                || IBM_WTP_WEB_NATURE.equals(nature)
                || GWT_NATURE.equals(nature)
                || GRAILS_NATURE.equals(nature)) {
                return true;
            }
        }

        if (isFacetedProject()) {
            for (String facet : projectFacets) {
                if (WEB_FACET.equals(facet)
                    || GRAILS_FACET.equals(facet)) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Returns whether the project has a Faceted project nature.
     *
     * @return the Faceted project nature flag
     */
    public boolean isFacetedProject() {

        for (String nature : projectNatures) {
            if (FACET_NATURE.equals(nature)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Returns whether the project has a GWT nature.
     *
     * @return the GWT nature flag
     */
    public boolean isGwtProject() {

        for (String nature : projectNatures) {
            if (GWT_NATURE.equals(nature)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Returns whether the project has a GAE nature.
     *
     * @return the GAE nature flag
     */
    public boolean isGaeProject() {

        for (String nature : projectNatures) {
            if (GAE_NATURE.equals(nature)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Returns whether the project has a Groovy nature.
     *
     * @return the Groovy nature flag
     */
    public boolean isGroovyProject() {

        for (String nature : projectNatures) {
            if (GROOVY_NATURE.equals(nature)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Returns whether the project has a Grails nature.
     *
     * @return the Grails nature flag
     */
    public boolean isGrailsProject() {

        for (String nature : projectNatures) {
            if (GRAILS_NATURE.equals(nature)) {
                return true;
            }
        }

        if (isFacetedProject()) {
            for (String facet : projectFacets) {
                if (GRAILS_FACET.equals(facet)) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Returns whether the project has an Eclipse plug-in nature.
     *
     * @return the Eclipse plug-in nature flag
     */
    public boolean isPdeProject() {

        for (String nature : projectNatures) {
            if (PDE_NATURE.equals(nature)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Returns whether the project has a JET nature.
     *
     * @return the GraiJETls nature flag
     */
    public boolean isJetProject() {

        for (String nature : projectNatures) {
            if (JET_NATURE.equals(nature)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Changes the value of the property <code>projectClasspath</code>.
     *
     * @param projectClasspath the new value for the property
     */
    public void setProjectClasspath(List<String> projectClasspath) {

        this.projectClasspath = projectClasspath;
    }

    /**
     * Changes the value of the property <code>projectDependencies</code>.
     *
     * @param projectDependencies the new value for the property
     */
    public void setProjectDependencies(List<String> projectDependencies) {

        this.projectDependencies = projectDependencies;
    }

    /**
     * Changes the value of the property <code>projectName</code>.
     *
     * @param projectName the new value for the property
     */
    public void setProjectName(String projectName) {

        this.projectName = projectName;
    }

    /**
     * Changes the value of the property <code>projectNatures</code>.
     *
     * @param projectNatures the new value for the property
     */
    public void setProjectNatures(List<String> projectNatures) {

        this.projectNatures = projectNatures;
    }

    /**
     * Changes the value of the property <code>projectFacets</code>.
     *
     * @param projectFacets the new value for the property
     */
    public void setProjectFacets(List<String> projectFacets) {

        this.projectFacets = projectFacets;
    }

    /**
     * Returns a JSON representation of this object.
     *
     * @return the JSON representation
     */
    public String toJson() {

        JsonObjectBuilder jsb = Json.createObjectBuilder()
            .add("name", getProjectName()); //$NON-NLS-1$

        if (!projectDependencies.isEmpty()) {
            JsonArrayBuilder jab = Json.createArrayBuilder();
            for (String dep : projectDependencies) {
                jab.add(dep);
            }
            jsb.add("dependencies", jab); //$NON-NLS-1$
        }

        jsb.add("isJava", isJavaProject()); //$NON-NLS-1$
        jsb.add("isEar", isEarProject()); //$NON-NLS-1$
        jsb.add("isEjb", isEjbProject()); //$NON-NLS-1$
        jsb.add("isWeb", isWebProject()); //$NON-NLS-1$
        jsb.add("isGwt", isGwtProject()); //$NON-NLS-1$
        jsb.add("isGae", isGaeProject()); //$NON-NLS-1$
        jsb.add("isGroovy", isGroovyProject()); //$NON-NLS-1$
        jsb.add("isGrails", isGrailsProject()); //$NON-NLS-1$
        jsb.add("isPde", isPdeProject()); //$NON-NLS-1$
        jsb.add("isJet", isJetProject()); //$NON-NLS-1$

        return jsb.build().toString();
    }

    /**
     * Returns a string representation of this object.
     *
     * @return the string representation
     */
    public String toString() {

        return projectName
            + " dependencies " //$NON-NLS-1$
            + projectDependencies
            + " natures " //$NON-NLS-1$
            + projectNatures
            + " facets " //$NON-NLS-1$
            + projectFacets
            + " classpath " //$NON-NLS-1$
            + projectClasspath;
    }
}
