//  AEM CODE ASSIST V18: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({AemContextExtension.class})
class HeroComponentModelImplTest {

    private final AemContext ctx = new AemContext();

    private static final String JSON_CONTENT = "{ \"heroComponent\": { \"jcr:primaryType\": \"nt:unstructured\", \"variation\": \"Article\", \"overline\": \"Sample Overline\", \"headline\": \"Sample Headline\", \"subhead\": \"Sample Subhead\", \"logoImage\": \"/content/dam/logo.png\", \"backgroundImage\": \"/content/dam/background.png\", \"primaryCtaLink\": \"/content/page1\", \"primaryCtaAriaLabel\": \"Primary CTA\", \"primaryCtaOpenInNewWindow\": true, \"secondaryCtaLabel\": \"Secondary CTA\", \"secondaryCtaLink\": \"/content/page2\", \"secondaryCtaAriaLabel\": \"Secondary CTA\", \"secondaryCtaOpenInNewWindow\": false } }";

    @BeforeEach
    void setUp() {
        ctx.addModelsForClasses(HeroComponentModelImpl.class);
        InputStream jsonStream = new ByteArrayInputStream(JSON_CONTENT.getBytes(StandardCharsets.UTF_8));
        ctx.load().json(jsonStream, "/content");
    }

    @Test
    void testGetVariation() {
        HeroComponentModelImpl heroComponent = ctx.resourceResolver().getResource("/content/heroComponent").adaptTo(HeroComponentModelImpl.class);
        String actual = heroComponent.getVariation();
        assertEquals("Article", actual);
    }

    @Test
    void testGetOverline() {
        HeroComponentModelImpl heroComponent = ctx.resourceResolver().getResource("/content/heroComponent").adaptTo(HeroComponentModelImpl.class);
        String actual = heroComponent.getOverline();
        assertEquals("Sample Overline", actual);
    }

    @Test
    void testGetHeadline() {
        HeroComponentModelImpl heroComponent = ctx.resourceResolver().getResource("/content/heroComponent").adaptTo(HeroComponentModelImpl.class);
        String actual = heroComponent.getHeadline();
        assertEquals("Sample Headline", actual);
    }

    @Test
    void testGetSubhead() {
        HeroComponentModelImpl heroComponent = ctx.resourceResolver().getResource("/content/heroComponent").adaptTo(HeroComponentModelImpl.class);
        String actual = heroComponent.getSubhead();
        assertEquals("Sample Subhead", actual);
    }

    @Test
    void testGetLogoImagePath() {
        HeroComponentModelImpl heroComponent = ctx.resourceResolver().getResource("/content/heroComponent").adaptTo(HeroComponentModelImpl.class);
        String actual = heroComponent.getLogoImagePath();
        assertEquals("/content/dam/logo.png", actual);
    }

    @Test
    void testGetBackgroundImagePath() {
        HeroComponentModelImpl heroComponent = ctx.resourceResolver().getResource("/content/heroComponent").adaptTo(HeroComponentModelImpl.class);
        String actual = heroComponent.getBackgroundImagePath();
        assertEquals("/content/dam/background.png", actual);
    }

    @Test
    void testGetPrimaryCtaLink() {
        HeroComponentModelImpl heroComponent = ctx.resourceResolver().getResource("/content/heroComponent").adaptTo(HeroComponentModelImpl.class);
        String actual = heroComponent.getPrimaryCtaLink();
        assertEquals("/content/page1", actual);
    }

    @Test
    void testGetPrimaryCtaAriaLabel() {
        HeroComponentModelImpl heroComponent = ctx.resourceResolver().getResource("/content/heroComponent").adaptTo(HeroComponentModelImpl.class);
        String actual = heroComponent.getPrimaryCtaAriaLabel();
        assertEquals("Primary CTA", actual);
    }

    @Test
    void testIsPrimaryCtaOpenInNewWindow() {
        HeroComponentModelImpl heroComponent = ctx.resourceResolver().getResource("/content/heroComponent").adaptTo(HeroComponentModelImpl.class);
        assertTrue(heroComponent.isPrimaryCtaOpenInNewWindow());
    }

    @Test
    void testGetSecondaryCtaLabel() {
        HeroComponentModelImpl heroComponent = ctx.resourceResolver().getResource("/content/heroComponent").adaptTo(HeroComponentModelImpl.class);
        String actual = heroComponent.getSecondaryCtaLabel();
        assertEquals("Secondary CTA", actual);
    }

    @Test
    void testGetSecondaryCtaLink() {
        HeroComponentModelImpl heroComponent = ctx.resourceResolver().getResource("/content/heroComponent").adaptTo(HeroComponentModelImpl.class);
        String actual = heroComponent.getSecondaryCtaLink();
        assertEquals("/content/page2", actual);
    }

    @Test
    void testGetSecondaryCtaAriaLabel() {
        HeroComponentModelImpl heroComponent = ctx.resourceResolver().getResource("/content/heroComponent").adaptTo(HeroComponentModelImpl.class);
        String actual = heroComponent.getSecondaryCtaAriaLabel();
        assertEquals("Secondary CTA", actual);
    }

    @Test
    void testIsSecondaryCtaOpenInNewWindow() {
        HeroComponentModelImpl heroComponent = ctx.resourceResolver().getResource("/content/heroComponent").adaptTo(HeroComponentModelImpl.class);
        assertFalse(heroComponent.isSecondaryCtaOpenInNewWindow());
    }
}

// Token Usage: {'total_tokens': 8683, 'completion_tokens': 1442, 'prompt_tokens': 7241}
// Timestamp: 2025-04-10T09:14:29
// Model Used: gpt-4o-2

//  AEM CODE ASSIST V18: AI Generated Code End -
