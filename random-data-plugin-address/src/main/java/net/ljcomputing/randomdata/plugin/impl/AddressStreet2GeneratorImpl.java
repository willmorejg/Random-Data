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

import net.ljcomputing.randomdata.plugin.AddressStreet2Generator;
import net.ljcomputing.randomdata.plugin.AddressStreetSuffixGenerator;
import net.ljcomputing.randomdata.plugin.DataDefinition;
import net.ljcomputing.randomdata.plugin.FourDigitGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Address street1 data generator.
 * 
 * @author James G. Willmore
 * 
 */
@Component
public class AddressStreet2GeneratorImpl implements AddressStreet2Generator,
	DataDefinition<FourDigitDataSourceImpl> {
    @Autowired
    private FourDigitGenerator poBoxGenerator;

    @Autowired
    private AddressStreetSuffixGenerator suffixGenerator;

    /**
     * Street1.
     * 
     * @return the string
     */
    public String street2() {
	return "P.O. Box " + generateValue().toString();
    }

    @Override
    public FourDigitDataDefinitionImpl getDataDefinition() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Object generateValue() {
	return poBoxGenerator.generateValue();
    }

    @Override
    public FourDigitDataSourceImpl dataSource() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void init() {
	// TODO Auto-generated method stub

    }

    @Override
    public Object[] data() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public int totalRecords() {
	// TODO Auto-generated method stub
	return 0;
    }
}
