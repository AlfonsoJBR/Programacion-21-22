Algoritmo ivaincluido
	Escribir "Introduzca precio con  IVA"
	Leer precio
  Escribir "Introduzca porcentaje de IVA"
  leer tipoiva
	preciosin = precio/(tipoiva/100+1)
	iva1 = precio-preciosin
	Escribir "el importe del iva"
	Escribir iva1
	Escribir "el precio total"
	Escribir preciosin
FinAlgoritmo
