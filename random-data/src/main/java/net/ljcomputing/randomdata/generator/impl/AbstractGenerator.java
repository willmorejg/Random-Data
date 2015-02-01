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

package net.ljcomputing.randomdata.generator.impl;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.ljcomputing.randomdata.generator.Generator;
import net.ljcomputing.randomdata.plugin.DataDefinition;

/**
 * Abstract implementation of a data generator.
 * 
 * @author James G. Willmore
 * 
 */
@Component
public abstract class AbstractGenerator<T extends DataDefinition<?>>
        implements Generator<T> {
    private static Logger logger = LoggerFactory.getLogger(AbstractGenerator.class);
    
    /** The random number generator. */
    private Random random = new Random();
    
    /** The data definition. */
    @Autowired
    private T dataDefinition;
    
    /**
     * @see net.ljcomputing.randomdata.generator.Generator#getDataDefinition()
     */
    public T getDataDefinition() {
        return dataDefinition;
    }
    
    /**
     * @see net.ljcomputing.randomdata.generator.Generator#generateValue()
     */
    public String generateValue() {
        logger.debug("total records: " + getDataDefinition().totalRecords());
        int line = generateRandomNumber(getDataDefinition().totalRecords());
        logger.debug("line: " + line);
        return getDataDefinition().data()[line];
    }

    /**
     * Generate random number.
     *
     * @param maximumLines the maximum lines in the data definition file
     * @return a random line number to read
     */
    protected int generateRandomNumber(int maximumLines) {
        return random.nextInt(maximumLines -1);
    }
}
