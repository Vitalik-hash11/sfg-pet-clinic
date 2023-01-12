package com.vkarpiv.sfgpetclinic.services;

import com.vkarpiv.sfgpetclinic.domain.Owner;

import java.util.Set;

public interface OwnerService {

  Owner findById(Long id);

  Owner save(Owner owner);

  Set<Owner> findAll(Owner owner);

  Owner saveByLastName(String lastName);
}
