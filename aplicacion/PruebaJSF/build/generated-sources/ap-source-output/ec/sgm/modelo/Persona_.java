package ec.sgm.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Persona.class)
public abstract class Persona_ {

	public static volatile SingularAttribute<Persona, Date> Fecha_Nacimiento;
	public static volatile SingularAttribute<Persona, Integer> Codigo;
	public static volatile SingularAttribute<Persona, String> nombre;

}

