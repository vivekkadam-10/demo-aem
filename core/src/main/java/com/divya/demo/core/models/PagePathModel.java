package com.divya.demo.core.models;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * Interface for Page Path Model.
 */
@ConsumerType
public interface PagePathModel {

    /**
     * Retrieves the page path.
     * @return the page path.
     */
    String getPagePath();
}

// Token Usage: {'total_tokens': 8796, 'completion_tokens': 100, 'prompt_tokens': 8007}
// Timestamp: 2025-02-18T10:23:20
// Model Used: gpt-4o-2
