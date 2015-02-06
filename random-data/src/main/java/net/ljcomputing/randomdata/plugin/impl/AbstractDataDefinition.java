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

package net.ljcomputing.randomdata.plugin.impl;

import javax.annotation.PostConstruct;

import net.ljcomputing.randomdata.data.DataSource;
import net.ljcomputing.randomdata.plugin.DataDefinition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Abstract implementation of a data definition.
 * 
 * @author James G. Willmore
 * 
 */
public abstract class AbstractDataDefinition<T extends DataSource> implements
        DataDefinition<T> {

    /** The logger. */
    private static Logger logger = LoggerFactory
            .getLogger(AbstractDataDefinition.class);
    
    @Autowired
    private T dataSource;

    /**
     * @see net.ljcomputing.randomdata.plugin.DataDefinition#init()
     */
    @PostConstruct
    public void init() {
        logger.debug("====================INIT DATA DEFINITION====================");
        dataSource.init();
    }

    /**
     * @see net.ljcomputing.randomdata.plugin.DataDefinition#data()
     */
    public Object[] data() {
        return dataSource.getData();
    }

    /**
     * @see net.ljcomputing.randomdata.plugin.DataDefinition#totalRecords()
     */
    public int totalRecords() {
        return data().length;
    }
}
