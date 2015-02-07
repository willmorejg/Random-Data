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

import net.ljcomputing.randomdata.plugin.PersonFirstNameGenerator;
import net.ljcomputing.randomdata.plugin.PersonLastNameGenerator;
import net.ljcomputing.randomdata.plugin.PersonPlugin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Random data person plugin.
 * 
 * @author James G. Willmore
 * 
 */
@Component
public class PersonPluginImpl implements PersonPlugin {
    @Autowired
    private PersonFirstNameGenerator firstNameGenerator;

    @Autowired
    private PersonLastNameGenerator lastNameGenerator;

    /**
     * @see net.ljcomputing.randomdata.plugin.PersonPlugin#firstName()
     */
    public String firstName() {
        return (String)firstNameGenerator.firstName();
    }

    /**
     * @see net.ljcomputing.randomdata.plugin.PersonPlugin#lastName()
     */
    public String lastName() {
        return (String)lastNameGenerator.lastName();
    }
}
