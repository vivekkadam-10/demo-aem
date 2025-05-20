package com.divya.demo.core.service.impl;

import com.divya.demo.core.models.PageDetails;
import com.divya.demo.core.service.SolrService;
import com.divya.demo.core.util.SolrSearchHelper;
//import org.apache.solr.client.solrj.SolrClient;
/*import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrInputDocument;*/

import java.util.List;

public class SolrServiceImpl implements SolrService {
    @Override
    public String addDocument(List<PageDetails> pageDetails, SolrSearchHelper solrSearchHelper) {
        final String url = solrSearchHelper.getSolrConfigurationService().getSolrEndpointUrl();
        try{
            /*final HttpSolrClient client = new HttpSolrClient.Builder(url)
                    .withConnectionTimeout(60000)
                    .withSocketTimeout(50000)
                    .build();
            for(PageDetails page:pageDetails){
                final SolrInputDocument doc = new SolrInputDocument();
                doc.addField("pageId",page.getPagePath());
                doc.addField("pageName",page.getPageName());
                doc.addField("pageDescription",page.getPageDescription());
                final UpdateResponse updateResponse = client.add(solrSearchHelper.getSolrCAConfig().coreName(),doc);
            }
            client.commit(solrSearchHelper.getSolrCAConfig().coreName());*/
        }catch (Exception e){

        }
        return pageDetails.size()+"added";
    }

    @Override
    public void deleteIndex(SolrSearchHelper solrSearchHelper) {

    }
}
