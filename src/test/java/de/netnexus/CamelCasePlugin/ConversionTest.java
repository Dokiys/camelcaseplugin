package de.netnexus.CamelCasePlugin;

import com.intellij.testFramework.LightPlatformTestCase;
import org.junit.jupiter.api.Test;

import static de.netnexus.CamelCasePlugin.Conversion.*;

public class ConversionTest extends LightPlatformTestCase {

    @Test
    public void testCaseType() {
        System.out.println("-----------------------------");
        System.out.println();

        String caseType = Conversion.CaseType("aaa");
        System.out.println(caseType);
        assertEquals(caseType, CONVERSION_KEBAB_CASE);

        System.out.println();
        System.out.println("-----------------------------");
    }
}
