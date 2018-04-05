package br.edu.udesc.pra.strsearch;

import java.io.File;
import java.util.HashMap;
/**
 * Explicar
 * @author udesc
 *
 */
public abstract class StringSearchStrategy {
	private File files[];
	
	/**
	 * Explicar
	 */
	public StringSearchStrategy() {
		super();
	}

	/**
	 * Explicar
	 * @param files
	 */
	public StringSearchStrategy(File[] files) {
		super();
		this.files = files;
	}

	/**
	 * Indica para cada arquivo quantas ocorrências da palavra foram encontradas nele
	 */
	private HashMap<String, Integer> result;
	public HashMap<String, Integer> getResult() {
		return result;
	}

	public void setResult(HashMap<String, Integer> result) {
		this.result = result;
	}

	/**
	 * Explicar
	 * @return
	 */
	public File[] getFiles() {
		return files;
	}

	/** 
	 * Explicar
	 * @param files
	 */
	public void setFiles(File[] files) {
		this.files = files;
	}

	/**
	 * Explicar
	 * @param keyword
	 */
	public abstract void Search( String keyword );
	

}
