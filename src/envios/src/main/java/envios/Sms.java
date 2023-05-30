package envios;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class Sms extends CanalComunicacion{
	//public static final String ACCOUNT_SID = "AC6176ececdb19871dc434bc41f8cf5726";
	//public static final String AUTH_TOKEN = "24ba4192d57a47a63a4c171dc8cb76f3";
	//private static final Logger logger = LoggerFactory.getLogger(Sms.class);
	
	public Sms(String account_Sid, String auth_Token, String numero_Telefonico) {
		super(account_Sid, auth_Token, numero_Telefonico);
	} 
	public String enviar(Empleado sary) {
		try {
			Twilio.init(getAccount_Sid(), getAuth_Token());
			Message message = Message.creator(new PhoneNumber(sary.getTelefono()), new PhoneNumber(this.getNumero_Telefonico()),
					"Nombre: " + sary.getNombre() + "\nEdad: " + sary.getEdad() + "\nSueldo: " + sary.getSueldo()
					+ "\nTelefono: " + sary.getTelefono() + "\nCorreo: " + sary.getCorreo()
					+ "\nAños de servicio: " + sary.getAñosDeSevicio() + "\nAfiliacion: " + sary.getAfiliacion()).create();
			return "Mensaje enviado. SID del mensaje: " + message.getSid();
		}catch (Exception e) {
			return "Error" + e;
		}
	}
}
