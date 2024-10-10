package com.sat.tmf.tmffoodrest.food;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestuarantServiceImpl implements RestuarantService {

	@Autowired
	private RestuarantRepository resRepo;

	@Override
	public Restuarant createRestuarant(Restuarant restuarant) {
		return resRepo.save(restuarant);

	}

	@Override
	public Restuarant getRestuarantById(Long resId) {
		Optional<Restuarant> resList = resRepo.findById(resId);
		return resList.get();
	}

	@Override
	public List<Restuarant> getAllRestuarants() {
		return resRepo.findAll();
	}

	@Override
	public Restuarant updateRestuarant(Restuarant res) {
		Restuarant currRes = resRepo.findById(res.getId()).get();
		// write set new values
		currRes.setCostForTwo(res.getCostForTwo());
		currRes.setResLocation(res.getResLocation());
		currRes.setResName(res.getResName());
		Restuarant updatedRes = resRepo.save(currRes);
		return updatedRes;
	}

	@Override
	public void deleteRestuarant(Long resId) {
		resRepo.deleteById(resId);

	}

}
