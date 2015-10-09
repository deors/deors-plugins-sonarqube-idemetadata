package deors.plugins.sonarqube.idemetadata.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ProjectInfoTest</code> contains tests for the class <code>{@link ProjectInfo}</code>.
 *
 * @generatedBy CodePro at 14/06/13 23:26
 * @author jorge.hidalgo
 * @version $Revision: 1.0 $
 */
public class ProjectInfoTest {

    private ProjectInfo fixture1;

    private ProjectInfo fixture2;

    private ProjectInfo fixture3;

    private ProjectInfo fixture4;

    private ProjectInfo fixture5;

    private ProjectInfo fixture6;

    private ProjectInfo fixture7;

    private ProjectInfo fixture8;

    private ProjectInfo fixture9;

    private ProjectInfo fixture10;

    private ProjectInfo fixture11;

    private ProjectInfo fixture12;

    public ProjectInfo getFixture3() {
        if (fixture3 == null) {
            fixture3 = new ProjectInfo("PRJ3");
            fixture3.addProjectDependency("DEP3");
            fixture3.addProjectNature(ProjectInfo.GAE_NATURE);
            fixture3.addProjectNature(ProjectInfo.JAVA_NATURE);
            fixture3.addProjectNature(ProjectInfo.FACET_NATURE);
            fixture3.addProjectNature(ProjectInfo.GRAILS_NATURE);
            fixture3.addProjectNature(ProjectInfo.GROOVY_NATURE);
            fixture3.addProjectNature(ProjectInfo.GWT_NATURE);
            fixture3.addProjectNature(ProjectInfo.JET_NATURE);
            fixture3.addProjectNature(ProjectInfo.PDE_NATURE);
            fixture3.addProjectFacet(ProjectInfo.EAR_FACET);
            fixture3.addProjectFacet(ProjectInfo.EJB_FACET);
            fixture3.addProjectFacet(ProjectInfo.WEB_FACET);
        }
        return fixture3;
    }

    public ProjectInfo getFixture4() {
        if (fixture4 == null) {
            fixture4 = new ProjectInfo("PRJ4");
            fixture4.addProjectDependency("DEP4");
            fixture4.addProjectNature(ProjectInfo.IBM_ETOOLS_JAVA_NATURE);
            fixture4.addProjectNature(ProjectInfo.IBM_ETOOLS_EAR_NATURE);
            fixture4.addProjectNature(ProjectInfo.IBM_ETOOLS_EJB_NATURE);
        }
        return fixture4;
    }

    public ProjectInfo getFixture5() {
        if (fixture5 == null) {
            fixture5 = new ProjectInfo("PRJ5");
            fixture5.addProjectDependency("DEP5");
            fixture5.addProjectNature(ProjectInfo.IBM_WTP_EJB_NATURE);
        }
        return fixture5;
    }

    public ProjectInfo getFixture6() {
        if (fixture6 == null) {
            fixture6 = new ProjectInfo("PRJ6");
            fixture6.addProjectDependency("DEP6");
            fixture6.addProjectNature(ProjectInfo.FACET_NATURE);
            fixture6.addProjectFacet(ProjectInfo.EJB_FACET);
        }
        return fixture6;
    }

    public ProjectInfo getFixture7() {
        if (fixture7 == null) {
            fixture7 = new ProjectInfo("PRJ7");
            fixture7.addProjectDependency("DEP7");
            fixture7.addProjectNature(ProjectInfo.FACET_NATURE);
            fixture7.addProjectFacet(ProjectInfo.EAR_FACET);
        }
        return fixture7;
    }

    public ProjectInfo getFixture8() {
        if (fixture8 == null) {
            fixture8 = new ProjectInfo("PRJ8");
            fixture8.addProjectDependency("DEP8");
            fixture8.addProjectNature(ProjectInfo.GWT_NATURE);
        }
        return fixture8;
    }

    public ProjectInfo getFixture9() {
        if (fixture9 == null) {
            fixture9 = new ProjectInfo("PRJ9");
            fixture9.addProjectDependency("DEP9");
            fixture9.addProjectNature(ProjectInfo.IBM_WTP_WEB_NATURE);
        }
        return fixture9;
    }

    public ProjectInfo getFixture10() {
        if (fixture10 == null) {
            fixture10 = new ProjectInfo("PRJ10");
            fixture10.addProjectDependency("DEP10");
            fixture10.addProjectNature(ProjectInfo.IBM_ETOOLS_WEB_NATURE);
        }
        return fixture10;
    }

