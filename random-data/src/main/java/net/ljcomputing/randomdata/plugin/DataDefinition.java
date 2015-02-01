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

package net.ljcomputing.randomdata.plugin;

/**
 * Define the data for use by the plugin.
 * 
 * @author James G. Willmore
 * 
 */
public interface DataDefinition<T> {

    /**
     * Gets the data source.
     * 
     * @return the data source
     */
    public T dataSource();

    /**
     * Initializes the data definition.
     */
    public void init();

    /**
     *  The data in the data definition file.
     *
     * @return the string[]
     */
    public String[] data();

    /**
     * Total records found in the data definition file.
     * 
     * @return the total number of records (line) in the data definition file
     */
    public int totalRecords();
}
