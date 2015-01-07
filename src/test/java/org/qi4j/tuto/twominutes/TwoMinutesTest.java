package org.qi4j.tuto.twominutes;

import org.junit.Test;
import org.qi4j.bootstrap.*;
import org.qi4j.test.AbstractQi4jTest;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TwoMinutesTest
    extends AbstractQi4jTest
{
    @Override
    public void assemble( ModuleAssembly moduleAssembly )
    {
        // Assemble our transient composite into the test module
        moduleAssembly.transients( Speaker.class );
    }

    @Test
    public void assertHelloWorld()
    {
        // Create a new instance of our transient composite and assert its behaviour
        Speaker speaker = module.newTransient( Speaker.class );
        assertThat( speaker.sayHello(), equalTo( "Hello, World!") );
    }
}
