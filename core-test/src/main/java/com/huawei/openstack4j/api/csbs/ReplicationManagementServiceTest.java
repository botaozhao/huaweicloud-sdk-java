// /*******************************************************************************
// * 	Copyright 2018 Huawei Technologies Co.,Ltd.
// *
// * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not
// * 	use this file except in compliance with the License. You may obtain a copy of
// * 	the License at
// *
// * 	    http://www.apache.org/licenses/LICENSE-2.0
// *
// * 	Unless required by applicable law or agreed to in writing, software
// * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
// * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
// * 	License for the specific language governing permissions and limitations under
// * 	the License.
// *******************************************************************************/
//package com.huawei.openstack4j.api.csbs;
//
//import static org.testng.Assert.assertNotNull;
//
//import java.io.IOException;
//import java.util.List;
//
//import org.testng.annotations.Test;
//
//import com.huawei.openstack4j.api.AbstractTest;
//import com.huawei.openstack4j.openstack.csbs.v1.domain.Region;
//import com.huawei.openstack4j.openstack.csbs.v1.domain.ReplicationRecord;
//
//public class ReplicationManagementServiceTest extends AbstractTest{
//	@Override
//	protected Service service() {
//		return Service.CSBS;
//	}
//	private static final String REPLICATION_JSON = "/csbs/replication.json";
//	private static final String REPLICATION_LIST_JSON = "/csbs/replication_list.json";
//	@Test
//	public void testGet() throws IOException{
//		respondWith(REPLICATION_JSON);
//		List<Region> res = osv3().csbs().replications().get();
//		assertNotNull(res);
//	}
//
//	@Test
//	public void testList() throws IOException{
//		respondWith(REPLICATION_LIST_JSON);
//		List<ReplicationRecord> res = osv3().csbs().replications().list();
//		assertNotNull(res);
//
//	}
//}
