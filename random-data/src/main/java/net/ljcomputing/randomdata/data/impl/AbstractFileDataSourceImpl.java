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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import net.ljcomputing.randomdata.data.FileDataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * File data source.
 * 
 * @author James G. Willmore
 * 
 */
public abstract class AbstractFileDataSourceImpl extends AbstractDataSourceImpl
        implements FileDataSource {

    /** The logger. */
    private static Logger logger = LoggerFactory
            .getLogger(AbstractFileDataSourceImpl.class);

    /**
     * @see net.ljcomputing.randomdata.data.impl.AbstractDataSourceImpl#populate()
     */
    public void populate() {
        Resource resource = new ClassPathResource(dataSourceFilename());
        File dataSource = null;
        BufferedReader reader = null;

        try {
            logger.debug("Loading data from file " + resource.getFilename());
            dataSource = resource.getFile();
            reader = new BufferedReader(new FileReader(dataSource));
            List<String> lines = new ArrayList<String>();

            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            data = lines.toArray(new String[0]);
            logger.debug("Loaded data from file " + resource.getFilename());
        } catch (Exception e) {
            logger.error(
                    "FAILED to find the total number of records available for "
                            + dataSource.getName() + ": ", e);
            throw new RuntimeException(
                    "FAILED to find the total number of records available for "
                            + dataSource.getName());
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                // noop
            }
        }
    }

}
