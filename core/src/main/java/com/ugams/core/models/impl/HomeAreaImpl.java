package com.ugams.core.models.impl;

import com.ugams.core.models.HomeArea;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = HomeArea.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class HomeAreaImpl implements HomeArea{

    @Inject
    String title;

    @Inject
    String text;

    @Override
    public String getHomeTitle() { return title; }

    @Override
    public String getHomeText() { return text; }
}
