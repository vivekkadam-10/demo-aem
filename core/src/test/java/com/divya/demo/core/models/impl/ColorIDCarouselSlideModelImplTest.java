//  AEM CODE ASSIST V18: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.ColorIDCarouselSlideModel;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(AemContextExtension.class)
class ColorIDCarouselSlideModelImplTest {

    private final AemContext ctx = new AemContext();

    private static final String JSON_CONTENT = "{ \"slides\": { \"jcr:primaryType\": \"nt:unstructured\", \"item0\": { \"image\": \"/content/dam/wknd/color1.jpg\", \"colorID\": \"C001\", \"colorHexcode\": \"#FFFFFF\", \"colorName\": \"White\", \"colorNumber\": \"001\", \"colorURL\": \"/content/color/white\", \"openInNewWindow\": true } } }";

    @BeforeEach
    void setUp() {
        ctx.addModelsForClasses(ColorIDCarouselSlideModelImpl.class);
        InputStream jsonStream = new ByteArrayInputStream(JSON_CONTENT.getBytes(StandardCharsets.UTF_8));
        ctx.load().json(jsonStream, "/content");
    }

    @Test
    void testGetImagePath() {
        ColorIDCarouselSlideModel slide = ctx.resourceResolver().getResource("/content/slides/item0").adaptTo(ColorIDCarouselSlideModel.class);
        assertNotNull(slide);
        assertEquals("/content/dam/wknd/color1.jpg", slide.getImagePath());
    }

    @Test
    void testGetColorID() {
        ColorIDCarouselSlideModel slide = ctx.resourceResolver().getResource("/content/slides/item0").adaptTo(ColorIDCarouselSlideModel.class);
        assertNotNull(slide);
        assertEquals("C001", slide.getColorID());
    }

    @Test
    void testGetColorHexcode() {
        ColorIDCarouselSlideModel slide = ctx.resourceResolver().getResource("/content/slides/item0").adaptTo(ColorIDCarouselSlideModel.class);
        assertNotNull(slide);
        assertEquals("#FFFFFF", slide.getColorHexcode());
    }

    @Test
    void testGetColorName() {
        ColorIDCarouselSlideModel slide = ctx.resourceResolver().getResource("/content/slides/item0").adaptTo(ColorIDCarouselSlideModel.class);
        assertNotNull(slide);
        assertEquals("White", slide.getColorName());
    }

    @Test
    void testGetColorNumber() {
        ColorIDCarouselSlideModel slide = ctx.resourceResolver().getResource("/content/slides/item0").adaptTo(ColorIDCarouselSlideModel.class);
        assertNotNull(slide);
        assertEquals("001", slide.getColorNumber());
    }

    @Test
    void testGetColorURL() {
        ColorIDCarouselSlideModel slide = ctx.resourceResolver().getResource("/content/slides/item0").adaptTo(ColorIDCarouselSlideModel.class);
        assertNotNull(slide);
        assertEquals("/content/color/white", slide.getColorURL());
    }

    @Test
    void testIsOpenInNewWindow() {
        ColorIDCarouselSlideModel slide = ctx.resourceResolver().getResource("/content/slides/item0").adaptTo(ColorIDCarouselSlideModel.class);
        assertNotNull(slide);
        assertTrue(slide.isOpenInNewWindow());
    }
}

// Token Usage: {'total_tokens': 6699, 'completion_tokens': 932, 'prompt_tokens': 5767}
// Timestamp: 2025-04-14T10:14:50
// Model Used: gpt-4o-2

//  AEM CODE ASSIST V18: AI Generated Code End -
