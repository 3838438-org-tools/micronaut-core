/*
 * Copyright 2017-2019 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.micronaut.inject.beans;

import io.micronaut.context.BeanContext;
import io.micronaut.core.annotation.Internal;
import io.micronaut.core.annotation.UsedByGeneratedCode;
import io.micronaut.core.beans.BeanIntrospectionReference;
import io.micronaut.inject.BeanType;


/**
 * Abstract bean introspection reference used by {@link io.micronaut.core.beans.BeanIntrospector} to soft load introspections.
 *
 * @param <T> The bean type
 * @author graemerocher
 * @since 1.1
 */
@Internal
@UsedByGeneratedCode
public abstract class AbstractBeanIntrospectionReference<T> implements BeanIntrospectionReference<T>, BeanType<T> {

    private Boolean present = null;

    /**
     * Default constructor.
     */
    @UsedByGeneratedCode
    @Internal
    protected AbstractBeanIntrospectionReference() {
    }

    @SuppressWarnings("ConstantConditions")
    @Override
    public final boolean isPresent() {
        if (present == null) {
            try {
                present = getBeanType() != null;
            } catch (Throwable e) {
                present = false;
            }
        }
        return present;
    }

    @Override
    public boolean isEnabled(BeanContext context) {
        return isPresent();
    }

    @Override
    public boolean isPrimary() {
        return true;
    }
}