    public ProjectInfo getFixture11() {
        if (fixture11 == null) {
            fixture11 = new ProjectInfo("PRJ11");
            fixture11.addProjectDependency("DEP11");
            fixture11.addProjectNature(ProjectInfo.FACET_NATURE);
            fixture11.addProjectFacet(ProjectInfo.WEB_FACET);
        }
        return fixture11;
    }

    public ProjectInfo getFixture12() {
        if (fixture12 == null) {
            fixture12 = new ProjectInfo("PRJ12");
            fixture12.addProjectDependency("DEP12");
            fixture12.addProjectNature(ProjectInfo.FACET_NATURE);
            fixture12.addProjectFacet(ProjectInfo.GRAILS_FACET);
        }
        return fixture12;
    }

    @Test
    public void testisGaeProject_fixture3()
        throws Exception {
        ProjectInfo projectInfo = getFixture3();
        boolean result = projectInfo.isGaeProject();
        assertEquals(true, result);
    }

    @Test
    public void testisGaeProject_fixture4()
        throws Exception {
        ProjectInfo projectInfo = getFixture4();
        boolean result = projectInfo.isGaeProject();
        assertEquals(false, result);
    }

    @Test
    public void testIsEarProject_fixture3()
        throws Exception {
        ProjectInfo projectInfo = getFixture3();
        boolean result = projectInfo.isEarProject();
        assertEquals(true, result);
    }

    @Test
    public void testIsEarProject_fixture4()
        throws Exception {
        ProjectInfo projectInfo = getFixture4();
        boolean result = projectInfo.isEarProject();
        assertEquals(true, result);
    }

    @Test
    public void testIsEarProject_fixture6()
        throws Exception {
        ProjectInfo projectInfo = getFixture6();
        boolean result = projectInfo.isEarProject();
        assertEquals(false, result);
    }

    @Test
    public void testIsEarProject_fixture7()
        throws Exception {
        ProjectInfo projectInfo = getFixture7();
        boolean result = projectInfo.isEarProject();
        assertEquals(true, result);
    }

    @Test
    public void testIsEjbProject_fixture3()
        throws Exception {
        ProjectInfo projectInfo = getFixture3();
        boolean result = projectInfo.isEjbProject();
        assertEquals(true, result);
    }

    @Test
    public void testIsEjbProject_fixture4()
        throws Exception {
        ProjectInfo projectInfo = getFixture4();
        boolean result = projectInfo.isEjbProject();
        assertEquals(true, result);
    }

    @Test
    public void testIsEjbProject_fixture5()
        throws Exception {
        ProjectInfo projectInfo = getFixture5();
        boolean result = projectInfo.isEjbProject();
        assertEquals(true, result);
    }

    @Test
    public void testIsEjbProject_fixture7()
        throws Exception {
        ProjectInfo projectInfo = getFixture7();
        boolean result = projectInfo.isEjbProject();
        assertEquals(false, result);
    }

    @Test
    public void testIsFacetedProject_fixture3()
        throws Exception {
        ProjectInfo projectInfo = getFixture3();
        boolean result = projectInfo.isFacetedProject();
        assertEquals(true, result);
    }

    @Test
    public void testIsGrailsProject_fixture3()
        throws Exception {
        ProjectInfo projectInfo = getFixture3();
        boolean result = projectInfo.isGrailsProject();
        assertEquals(true, result);
    }

    @Test
    public void testIsGroovyProject_fixture3()
        throws Exception {
        ProjectInfo projectInfo = getFixture3();
        boolean result = projectInfo.isGroovyProject();
        assertEquals(true, result);
    }

    @Test
    public void testIsGwtProject_fixture3()
        throws Exception {
        ProjectInfo projectInfo = getFixture3();
        boolean result = projectInfo.isGwtProject();
        assertEquals(true, result);
    }

    @Test
    public void testIsJavaProject_fixture3()
        throws Exception {
        ProjectInfo projectInfo = getFixture3();
        boolean result = projectInfo.isJavaProject();
        assertEquals(true, result);
    }

    @Test
    public void testIsJavaProjectfixture4()
        throws Exception {
        ProjectInfo projectInfo = getFixture4();
        boolean result = projectInfo.isJavaProject();
        assertEquals(true, result);
    }

    @Test
    public void testIsJetProject_fixture3()
        throws Exception {
        ProjectInfo projectInfo = getFixture3();
        boolean result = projectInfo.isJetProject();
        assertEquals(true, result);
    }

    @Test
    public void testIsPdeProject_fixture3()
        throws Exception {
        ProjectInfo projectInfo = getFixture3();
        boolean result = projectInfo.isPdeProject();
        assertEquals(true, result);
    }

    @Test
    public void testIsWebProject_fixture3()
        throws Exception {
        ProjectInfo projectInfo = getFixture3();
        boolean result = projectInfo.isWebProject();
        assertEquals(true, result);
    }

