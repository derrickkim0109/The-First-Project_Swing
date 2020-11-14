package com.javalec.minigame;

import java.io.FileInputStream;

public class BeanMiniGame {
	
	
	int fileno;
	String filename;
	FileInputStream file;
	String sfileno;
	
	
	
	
	
	// constructor
	
	public BeanMiniGame(String filename, String sfileno) {
		super();
		this.filename = filename;
		this.sfileno = sfileno;
	}


	public BeanMiniGame() {
		
	}
	

	public BeanMiniGame(int fileno, String filename) {
		super();
		this.fileno = fileno;
		this.filename = filename;
	}


	public BeanMiniGame(int fileno, String filename, FileInputStream file) {
		super();
		this.fileno = fileno;
		this.filename = filename;
		this.file = file;
	}


	

	public String getSfileno() {
		return sfileno;
	}


	public void setSfileno(String sfileno) {
		this.sfileno = sfileno;
	}


	// getter setter
	public int getFileno() {
		return fileno;
	}
	
	
	public void setFileno(int fileno) {
		this.fileno = fileno;
	}
	
	
	public String getFilename() {
		return filename;
	}
	
	
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	
	public FileInputStream getFile() {
		return file;
	}
	
	
	public void setFile(FileInputStream file) {
		this.file = file;
	}
	
	
	
	
	
	
	
	

}
