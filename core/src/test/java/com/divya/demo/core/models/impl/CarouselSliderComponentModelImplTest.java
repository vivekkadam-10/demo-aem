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
import com.divya.demo.core.models.CarouselSliderModel;
import com.divya.demo.core.models.CarouselSliderModel.SlideModel;
import com.divya.demo.core.models.CarouselSliderModel.InteractiveLinkModel;

@ExtendWith({AemContextExtension.class})
class CarouselSliderComponentModelImplTest {

    private final AemContext ctx = new AemContext();

    private static final String JSON_CONTENT = "{ \"carousel\": { \"jcr:primaryType\": \"nt:unstructured\", \"sling:resourceType\": \"demo/components/carousel\", \"carouselType\": \"basic\", \"numberOfSlides\": 3, \"autoplay\": true, \"transitionType\": \"fade\", \"ariaLabels\": false, \"trackInteractions\": true, \"slides\": { \"item0\": { \"type\": \"image\", \"imagePath\": \"/content/dam/image1.jpg\", \"altText\": \"Image 1\", \"interactiveLinks\": { \"item0\": { \"linkLabel\": \"Link 1\", \"linkDetails\": \"Details 1\", \"linkStyle\": \"default\" } } }, \"item1\": { \"type\": \"video\", \"videoSource\": \"/content/video1.mp4\", \"videoURL\": \"http://example.com/video1\", \"interactiveLinks\": { \"item0\": { \"linkLabel\": \"Link 2\", \"linkDetails\": \"Details 2\", \"linkStyle\": \"primary\" } } }, \"item2\": { \"type\": \"text\", \"textOverlay\": \"Sample Text\", \"interactiveLinks\": { \"item0\": { \"linkLabel\": \"Link 3\", \"linkDetails\": \"Details 3\", \"linkStyle\": \"secondary\" } } } } } }";

    @BeforeEach
    void setUp() {
        ctx.addModelsForClasses(CarouselSliderComponentModelImpl.class, CarouselSliderComponentModelImpl.SlideModelImpl.class, CarouselSliderComponentModelImpl.InteractiveLinkModelImpl.class);
        InputStream jsonStream = new ByteArrayInputStream(JSON_CONTENT.getBytes(StandardCharsets.UTF_8));
        ctx.load().json(jsonStream, "/content");
    }

    @Test
    public void testGetCarouselType() {
        CarouselSliderModel carousel = ctx.resourceResolver().getResource("/content/carousel").adaptTo(CarouselSliderModel.class);
        String actual = carousel.getCarouselType();
        assertEquals("basic", actual);
    }

    @Test
    public void testGetNumberOfSlides() {
        CarouselSliderModel carousel = ctx.resourceResolver().getResource("/content/carousel").adaptTo(CarouselSliderModel.class);
        int actual = carousel.getNumberOfSlides();
        assertEquals(3, actual);
    }

    @Test
    public void testGetSlides() {
        CarouselSliderModel carousel = ctx.resourceResolver().getResource("/content/carousel").adaptTo(CarouselSliderModel.class);
        List<SlideModel> slides = carousel.getSlides();
        assertEquals(3, slides.size());
        assertEquals("image", slides.get(0).getType());
        assertEquals("/content/dam/image1.jpg", slides.get(0).getImagePath());
        assertEquals("Image 1", slides.get(0).getAltText());
        assertEquals("video", slides.get(1).getType());
        assertEquals("/content/video1.mp4", slides.get(1).getVideoSource());
        assertEquals("http://example.com/video1", slides.get(1).getVideoURL());
        assertEquals("text", slides.get(2).getType());
        assertEquals("Sample Text", slides.get(2).getTextOverlay());
    }

    @Test
    public void testIsAutoplay() {
        CarouselSliderModel carousel = ctx.resourceResolver().getResource("/content/carousel").adaptTo(CarouselSliderModel.class);
        assertTrue(carousel.isAutoplay());
    }

    @Test
    public void testGetTransitionType() {
        CarouselSliderModel carousel = ctx.resourceResolver().getResource("/content/carousel").adaptTo(CarouselSliderModel.class);
        String actual = carousel.getTransitionType();
        assertEquals("fade", actual);
    }

    @Test
    public void testIsAriaLabels() {
        CarouselSliderModel carousel = ctx.resourceResolver().getResource("/content/carousel").adaptTo(CarouselSliderModel.class);
        assertFalse(carousel.isAriaLabels());
    }

    @Test
    public void testIsTrackInteractions() {
        CarouselSliderModel carousel = ctx.resourceResolver().getResource("/content/carousel").adaptTo(CarouselSliderModel.class);
        assertTrue(carousel.isTrackInteractions());
    }
}