package io.quarkus.tck.restclient.invalid;

import org.eclipse.microprofile.rest.client.RestClientDefinitionException;
import org.eclipse.microprofile.rest.client.tck.interfaces.MissingPathParam;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.ShouldThrowException;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.testng.annotations.Test;

public class InterfaceHasMethodWithMissingPathParamAnnotation_templateDeclaredAtTypeLevelTest {
    @Deployment
    @ShouldThrowException(RestClientDefinitionException.class)
    public static Archive<?> createDeployment() {
        return ShrinkWrap
                .create(WebArchive.class,
                        InterfaceHasMethodWithMissingPathParamAnnotation_templateDeclaredAtTypeLevelTest.class
                                .getSimpleName() + ".war")
                .addClasses(MissingPathParam.class);
    }

    @Test
    public void shouldNotBeInvoked() {

    }
}
