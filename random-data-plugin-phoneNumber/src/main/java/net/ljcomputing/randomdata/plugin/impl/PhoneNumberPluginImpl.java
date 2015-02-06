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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.ljcomputing.randomdata.plugin.FourDigitGenerator;
import net.ljcomputing.randomdata.plugin.ThreeDigitGenerator;
import net.ljcomputing.randomdata.plugin.PhoneNumberPlugin;

/**
 * @author James G. Willmore
 *
 */
@Component
public class PhoneNumberPluginImpl implements PhoneNumberPlugin {

    @Autowired
    private ThreeDigitGenerator threeDigitGenerator;

    @Autowired
    private FourDigitGenerator fourDigitGenerator;
    
    public Integer areaCode() {
	return (Integer) threeDigitGenerator.generateValue();
    }

    public Integer prefix() {
	return (Integer) threeDigitGenerator.generateValue();
    }

    public Integer number() {
	return (Integer) fourDigitGenerator.generateValue();
    }

    public Integer extension() {
	return (Integer) fourDigitGenerator.generateValue();
    }

}
