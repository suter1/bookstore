package main.java.org.books.persistence.repository;

import main.java.org.books.persistence.entity.Customer;
import main.java.org.books.persistence.entity.Order;
import main.java.org.books.persistence.dto.OrderInfo;

import javax.ejb.Remote;
import java.util.List;

/**
 * Created by maestroSurface on 24.03.2017.
 */
@Remote
public interface OrderRepositoryRemote {

	public Order find(Long number);
	public List<OrderInfo> search(Customer customer, Integer year);
}