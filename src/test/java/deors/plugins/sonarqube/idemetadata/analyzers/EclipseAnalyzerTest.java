package deors.plugins.sonarqube.idemetadata.analyzers;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

import org.junit.Test;

import deors.plugins.sonarqube.idemetadata.model.ProjectInfo;


public class EclipseAnalyzerTest {
    public EclipseAnalyzerTest() {
        super();
    }

    @Test
    public void testMissingProject() throws AnalyzerException {

        EclipseAnalyzer ea = new EclipseAnalyzer(new File("missing-dir"));

        ProjectInfo projectInfo = ea.analyze();

        assertFalse("project should not be Java", projectInfo.isJavaProject());
    }

    @Test
    public void testUnfacetedJavaProject() throws URISyntaxException, AnalyzerException {

        URL settingsUrl = this.getClass().getResource("/project1");
        File settingsDir = new File(settingsUrl.toURI());

        EclipseAnalyzer ea = new EclipseAnalyzer(settingsDir);

        ProjectInfo projectInfo = ea.analyze();

        assertFalse("project should not be faceted", projectInfo.isFacetedProject());
        assertTrue("project should be Java", projectInfo.isJavaProject());
    }

    @Test
    public void testFacetedJavaWebProject() throws URISyntaxException, AnalyzerException {

        URL settingsUrl = this.getClass().getResource("/project2");
        File settingsDir = new File(settingsUrl.toURI());

        EclipseAnalyzer ea = new EclipseAnalyzer(settingsDir);

        ProjectInfo projectInfo = ea.analyze();

        assertTrue("project should be faceted", projectInfo.isFacetedProject());
        assertTrue("project should be Java", projectInfo.isJavaProject());
        assertTrue("project should be Web", projectInfo.isWebProject());
    }

    @Test
    public void testProjectWithDependencies() throws URISyntaxException, AnalyzerException {

        URL settingsUrl = this.getClass().getResource("/project3");
        File settingsDir = new File(settingsUrl.toURI());

        EclipseAnalyzer ea = new EclipseAnalyzer(settingsDir);

        ProjectInfo projectInfo = ea.analyze();

        assertFalse("project should have dependencies", projectInfo.getProjectDependencies().isEmpty());
        assertFalse("project should depend on classpath libraries", projectInfo.getProjectClasspath().isEmpty());
    }

    @Test(expected = AnalyzerException.class)
    public void testProjectWithBadFiles1() throws URISyntaxException, AnalyzerException {

        URL settingsUrl = this.getClass().getResource("/badproject1");
        File settingsDir = new File(settingsUrl.toURI());

        EclipseAnalyzer ea = new EclipseAnalyzer(settingsDir);

        ea.analyze();
    }

    @Test(expected = AnalyzerException.class)
    public void testProjectWithBadFiles2() throws URISyntaxException, AnalyzerException {

        URL settingsUrl = this.getClass().getResource("/badproject2");
        File settingsDir = new File(settingsUrl.toURI());

        EclipseAnalyzer ea = new EclipseAnalyzer(settingsDir);

        ea.analyze();
    }

    @Test(expected = AnalyzerException.class)
    public void testProjectWithBadFiles3() throws URISyntaxException, AnalyzerException {

        URL settingsUrl = this.getClass().getResource("/badproject3");
        File settingsDir = new File(settingsUrl.toURI());

        EclipseAnalyzer ea = new EclipseAnalyzer(settingsDir);

        ea.analyze();
    }
}
