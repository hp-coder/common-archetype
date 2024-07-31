#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain;

/**
 * @author hp
 */
public class OrderConstants {
    public static final String API_SOURCE_PATH = "../${rootArtifactId}-api/src/main/java";
    public static final String MODEL_SOURCE_PATH = "../${rootArtifactId}-model/src/main/java";
    public static final String APP_SOURCE_PATH = "../${rootArtifactId}-app/src/main/java";
    public static final String DOMAIN_SOURCE_PATH = "../${rootArtifactId}-domain/src/main/java";
    public static final String FEIGN_SERVICE_SOURCE_PATH = "../${rootArtifactId}-feign-service/src/main/java";
    public static final String INFRASTRUCTURE_SOURCE_PATH = "../${rootArtifactId}-infrastructure/src/main/java";
}
