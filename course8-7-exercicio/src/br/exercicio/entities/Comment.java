package br.exercicio.entities;

public class Comment {
	
	private String text;

	/**
	 * @param comment
	 */
	public Comment(String comment) {
		this.text = comment;
	}

	public String getText() {
		return text;
	}

	public void setText(String comment) {
		this.text = comment;
	}
	
	
	
}
