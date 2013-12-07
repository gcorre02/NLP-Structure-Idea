public interface Node{
	//parameterArray[]
	//tableArray[]
	//StringQuestions[]
	//StringFunctionalities[]
	public void getRelationship(int arrayPosition, String parameterName);
	public double inferencingQuestions(String[] questions);
	public void generateParameterArray();
	public void generateNewNode();
	public double evaluateRelationshipLevel(thisnode, node, table);
}