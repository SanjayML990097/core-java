
class YouTubeExecuter{
	public static void main(String args[]){
		YouTube y = new YouTube();

		boolean added = y.addVideo("Java Tutorial for Beginners");
		System.out.println(added);
		added = y.addVideo("Python Full Course");
		System.out.println(added);
		added = y.addVideo("HTML & CSS Crash Course");
		System.out.println(added);
		added = y.addVideo("JavaScript Basics");
		System.out.println(added);
		added = y.addVideo("React JS Tutorial");
		System.out.println(added);
		added = y.addVideo("Spring Boot Project");
		System.out.println(added);
		added = y.addVideo("Data Structures in Java");
		System.out.println(added);
		added = y.addVideo("SQL for Beginners");
		System.out.println(added);
		added = y.addVideo("Machine Learning Intro");
		System.out.println(added);
		added = y.addVideo("Docker Tutorial");
		System.out.println(added);
		added = y.addVideo("Git & GitHub Guide");
		System.out.println(added);
		added = y.addVideo("Android App Development");
		System.out.println(added);
		added = y.addVideo("Cloud Computing Basics");
		System.out.println(added);
		added = y.addVideo("Cyber Security Fundamentals");
		System.out.println(added);
		added = y.addVideo("Full Stack Development Roadmap");
		System.out.println(added);

		y.getVideos();
	}
}