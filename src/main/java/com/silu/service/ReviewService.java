package com.silu.service;

import java.util.List;

import com.silu.exception.ProductException;
import com.silu.modal.Review;
import com.silu.modal.User;
import com.silu.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
