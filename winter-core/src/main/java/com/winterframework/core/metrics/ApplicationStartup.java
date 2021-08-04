/*
 * Copyright (C), 1987-2099, Winter All Rights Reserved.
 */
package com.winterframework.core.metrics;

/**
 * @author huangwh@paraview.cn
 * @since 2021/08/04
 */
public interface ApplicationStartup {

    ApplicationStartup DEFAULT = new DefaultApplicationStartup();

    /**
     *
     * @param name
     * @return
     */
    StartupStep start(String name);
}