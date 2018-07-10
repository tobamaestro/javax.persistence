/*
 * Copyright (c) 1998, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     mkeith

package org.eclipse.persistence.javax.persistence.osgi;

import javax.persistence.spi.PersistenceProviderResolverHolder;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Activator class for OSGi integration
 * 
 * @author mkeith, tware, ssmith
 */
public class Activator implements BundleActivator {

    public void start(BundleContext context) throws Exception {
        PersistenceProviderResolverHolder.setPersistenceProviderResolver(new OSGiProviderResolver(context));
    }

    public void stop(BundleContext context) throws Exception {
        PersistenceProviderResolverHolder.setPersistenceProviderResolver(null);
    }
}
