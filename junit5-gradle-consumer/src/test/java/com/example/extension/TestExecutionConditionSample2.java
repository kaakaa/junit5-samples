package com.example.extension;

import org.junit.jupiter.api.extension.TestExecutionCondition;
import org.junit.jupiter.api.extension.TestExtensionContext;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;

public class TestExecutionConditionSample2 implements TestExecutionCondition {
    public ConditionEvaluationResult evaluate(TestExtensionContext context) {
        long freeMemory = Runtime.getRuntime().freeMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();

        System.out.println("FreeMemory  : " + freeMemory + "[bytes]");
        System.out.println("MaxMemory   : " + maxMemory + "[bytes]");

        long usageMemory = ((maxMemory - freeMemory) / maxMemory) * 100;
        System.out.println("MemoryUsage : " + usageMemory + "%");
        
        if (usageMemory > 50.0) {
            return ConditionEvaluationResult.disabled("no free memory");
        } else {
            return ConditionEvaluationResult.enabled("can use large size of memory");
        }
    }
}