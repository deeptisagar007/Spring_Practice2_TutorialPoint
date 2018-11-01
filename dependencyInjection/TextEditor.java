package com.spring.dependencyInjection;

public class TextEditor {
	private SpellChecker spellChecker;

	/**
	 * @param spellChecker
	 */
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("In TextEditor Constructor");
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}
