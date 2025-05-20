//  AEM CODE ASSIST V16: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.NotificationComponentModel;
import com.divya.demo.core.models.PagePathModel;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(AemContextExtension.class)
class NotificationComponentModelImplTest {

    private final AemContext ctx = new AemContext();

    private static final String JSON_CONTENT = "{\n" +
            "  \"notification\": {\n" +
            "    \"jcr:primaryType\": \"nt:unstructured\",\n" +
            "    \"sling:resourceType\": \"wknd/components/notification\",\n" +
            "    \"notificationType\": \"Alert\",\n" +
            "    \"displayLocation\": \"Specific Page\",\n" +
            "    \"pagePaths\": {\n" +
            "      \"item0\": {\n" +
            "        \"pagePath\": \"/content/page1\"\n" +
            "      },\n" +
            "      \"item1\": {\n" +
            "        \"pagePath\": \"/content/page2\"\n" +
            "      }\n" +
            "    },\n" +
            "    \"notificationLabel\": \"Important Update\",\n" +
            "    \"imageIconPath\": \"/content/dam/icon.png\",\n" +
            "    \"backgroundColor\": \"#FF5733\",\n" +
            "    \"textStyle\": \"font-weight:bold;\",\n" +
            "    \"timing\": 10,\n" +
            "    \"linkLabel\": \"Read More\",\n" +
            "    \"linkURL\": \"http://example.com\",\n" +
            "    \"interactionOptions\": [\"dismiss\", \"snooze\"],\n" +
            "    \"trackInteractions\": true\n" +
            "  }\n" +
            "}";

    @BeforeEach
    void setUp() {
        ctx.addModelsForClasses(NotificationComponentModelImpl.class, PagePathModelImpl.class);
        InputStream jsonStream = new ByteArrayInputStream(JSON_CONTENT.getBytes(StandardCharsets.UTF_8));
        ctx.load().json(jsonStream, "/content");
    }

    @Test
    void testGetNotificationType() {
        NotificationComponentModel model = ctx.resourceResolver().getResource("/content/notification").adaptTo(NotificationComponentModel.class);
        assertEquals("Alert", model.getNotificationType());
    }

    @Test
    void testGetDisplayLocation() {
        NotificationComponentModel model = ctx.resourceResolver().getResource("/content/notification").adaptTo(NotificationComponentModel.class);
        assertEquals("Specific Page", model.getDisplayLocation());
    }

    @Test
    void testGetPagePaths() {
        NotificationComponentModel model = ctx.resourceResolver().getResource("/content/notification").adaptTo(NotificationComponentModel.class);
        List<PagePathModel> pagePaths = model.getPagePaths();
        assertEquals(2, pagePaths.size());
        assertEquals("/content/page1", pagePaths.get(0).getPagePath());
        assertEquals("/content/page2", pagePaths.get(1).getPagePath());
    }

    @Test
    void testGetNotificationLabel() {
        NotificationComponentModel model = ctx.resourceResolver().getResource("/content/notification").adaptTo(NotificationComponentModel.class);
        assertEquals("Important Update", model.getNotificationLabel());
    }

    @Test
    void testGetImageIconPath() {
        NotificationComponentModel model = ctx.resourceResolver().getResource("/content/notification").adaptTo(NotificationComponentModel.class);
        assertEquals("/content/dam/icon.png", model.getImageIconPath());
    }

    @Test
    void testGetBackgroundColor() {
        NotificationComponentModel model = ctx.resourceResolver().getResource("/content/notification").adaptTo(NotificationComponentModel.class);
        assertEquals("#FF5733", model.getBackgroundColor());
    }

    @Test
    void testGetTextStyle() {
        NotificationComponentModel model = ctx.resourceResolver().getResource("/content/notification").adaptTo(NotificationComponentModel.class);
        assertEquals("font-weight:bold;", model.getTextStyle());
    }

    @Test
    void testGetTiming() {
        NotificationComponentModel model = ctx.resourceResolver().getResource("/content/notification").adaptTo(NotificationComponentModel.class);
        assertEquals(10, model.getTiming());
    }

    @Test
    void testGetLinkLabel() {
        NotificationComponentModel model = ctx.resourceResolver().getResource("/content/notification").adaptTo(NotificationComponentModel.class);
        assertEquals("Read More", model.getLinkLabel());
    }

    @Test
    void testGetLinkURL() {
        NotificationComponentModel model = ctx.resourceResolver().getResource("/content/notification").adaptTo(NotificationComponentModel.class);
        assertEquals("http://example.com", model.getLinkURL());
    }

    @Test
    void testGetInteractionOptions() {
        NotificationComponentModel model = ctx.resourceResolver().getResource("/content/notification").adaptTo(NotificationComponentModel.class);
        List<String> interactionOptions = model.getInteractionOptions();
        assertEquals(2, interactionOptions.size());
        assertTrue(interactionOptions.contains("dismiss"));
        assertTrue(interactionOptions.contains("snooze"));
    }

    @Test
    void testIsTrackInteractionsEnabled() {
        NotificationComponentModel model = ctx.resourceResolver().getResource("/content/notification").adaptTo(NotificationComponentModel.class);
        assertTrue(model.isTrackInteractionsEnabled());
    }
}

// Token Usage: {'total_tokens': 9427, 'completion_tokens': 1570, 'prompt_tokens': 7857}
// Timestamp: 2025-02-18T10:23:48
// Model Used: gpt-4o-2

//  AEM CODE ASSIST V16: AI Generated Code End -
