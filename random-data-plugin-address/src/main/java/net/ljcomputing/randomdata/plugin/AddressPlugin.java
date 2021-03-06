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
 * Random data address plugin interface.
 * 
 * @author James G. Willmore
 *
 */
public interface AddressPlugin {
    
    /**
     * Address value (street).
     *
     * @return the string
     */
    public String address1();
    
    /**
     * Address value (P.O. Box).
     *
     * @return the string
     */
    public String address2();
    
    /**
     * City value.
     *
     * @return the string
     */
    public String city();
    
    /**
     * State value.
     *
     * @return the string
     */
    public String state();
    
    /**
     * Zip code value.
     *
     * @return the string
     */
    public String zipCode();
}
