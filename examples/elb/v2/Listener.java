package com.huawei.openstack.sample;

import com.huawei.openstack4j.api.OSClient.OSClientV3;
import com.huawei.openstack4j.openstack.OSFactory;
import com.huawei.openstack4j.model.common.Identifier;

import com.huawei.openstack4j.model.network.ext.ListenerProtocol;
import com.huawei.openstack4j.model.network.ext.ListenerV2;
import com.huawei.openstack4j.model.network.ext.ListenerV2Update;
import com.huawei.openstack4j.openstack.networking.domain.ext.NeutronListenerV2Update;
import com.huawei.openstack4j.openstack.networking.domain.ext.NeutronListenerV2;

public class Listener {

	public static void main(String[] args) {

				String user = "******";
				String password = "******";
				String projectId = "******";
				String userDomainId = "******";
				String authUrl = "******";

			OSClientV3 osclient = OSFactory.builderV3().endpoint(authUrl)
					.credentials(user, password, Identifier.byId(userDomainId))
					.scopeToProject(Identifier.byId(projectId)).authenticate();



//Create a listener for Enhanced Loadbalancer
			String lb_id = "*******";
			String clientTlsContainerRef="******";
			ListenerV2 listener = NeutronListenerV2.builder().protocolPort(80).clientTlsContainerRef(clientTlsContainerRef).protocol(ListenerProtocol.HTTP).loadBalancerId(lb_id).build();
			osclient.networking().lbaasV2().listener().create(listener);
			
//List all listeners
			osclient.networking().lbaasV2().listener().list();
			
//Query info about a listener
			String lsnr_id = "*******";
			osclient.networking().lbaasV2().listener().get(lsnr_id);
			
//Update a listener
            String clientTlsContainerRefUpdate="******";
			ListenerV2Update lsnr_mod = NeutronListenerV2Update.builder().clientTlsContainerRef(clientTlsContainerRefUpdate).name("lsnr_name_mod").build();
			osclient.networking().lbaasV2().listener().update(lsnr_id, lsnr_mod);
			
//Delete a listener
			osclient.networking().lbaasV2().listener().delete(lsnr_id);
			}

}