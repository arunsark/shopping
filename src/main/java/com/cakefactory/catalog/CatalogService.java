package com.cakefactory.catalog;

import com.cakefactory.domain.Item;

public interface CatalogService {
    Iterable<Item> getItems();
}
