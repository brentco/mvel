package org.mvel2.integration.impl;

import org.mvel2.integration.SecurityContext;
import org.mvel2.optimizers.impl.refl.nodes.VariableAccessor;

import java.lang.reflect.Method;

/**
 * A security context that allows everything. This is the security context that replicates the language behavior before
 * sandboxing was introduced.
 */
public class DefaultSecurityContext implements SecurityContext {
    @Override
    public boolean canAccessVariable(VariableAccessor accessor) {
        return true;
    }

    @Override
    public boolean canAccessMethod(Method method) {
        return true;
    }

    @Override
    public boolean canCreateClass(Class<?> c) {
        return true;
    }
}
