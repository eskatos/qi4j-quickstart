package org.qi4j.tuto.twominutes;

import org.qi4j.bootstrap.*;

public class Main
{
    public static void main( String[] args )
        throws Exception
    {
        SingletonAssembler assembler = new SingletonAssembler()
        {
            @Override
            public void assemble( ModuleAssembly assembly )
                throws AssemblyException
            {
                assembly.transients( Speaker.class );
            }
        };
        Speaker speaker = assembler.module().newTransient( Speaker.class );
        System.out.println( speaker.sayHello() );
    }
}
