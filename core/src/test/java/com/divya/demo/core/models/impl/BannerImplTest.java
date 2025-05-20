//  AEM Code Assist V15: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@ExtendWith(AemContextExtension.class)
class BannerImplTest {

    private final AemContext ctx = new AemContext();
    private static final String JSON_CONTENT = "{\n" +
            "  \"ctaBanner\": {\n" +
            "    \"jcr:primaryType\": \"nt:unstructured\",\n" +
            "    \"heading\": \"Welcome to Our Site\",\n" +
            "    \"subheading\": \"Explore the Features\",\n" +
            "    \"description\": \"Discover amazing content and features.\",\n" +
            "    \"textAndCtaPlacement\": \"Top\",\n" +
            "    \"backgroundImage\": \"/content/dam/site/background.jpg\",\n" +
            "    \"primaryCtaLabel\": \"Learn More\",\n" +
            "    \"primaryCtaLink\": \"/content/site/learn-more.html\",\n" +
            "    \"primaryCtaAriaLabel\": \"Learn more about our features\",\n" +
            "    \"openInNewWindow\": true,\n" +
            "    \"secondaryCtaLabel\": \"Contact Us\",\n" +
            "    \"secondaryCtaLink\": \"/content/site/contact.html\",\n" +
            "    \"secondaryCtaAriaLabel\": \"Contact us for more information\",\n" +
            "    \"secondaryOpenInNewWindow\": false\n" +
            "  }\n" +
            "}";

    @BeforeEach
    void setUp() {
        InputStream jsonStream = new ByteArrayInputStream(JSON_CONTENT.getBytes(StandardCharsets.UTF_8));
        ctx.load().json(jsonStream, "/content");
        ctx.addModelsForClasses(BannerImpl.class);
    }

    @Test
    void testGetHeading() {
        BannerImpl model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(BannerImpl.class);
        assertEquals("Welcome to Our Site", model.getHeading());
    }

    @Test
    void testGetSubheading() {
        BannerImpl model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(BannerImpl.class);
        assertEquals("Explore the Features", model.getSubheading());
    }

    @Test
    void testGetDescription() {
        BannerImpl model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(BannerImpl.class);
        assertEquals("Discover amazing content and features.", model.getDescription());
    }

    @Test
    void testGetTextAndCtaPlacement() {
        BannerImpl model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(BannerImpl.class);
        assertEquals("Top", model.getTextAndCtaPlacement());
    }

    @Test
    void testGetBackgroundImagePath() {
        BannerImpl model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(BannerImpl.class);
        assertEquals("/content/dam/site/background.jpg", model.getBackgroundImagePath());
    }

    @Test
    void testGetPrimaryCtaLabel() {
        BannerImpl model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(BannerImpl.class);
        assertEquals("Learn More", model.getPrimaryCtaLabel());
    }

    @Test
    void testGetPrimaryCtaLink() {
        BannerImpl model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(BannerImpl.class);
        assertEquals("/content/site/learn-more.html", model.getPrimaryCtaLink());
    }

    @Test
    void testGetPrimaryCtaAriaLabel() {
        BannerImpl model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(BannerImpl.class);
        assertEquals("Learn more about our features", model.getPrimaryCtaAriaLabel());
    }

    @Test
    void testIsOpenInNewWindow() {
        BannerImpl model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(BannerImpl.class);
        assertTrue(model.isOpenInNewWindow());
    }

    @Test
    void testGetSecondaryCtaLabel() {
        BannerImpl model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(BannerImpl.class);
        assertEquals("Contact Us", model.getSecondaryCtaLabel());
    }

    @Test
    void testGetSecondaryCtaLink() {
        BannerImpl model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(BannerImpl.class);
        assertEquals("/content/site/contact.html", model.getSecondaryCtaLink());
    }

    @Test
    void testGetSecondaryCtaAriaLabel() {
        BannerImpl model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(BannerImpl.class);
        assertEquals("Contact us for more information", model.getSecondaryCtaAriaLabel());
    }

    @Test
    void testIsSecondaryOpenInNewWindow() {
        BannerImpl model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(BannerImpl.class);
        assertFalse(model.isSecondaryOpenInNewWindow());
    }
}

//  AEM Code Assist V15: AI Generated Code End -