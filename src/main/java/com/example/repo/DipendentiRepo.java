package com.example.repo;

import java.util.ArrayList;
import java.util.List;

public class DipendentiRepo {
	
	public List<String> listAll() {
		List<String> dipendenti = new ArrayList<String>() {
			private static final long serialVersionUID = 1L;
			{
				add("Mario Rossi");
				add("Anna Verdi");
				add("Bruno Neri");
			}};
		
		return dipendenti;
	}
	
}
