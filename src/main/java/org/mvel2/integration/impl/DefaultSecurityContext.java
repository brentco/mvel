package org.mvel2.integration.impl;

import org.mvel2.PropertyAccessor;
import org.mvel2.integration.SecurityContext;

import java.util.HashMap;
import java.util.Map;

/**
 * A security context that allows everything. This is the security context that replicates the language behavior before
 * sandboxing was introduced.
 */
public class DefaultSecurityContext implements SecurityContext {

    private final Map<String, Object> literals = new HashMap<String, Object>();

    public DefaultSecurityContext() {

    }

    @Override
    public void checkPropertyAccess(PropertyAccessor accessor) {
        System.out.println("Checking property access '" + accessor);
    }

    @Override
    public Map<String, Object> getLiterals() {
        return new HashMap<String, Object>();
    }
}
