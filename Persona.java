public class Persona {
	String name;
	String sexo;
	int edad;

   public void caminar (){
   	 System.out.println(name+"Esta caminando");
   }

    public void estudiar(){
    	System.out.println(name+"esta estudiando");
    }
    public void comer(String comida){
    	System.out.println(name + " esta comiendo "+ comida);

    } 
    public void pedirCerveza(){
    	if(edad >=18 ){
    		System.out.println(" dar cerveza");
    	} else {
    		System.out.println(" No tienes edad para beber  cerveza");
    	}


    }
}


class Curso {

	 public static void main(String args []){

	 	Persona juan = new Persona ();
	 	juan.name = "JUAN PEREZ";
	 	juan.sexo = "Masculino";
	 	juan.edad = 15;
	 	juan.caminar();
	 	juan.estudiar();
	 	juan.comer(" Torta cubana");
	 	juan.pedirCerveza();

	 	Persona bety = new Persona();
	 	bety.name = "Beatriz";
	 	bety.sexo = "F";
	 	bety.edad = 18;
	 	
	 	bety.caminar();
	 	bety.estudiar();
	 	bety.comer( "Lechuga");
	 	bety.pedirCerveza();

	 }
}