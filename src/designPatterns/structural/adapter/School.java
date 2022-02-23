package designPatterns.structural.adapter;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen pen= new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setPen(pen);
		aw.writeAssignment("Adapter Pattern");
	}

}
