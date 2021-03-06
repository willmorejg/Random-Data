/**
           Copyright 2014, James G. Willmore

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package net.ljcomputing.randomdata.data.impl;

import javax.annotation.PostConstruct;

import net.ljcomputing.randomdata.data.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * File data source.
 * 
 * @author James G. Willmore
 * 
 */
public abstract class AbstractDataSourceImpl implements DataSource {

    /** The logger. */
    private static Logger logger = LoggerFactory
            .getLogger(AbstractDataSourceImpl.class);

    /** The data. */
    protected Object[] data;

    /**
     * Inits the data source.
     * 
     * @see net.ljcomputing.randomdata.data.DataSource#init()
     */
    @PostConstruct
    public void init() {
        logger.debug("====================INIT DATA SOURCE====================");
        populate();
    }

    /**
     * @see net.ljcomputing.randomdata.data.DataSource#getData()
     */
    public Object[] getData() {
        //logger.debug(null != data ? "data: " + Arrays.asList(data).toString() : "NO DATA");
        return data;
    }

}
