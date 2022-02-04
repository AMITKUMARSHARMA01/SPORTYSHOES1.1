package com.example.demo;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Shoe.User;
@RestController
public class ShoeController  {

	@Autowired
     Shoe shoe1;
	private String name;
	
	@RequestMapping("/")
	public String healthCheck() {
		return "OK";
	}
	
	
	@RequestMapping("/shoe1/get")
	public Shoe getShoe(@RequestParam(name="name", required=false, defaultValue="Unknown") String name) {
		shoe1.setsave(name);
		return shoe1;
	}
	
	/*@RequestMapping(value="/shoe1/add", method=RequestMethod.POST)
	public Shoe addShoe(@RequestParam(name="name", required=true ) int id) {
		shoe1.setPrice(name);	
		return shoe1;
	}*/
	
	@RequestMapping(value="/shoe1/update", method=RequestMethod.POST, consumes = "application/json")
	public Shoe updatePerson(@RequestBody Shoe s) {
		shoe1.setPrice(s.getPrice());
		return shoe1;
	}
	
	
	
	
	
	
	// retrieve all shoe from database
	@GetMapping("/all")
	public List<Shoe> getAllShoe()
	{
		List<Shoe> shoe=(List<Shoe>) shoe1.findAll(); 
		return shoe;
	}
	
	// insert new shoe into database
	@PostMapping("/add")
	public Shoe addShoe(@RequestBody Shoe shoe)
	{
		return shoe1.save(shoe);
	}
	
	// get particular shoe by their ID
	@GetMapping("shoe/{id}")
	public Optional<Shoe> getShoeId(@PathVariable int id)
	{
		return shoe1.findById(id);
	}
	
	// update existing shoe
	@PutMapping("update/{id}")
	public Shoe updateShoe(@RequestBody Shoe shoe)
	{
		return shoe1.save(shoe);
	}
	
	// delete particular shoe from database
	@DeleteMapping("delete/{id}")
	public Object deleteShoe(@PathVariable int id)
	{
		return shoe1.deleteById(id);
	}
}




	

