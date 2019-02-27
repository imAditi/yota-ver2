package com.yash.yota.service;

import com.yash.yota.domain.Role;

public interface RoleService {
	/**
	 * This method is used to find the role corresponding to the given id.
	 * @param id for which Role is to be found
	 * @return return the Role corresponding to the given id
	 */
	public Role findById(Long id);
}
