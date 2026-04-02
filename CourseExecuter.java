
class CourseExecuter{
	public static void main(String args[]){
		Course c = new Course();

		boolean added = c.addTechnology("Java");
		System.out.println(added);
		added = c.addTechnology("Python");
		System.out.println(added);
		added = c.addTechnology("C");
		System.out.println(added);
		added = c.addTechnology("C++");
		System.out.println(added);
		added = c.addTechnology("JavaScript");
		System.out.println(added);
		added = c.addTechnology("HTML");
		System.out.println(added);
		added = c.addTechnology("CSS");
		System.out.println(added);
		added = c.addTechnology("SQL");
		System.out.println(added);
		added = c.addTechnology("Spring");
		System.out.println(added);
		added = c.addTechnology("Hibernate");
		System.out.println(added);
		added = c.addTechnology("React");
		System.out.println(added);
		added = c.addTechnology("Node.js");
		System.out.println(added);
		added = c.addTechnology("Angular");
		System.out.println(added);
		added = c.addTechnology("MongoDB");
		System.out.println(added);
		added = c.addTechnology("Docker");
		System.out.println(added);

		c.getTechnologies();
	}
}