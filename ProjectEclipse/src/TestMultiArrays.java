
public class TestMultiArrays {

	public static void main (String[] args) {
		String course_subjects [] [] = new String [2] [2];
		course_subjects [0][0] = "CS-MATHS";
		course_subjects [0][1] = "CS-ENGLISH";
		course_subjects [1][0] = "AC-Accounting";
		course_subjects [1][1] = "AC-bahasa melayu";

		String course_subjects2 [] [] = {{"CS-MATHS","CS-ENGLISH", "AC-Accounting", "AC-bahasa melayu"}};
		
		for (int i =0;i < course_subjects.length; i++) {
			for (int j =0;j < course_subjects [i].length; j++) {
			System.out.println("course of" + i + "subject of" +j + "is" + course_subjects[i][j]);
			
			}		
		}
	}
}

	
