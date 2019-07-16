package org.mvel2.tests.security;

import junit.framework.TestCase;
import org.mvel2.MVEL;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class SecurityTests extends TestCase {

    private final String dir = "src/test/java/" + getClass().getPackage().getName().replaceAll("\\.", "/");

    public void testVariableAccessorWorksWithDefaultContext() throws IOException {
        final Object o = MVEL.evalFile(new File(dir + "/sec1.mvel"), new HashMap<String, Object>());
    }
}
