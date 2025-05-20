package com.divya.demo.core.service;

import com.day.cq.wcm.api.Page;
import com.divya.demo.core.models.PageDetails;
import org.apache.sling.api.resource.LoginException;

import javax.jcr.RepositoryException;
import java.util.List;

public interface PageService {
    List<PageDetails> getPageDetails(String pagePath) throws LoginException, RepositoryException;
}
