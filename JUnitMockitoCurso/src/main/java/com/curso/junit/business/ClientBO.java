package com.curso.junit.business;

import java.util.List;

import com.curso.junit.business.exception.DifferentCurrenciesException;
import com.curso.junit.model.Amount;
import com.curso.junit.model.Product;

public interface ClientBO {

	Amount getClientProductsSum(List<Product> products)
			throws DifferentCurrenciesException;

}