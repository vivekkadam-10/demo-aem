//  AEM CODE ASSIST V18: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.FeaturesComponentModel;
import com.divya.demo.core.models.TileModel;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation for the FeaturesComponent Sling Model.
 */
@Model(adaptables = Resource.class, adapters = FeaturesComponentModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FeaturesComponentModelImpl implements FeaturesComponentModel {

    @ChildResource(name = "tiles", injectionStrategy = InjectionStrategy.OPTIONAL)
    private Resource tilesResource;

    private List<TileModel> tiles;

    @PostConstruct
    protected void init() {
        tiles = new ArrayList<>();
        if (tilesResource != null) {
            for (Resource childResource : tilesResource.getChildren()) {
                TileModel tile = childResource.adaptTo(TileModel.class);
                if (tile != null) {
                    tiles.add(tile);
                }
            }
        }
    }

    @Override
    public List<TileModel> getTiles() {
        return new ArrayList<>(tiles);
    }
}
// Token Usage: {'total_tokens': 7824, 'completion_tokens': 450, 'prompt_tokens': 6974}
// Timestamp: 2025-04-14T13:56:50
// Model Used: gpt-4o-2

//  AEM CODE ASSIST V18: AI Generated Code End -
