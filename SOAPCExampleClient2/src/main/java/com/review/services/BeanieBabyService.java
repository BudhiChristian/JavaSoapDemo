package com.review.services;

import java.util.List;

import javax.jws.WebService;

import com.review.models.BeanieBaby;

@WebService
public interface BeanieBabyService {
	public List<BeanieBaby> getAllBeanieBabies();
	public String addBeanieBaby(BeanieBaby beanieBaby);
}
