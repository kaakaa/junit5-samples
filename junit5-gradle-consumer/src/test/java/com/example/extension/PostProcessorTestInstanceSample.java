package com.example.extension;

import org.junit.jupiter.api.extension.ExtensionContext; 
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

public class PostProcessorTestInstanceSample implements TestInstancePostProcessor {
    public void postProcessTestInstance(Object testInstance, ExtensionContext context) {
        System.out.println(context);
    }
}
