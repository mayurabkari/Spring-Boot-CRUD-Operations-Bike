package spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.entity.Bike;
import com.assignment.repository.BikeRepository;

@RestController
public class BikeController {

	@Autowired
	BikeRepository br;
	
	@PostMapping("/saveBike")
	public String saveBike( @RequestBody Bike b) {
        br.save(b);
		return "Bike Saved";
	}
	
	@GetMapping("/getBikeById")
	public Bike getBike( @RequestParam int id) {
		Optional<Bike> bb=br.findById(id);
		return bb.get();
	}
	
	@PutMapping("/updateBike")
	public String updateBike( @RequestBody Bike b) {
		br.save(b);
		return "Updatedd!";
	}
	
	@DeleteMapping("/deleteBike")
	public String deleteBike( @RequestParam int id ) {
		br.deleteById(id);
		return "deleted!";
	}
	
	@GetMapping("/allBikeDetails")
	public List<Bike> fetchAllBike(){
		List<Bike> bb=br.findAll();
		return bb;
	}
}
