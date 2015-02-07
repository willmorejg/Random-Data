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

import net.ljcomputing.randomdata.data.ArrayDataSource;
import net.ljcomputing.randomdata.data.impl.AbstractDataSourceImpl;
import net.ljcomputing.randomdata.plugin.data.StreetSuffixes;

import org.springframework.stereotype.Component;

/**
 * @author James G. Willmore
 * 
 */
@Component
public class AddressStreetSuffixDataSourceImpl extends AbstractDataSourceImpl
	implements ArrayDataSource {
    /**
     * @see net.ljcomputing.randomdata.data.impl.AbstractEnumDataSourceImpl#populate()
     */
    public void populate() {
	data = dataArray();
    }

    public Object[] dataArray() {
	StreetSuffixes suffixes = new StreetSuffixes();
	return suffixes.getSuffixes();
    }
}
