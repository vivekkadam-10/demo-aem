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
import com.divya.demo.core.models.AdaptiveBreadcrumbNavigationModel;
import com.divya.demo.core.models.AdaptiveBreadcrumbNavigationModel.BreadcrumbItemModel;

@ExtendWith({AemContextExtension.class})
class AdaptiveBreadcrumbNavigationModelImplTest {

    private final AemContext ctx = new AemContext();

    private static final String JSON_CONTENT = "{ \"breadcrumb\": { \"jcr:primaryType\": \"nt:unstructured\", \"breadcrumbType\": \"Dynamic\", \"siteStructureSync\": true, \"breadcrumbTitle\": \"Home\", \"linkManagement\": false, \"breadcrumbSeparator\": \"/\", \"fontColor\": \"#000000\", \"accessibilitySettings\": true, \"breadcrumbItems\": { \"item0\": { \"textvalue\": \"Home\", \"numbervalue\": 1 }, \"item1\": { \"textvalue\": \"About\", \"numbervalue\": 2 } } } }";

    @BeforeEach
    void setUp() {
        ctx.addModelsForClasses(AdaptiveBreadcrumbNavigationModelImpl.class, AdaptiveBreadcrumbNavigationModelImpl.BreadcrumbItem.class);
        InputStream jsonStream = new ByteArrayInputStream(JSON_CONTENT.getBytes(StandardCharsets.UTF_8));
        ctx.load().json(jsonStream, "/content");
    }

    @Test
    public void testGetBreadcrumbType() {
        AdaptiveBreadcrumbNavigationModel model = ctx.resourceResolver().getResource("/content/breadcrumb").adaptTo(AdaptiveBreadcrumbNavigationModel.class);
        assertEquals("Dynamic", model.getBreadcrumbType());
    }

    @Test
    public void testIsSiteStructureSyncEnabled() {
        AdaptiveBreadcrumbNavigationModel model = ctx.resourceResolver().getResource("/content/breadcrumb").adaptTo(AdaptiveBreadcrumbNavigationModel.class);
        assertTrue(model.isSiteStructureSyncEnabled());
    }

    @Test
    public void testGetBreadcrumbTitle() {
        AdaptiveBreadcrumbNavigationModel model = ctx.resourceResolver().getResource("/content/breadcrumb").adaptTo(AdaptiveBreadcrumbNavigationModel.class);
        assertEquals("Home", model.getBreadcrumbTitle());
    }

    @Test
    public void testIsLinkManagementEnabled() {
        AdaptiveBreadcrumbNavigationModel model = ctx.resourceResolver().getResource("/content/breadcrumb").adaptTo(AdaptiveBreadcrumbNavigationModel.class);
        assertFalse(model.isLinkManagementEnabled());
    }

    @Test
    public void testGetBreadcrumbSeparator() {
        AdaptiveBreadcrumbNavigationModel model = ctx.resourceResolver().getResource("/content/breadcrumb").adaptTo(AdaptiveBreadcrumbNavigationModel.class);
        assertEquals("/", model.getBreadcrumbSeparator());
    }

    @Test
    public void testGetBreadcrumbItems() {
        AdaptiveBreadcrumbNavigationModel model = ctx.resourceResolver().getResource("/content/breadcrumb").adaptTo(AdaptiveBreadcrumbNavigationModel.class);
        List<BreadcrumbItemModel> items = model.getBreadcrumbItems();
        assertEquals(2, items.size());
        assertEquals("Home", items.get(0).getTextvalue());
        assertEquals(1, items.get(0).getNumbervalue());
        assertEquals("About", items.get(1).getTextvalue());
        assertEquals(2, items.get(1).getNumbervalue());
    }

    @Test
    public void testGetFontColor() {
        AdaptiveBreadcrumbNavigationModel model = ctx.resourceResolver().getResource("/content/breadcrumb").adaptTo(AdaptiveBreadcrumbNavigationModel.class);
        assertEquals("#000000", model.getFontColor());
    }

    @Test
    public void testIsAccessibilitySettingsEnabled() {
        AdaptiveBreadcrumbNavigationModel model = ctx.resourceResolver().getResource("/content/breadcrumb").adaptTo(AdaptiveBreadcrumbNavigationModel.class);
        assertTrue(model.isAccessibilitySettingsEnabled());
    }
}

//  AEM Code Assist V15: AI Generated Code End -