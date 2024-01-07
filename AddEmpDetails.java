package com.coder.beans;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AddEmpDetails implements List<AddEmpDetails> {
	
	private int id;
	private String name;
	private String password;
	private String email;
	private String address;
	private String city;
	private String country;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public AddEmpDetails(String name, String password, String email, String address, String city, String country) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.address = address;
		this.city = city;
		this.country = country;
	}
	public AddEmpDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterator<AddEmpDetails> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean add(AddEmpDetails e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(Collection<? extends AddEmpDetails> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(int index, Collection<? extends AddEmpDetails> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public AddEmpDetails get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AddEmpDetails set(int index, AddEmpDetails element) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void add(int index, AddEmpDetails element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public AddEmpDetails remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ListIterator<AddEmpDetails> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ListIterator<AddEmpDetails> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<AddEmpDetails> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
