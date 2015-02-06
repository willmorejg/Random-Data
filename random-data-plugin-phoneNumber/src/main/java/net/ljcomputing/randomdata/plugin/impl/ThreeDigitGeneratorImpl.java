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


package net.ljcomputing.randomdata.plugin.impl;

import net.ljcomputing.randomdata.generator.impl.AbstractGenerator;
import net.ljcomputing.randomdata.plugin.ThreeDigitGenerator;

import org.springframework.stereotype.Component;

/**
 * A phone number area code generator.
 * 
 * @author James G. Willmore
 *
 */
@Component
public class ThreeDigitGeneratorImpl extends AbstractGenerator<ThreeDigitDataDefinitionImpl> implements ThreeDigitGenerator {
    
    /**
     * @see net.ljcomputing.randomdata.plugin.ThreeDigitGenerator#areaCode()
     */
    public Integer areaCode() {
	return (Integer)generateValue();
    }

    /**
     * @see net.ljcomputing.randomdata.plugin.ThreeDigitGenerator#prefix()
     */
    public Integer prefix() {
	return (Integer)generateValue();
    }
}
