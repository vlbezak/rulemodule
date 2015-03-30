package sk.rulemodule.bo;

public class Rule { 
	private String cypherStatement;

	public Rule(String cypherStatement) {
		super();
		this.cypherStatement = cypherStatement;
	}

	public String getCypherStatement() {
		return cypherStatement;
	}

}
