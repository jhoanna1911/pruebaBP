CREATE TABLE T01_SOLICITUD
   (ID NUMBER(20,0) NOT NULL, 
	ESTADO NUMBER(20,0), 
	FECHA_INGRESO DATE, 
	MONTO DECIMAL, 
	ID_CLIENTE VARCHAR2(50 CHAR), 
	CONSTRAINT "ID_PK" PRIMARY KEY ("ID"));
    
    CREATE INDEX "INDICE_T01" ON "T01_SOLICITUD" (ID_CLIENTE);