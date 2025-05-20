//  AEM CODE ASSIST V18: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.CTABannerComponentModel;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(AemContextExtension.class)
class CTABannerComponentModelImplTest {

    private final AemContext ctx = new AemContext();

    private static final String JSON_CONTENT = "{ \"ctaBanner\": { \"jcr:primaryType\": \"nt:unstructured\", \"sling:resourceType\": \"wknd/components/cta-banner\", \"heading\": \"Welcome to Our Site\", \"subheading\": \"Explore More\", \"description\": \"Discover the amazing features we offer.\", \"textAndCTAPlacement\": \"Top\", \"backgroundImagePath\": \"/content/dam/wknd/background.jpg\", \"primaryCTALabel\": \"Get Started\", \"primaryCTALink\": \"/content/wknd/start.html\", \"primaryCTAAriaLabel\": \"Start Here\", \"primaryCTAOpenInNewWindow\": true, \"secondaryCTALabel\": \"Learn More\", \"secondaryCTALink\": \"/content/wknd/learn.html\", \"secondaryCTAAriaLabel\": \"Learn More About Us\", \"secondaryCTAOpenInNewWindow\": false } }";

    @BeforeEach
    void setUp() {
        ctx.addModelsForClasses(CTABannerComponentModelImpl.class);
        InputStream jsonStream = new ByteArrayInputStream(JSON_CONTENT.getBytes(StandardCharsets.UTF_8));
        ctx.load().json(jsonStream, "/content");
    }

    @Test
    void testGetHeading() {
        CTABannerComponentModel model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(CTABannerComponentModel.class);
        assertEquals("Welcome to Our Site", model.getHeading());
    }

    @Test
    void testGetSubheading() {
        CTABannerComponentModel model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(CTABannerComponentModel.class);
        assertEquals("Explore More", model.getSubheading());
    }

    @Test
    void testGetDescription() {
        CTABannerComponentModel model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(CTABannerComponentModel.class);
        assertEquals("Discover the amazing features we offer.", model.getDescription());
    }

    @Test
    void testGetTextAndCTAPlacement() {
        CTABannerComponentModel model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(CTABannerComponentModel.class);
        assertEquals("Top", model.getTextAndCTAPlacement());
    }

    @Test
    void testGetBackgroundImagePath() {
        CTABannerComponentModel model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(CTABannerComponentModel.class);
        assertEquals("/content/dam/wknd/background.jpg", model.getBackgroundImagePath());
    }

    @Test
    void testGetPrimaryCTALabel() {
        CTABannerComponentModel model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(CTABannerComponentModel.class);
        assertEquals("Get Started", model.getPrimaryCTALabel());
    }

    @Test
    void testGetPrimaryCTALink() {
        CTABannerComponentModel model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(CTABannerComponentModel.class);
        assertEquals("/content/wknd/start.html", model.getPrimaryCTALink());
    }

    @Test
    void testGetPrimaryCTAAriaLabel() {
        CTABannerComponentModel model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(CTABannerComponentModel.class);
        assertEquals("Start Here", model.getPrimaryCTAAriaLabel());
    }

    @Test
    void testIsPrimaryCTAOpenInNewWindow() {
        CTABannerComponentModel model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(CTABannerComponentModel.class);
        assertTrue(model.isPrimaryCTAOpenInNewWindow());
    }

    @Test
    void testGetSecondaryCTALabel() {
        CTABannerComponentModel model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(CTABannerComponentModel.class);
        assertEquals("Learn More", model.getSecondaryCTALabel());
    }

    @Test
    void testGetSecondaryCTALink() {
        CTABannerComponentModel model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(CTABannerComponentModel.class);
        assertEquals("/content/wknd/learn.html", model.getSecondaryCTALink());
    }

    @Test
    void testGetSecondaryCTAAriaLabel() {
        CTABannerComponentModel model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(CTABannerComponentModel.class);
        assertEquals("Learn More About Us", model.getSecondaryCTAAriaLabel());
    }

    @Test
    void testIsSecondaryCTAOpenInNewWindow() {
        CTABannerComponentModel model = ctx.resourceResolver().getResource("/content/ctaBanner").adaptTo(CTABannerComponentModel.class);
        assertFalse(model.isSecondaryCTAOpenInNewWindow());
    }
}

// Token Usage: {'total_tokens': 8274, 'completion_tokens': 1432, 'prompt_tokens': 6842}
// Timestamp: 2025-04-14T12:37:07
// Model Used: gpt-4o-2

//  AEM CODE ASSIST V18: AI Generated Code End -
