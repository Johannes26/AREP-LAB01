package edu.escuelaing.arep;

public class Node<E> {
	
	
	private E value;
	private Node<E> next;
	private Node<E> previous;

	public Node(E value) {
		this.value = value;
		next= null;
		previous=null;
	}
	
	public Node<E> getNext() {
		return next;
	}
	
	public Node<E> getPrevious() {
		return previous;
	}
	
	public E getValue() {
		return value;
	}
	
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	public void setPrevious(Node<E> previous) {
		this.previous = previous;
	}
}
