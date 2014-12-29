package org.dd4t.core.factories;

import org.dd4t.core.filters.Filter;
import org.dd4t.providers.CacheProvider;

import java.util.List;

/**
 * dd4t-2: Filters renamed to Processors
 */
public interface Factory {

    /**
     * @deprecated
     * @return list of Filters
     */
    @Deprecated
    public List<Filter> getFilters();

    /**
     * @deprecated
     * @param filters list of Filters
     */
    @Deprecated
    public void setFilters(List<Filter> filters);



    public void setCacheProvider(CacheProvider cacheAgent);
}
