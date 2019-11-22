package ch21_JDBC;

public class HealthDTO {
	
	    String id;
		String name;
		int age;
		double height; 
		double weight;
		double bmi;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getNAME() {
			return name;
		}
		public void setNAME(String nAME) {
			name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		public double getBmi() {
			return bmi;
		}
		public void setBmi(double bmi) {
			this.bmi = bmi;
		}
		public HealthDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
		public HealthDTO(String id, String name, int age, double height, double weight, double bmi) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.height = height;
			this.weight = weight;
			this.bmi = bmi;
		}
		@Override
		public String toString() {
			return "HealthDTO [id=" + id + ", NAME=" + name + ", age=" + age + ", height=" + height + ", weight="
					+ weight + ", bmi=" + bmi + "]";
		} 
		
		

}
