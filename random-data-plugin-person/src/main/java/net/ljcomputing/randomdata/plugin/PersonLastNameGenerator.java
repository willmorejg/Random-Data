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

import net.ljcomputing.randomdata.generator.Generator;
import net.ljcomputing.randomdata.plugin.impl.PersonLastNameDataDefinitionImpl;

/**
 * Interface for a person last name generator.
 * 
 * @author James G. Willmore
 * 
 */
public interface PersonLastNameGenerator extends
        Generator<PersonLastNameDataDefinitionImpl> {
    /**
     * Generate a person's last name.
     * 
     * @return the string
     */
    public String lastName();
}
