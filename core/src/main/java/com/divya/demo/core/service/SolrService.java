package com.divya.demo.core.service;

import com.day.cq.wcm.api.Page;
import com.divya.demo.core.models.PageDetails;
import com.divya.demo.core.util.SolrSearchHelper;

import java.util.List;

public interface SolrService {

    String addDocument(List<PageDetails> pageDetails, SolrSearchHelper solrSearchHelper);

    void deleteIndex(SolrSearchHelper solrSearchHelper);
}
