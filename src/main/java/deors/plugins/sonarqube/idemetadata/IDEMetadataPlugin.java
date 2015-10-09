package deors.plugins.sonarqube.idemetadata;

import java.util.Arrays;
import java.util.List;

import org.sonar.api.Extension;
import org.sonar.api.SonarPlugin;

/**
 * IDE Metadata plugin definition.
 *
 * @author jorge.hidalgo
 * @version 1.0
 */
public class IDEMetadataPlugin extends SonarPlugin {

    /**
     * Default constructor.
     */
    public IDEMetadataPlugin() {
        super();
    }

    /**
     * Defines the plugin extensions: metrics, sensor and dashboard widget.
     *
     * @return the list of extensions for this plugin
     */
    public List<Class<? extends Extension>> getExtensions() {
        return Arrays.asList(
            IDEMetadataMetrics.class,
            IDEMetadataSensor.class,
            IDEMetadataDashboardWidget.class);
    }
}
