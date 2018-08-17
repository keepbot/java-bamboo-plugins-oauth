package ut.keepbot.bamboo.plugins.oauth;

import org.junit.Test;
import keepbot.bamboo.plugins.oauth.api.MyPluginComponent;
import keepbot.bamboo.plugins.oauth.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}