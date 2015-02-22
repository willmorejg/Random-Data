/**
           Copyright 2015, James G. Willmore

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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.ljcomputing.randomdata.data.RandomNumberDataSource;

/**
 * Numeric data source.
 * 
 * @author James G. Willmore
 *
 */
public abstract class AbstractRandomNumberDataSourceImpl extends
	AbstractDataSourceImpl implements RandomNumberDataSource {

    @SuppressWarnings("unused")
    private static Logger logger = LoggerFactory.getLogger(AbstractRandomNumberDataSourceImpl.class);
    
    /**
     * @see net.ljcomputing.randomdata.data.DataSource#populate()
     */
    public void populate() {
	int size = upperRange() - lowerRange();
	data = new Integer[size];
	
	for(int i = 0; i < size; i++) {
	    data[i] = upperRange() - i;
	    //logger.debug("i = {}, data[i] = {}", i, data[i]);
	}
    }

}
