package com.olx.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import com.olx.model.Category;
import com.olx.model.CategoryDtoReq;
import com.olx.model.CategoryDtoRes;
import com.olx.model.Product;
import com.olx.model.ProductDtoReq;
import com.olx.model.ProductDtoRes;
import com.olx.model.User;
import com.olx.model.UserDtoReq;
import com.olx.model.UserDtoRes;



public class ProductController  {
	public ProductController(){
		this.productDao=new ProductDao();
	}
	private ProductDao productDao;
	private UserDao userDao;
   
    public boolean addproduct(Product product) {
    	
    	
    	
    	
    	//Set<ProductDtoRes> ProductRes =  productDao.findAllProducts(new UserDtoReq(product.getUser().getName(),product.getUser().getPassword()));
        	
			productDao.create(product);
            return true;
          
      
        }
    
    
    public ProductDtoRes getProductById(int id) {
		ProductDtoRes product = new ProductDtoRes();
		product=productDao.find(id);
		return product;
	} 
    public Set<Product> ListOfProducts(CategoryDtoReq category){
		Set<Product> productss =new HashSet<Product>();
		
		Set<ProductDtoRes> products=productDao.findAllProducts(category);
		
		for(ProductDtoRes prod:products){
			Product product= new Product();
			product=prod.getProduct();
			productss.add(product);
			
		}
		return productss;
	}     

        
        public void close(){
        	
        	userDao.close();
        }
    
        
        
        
        
        
        
        
        
        
        
        
        
        
    
   
    

}











