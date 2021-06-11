package com.ugams.core.models.impl;

import com.ugams.core.models.Testimonial;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = Testimonial.class)
public class TestimonialImpl implements Testimonial{
    @Inject
    String name;

    @Inject
    String description;

    @Inject
    String designation;

    @Override
    public String getTestimonialName() { return name; }

    @Override
    public String getTestimonialDescription() { return description; }

    @Override
    public String getTestimonialDesignation() { return designation; }

}
