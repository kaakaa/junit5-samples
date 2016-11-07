package com.example.extension;

import org.junit.jupiter.api.extension.TestExecutionCondition;
import org.junit.jupiter.api.extension.TestExtensionContext;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;

public class TestExecutionConditionSample1 implements TestExecutionCondition {
    public ConditionEvaluationResult evaluate(TestExtensionContext context) {
        return ConditionEvaluationResult.disabled("なんとなく");
    }
}