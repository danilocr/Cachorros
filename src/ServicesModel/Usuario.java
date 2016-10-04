package ServicesModel;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable
public class Usuario {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String nombres;
	
	@Persistent
	private String correo;
	
	@Persistent
	private String contrase�a;
	
	@Persistent
	private String sexo;
	
	public Usuario(String n,String c,String con,String se){
		nombres=n;correo=c;contrase�a=con;sexo=se;
		
	}
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String apPat) {
		this.nombres = apPat;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
	
    public void setKey(Key key) {
        this.key = key;
    }
	
	@Override
	public String toString() {
		String resp = "<br> Nombres : "+nombres+" <br>Correo : " + correo + " <br> Contrase�a : " + contrase�a+
					" <br> Sexo : " + sexo ;  
		return resp;
	}}
