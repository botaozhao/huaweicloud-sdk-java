/*******************************************************************************
 * 	Copyright 2019 Huawei Technologies Co.,Ltd.
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
package com.huawei.openstack4j.openstack.eps.v1.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huawei.openstack4j.model.ModelEntity;
import com.huawei.openstack4j.openstack.eps.v1.domain.base.EPResponseBase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @version 版本号, 2019/7/10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EPQueryResponse implements ModelEntity
{
    private static final long serialVersionUID = 6809572959398125329L;

    /**
     * 企业项目
     */
    @JsonProperty ("enterprise_project")
    private EPResponseBase enterpriseProject;
}
