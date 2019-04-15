package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Phone")
public class MobileController {

	@Autowired
	 private MobileService mobileservice;
	
	 
	 @PostMapping("Insert")
	 private MobileModel create(@RequestBody MobileModel mobilemodel)
	 {
	 
	 return mobileservice.create(mobilemodel);
	 }

     @GetMapping("View")
     private List<MobileModel>view()
     {
     return mobileservice.getAll();
     }

     
     @DeleteMapping("Delete")
     
     private void delete(@RequestParam("id") long id) {
 		System.out.println("value of id    :   " + id);
 		mobileservice.Delete(id);
 	}
     
     
     @PutMapping("Update")
     public MobileModel update(@RequestParam("id") long id, @RequestBody MobileModel mobilemodel) 
 	{
 		mobilemodel.setId(id);
 		System.out.println("values" +mobilemodel.toString());
 		return mobileservice.update(id, mobilemodel);
 	}
 	
     
 

}  