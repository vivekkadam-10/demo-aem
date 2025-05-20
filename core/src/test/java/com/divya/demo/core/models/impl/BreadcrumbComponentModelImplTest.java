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
import com.divya.demo.core.models.BreadcrumbComponentModel;
import com.divya.demo.core.models.BreadcrumbComponentModel.BreadcrumbItemModel;

@ExtendWith({AemContextExtension.class})
class BreadcrumbComponentModelImplTest {

    private final AemContext ctx = new AemContext();

    private static final String JSON_CONTENT = "{ \"breadcrumb\": { \"jcr:primaryType\": \"nt:unstructured\", \"breadcrumbType\": \"dynamic\", \"syncWithSiteStructure\": true, \"breadcrumbTitle\": \"Home\", \"manageLinks\": true, \"breadcrumbSeparator\": \"pipe\", \"breadcrumbItems\": { \"item0\": { \"textvalue\": \"Home\", \"numbervalue\": 1 }, \"item1\": { \"textvalue\": \"Products\", \"numbervalue\": 2 } }, \"fontColor\": \"#FFFFFF\", \"applyAccessibility\": true } }";

    @BeforeEach
    void setUp() {
        ctx.addModelsForClasses(BreadcrumbComponentModelImpl.class, BreadcrumbComponentModelImpl.BreadcrumbItem.class);
        InputStream jsonStream = new ByteArrayInputStream(JSON_CONTENT.getBytes(StandardCharsets.UTF_8));
        ctx.load().json(jsonStream, "/content");
    }

    @Test
    public void testGetBreadcrumbType() {
        BreadcrumbComponentModel breadcrumb = ctx.resourceResolver().getResource("/content/breadcrumb").adaptTo(BreadcrumbComponentModel.class);
        String actual = breadcrumb.getBreadcrumbType();
        assertEquals("dynamic", actual);
    }

    @Test
    public void testIsSyncWithSiteStructure() {
        BreadcrumbComponentModel breadcrumb = ctx.resourceResolver().getResource("/content/breadcrumb").adaptTo(BreadcrumbComponentModel.class);
        assertTrue(breadcrumb.isSyncWithSiteStructure());
    }

    @Test
    public void testGetBreadcrumbTitle() {
        BreadcrumbComponentModel breadcrumb = ctx.resourceResolver().getResource("/content/breadcrumb").adaptTo(BreadcrumbComponentModel.class);
        String actual = breadcrumb.getBreadcrumbTitle();
        assertEquals("Home", actual);
    }

    @Test
    public void testIsManageLinks() {
        BreadcrumbComponentModel breadcrumb = ctx.resourceResolver().getResource("/content/breadcrumb").adaptTo(BreadcrumbComponentModel.class);
        assertTrue(breadcrumb.isManageLinks());
    }

    @Test
    public void testGetBreadcrumbSeparator() {
        BreadcrumbComponentModel breadcrumb = ctx.resourceResolver().getResource("/content/breadcrumb").adaptTo(BreadcrumbComponentModel.class);
        String actual = breadcrumb.getBreadcrumbSeparator();
        assertEquals("pipe", actual);
    }

    @Test
    public void testGetBreadcrumbItems() {
        BreadcrumbComponentModel breadcrumb = ctx.resourceResolver().getResource("/content/breadcrumb").adaptTo(BreadcrumbComponentModel.class);
        List<BreadcrumbItemModel> actual = breadcrumb.getBreadcrumbItems();
        assertEquals(2, actual.size());
        assertEquals("Home", actual.get(0).getTextValue());
        assertEquals(1, actual.get(0).getNumberValue());
        assertEquals("Products", actual.get(1).getTextValue());
        assertEquals(2, actual.get(1).getNumberValue());
    }

    @Test
    public void testGetFontColor() {
        BreadcrumbComponentModel breadcrumb = ctx.resourceResolver().getResource("/content/breadcrumb").adaptTo(BreadcrumbComponentModel.class);
        String actual = breadcrumb.getFontColor();
        assertEquals("#FFFFFF", actual);
    }

    @Test
    public void testIsApplyAccessibility() {
        BreadcrumbComponentModel breadcrumb = ctx.resourceResolver().getResource("/content/breadcrumb").adaptTo(BreadcrumbComponentModel.class);
        assertTrue(breadcrumb.isApplyAccessibility());
    }
}
