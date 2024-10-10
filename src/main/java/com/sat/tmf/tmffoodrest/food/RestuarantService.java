package com.sat.tmf.tmffoodrest.food;

import java.util.List;

public interface RestuarantService {
	Restuarant createRestuarant(Restuarant restuarant);
	Restuarant getRestuarantById(Long resId);
    List<Restuarant> getAllRestuarants();
    Restuarant updateRestuarant(Restuarant res);
    void deleteRestuarant(Long resId);
}
