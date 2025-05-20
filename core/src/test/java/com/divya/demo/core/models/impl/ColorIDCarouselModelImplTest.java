//  AEM CODE ASSIST V16: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.ColorIDCarouselItemModel;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(AemContextExtension.class)
class ColorIDCarouselModelImplTest {

    private final AemContext ctx = new AemContext();

    private static final String JSON_CONTENT = "{ \"myMultifield\": { \"item0\": { \"image\": \"/content/dam/image1.jpg\", \"colorID\": \"ColorID1\", \"colorHexcode\": \"#FFFFFF\", \"colorName\": \"White\", \"colorNumber\": \"001\", \"colorURL\": \"/content/color1\", \"openInNewWindow\": true }, \"item1\": { \"image\": \"/content/dam/image2.jpg\", \"colorID\": \"ColorID2\", \"colorHexcode\": \"#000000\", \"colorName\": \"Black\", \"colorNumber\": \"002\", \"colorURL\": \"/content/color2\", \"openInNewWindow\": false } } }";

    @BeforeEach
    void setUp() {
        ctx.addModelsForClasses(ColorIDCarouselModelImpl.class, ColorIDCarouselItemModelImpl.class);
        InputStream jsonStream = new ByteArrayInputStream(JSON_CONTENT.getBytes(StandardCharsets.UTF_8));
        ctx.load().json(jsonStream, "/content");
    }

    //@Test
    void testGetMyMultifield() {
        ColorIDCarouselModelImpl carousel = ctx.resourceResolver().getResource("/content/myMultifield").adaptTo(ColorIDCarouselModelImpl.class);
        List<ColorIDCarouselItemModel> items = carousel.getMyMultifield();
        assertNotNull(items);
        assertEquals(2, items.size());

        ColorIDCarouselItemModel firstItem = items.get(0);
        assertEquals("/content/dam/image1.jpg", firstItem.getImagePath());
        assertEquals("ColorID1", firstItem.getColorID());
        assertEquals("#FFFFFF", firstItem.getColorHexcode());
        assertEquals("White", firstItem.getColorName());
        assertEquals("001", firstItem.getColorNumber());
        assertEquals("/content/color1", firstItem.getColorURL());
        assertTrue(firstItem.isOpenInNewWindow());

        ColorIDCarouselItemModel secondItem = items.get(1);
        assertEquals("/content/dam/image2.jpg", secondItem.getImagePath());
        assertEquals("ColorID2", secondItem.getColorID());
        assertEquals("#000000", secondItem.getColorHexcode());
        assertEquals("Black", secondItem.getColorName());
        assertEquals("002", secondItem.getColorNumber());
        assertEquals("/content/color2", secondItem.getColorURL());
        assertFalse(secondItem.isOpenInNewWindow());
    }
}

// Token Usage: {'total_tokens': 6742, 'completion_tokens': 847, 'prompt_tokens': 5895}
// Timestamp: 2025-02-17T13:13:02
// Model Used: gpt-4o-2

//  AEM CODE ASSIST V16: AI Generated Code End -
