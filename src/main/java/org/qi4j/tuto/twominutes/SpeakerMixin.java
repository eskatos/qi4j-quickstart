package org.qi4j.tuto.twominutes;

public class SpeakerMixin
    implements Speaker
{
    @Override
    public String sayHello()
    {
       return "Hello, World!";
    }
}
