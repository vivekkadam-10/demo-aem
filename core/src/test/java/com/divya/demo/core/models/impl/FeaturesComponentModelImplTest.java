//  AEM CODE ASSIST V18: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.TileModel;
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
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith({AemContextExtension.class})
class FeaturesComponentModelImplTest {

    private final AemContext ctx = new AemContext();

    private static final String JSON_CONTENT = "{ \"featuresComponent\": { \"jcr:primaryType\": \"nt:unstructured\", \"sling:resourceType\": \"wknd/components/features\", \"tiles\": { \"item0\": { \"title\": \"Tile 1 Title\", \"description\": \"Tile 1 Description\", \"cta\": \"Tile 1 CTA\", \"backgroundImage\": \"/content/dam/image1.jpg\" }, \"item1\": { \"title\": \"Tile 2 Title\", \"description\": \"Tile 2 Description\", \"cta\": \"Tile 2 CTA\", \"backgroundImage\": \"/content/dam/image2.jpg\" } } } }";

    @BeforeEach
    void setUp() {
        ctx.addModelsForClasses(FeaturesComponentModelImpl.class, TileModelImpl.class);
        InputStream jsonStream = new ByteArrayInputStream(JSON_CONTENT.getBytes(StandardCharsets.UTF_8));
        ctx.load().json(jsonStream, "/content");
    }

    @Test
    void testGetTiles() {
        FeaturesComponentModelImpl featuresComponent = ctx.resourceResolver().getResource("/content/featuresComponent").adaptTo(FeaturesComponentModelImpl.class);
        List<TileModel> tiles = featuresComponent.getTiles();
        assertNotNull(tiles);
        assertEquals(2, tiles.size());

        TileModel tile1 = tiles.get(0);
        assertEquals("Tile 1 Title", tile1.getTitle());
        assertEquals("Tile 1 Description", tile1.getDescription());
        assertEquals("Tile 1 CTA", tile1.getCTA());
        assertEquals("/content/dam/image1.jpg", tile1.getBackgroundImagePath());

        TileModel tile2 = tiles.get(1);
        assertEquals("Tile 2 Title", tile2.getTitle());
        assertEquals("Tile 2 Description", tile2.getDescription());
        assertEquals("Tile 2 CTA", tile2.getCTA());
        assertEquals("/content/dam/image2.jpg", tile2.getBackgroundImagePath());
    }
}

// Token Usage: {'total_tokens': 5225, 'completion_tokens': 721, 'prompt_tokens': 4504}
// Timestamp: 2025-04-14T13:57:02
// Model Used: gpt-4o-2

//  AEM CODE ASSIST V18: AI Generated Code End -
