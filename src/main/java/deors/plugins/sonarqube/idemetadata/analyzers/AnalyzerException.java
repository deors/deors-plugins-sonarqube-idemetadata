package deors.plugins.sonarqube.idemetadata.analyzers;

/**
 * Analyzer Exception type.
 *
 * @author jorge.hidalgo
 * @version 1.0
 */
public class AnalyzerException extends Exception {

    /**
     * Serialization id.
     */
    private static final long serialVersionUID = -1644223223242751568L;

    /**
     * Default constructor.
     */
    public AnalyzerException() {
        super();
    }

    /**
     * Exception constructor from a given message.
     *
     * @param message the exception message
     */
    public AnalyzerException(String message) {
        super(message);
    }

    /**
     * Exception constructor from a given root cause.
     *
     * @param rootCause the exception root cause
     */
    public AnalyzerException(Throwable rootCause) {
        super(rootCause);
    }

    /**
     * Exception constructor from a given message and root cause.
     *
     * @param message the exception message
     * @param rootCause the exception root cause
     */
    public AnalyzerException(String message, Throwable rootCause) {
        super(message, rootCause);
    }
}
