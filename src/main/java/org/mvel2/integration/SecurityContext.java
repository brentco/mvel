package org.mvel2.integration;

import org.mvel2.PropertyAccessor;
import org.mvel2.optimizers.impl.refl.nodes.VariableAccessor;

import java.lang.reflect.Method;
import java.util.Map;

public interface SecurityContext {
    void checkPropertyAccess(PropertyAccessor accessor);
    Map<String, Object> getLiterals();
}
