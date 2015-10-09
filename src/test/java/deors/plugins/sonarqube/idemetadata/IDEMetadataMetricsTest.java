package deors.plugins.sonarqube.idemetadata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IDEMetadataMetricsTest {

    public IDEMetadataMetricsTest() {
        super();
    }

    @Test
    public void testMetricsDefinition() {

        IDEMetadataMetrics metrics = new IDEMetadataMetrics();

        assertEquals("plug-in should have 13 metrics defined", 13, metrics.getMetrics().size());
    }
}
