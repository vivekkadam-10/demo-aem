//  AEM Code Assist V15: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import com.google.common.collect.ImmutableList;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import com.divya.demo.core.models.VersatileNotificationComponentModel;

@ExtendWith({AemContextExtension.class})
class VersatileNotificationComponentModelImplTest {

    private final AemContext ctx = new AemContext();

    private static final String JSON_CONTENT = "{ \"versatileNotification\": { \"jcr:primaryType\": \"nt:unstructured\", \"sling:resourceType\": \"demo/components/versatileNotification\", \"notificationType\": \"Alert\", \"displayLocation\": \"Specific Page\", \"pagePaths\": { \"item0\": { \"pagePath\": \"/content/page1\" }, \"item1\": { \"pagePath\": \"/content/page2\" } }, \"notificationLabel\": \"Important Update\", \"imageIconPath\": \"/content/dam/icons/icon.png\", \"backgroundColor\": \"#FF5733\", \"textStyle\": \"font-weight: bold;\", \"timing\": 10, \"linkLabel\": \"Read More\", \"linkURL\": \"/content/readmore\", \"interactionOptions\": { \"item0\": { \"value\": \"Dismiss\" }, \"item1\": { \"value\": \"Snooze\" } }, \"trackInteractions\": true } }";

    @BeforeEach
    void setUp() {
        ctx.addModelsForClasses(VersatileNotificationComponentModelImpl.class);
        InputStream jsonStream = new ByteArrayInputStream(JSON_CONTENT.getBytes(StandardCharsets.UTF_8));
        ctx.load().json(jsonStream, "/content");
    }

    @Test
    public void testGetNotificationType() {
        VersatileNotificationComponentModel model = ctx.resourceResolver().getResource("/content/versatileNotification").adaptTo(VersatileNotificationComponentModel.class);
        assertEquals("Alert", model.getNotificationType());
    }

    @Test
    public void testGetDisplayLocation() {
        VersatileNotificationComponentModel model = ctx.resourceResolver().getResource("/content/versatileNotification").adaptTo(VersatileNotificationComponentModel.class);
        assertEquals("Specific Page", model.getDisplayLocation());
    }

    @Test
    public void testGetPagePaths() {
        VersatileNotificationComponentModel model = ctx.resourceResolver().getResource("/content/versatileNotification").adaptTo(VersatileNotificationComponentModel.class);
        List<String> actual = model.getPagePaths();
        assertEquals(ImmutableList.of("/content/page1", "/content/page2"), actual);
    }

    @Test
    public void testGetNotificationLabel() {
        VersatileNotificationComponentModel model = ctx.resourceResolver().getResource("/content/versatileNotification").adaptTo(VersatileNotificationComponentModel.class);
        assertEquals("Important Update", model.getNotificationLabel());
    }

    @Test
    public void testGetImageIconPath() {
        VersatileNotificationComponentModel model = ctx.resourceResolver().getResource("/content/versatileNotification").adaptTo(VersatileNotificationComponentModel.class);
        assertEquals("/content/dam/icons/icon.png", model.getImageIconPath());
    }

    @Test
    public void testGetBackgroundColor() {
        VersatileNotificationComponentModel model = ctx.resourceResolver().getResource("/content/versatileNotification").adaptTo(VersatileNotificationComponentModel.class);
        assertEquals("#FF5733", model.getBackgroundColor());
    }

    @Test
    public void testGetTextStyle() {
        VersatileNotificationComponentModel model = ctx.resourceResolver().getResource("/content/versatileNotification").adaptTo(VersatileNotificationComponentModel.class);
        assertEquals("font-weight: bold;", model.getTextStyle());
    }

    @Test
    public void testGetTiming() {
        VersatileNotificationComponentModel model = ctx.resourceResolver().getResource("/content/versatileNotification").adaptTo(VersatileNotificationComponentModel.class);
        assertEquals(10, model.getTiming());
    }

    @Test
    public void testGetLinkLabel() {
        VersatileNotificationComponentModel model = ctx.resourceResolver().getResource("/content/versatileNotification").adaptTo(VersatileNotificationComponentModel.class);
        assertEquals("Read More", model.getLinkLabel());
    }

    @Test
    public void testGetLinkURL() {
        VersatileNotificationComponentModel model = ctx.resourceResolver().getResource("/content/versatileNotification").adaptTo(VersatileNotificationComponentModel.class);
        assertEquals("/content/readmore.html", model.getLinkURL());
    }

    @Test
    public void testGetInteractionOptions() {
        VersatileNotificationComponentModel model = ctx.resourceResolver().getResource("/content/versatileNotification").adaptTo(VersatileNotificationComponentModel.class);
        List<String> actual = model.getInteractionOptions();
        assertEquals(ImmutableList.of("Dismiss", "Snooze"), actual);
    }

    @Test
    public void testIsTrackInteractionsEnabled() {
        VersatileNotificationComponentModel model = ctx.resourceResolver().getResource("/content/versatileNotification").adaptTo(VersatileNotificationComponentModel.class);
        assertTrue(model.isTrackInteractionsEnabled());
    }
}

//  AEM Code Assist V15: AI Generated Code End -