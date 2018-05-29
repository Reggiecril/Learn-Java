
public class Test {

	public static void main(String[] args) {
		Animal[] animal=new Animal[5];
		for(int i=0;i<animal.length;i++) {
			int rand=(int) (Math.random()*2);
			
			if(rand==0) {
				Cat cat=new Cat();
				animal[i]=cat;
			}else if(rand==1) {
				Dog dog=new Dog();
				animal[i]=dog;
			}else {
				Sheep sheep =new Sheep();
				animal[i]=sheep;
			}
		}
		for(int i=0;i<animal.length;i++) {
			if(animal[i] instanceof Cat) {
				animal[i].cry();
			}else if(animal[i] instanceof Dog) {
				animal[i].cry();
			}else if(animal[i] instanceof Sheep) {
				animal[i].cry();
			}
		}

	}

}
