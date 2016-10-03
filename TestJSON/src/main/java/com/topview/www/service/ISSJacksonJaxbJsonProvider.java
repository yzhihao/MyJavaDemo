package com.topview.www.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

public class ISSJacksonJaxbJsonProvider extends JacksonJaxbJsonProvider {
    public ISSJacksonJaxbJsonProvider(ObjectMapper objectMapper){
        super(objectMapper, DEFAULT_ANNOTATIONS);
    }
}
