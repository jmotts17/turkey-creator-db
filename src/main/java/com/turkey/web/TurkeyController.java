package com.turkey.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.turkey.business.Turkey;
import com.turkey.db.TurkeyRepo;

@CrossOrigin
@RestController
@RequestMapping("/turkeys")
public class TurkeyController {

	@Autowired
	private TurkeyRepo turkeyRepo;
	
	// Get all turkeys
	@GetMapping("/")
	public List<Turkey> getAll() {
		return turkeyRepo.findAll();
	}
	
	// Get a turkey by id
	@GetMapping("/{id}")
	public Optional<Turkey> getById(@PathVariable int id) {
		return turkeyRepo.findById(id);
	}
	
	// Add a turkey
	@PostMapping("/")
	public Turkey addTurkey(@RequestBody Turkey t) {
		t = turkeyRepo.save(t);
		return t;
	}
	
	// Update a turkey
	@PutMapping("/")
	public Turkey updateTurkey(@RequestBody Turkey t) {
		t = turkeyRepo.save(t);
		return t;
	}
	
	// Delete a turkey by id
	@DeleteMapping("{id}")
	public Turkey deleteTurkey(@PathVariable int id) {
		Optional<Turkey> t = turkeyRepo.findById(id);

		if (t.isPresent()) {
			turkeyRepo.deleteById(id);
		} else {
			System.out.println("Error - turkey not found for id " + id);
		}
		return t.get();
	}
	
}
