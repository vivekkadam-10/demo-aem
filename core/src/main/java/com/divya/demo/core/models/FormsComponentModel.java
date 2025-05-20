package com.divya.demo.core.models;

import org.osgi.annotation.versioning.ConsumerType;
import java.util.List;

/**
 * Interface for the Forms Component Sling Model.
 */
@ConsumerType
public interface FormsComponentModel {

    /**
     * Retrieves the type of form.
     * @return the form type.
     */
    String getFormType();

    /**
     * Checks if auto-fill is enabled.
     * @return true if auto-fill is enabled, false otherwise.
     */
    boolean isAutoFill();

    /**
     * Retrieves the list of form fields.
     * @return list of form fields.
     */
    List<FormFieldModel> getFormFields();

    /**
     * Retrieves the label for the submit button.
     * @return the submit button label.
     */
    String getSubmitButtonLabel();

    /**
     * Retrieves the error message.
     * @return the error message.
     */
    String getErrorMessage();

    /**
     * Retrieves the success message.
     * @return the success message.
     */
    String getSuccessMessage();

    /**
     * Checks if data encryption is enabled.
     * @return true if data encryption is enabled, false otherwise.
     */
    boolean isDataEncryption();

    /**
     * Checks if CAPTCHA is enabled.
     * @return true if CAPTCHA is enabled, false otherwise.
     */
    boolean isCaptcha();

    /**
     * Checks if form analytics is enabled.
     * @return true if form analytics is enabled, false otherwise.
     */
    boolean isFormAnalytics();

    /**
     * Checks if A/B testing is enabled.
     * @return true if A/B testing is enabled, false otherwise.
     */
    boolean isAbTesting();

    /**
     * Nested interface for Form Field Model.
     */
    @ConsumerType
    interface FormFieldModel {

        /**
         * Retrieves the field name.
         * @return the field name.
         */
        String getFieldName();

        /**
         * Retrieves the field type.
         * @return the field type.
         */
        String getFieldType();
    }
}
