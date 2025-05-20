package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.FormsComponentModel;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Model(adaptables = Resource.class, adapters = FormsComponentModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FormsComponentModelImpl implements FormsComponentModel {

    @ValueMapValue
    @Default(values = "contact")
    private String formType;

    @ValueMapValue
    @Default(booleanValues = false)
    private boolean autoFill;

    @ChildResource(name = "formFields", injectionStrategy = InjectionStrategy.OPTIONAL)
    private Resource formFieldsResource;

    private List<FormFieldModelImpl> formFields;

    @ValueMapValue
    @Default(values = "Submit")
    private String submitButtonLabel;

    @ValueMapValue
    @Default(values = "An error occurred.")
    private String errorMessage;

    @ValueMapValue
    @Default(values = "Form submitted successfully.")
    private String successMessage;

    @ValueMapValue
    @Default(booleanValues = false)
    private boolean dataEncryption;

    @ValueMapValue
    @Default(booleanValues = false)
    private boolean captcha;

    @ValueMapValue
    @Default(booleanValues = false)
    private boolean formAnalytics;

    @ValueMapValue
    @Default(booleanValues = false)
    private boolean abTesting;

    @PostConstruct
    protected void init() {
        formFields = new ArrayList<>();
        if (formFieldsResource != null) {
            for (Resource childResource : formFieldsResource.getChildren()) {
                FormFieldModelImpl field = childResource.adaptTo(FormFieldModelImpl.class);
                if (field != null) {
                    formFields.add(field);
                }
            }
        }
    }

    @Override
    public String getFormType() {
        return formType;
    }

    @Override
    public boolean isAutoFill() {
        return autoFill;
    }

    @Override
    public List<FormFieldModel> getFormFields() {
        return new ArrayList<>(formFields);
    }

    @Override
    public String getSubmitButtonLabel() {
        return submitButtonLabel;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String getSuccessMessage() {
        return successMessage;
    }

    @Override
    public boolean isDataEncryption() {
        return dataEncryption;
    }

    @Override
    public boolean isCaptcha() {
        return captcha;
    }

    @Override
    public boolean isFormAnalytics() {
        return formAnalytics;
    }

    @Override
    public boolean isAbTesting() {
        return abTesting;
    }

    @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public static class FormFieldModelImpl implements FormFieldModel {

        @ValueMapValue
        private String fieldName;

        @ValueMapValue
        private String fieldType;

        @Override
        public String getFieldName() {
            return fieldName;
        }

        @Override
        public String getFieldType() {
            return fieldType;
        }
    }
}
