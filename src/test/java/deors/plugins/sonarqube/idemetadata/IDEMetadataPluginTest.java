package deors.plugins.sonarqube.idemetadata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IDEMetadataPluginTest {

    public IDEMetadataPluginTest() {
        super();
    }

    @Test
    public void testPluginDefinition() {

        IDEMetadataPlugin plugin = new IDEMetadataPlugin();

        assertEquals("plug-in should have 3 extensions defined", 3, plugin.getExtensions().size());
    }
}
