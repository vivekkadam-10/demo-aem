package com.divya.demo.core.models.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import com.divya.demo.core.models.FormsComponentModel;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

@ExtendWith({AemContextExtension.class})
class FormsComponentModelImplTest {

    private final AemContext ctx = new AemContext();

    private static final String JSON_CONTENT = "{ \"formsComponent\": { \"jcr:primaryType\": \"nt:unstructured\", \"sling:resourceType\": \"demo/components/forms\", \"formType\": \"contact\", \"autoFill\": true, \"formFields\": { \"item0\": { \"fieldName\": \"name\", \"fieldType\": \"text\" }, \"item1\": { \"fieldName\": \"email\", \"fieldType\": \"email\" } }, \"submitButtonLabel\": \"Submit\", \"errorMessage\": \"An error occurred.\", \"successMessage\": \"Form submitted successfully.\", \"dataEncryption\": true, \"captcha\": true, \"formAnalytics\": true, \"abTesting\": true } }";

    @BeforeEach
    void setUp() {
        ctx.addModelsForClasses(FormsComponentModelImpl.class, FormsComponentModelImpl.FormFieldModelImpl.class);
        InputStream jsonStream = new ByteArrayInputStream(JSON_CONTENT.getBytes(StandardCharsets.UTF_8));
        ctx.load().json(jsonStream, "/content");
    }

    @Test
    public void testGetFormType() {
        FormsComponentModelImpl formsComponent = ctx.resourceResolver().getResource("/content/formsComponent").adaptTo(FormsComponentModelImpl.class);
        String actual = formsComponent.getFormType();
        assertEquals("contact", actual);
    }

    @Test
    public void testIsAutoFill() {
        FormsComponentModelImpl formsComponent = ctx.resourceResolver().getResource("/content/formsComponent").adaptTo(FormsComponentModelImpl.class);
        assertTrue(formsComponent.isAutoFill());
    }

    @Test
    public void testGetFormFields() {
        FormsComponentModelImpl formsComponent = ctx.resourceResolver().getResource("/content/formsComponent").adaptTo(FormsComponentModelImpl.class);
        List<FormsComponentModel.FormFieldModel> formFields = formsComponent.getFormFields();
        assertEquals(2, formFields.size());
        assertEquals("name", formFields.get(0).getFieldName());
        assertEquals("text", formFields.get(0).getFieldType());
        assertEquals("email", formFields.get(1).getFieldName());
        assertEquals("email", formFields.get(1).getFieldType());
    }

    @Test
    public void testGetSubmitButtonLabel() {
        FormsComponentModelImpl formsComponent = ctx.resourceResolver().getResource("/content/formsComponent").adaptTo(FormsComponentModelImpl.class);
        String actual = formsComponent.getSubmitButtonLabel();
        assertEquals("Submit", actual);
    }

    @Test
    public void testGetErrorMessage() {
        FormsComponentModelImpl formsComponent = ctx.resourceResolver().getResource("/content/formsComponent").adaptTo(FormsComponentModelImpl.class);
        String actual = formsComponent.getErrorMessage();
        assertEquals("An error occurred.", actual);
    }

    @Test
    public void testGetSuccessMessage() {
        FormsComponentModelImpl formsComponent = ctx.resourceResolver().getResource("/content/formsComponent").adaptTo(FormsComponentModelImpl.class);
        String actual = formsComponent.getSuccessMessage();
        assertEquals("Form submitted successfully.", actual);
    }

    @Test
    public void testIsDataEncryption() {
        FormsComponentModelImpl formsComponent = ctx.resourceResolver().getResource("/content/formsComponent").adaptTo(FormsComponentModelImpl.class);
        assertTrue(formsComponent.isDataEncryption());
    }

    @Test
    public void testIsCaptcha() {
        FormsComponentModelImpl formsComponent = ctx.resourceResolver().getResource("/content/formsComponent").adaptTo(FormsComponentModelImpl.class);
        assertTrue(formsComponent.isCaptcha());
    }

    @Test
    public void testIsFormAnalytics() {
        FormsComponentModelImpl formsComponent = ctx.resourceResolver().getResource("/content/formsComponent").adaptTo(FormsComponentModelImpl.class);
        assertTrue(formsComponent.isFormAnalytics());
    }

    @Test
    public void testIsAbTesting() {
        FormsComponentModelImpl formsComponent = ctx.resourceResolver().getResource("/content/formsComponent").adaptTo(FormsComponentModelImpl.class);
        assertTrue(formsComponent.isAbTesting());
    }
}
