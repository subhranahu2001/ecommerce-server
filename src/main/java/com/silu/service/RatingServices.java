package com.silu.service;

import java.util.List;

import com.silu.exception.ProductException;
import com.silu.modal.Rating;
import com.silu.modal.User;
import com.silu.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
