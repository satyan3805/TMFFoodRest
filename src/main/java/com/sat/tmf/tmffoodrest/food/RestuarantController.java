package com.sat.tmf.tmffoodrest.food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/restuarants")
public class RestuarantController {
	@Autowired
	private RestuarantService resService;

	@PostMapping("/createRes")
	public ResponseEntity<Restuarant> createRestuarant(@RequestBody Restuarant res) {
		System.out.println("/createRes");
		Restuarant savedRes = resService.createRestuarant(res);
		return new ResponseEntity<>(savedRes, HttpStatus.CREATED);
	}

	@GetMapping("/getRes/{id}")
	public ResponseEntity<Restuarant> getResById(@PathVariable("id") Long resId) {
		System.out.println("/getRes");
		Restuarant res = resService.getRestuarantById(resId);
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

	@GetMapping("/getAllRes")
	public ResponseEntity<List<Restuarant>> getAllRestuarants() {
		List<Restuarant> resList = resService.getAllRestuarants();
		return new ResponseEntity<>(resList, HttpStatus.OK);
	}

	@PutMapping("/updateRes/{id}")
	public ResponseEntity<Restuarant> updateRes(@PathVariable("id") Long resId, @RequestBody Restuarant res) {
		res.setId(resId);
		Restuarant updatedRes = resService.updateRestuarant(res);
		return new ResponseEntity<>(updatedRes, HttpStatus.OK);
	}

	@DeleteMapping("/deleteRes/{id}")
	public ResponseEntity<String> deleteRestuarent(@PathVariable("id") Long resId) {
		resService.deleteRestuarant(resId);
		return new ResponseEntity<>("Restuarent successfully deleted!", HttpStatus.OK);
	}
}
