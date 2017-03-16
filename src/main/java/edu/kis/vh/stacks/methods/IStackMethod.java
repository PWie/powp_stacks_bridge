package edu.kis.vh.stacks.methods;

/**
 * Created by Student on 16.03.2017.
 */
public interface IStackMethod {
	int EMPTY_STACK_INDICATOR = 0;

	int getTotal();

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();
}

/*
	dzieki wyciagnieciu wspolnych stalych do interfejsu zmiene dotyczaca wszystkich implementujacych
	klas wystarczylo wprowadzic tylko w jednym miejscu.
 */