    @Test
    public void testIsWebProject_fixture7()
        throws Exception {
        ProjectInfo projectInfo = getFixture7();
        boolean result = projectInfo.isWebProject();
        assertEquals(false, result);
    }

    @Test
    public void testIsWebProject_fixture8()
        throws Exception {
        ProjectInfo projectInfo = getFixture8();
        boolean result = projectInfo.isWebProject();
        assertEquals(true, result);
    }

    @Test
    public void testIsWebProject_fixture9()
        throws Exception {
        ProjectInfo projectInfo = getFixture9();
        boolean result = projectInfo.isWebProject();
        assertEquals(true, result);
    }

    @Test
    public void testIsWebProject_fixture10()
        throws Exception {
        ProjectInfo projectInfo = getFixture10();
        boolean result = projectInfo.isWebProject();
        assertEquals(true, result);
    }

    @Test
    public void testIsWebProject_fixture11()
        throws Exception {
        ProjectInfo projectInfo = getFixture11();
        boolean result = projectInfo.isWebProject();
        assertEquals(true, result);
    }

    @Test
    public void testIsGrailsProject_fixture11()
        throws Exception {
        ProjectInfo projectInfo = getFixture11();
        boolean result = projectInfo.isGrailsProject();
        assertEquals(false, result);
    }

    @Test
    public void testIsWebProject_fixture12()
        throws Exception {
        ProjectInfo projectInfo = getFixture12();
        boolean result = projectInfo.isWebProject();
        assertEquals(true, result);
    }

    @Test
    public void testIsGrailsProject_fixture12()
        throws Exception {
        ProjectInfo projectInfo = getFixture12();
        boolean result = projectInfo.isGrailsProject();
        assertEquals(true, result);
    }

    @Test
    public void testToJson_fixture3()
        throws Exception {
        ProjectInfo projectInfo = getFixture3();
        String result = projectInfo.toJson();
        assertEquals("{\"name\":\"PRJ3\",\"dependencies\":[\"DEP3\"],\"isJava\":true,\"isEar\":true,\"isEjb\":true,\"isWeb\":true,\"isGwt\":true,\"isGae\":true,\"isGroovy\":true,\"isGrails\":true,\"isPde\":true,\"isJet\":true}", result);
    }

