package org.qi4j.tuto.twominutes;

import org.qi4j.api.mixin.Mixins;

@Mixins( SpeakerMixin.class )
public interface Speaker
{
    String sayHello();
}
