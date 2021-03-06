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

import net.ljcomputing.randomdata.plugin.AddressCityGenerator;
import net.ljcomputing.randomdata.plugin.AddressPlugin;
import net.ljcomputing.randomdata.plugin.AddressStateGenerator;
import net.ljcomputing.randomdata.plugin.AddressStreet1Generator;
import net.ljcomputing.randomdata.plugin.AddressStreet2Generator;
import net.ljcomputing.randomdata.plugin.FiveDigitGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Random data address plugin.
 * 
 * @author James G. Willmore
 * 
 */
@Component
public class AddressPluginImpl implements AddressPlugin {
    @Autowired
    private AddressStreet1Generator street1Generator;

    @Autowired
    private AddressStreet2Generator street2Generator;

    @Autowired
    private AddressCityGenerator cityGenerator;

    @Autowired
    private AddressStateGenerator stateGenerator;

    @Autowired
    private FiveDigitGenerator zipCodeGenerator;

    /**
     * @see net.ljcomputing.randomdata.plugin.AddressPlugin#address1()
     */
    public String address1() {
	return (String) street1Generator.street1();
    }

    /**
     * @see net.ljcomputing.randomdata.plugin.AddressPlugin#address2()
     */
    public String address2() {
	return (String) street2Generator.street2();
    }

    /**
     * @see net.ljcomputing.randomdata.plugin.AddressPlugin#city()
     */
    public String city() {
	return (String) cityGenerator.city();
    }

    /**
     * @see net.ljcomputing.randomdata.plugin.AddressPlugin#state()
     */
    public String state() {
	return (String) stateGenerator.state();
    }

    /**
     * @see net.ljcomputing.randomdata.plugin.AddressPlugin#zipCode()
     */
    public String zipCode() {
	return zipCodeGenerator.zipCode();
    }
}
