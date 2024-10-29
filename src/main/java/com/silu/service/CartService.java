package com.silu.service;

import com.silu.exception.ProductException;
import com.silu.modal.Cart;
import com.silu.modal.CartItem;
import com.silu.modal.User;
import com.silu.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
