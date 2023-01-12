package com.vkarpiv.sfgpetclinic.services;

import com.vkarpiv.sfgpetclinic.domain.Pet;

import java.util.Set;

public interface PetService {
  Pet findById(Long id);

  Pet save(Pet owner);

  Set<Pet> findAll(Pet owner);
}
