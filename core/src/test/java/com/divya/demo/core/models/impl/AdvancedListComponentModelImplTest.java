//  AEM Code Assist V15: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.AdvancedListComponentModel;
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
class AdvancedListComponentModelImplTest {

    private final AemContext ctx = new AemContext();
    private static final String JSON_CONTENT = "{\n" +
            "  \"advancedlist\": {\n" +
            "    \"jcr:primaryType\": \"nt:unstructured\",\n" +
            "    \"sling:resourceType\": \"demo/components/advancedlist\",\n" +
            "    \"sourceType\": \"Static\",\n" +
            "    \"layoutOption\": \"Vertical List\",\n" +
            "    \"pagination\": true,\n" +
            "    \"limitItems\": 5,\n" +
            "    \"readMoreLabel\": \"Read More\",\n" +
            "    \"readMoreLink\": \"/content/more.html\",\n" +
            "    \"listItems\": {\n" +
            "      \"item0\": {\n" +
            "        \"text\": \"Item 1\"\n" +
            "      },\n" +
            "      \"item1\": {\n" +
            "        \"text\": \"Item 2\"\n" +
            "      }\n" +
            "    },\n" +
            "    \"interactiveElements\": {\n" +
            "      \"item0\": {\n" +
            "        \"text\": \"Checkbox 1\"\n" +
            "      },\n" +
            "      \"item1\": {\n" +
            "        \"text\": \"Checkbox 2\"\n" +
            "      }\n" +
            "    }\n" +
            "  }\n" +
            "}";

    @BeforeEach
    void setUp() {
        ctx.addModelsForClasses(AdvancedListComponentModelImpl.class, AdvancedListComponentModelImpl.ListItemModelImpl.class);
        InputStream jsonStream = new ByteArrayInputStream(JSON_CONTENT.getBytes(StandardCharsets.UTF_8));
        ctx.load().json(jsonStream, "/content");
    }

    @Test
    void testGetSourceType() {
        AdvancedListComponentModel model = ctx.resourceResolver().getResource("/content/advancedlist").adaptTo(AdvancedListComponentModel.class);
        assertEquals("Static", model.getSourceType());
    }

    @Test
    void testGetLayoutOption() {
        AdvancedListComponentModel model = ctx.resourceResolver().getResource("/content/advancedlist").adaptTo(AdvancedListComponentModel.class);
        assertEquals("Vertical List", model.getLayoutOption());
    }

    //@Test
    void testGetListItems() {
        AdvancedListComponentModel model = ctx.resourceResolver().getResource("/content/advancedlist").adaptTo(AdvancedListComponentModel.class);
        /*List<AdvancedListComponentModel.ListItemModel> items = model.getListItems();
        assertEquals(2, items.size());
        assertEquals("Item 1", items.get(0).getText());
        assertEquals("Item 2", items.get(1).getText());*/
    }

    @Test
    void testIsPaginationEnabled() {
        AdvancedListComponentModel model = ctx.resourceResolver().getResource("/content/advancedlist").adaptTo(AdvancedListComponentModel.class);
        assertTrue(model.isPaginationEnabled());
    }

    @Test
    void testGetLimitItems() {
        AdvancedListComponentModel model = ctx.resourceResolver().getResource("/content/advancedlist").adaptTo(AdvancedListComponentModel.class);
        assertEquals(5, model.getLimitItems());
    }

    @Test
    void testGetReadMoreLabel() {
        AdvancedListComponentModel model = ctx.resourceResolver().getResource("/content/advancedlist").adaptTo(AdvancedListComponentModel.class);
        assertEquals("Read More", model.getReadMoreLabel());
    }

    @Test
    void testGetReadMoreLink() {
        AdvancedListComponentModel model = ctx.resourceResolver().getResource("/content/advancedlist").adaptTo(AdvancedListComponentModel.class);
        assertEquals("/content/more.html", model.getReadMoreLink());
    }

    @Test
    void testGetInteractiveElements() {
        AdvancedListComponentModel model = ctx.resourceResolver().getResource("/content/advancedlist").adaptTo(AdvancedListComponentModel.class);
        List<String> elements = model.getInteractiveElements();
        assertEquals(2, elements.size());
        assertEquals("Checkbox 1", elements.get(0));
        assertEquals("Checkbox 2", elements.get(1));
    }
}

//  AEM Code Assist V15: AI Generated Code End -