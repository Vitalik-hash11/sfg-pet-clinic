package com.vkarpiv.sfgpetclinic.services;

import com.vkarpiv.sfgpetclinic.domain.Vet;

import java.util.Set;

public interface VetService {
  Vet findById(Long id);

  Vet save(Vet owner);

  Set<Vet> findAll(Vet owner);
}
