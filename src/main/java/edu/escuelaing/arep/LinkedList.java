package edu.escuelaing.arep;

import java.util.AbstractSequentialList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable {

	public Node<E> head;

	/**
	 * Constructor para la clase LinkedList, contenedor de tipos genericos de datos
	 */
	public LinkedList() {
		head = new Node<E>(null);
	}

	/**
	 * Agrega una nueva cabeza a la lista
	 * 
	 * @param e representa el nuevo elemento
	 */
	@Override
	public void addFirst(E e) {
		Node<E> newHead = new Node<E>(e);
		if (head.getPrevious() == null) {
			head.setNext(newHead);
			head.setPrevious(newHead);
		} else {
			Node<E> oldHead = head.getPrevious();
			newHead.setNext(oldHead);
			oldHead.setPrevious(newHead);
			head.setPrevious(newHead);
		}
	}

	/**
	 * Agrega una nueva cola a la lista
	 * 
	 * @param e representa el nuevo elemento
	 */
	@Override
	public void addLast(E e) {
		Node<E> newTail = new Node<E>(e);
		if (head.getNext() == null) {
			head.setNext(newTail);
			head.setPrevious(newTail);
		} else {
			Node<E> oldTail = head.getNext();
			newTail.setPrevious(oldTail);
			oldTail.setNext(newTail);
			head.setNext(newTail);
		}
	}

	@Override
	public boolean offerFirst(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offerLast(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E pollFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E pollLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peekFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peekLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeFirstOccurrence(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeLastOccurrence(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offer(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Elimina y retorna la cabeza de la lista
	 * 
	 * @return la anterior cabeza de la lista
	 */
	@Override
	public E remove() {

		Node<E> OldHead = head.getPrevious();
		if (OldHead != null) {
			Node newHead = OldHead.getNext();
			newHead.setPrevious(null);
			head.setPrevious(newHead);
		}
		return OldHead.getValue();
	}

	@Override
	public E poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Agrega un nuevo elemento a una pila representado por la lista
	 * 
	 * @param e nuevo elemento a agregar
	 */
	@Override
	public void push(E e) {
		this.addFirst(e);
	}

	/**
	 * Elimina un elemento de una pila representada por la lista Return elemento que
	 * se elimino
	 */
	@Override
	public E pop() {
		return this.remove();
	}

	@Override
	public Iterator<E> descendingIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * muestra la cantidad de elementos en la lista
	 * 
	 * @return
	 */
	@Override
	public int size() {
		int cont = 0;
		Node<E> nodeFind = head.getPrevious();
		while (nodeFind != null) {
			cont++;
			nodeFind = nodeFind.getNext();
		}
		return cont;
	}

	/**
	 * Retorna un elemento en una posicion especifica de la lista
	 * 
	 * @param index posicion
	 * @return elemento que se busca
	 */
	public E getIndexOf(int index) {
		Node<E> nodeFind = head.getPrevious();
		int i = 0;
		while (index != i || nodeFind == null) {
			i++;
			nodeFind = nodeFind.getNext();
		}
		return nodeFind.getValue();
	}

}
