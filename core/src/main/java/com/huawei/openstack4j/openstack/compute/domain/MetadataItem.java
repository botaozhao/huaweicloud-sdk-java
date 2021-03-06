/*******************************************************************************
 * 	Copyright 2018 ContainX and OpenStack4j                                          
 * 	                                                                                 
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not      
 * 	use this file except in compliance with the License. You may obtain a copy of    
 * 	the License at                                                                   
 * 	                                                                                 
 * 	    http://www.apache.org/licenses/LICENSE-2.0                                   
 * 	                                                                                 
 * 	Unless required by applicable law or agreed to in writing, software              
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT        
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the         
 * 	License for the specific language governing permissions and limitations under    
 * 	the License.                                                                     
 *******************************************************************************/
package com.huawei.openstack4j.openstack.compute.domain;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.huawei.openstack4j.model.ModelEntity;

/**
 * A generic MetaData model class which is just a Map of Key to Value
 * 
 * @author Jeremy Unruh
 */
@JsonRootName("meta")
public class MetadataItem extends HashMap<String, String> implements ModelEntity {

    private static final long serialVersionUID = 1L;

    public static MetadataItem toMetadataItem(Map<String, String> from) {
        MetadataItem md = new MetadataItem();
        md.putAll(from);
        return md;
    }
    
}