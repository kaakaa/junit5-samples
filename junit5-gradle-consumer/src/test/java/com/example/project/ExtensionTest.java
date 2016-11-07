package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.expectThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import com.example.extension.*;

@Tag("ExtensionSample1")
@ExtendWith(TestExecutionConditionSample1.class)
class ExtensionTest {
	@Test
	void exceptionTest() {
	}

}
