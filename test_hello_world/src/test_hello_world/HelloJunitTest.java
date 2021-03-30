package test_hello_world;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class HelloJunitTest {

    @Test
    public void Helloと言う() {
        HelloJunit helloJunit = new HelloJunit();
        assertThat(helloJunit.sayHello(), is("Hello"));
    }
}