    /**
     * Return an instance of the class being tested.
     *
     * @return an instance of the class being tested
     *
     * @see ProjectInfo
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    public ProjectInfo getFixture1()
        throws Exception {
        if (fixture1 == null) {
            fixture1 = new ProjectInfo("");
        }
        return fixture1;
    }

    /**
     * Return an instance of the class being tested.
     *
     * @return an instance of the class being tested
     *
     * @see ProjectInfo
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    public ProjectInfo getFixture2()
        throws Exception {
        if (fixture2 == null) {
            fixture2 = new ProjectInfo();
        }
        return fixture2;
    }

    /**
     * Run the ProjectInfo() constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testProjectInfo_1()
        throws Exception {

        ProjectInfo result = new ProjectInfo();

        // add additional test code here
        assertNotNull(result);
        assertEquals("DEFAULT dependencies [] natures [] facets [] classpath []", result.toString());
        assertEquals("DEFAULT", result.getProjectName());
        assertEquals(false, result.isJavaProject());
        assertEquals(false, result.isFacetedProject());
        assertEquals(false, result.isGroovyProject());
        assertEquals(false, result.isEjbProject());
        assertEquals(false, result.isGwtProject());
        assertEquals(false, result.isEarProject());
        assertEquals("{\"name\":\"DEFAULT\",\"isJava\":false,\"isEar\":false,\"isEjb\":false,\"isWeb\":false,\"isGwt\":false,\"isGae\":false,\"isGroovy\":false,\"isGrails\":false,\"isPde\":false,\"isJet\":false}", result.toJson());
        assertEquals(false, result.isJetProject());
        assertEquals(false, result.isPdeProject());
        assertEquals(false, result.isWebProject());
        assertEquals(false, result.isGrailsProject());
        assertEquals(false, result.isGaeProject());
    }

    /**
     * Run the ProjectInfo(String) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testProjectInfo_2()
        throws Exception {
        String projectName = "";

        ProjectInfo result = new ProjectInfo(projectName);

        // add additional test code here
        assertNotNull(result);
        assertEquals(" dependencies [] natures [] facets [] classpath []", result.toString());
        assertEquals("", result.getProjectName());
        assertEquals(false, result.isJavaProject());
        assertEquals(false, result.isFacetedProject());
        assertEquals(false, result.isGroovyProject());
        assertEquals(false, result.isEjbProject());
        assertEquals(false, result.isGwtProject());
        assertEquals(false, result.isEarProject());
        assertEquals("{\"name\":\"\",\"isJava\":false,\"isEar\":false,\"isEjb\":false,\"isWeb\":false,\"isGwt\":false,\"isGae\":false,\"isGroovy\":false,\"isGrails\":false,\"isPde\":false,\"isJet\":false}", result.toJson());
        assertEquals(false, result.isJetProject());
        assertEquals(false, result.isPdeProject());
        assertEquals(false, result.isWebProject());
        assertEquals(false, result.isGrailsProject());
        assertEquals(false, result.isGaeProject());
    }

    /**
     * Run the ProjectInfo(String) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testProjectInfo_3()
        throws Exception {
        String projectName = "0123456789";

        ProjectInfo result = new ProjectInfo(projectName);

        // add additional test code here
        assertNotNull(result);
        assertEquals("0123456789 dependencies [] natures [] facets [] classpath []", result.toString());
        assertEquals("0123456789", result.getProjectName());
        assertEquals(false, result.isJavaProject());
        assertEquals(false, result.isFacetedProject());
        assertEquals(false, result.isGroovyProject());
        assertEquals(false, result.isEjbProject());
        assertEquals(false, result.isGwtProject());
        assertEquals(false, result.isEarProject());
        assertEquals("{\"name\":\"0123456789\",\"isJava\":false,\"isEar\":false,\"isEjb\":false,\"isWeb\":false,\"isGwt\":false,\"isGae\":false,\"isGroovy\":false,\"isGrails\":false,\"isPde\":false,\"isJet\":false}", result.toJson());
        assertEquals(false, result.isJetProject());
        assertEquals(false, result.isPdeProject());
        assertEquals(false, result.isWebProject());
        assertEquals(false, result.isGrailsProject());
        assertEquals(false, result.isGaeProject());
    }

    /**
     * Run the void addProjectClasspathEntry(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testAddProjectClasspathEntry_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        String classpathEntry = "";

        fixture.addProjectClasspathEntry(classpathEntry);

        // add additional test code here
    }

    /**
     * Run the void addProjectClasspathEntry(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testAddProjectClasspathEntry_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        String classpathEntry = "0123456789";

        fixture.addProjectClasspathEntry(classpathEntry);

        // add additional test code here
    }

    /**
     * Run the void addProjectClasspathEntry(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testAddProjectClasspathEntry_fixture2_2()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        String classpathEntry = "";

        fixture.addProjectClasspathEntry(classpathEntry);

        // add additional test code here
    }

    /**
     * Run the void addProjectClasspathEntry(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testAddProjectClasspathEntry_fixture1_2()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        String classpathEntry = "0123456789";

        fixture.addProjectClasspathEntry(classpathEntry);

        // add additional test code here
    }

    /**
     * Run the void addProjectDependency(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testAddProjectDependency_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        String dependencyName = "";

        fixture.addProjectDependency(dependencyName);

        // add additional test code here
    }

    /**
     * Run the void addProjectDependency(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testAddProjectDependency_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        String dependencyName = "0123456789";

        fixture.addProjectDependency(dependencyName);

        // add additional test code here
    }

    /**
     * Run the void addProjectDependency(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testAddProjectDependency_fixture2_2()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        String dependencyName = "";

        fixture.addProjectDependency(dependencyName);

        // add additional test code here
    }

    /**
     * Run the void addProjectDependency(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testAddProjectDependency_fixture1_2()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        String dependencyName = "0123456789";

        fixture.addProjectDependency(dependencyName);

        // add additional test code here
    }

    /**
     * Run the void addProjectFacet(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testAddProjectFacet_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        String facetName = "";

        fixture.addProjectFacet(facetName);

        // add additional test code here
    }

    /**
     * Run the void addProjectFacet(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testAddProjectFacet_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        String facetName = "0123456789";

        fixture.addProjectFacet(facetName);

        // add additional test code here
    }

    /**
     * Run the void addProjectFacet(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testAddProjectFacet_fixture2_2()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        String facetName = "";

        fixture.addProjectFacet(facetName);

        // add additional test code here
    }

    /**
     * Run the void addProjectFacet(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testAddProjectFacet_fixture1_2()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        String facetName = "0123456789";

        fixture.addProjectFacet(facetName);

        // add additional test code here
    }

    /**
     * Run the void addProjectNature(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testAddProjectNature_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        String natureName = "";

        fixture.addProjectNature(natureName);

        // add additional test code here
    }

    /**
     * Run the void addProjectNature(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testAddProjectNature_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        String natureName = "0123456789";

        fixture.addProjectNature(natureName);

        // add additional test code here
    }

    /**
     * Run the void addProjectNature(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testAddProjectNature_fixture2_2()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        String natureName = "";

        fixture.addProjectNature(natureName);

        // add additional test code here
    }

    /**
     * Run the void addProjectNature(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testAddProjectNature_fixture1_2()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        String natureName = "0123456789";

        fixture.addProjectNature(natureName);

        // add additional test code here
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testEquals_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        Object target = "1";

        boolean result = fixture.equals(target);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testEquals_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        Object target = null;

        boolean result = fixture.equals(target);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testEquals_fixture1_2()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        Object target = new ProjectInfo("");

        boolean result = fixture.equals(target);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testEquals_fixture2_2()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        Object target = new ProjectInfo();

        boolean result = fixture.equals(target);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testEquals_fixture2_3()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        Object target = "1";

        boolean result = fixture.equals(target);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testEquals_fixture1_3()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        Object target = null;

        boolean result = fixture.equals(target);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testEquals_fixture2_4()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        Object target = new ProjectInfo("");

        boolean result = fixture.equals(target);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testEquals_fixture1_4()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        Object target = new ProjectInfo();

        boolean result = fixture.equals(target);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the List<String> getProjectClasspath() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testGetProjectClasspath_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();

        List<String> result = fixture.getProjectClasspath();

        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    /**
     * Run the List<String> getProjectClasspath() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testGetProjectClasspath_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();

        List<String> result = fixture.getProjectClasspath();

        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    /**
     * Run the List<String> getProjectDependencies() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testGetProjectDependencies_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();

        List<String> result = fixture.getProjectDependencies();

        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    /**
     * Run the List<String> getProjectDependencies() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testGetProjectDependencies_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();

        List<String> result = fixture.getProjectDependencies();

        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    /**
     * Run the List<String> getProjectFacets() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testGetProjectFacets_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();

        List<String> result = fixture.getProjectFacets();

        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    /**
     * Run the List<String> getProjectFacets() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testGetProjectFacets_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();

        List<String> result = fixture.getProjectFacets();

        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    /**
     * Run the String getProjectName() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testGetProjectName_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();

        String result = fixture.getProjectName();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getProjectName() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testGetProjectName_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();

        String result = fixture.getProjectName();

        // add additional test code here
        assertEquals("DEFAULT", result);
    }

    /**
     * Run the List<String> getProjectNatures() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testGetProjectNatures_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();

        List<String> result = fixture.getProjectNatures();

        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    /**
     * Run the List<String> getProjectNatures() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testGetProjectNatures_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();

        List<String> result = fixture.getProjectNatures();

        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testHashCode_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(0, result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testHashCode_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(-2032180703, result);
    }

    /**
     * Run the boolean isEarProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsEarProject_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();

        boolean result = fixture.isEarProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isEarProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsEarProject_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();

        boolean result = fixture.isEarProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isEjbProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsEjbProject_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();

        boolean result = fixture.isEjbProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isEjbProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsEjbProject_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();

        boolean result = fixture.isEjbProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isFacetedProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsFacetedProject_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();

        boolean result = fixture.isFacetedProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isFacetedProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsFacetedProject_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();

        boolean result = fixture.isFacetedProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isGaeProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsGaeProject_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();

        boolean result = fixture.isGaeProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isGaeProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsGaeProject_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();

        boolean result = fixture.isGaeProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isGrailsProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsGrailsProject_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();

        boolean result = fixture.isGrailsProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isGrailsProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsGrailsProject_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();

        boolean result = fixture.isGrailsProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isGroovyProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsGroovyProject_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();

        boolean result = fixture.isGroovyProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isGroovyProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsGroovyProject_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();

        boolean result = fixture.isGroovyProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isGwtProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsGwtProject_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();

        boolean result = fixture.isGwtProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isGwtProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsGwtProject_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();

        boolean result = fixture.isGwtProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isJavaProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsJavaProject_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();

        boolean result = fixture.isJavaProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isJavaProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsJavaProject_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();

        boolean result = fixture.isJavaProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isJetProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsJetProject_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();

        boolean result = fixture.isJetProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isJetProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsJetProject_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();

        boolean result = fixture.isJetProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isPdeProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsPdeProject_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();

        boolean result = fixture.isPdeProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isPdeProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsPdeProject_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();

        boolean result = fixture.isPdeProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isWebProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsWebProject_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();

        boolean result = fixture.isWebProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isWebProject() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testIsWebProject_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();

        boolean result = fixture.isWebProject();

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        ArrayList<String> projectClasspath = new ArrayList<String>();
        projectClasspath.add("");

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        ArrayList<String> projectClasspath = new ArrayList<String>();
        projectClasspath.add("");
        projectClasspath.add("0123456789");

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture1_2()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        ArrayList<String> projectClasspath = new ArrayList<String>();
        projectClasspath.add("0123456789");

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture2_2()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        LinkedList<String> projectClasspath = new LinkedList<String>();
        projectClasspath.add("");

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture1_3()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        LinkedList<String> projectClasspath = new LinkedList<String>();
        projectClasspath.add("");
        projectClasspath.add("0123456789");

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture2_3()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        LinkedList<String> projectClasspath = new LinkedList<String>();
        projectClasspath.add("0123456789");

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture1_4()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        Vector<String> projectClasspath = new Vector<String>();
        projectClasspath.add("");

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture2_4()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        Vector<String> projectClasspath = new Vector<String>();
        projectClasspath.add("");
        projectClasspath.add("0123456789");

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture1_5()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        Vector<String> projectClasspath = new Vector<String>();
        projectClasspath.add("0123456789");

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture2_5()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        List<String> projectClasspath = new ArrayList<String>();

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture1_6()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        List<String> projectClasspath = new LinkedList<String>();

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture2_6()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        List<String> projectClasspath = new Vector<String>();

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture2_7()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        ArrayList<String> projectClasspath = new ArrayList<String>();
        projectClasspath.add("");

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture1_7()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        ArrayList<String> projectClasspath = new ArrayList<String>();
        projectClasspath.add("");
        projectClasspath.add("0123456789");

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture2_8()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        ArrayList<String> projectClasspath = new ArrayList<String>();
        projectClasspath.add("0123456789");

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture1_8()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        LinkedList<String> projectClasspath = new LinkedList<String>();
        projectClasspath.add("");

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture2_9()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        LinkedList<String> projectClasspath = new LinkedList<String>();
        projectClasspath.add("");
        projectClasspath.add("0123456789");

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture1_9()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        LinkedList<String> projectClasspath = new LinkedList<String>();
        projectClasspath.add("0123456789");

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture2_10()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        Vector<String> projectClasspath = new Vector<String>();
        projectClasspath.add("");

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture1_10()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        Vector<String> projectClasspath = new Vector<String>();
        projectClasspath.add("");
        projectClasspath.add("0123456789");

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture2_11()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        Vector<String> projectClasspath = new Vector<String>();
        projectClasspath.add("0123456789");

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture1_11()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        List<String> projectClasspath = new ArrayList<String>();

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture2_12()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        List<String> projectClasspath = new LinkedList<String>();

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectClasspath(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectClasspath_fixture1_12()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        List<String> projectClasspath = new Vector<String>();

        fixture.setProjectClasspath(projectClasspath);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        ArrayList<String> projectDependencies = new ArrayList<String>();
        projectDependencies.add("");

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        ArrayList<String> projectDependencies = new ArrayList<String>();
        projectDependencies.add("");
        projectDependencies.add("0123456789");

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture1_2()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        ArrayList<String> projectDependencies = new ArrayList<String>();
        projectDependencies.add("0123456789");

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture2_2()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        LinkedList<String> projectDependencies = new LinkedList<String>();
        projectDependencies.add("");

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture1_3()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        LinkedList<String> projectDependencies = new LinkedList<String>();
        projectDependencies.add("");
        projectDependencies.add("0123456789");

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture2_3()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        LinkedList<String> projectDependencies = new LinkedList<String>();
        projectDependencies.add("0123456789");

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture1_4()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        Vector<String> projectDependencies = new Vector<String>();
        projectDependencies.add("");

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture2_4()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        Vector<String> projectDependencies = new Vector<String>();
        projectDependencies.add("");
        projectDependencies.add("0123456789");

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture1_5()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        Vector<String> projectDependencies = new Vector<String>();
        projectDependencies.add("0123456789");

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture2_5()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        List<String> projectDependencies = new ArrayList<String>();

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture1_6()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        List<String> projectDependencies = new LinkedList<String>();

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture2_6()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        List<String> projectDependencies = new Vector<String>();

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture2_7()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        ArrayList<String> projectDependencies = new ArrayList<String>();
        projectDependencies.add("");

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture1_7()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        ArrayList<String> projectDependencies = new ArrayList<String>();
        projectDependencies.add("");
        projectDependencies.add("0123456789");

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture2_8()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        ArrayList<String> projectDependencies = new ArrayList<String>();
        projectDependencies.add("0123456789");

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture1_8()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        LinkedList<String> projectDependencies = new LinkedList<String>();
        projectDependencies.add("");

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture2_9()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        LinkedList<String> projectDependencies = new LinkedList<String>();
        projectDependencies.add("");
        projectDependencies.add("0123456789");

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture1_9()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        LinkedList<String> projectDependencies = new LinkedList<String>();
        projectDependencies.add("0123456789");

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture2_10()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        Vector<String> projectDependencies = new Vector<String>();
        projectDependencies.add("");

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture1_10()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        Vector<String> projectDependencies = new Vector<String>();
        projectDependencies.add("");
        projectDependencies.add("0123456789");

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture2_11()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        Vector<String> projectDependencies = new Vector<String>();
        projectDependencies.add("0123456789");

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture1_11()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        List<String> projectDependencies = new ArrayList<String>();

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture2_12()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        List<String> projectDependencies = new LinkedList<String>();

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectDependencies(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectDependencies_fixture1_12()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        List<String> projectDependencies = new Vector<String>();

        fixture.setProjectDependencies(projectDependencies);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        ArrayList<String> projectFacets = new ArrayList<String>();
        projectFacets.add("");

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        ArrayList<String> projectFacets = new ArrayList<String>();
        projectFacets.add("");
        projectFacets.add("0123456789");

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture1_2()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        ArrayList<String> projectFacets = new ArrayList<String>();
        projectFacets.add("0123456789");

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture2_2()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        LinkedList<String> projectFacets = new LinkedList<String>();
        projectFacets.add("");

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture1_3()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        LinkedList<String> projectFacets = new LinkedList<String>();
        projectFacets.add("");
        projectFacets.add("0123456789");

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture2_3()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        LinkedList<String> projectFacets = new LinkedList<String>();
        projectFacets.add("0123456789");

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture1_4()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        Vector<String> projectFacets = new Vector<String>();
        projectFacets.add("");

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture2_4()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        Vector<String> projectFacets = new Vector<String>();
        projectFacets.add("");
        projectFacets.add("0123456789");

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture1_5()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        Vector<String> projectFacets = new Vector<String>();
        projectFacets.add("0123456789");

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture2_5()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        List<String> projectFacets = new ArrayList<String>();

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture1_6()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        List<String> projectFacets = new LinkedList<String>();

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture2_6()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        List<String> projectFacets = new Vector<String>();

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture2_7()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        ArrayList<String> projectFacets = new ArrayList<String>();
        projectFacets.add("");

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture1_7()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        ArrayList<String> projectFacets = new ArrayList<String>();
        projectFacets.add("");
        projectFacets.add("0123456789");

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture2_8()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        ArrayList<String> projectFacets = new ArrayList<String>();
        projectFacets.add("0123456789");

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture1_8()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        LinkedList<String> projectFacets = new LinkedList<String>();
        projectFacets.add("");

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture2_9()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        LinkedList<String> projectFacets = new LinkedList<String>();
        projectFacets.add("");
        projectFacets.add("0123456789");

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture1_9()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        LinkedList<String> projectFacets = new LinkedList<String>();
        projectFacets.add("0123456789");

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture2_10()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        Vector<String> projectFacets = new Vector<String>();
        projectFacets.add("");

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture1_10()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        Vector<String> projectFacets = new Vector<String>();
        projectFacets.add("");
        projectFacets.add("0123456789");

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture2_11()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        Vector<String> projectFacets = new Vector<String>();
        projectFacets.add("0123456789");

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture1_11()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        List<String> projectFacets = new ArrayList<String>();

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture2_12()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        List<String> projectFacets = new LinkedList<String>();

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectFacets(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectFacets_fixture1_12()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        List<String> projectFacets = new Vector<String>();

        fixture.setProjectFacets(projectFacets);

        // add additional test code here
    }

    /**
     * Run the void setProjectName(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectName_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        String projectName = "";

        fixture.setProjectName(projectName);

        // add additional test code here
    }

    /**
     * Run the void setProjectName(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectName_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        String projectName = "0123456789";

        fixture.setProjectName(projectName);

        // add additional test code here
    }

    /**
     * Run the void setProjectName(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectName_fixture2_2()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        String projectName = "";

        fixture.setProjectName(projectName);

        // add additional test code here
    }

    /**
     * Run the void setProjectName(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectName_fixture1_2()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        String projectName = "0123456789";

        fixture.setProjectName(projectName);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        ArrayList<String> projectNatures = new ArrayList<String>();
        projectNatures.add("");

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        ArrayList<String> projectNatures = new ArrayList<String>();
        projectNatures.add("");
        projectNatures.add("0123456789");

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture1_2()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        ArrayList<String> projectNatures = new ArrayList<String>();
        projectNatures.add("0123456789");

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture2_2()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        LinkedList<String> projectNatures = new LinkedList<String>();
        projectNatures.add("");

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture1_3()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        LinkedList<String> projectNatures = new LinkedList<String>();
        projectNatures.add("");
        projectNatures.add("0123456789");

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture2_3()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        LinkedList<String> projectNatures = new LinkedList<String>();
        projectNatures.add("0123456789");

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture1_4()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        Vector<String> projectNatures = new Vector<String>();
        projectNatures.add("");

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture2_4()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        Vector<String> projectNatures = new Vector<String>();
        projectNatures.add("");
        projectNatures.add("0123456789");

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture1_5()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        Vector<String> projectNatures = new Vector<String>();
        projectNatures.add("0123456789");

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture2_5()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        List<String> projectNatures = new ArrayList<String>();

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture1_6()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        List<String> projectNatures = new LinkedList<String>();

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture2_6()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        List<String> projectNatures = new Vector<String>();

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture2_7()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        ArrayList<String> projectNatures = new ArrayList<String>();
        projectNatures.add("");

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture1_7()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        ArrayList<String> projectNatures = new ArrayList<String>();
        projectNatures.add("");
        projectNatures.add("0123456789");

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture2_8()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        ArrayList<String> projectNatures = new ArrayList<String>();
        projectNatures.add("0123456789");

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture1_8()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        LinkedList<String> projectNatures = new LinkedList<String>();
        projectNatures.add("");

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture2_9()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        LinkedList<String> projectNatures = new LinkedList<String>();
        projectNatures.add("");
        projectNatures.add("0123456789");

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture1_9()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        LinkedList<String> projectNatures = new LinkedList<String>();
        projectNatures.add("0123456789");

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture2_10()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        Vector<String> projectNatures = new Vector<String>();
        projectNatures.add("");

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture1_10()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        Vector<String> projectNatures = new Vector<String>();
        projectNatures.add("");
        projectNatures.add("0123456789");

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture2_11()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        Vector<String> projectNatures = new Vector<String>();
        projectNatures.add("0123456789");

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture1_11()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        List<String> projectNatures = new ArrayList<String>();

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture2_12()
        throws Exception {
        ProjectInfo fixture = getFixture2();
        List<String> projectNatures = new LinkedList<String>();

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the void setProjectNatures(List<String>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testSetProjectNatures_fixture1_12()
        throws Exception {
        ProjectInfo fixture = getFixture1();
        List<String> projectNatures = new Vector<String>();

        fixture.setProjectNatures(projectNatures);

        // add additional test code here
    }

    /**
     * Run the String toJson() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testToJson_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();

        String result = fixture.toJson();

        // add additional test code here
        assertEquals("{\"name\":\"\",\"isJava\":false,\"isEar\":false,\"isEjb\":false,\"isWeb\":false,\"isGwt\":false,\"isGae\":false,\"isGroovy\":false,\"isGrails\":false,\"isPde\":false,\"isJet\":false}", result);
    }

    /**
     * Run the String toJson() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testToJson_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();

        String result = fixture.toJson();

        // add additional test code here
        assertEquals("{\"name\":\"DEFAULT\",\"isJava\":false,\"isEar\":false,\"isEjb\":false,\"isWeb\":false,\"isGwt\":false,\"isGae\":false,\"isGroovy\":false,\"isGrails\":false,\"isPde\":false,\"isJet\":false}", result);
    }

    /**
     * Run the String toString() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testToString_fixture1_1()
        throws Exception {
        ProjectInfo fixture = getFixture1();

        String result = fixture.toString();

        // add additional test code here
        assertEquals(" dependencies [] natures [] facets [] classpath []", result);
    }

    /**
     * Run the String toString() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Test
    public void testToString_fixture2_1()
        throws Exception {
        ProjectInfo fixture = getFixture2();

        String result = fixture.toString();

        // add additional test code here
        assertEquals("DEFAULT dependencies [] natures [] facets [] classpath []", result);
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @Before
    public void setUp()
        throws Exception {
        // add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *         if the clean-up fails for some reason
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    @After
    public void tearDown()
        throws Exception {
        // Add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args the command line arguments
     *
     * @generatedBy CodePro at 26/06/13 21:36
     */
    public static void main(String[] args) {
        new org.junit.runner.JUnitCore().run(ProjectInfoTest.class);
    }
}
