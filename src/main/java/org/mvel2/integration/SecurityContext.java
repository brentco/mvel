package org.mvel2.integration;

import org.mvel2.optimizers.impl.refl.nodes.VariableAccessor;

import java.lang.reflect.Method;

public interface SecurityContext {
    boolean canAccessVariable(VariableAccessor accessor);
    boolean canAccessMethod(Method method);
    boolean canCreateClass(Class<?> c);
}
