package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.HeaderComponentModel;
import com.google.common.collect.ImmutableList;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({AemContextExtension.class})
class HeaderComponentModelImplTest {

    private final AemContext ctx = new AemContext();

    private static final String JSON_CONTENT = "{ \"navigation\": { \"jcr:primaryType\": \"nt:unstructured\", \"sling:resourceType\": \"demo/components/header\", \"navigationRoot\": \"/content/demo\", \"structureStart\": 1, \"collectAllPages\": true, \"structureDepth\": 2, \"disableShadowing\": false, \"id\": \"header1\", \"accessibilityLabel\": \"Main Navigation\", \"navigationPages\": { \"item0\": { \"path\": \"/content/demo/home\", \"title\": \"Home\" }, \"item1\": { \"path\": \"/content/demo/about\", \"title\": \"About\" } } } }";

    @BeforeEach
    void setUp() {
        ctx.addModelsForClasses(HeaderComponentModelImpl.class, HeaderComponentModelImpl.NavigationPage.class);
        InputStream jsonStream = new ByteArrayInputStream(JSON_CONTENT.getBytes(StandardCharsets.UTF_8));
        ctx.load().json(jsonStream, "/content");
    }

    @Test
    public void testGetNavigationRoot() {
        HeaderComponentModel header = ctx.resourceResolver().getResource("/content/navigation").adaptTo(HeaderComponentModel.class);
        String actual = header.getNavigationRoot();
        assertEquals("/content/demo", actual);
    }

    @Test
    public void testGetStructureStart() {
        HeaderComponentModel header = ctx.resourceResolver().getResource("/content/navigation").adaptTo(HeaderComponentModel.class);
        int actual = header.getStructureStart();
        assertEquals(1, actual);
    }

    @Test
    public void testIsCollectAllPages() {
        HeaderComponentModel header = ctx.resourceResolver().getResource("/content/navigation").adaptTo(HeaderComponentModel.class);
        assertTrue(header.isCollectAllPages());
    }

    @Test
    public void testGetStructureDepth() {
        HeaderComponentModel header = ctx.resourceResolver().getResource("/content/navigation").adaptTo(HeaderComponentModel.class);
        int actual = header.getStructureDepth();
        assertEquals(2, actual);
    }

    @Test
    public void testIsDisableShadowing() {
        HeaderComponentModel header = ctx.resourceResolver().getResource("/content/navigation").adaptTo(HeaderComponentModel.class);
        assertFalse(header.isDisableShadowing());
    }

    @Test
    public void testGetId() {
        HeaderComponentModel header = ctx.resourceResolver().getResource("/content/navigation").adaptTo(HeaderComponentModel.class);
        String actual = header.getId();
        assertEquals("header1", actual);
    }

    @Test
    public void testGetAccessibilityLabel() {
        HeaderComponentModel header = ctx.resourceResolver().getResource("/content/navigation").adaptTo(HeaderComponentModel.class);
        String actual = header.getAccessibilityLabel();
        assertEquals("Main Navigation", actual);
    }

    @Test
    public void testGetNavigationPages() {
        HeaderComponentModel header = ctx.resourceResolver().getResource("/content/navigation").adaptTo(HeaderComponentModel.class);
        List<HeaderComponentModel.NavigationPageModel> actual = header.getNavigationPages();
        assertEquals(ImmutableList.of("/content/demo/home", "/content/demo/about"), actual.stream().map(HeaderComponentModel.NavigationPageModel::getPath).collect(Collectors.toList()));
        assertEquals(ImmutableList.of("Home", "About"), actual.stream().map(HeaderComponentModel.NavigationPageModel::getTitle).collect(Collectors.toList()));
    }
}
