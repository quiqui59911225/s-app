package sample;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import mockit.Expectations;
import mockit.Mocked;

public class FooTest_2 {

    @Test
    public void testGetString(@Mocked final Foo foo) {
        // Record
        new Expectations() {{
            foo.getString();
            result = "Mock";
        }};

        // Replay
        String actual = foo.getString();

        // Verify
        assertThat(actual, is("Mock"));
    }

}