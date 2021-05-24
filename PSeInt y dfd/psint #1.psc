Algoritmo innova 
	ESCRIBIR "Programa de regristo de empleados, por area y hora de ingreso." ;
	//DEFINIMOS LAS VARIABLES 
	Definir  Horaingreso  Como Real;
	Definir Area  Como Caracter;
	Definir  Usuario  Como Caracter;
	Definir  Contraseña  Como Entero;
	Definir  Verificar1 Como Caracter;
	Definir  Verificar2 Como Entero;
	
	Escribir "Digite hora de ingreso, si no es una hora exacta para determinar la hora colocar un punto despues del primer numero.";
	Leer Horaingreso;
	Escribir "Ingrese nombre de area de trabajo.";
	Leer Area;
	Verificar1=Tecnologia;
	Area=Tecnologia;
	si (Verificar1=Area) Entonces
		Escribir "Area asignada encontrada";
	SiNo
		Escribir " Area no encontrada";
		
	FinSi
	
	Escribir  "Ingrese nombre del usuario.";
	Leer Usuario;
	Escribir  "Ingrese Contraseña del Usuario.";
	Leer Contraseña;
	Verificar2=12345;
	si (Verificar2=Contraseña) Entonces
		Escribir "Bienvenido a la area de Tecnologia ", Usuario " usted ingreso a las ", Horaingreso " A.M.";
	SiNo
		Escribir "Acceso denegado";
	FinSi
	
	
	
	
	

	
FinAlgoritmo
