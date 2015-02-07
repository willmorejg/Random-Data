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

import org.springframework.stereotype.Component;

import net.ljcomputing.randomdata.generator.Generator;
import net.ljcomputing.randomdata.plugin.impl.AddressStreetSuffixDataDefinitionImpl;

/**
 * Interface for an address state generator.
 * 
 * @author James G. Willmore
 * 
 */
@Component(value="streetSuffix")
public interface AddressStreetSuffixGenerator extends
	Generator<AddressStreetSuffixDataDefinitionImpl> {

    /**
     * Street suffix.
     *
     * @return the string
     */
    public String streetSuffix();
}