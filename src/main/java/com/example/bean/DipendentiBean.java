package com.example.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.context.RequestContext;

import com.example.repo.DipendentiRepo;

@ManagedBean
@RequestScoped
public class DipendentiBean {
	
	private DipendentiRepo repo = new DipendentiRepo();
	private int counter = 0;	
	
	public void showDialog1() {
		RequestContext.getCurrentInstance().execute("PF('dlgDettaglio1').show();");
	}

	public void showDialog2() {
		RequestContext.getCurrentInstance().execute("PF('dlgDettaglio2').show();");
	}
	
	public DipendentiRepo getRepo() {
		return repo;
	}

	public void setRepo(DipendentiRepo repo) {
		this.repo = repo;
	}
	
	public List<String> getDipendenti() {
		return this.getRepo().listAll();
	}

	public int getCounter() {		
		return counter++;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

}
