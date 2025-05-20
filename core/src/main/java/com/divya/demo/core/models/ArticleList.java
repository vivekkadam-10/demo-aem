package com.divya.demo.core.models;

import com.adobe.cq.dam.cfm.ContentFragment;
import com.adobe.cq.wcm.core.components.models.List;
import org.osgi.annotation.versioning.ConsumerType;

@ConsumerType
public interface ArticleList extends List {

    java.util.List<ContentFragment> getArticleListItems();

}