package com.example.demo;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




@Component
public class MobileService {
	

	@Autowired
	private MobileRepository mobilerepository;
    
	
	public MobileModel create(MobileModel mobilemodel)
	{
	 return mobilerepository.save(mobilemodel);
	}

	public List<MobileModel> getAll() {
		return mobilerepository.findAll();
	}
	
	public void Delete(long id) { 
		  mobilerepository.deleteById(id); }

	public MobileModel update(long id,MobileModel mobilemodel) {
		MobileModel mm=mobilerepository.getOne(id);
		mm.setBrand(mobilemodel.getBrand());
		mm.setColour(mobilemodel.getColour());
		mm.setSize(mobilemodel.getSize());
		mm.setWeight(mobilemodel.getWeight());
		mobilerepository.save(mm);
		return mobilemodel;
	}

}
